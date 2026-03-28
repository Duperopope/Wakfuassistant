import java.io.*;
import java.lang.reflect.*;
import java.net.*;
import java.util.*;

/**
 * Extrait spellId → gfxId depuis les bdata du jeu Wakfu.
 * Utilise les classes du client via réflexion.
 *
 * Noms réels dans wakfu-client.jar (pas les noms renommés du décompilateur) :
 *   aqA = data store (constructeur: aqA(String binName, int typeId))
 *   aqG = callback interface (méthode load(T))
 *   aOx = spell row data (d()=spellId, aVt()=gfxId)
 */
public class ExtractSpells {

    static final String WAKFU_DIR = "C:\\Users\\Smedj\\AppData\\Local\\Ankama\\Wakfu";
    static final String OUTPUT = "H:\\Code\\Wakfuassistant\\rnd\\data\\spell_names_fr.json";

    public static void main(String[] args) throws Exception {
        System.out.println("=== Extraction des sorts Wakfu ===");

        List<URL> urls = new ArrayList<>();
        // Client + libs
        for (File f : new File(WAKFU_DIR + "\\lib").listFiles((d, n) -> n.endsWith(".jar"))) {
            urls.add(f.toURI().toURL());
        }
        // bdata (contient 66.bin dans 66.jar)
        for (File f : new File(WAKFU_DIR + "\\contents\\bdata").listFiles((d, n) -> n.endsWith(".jar"))) {
            urls.add(f.toURI().toURL());
        }
        // i18n
        for (File f : new File(WAKFU_DIR + "\\contents\\i18n").listFiles((d, n) -> n.endsWith(".jar"))) {
            urls.add(f.toURI().toURL());
        }

        URLClassLoader cl = new URLClassLoader(urls.toArray(new URL[0]), ClassLoader.getSystemClassLoader());
        System.out.println("Classpath: " + urls.size() + " JARs");

        // Charger les classes avec leurs vrais noms
        Class<?> aOxClass = cl.loadClass("aOx");
        System.out.println("aOx (spell row) OK");

        // Trouver la classe data store — c'est aqA dans le vrai JAR
        // Le constructeur prend (String binName, int typeId)
        Class<?> storeClass = cl.loadClass("aqA");
        System.out.println("aqA (data store) OK");

        // Instancier le store avec "66.bin" et typeId=66
        Constructor<?> storeCtor = null;
        for (Constructor<?> c : storeClass.getDeclaredConstructors()) {
            if (c.getParameterCount() == 2) {
                storeCtor = c;
                break;
            }
        }
        storeCtor.setAccessible(true);
        Object store = storeCtor.newInstance("66.bin", 66);

        // Vérifier le nombre de records
        Method countMethod = storeClass.getDeclaredMethod("bGC");
        countMethod.setAccessible(true);
        int nRecords = (int) countMethod.invoke(store);
        System.out.println("Records: " + nRecords);

        // Trouver la méthode d'itération: a(T row, aqG<T> callback)
        // aqG est l'interface callback avec méthode load(T)
        Class<?> callbackInterface = cl.loadClass("aqG");

        // Trouver a(aqz, aqG) — la méthode qui itère sur tous les records
        // aqz est l'interface que aOx implémente
        Method iterMethod = null;
        for (Method m : storeClass.getDeclaredMethods()) {
            if (m.getName().equals("a") && m.getParameterCount() == 2) {
                Class<?>[] p = m.getParameterTypes();
                if (p[1].getName().contains("aqG") || p[1].getName().contains("aqg")) {
                    iterMethod = m;
                    System.out.println("Iter method: " + m.toGenericString());
                    break;
                }
            }
        }

        if (iterMethod == null) {
            // Lister toutes les méthodes pour debug
            System.out.println("Méthodes de " + storeClass.getName() + ":");
            for (Method m : storeClass.getDeclaredMethods()) {
                System.out.println("  " + m.getName() + " " + Arrays.toString(m.getParameterTypes()));
            }
            System.err.println("Méthode d'itération non trouvée!");
            return;
        }
        iterMethod.setAccessible(true);

        // Créer le proxy callback
        StringBuilder json = new StringBuilder("{\n");
        final int[] count = {0};

        Object callback = java.lang.reflect.Proxy.newProxyInstance(cl, new Class[]{callbackInterface},
            (proxy, method, margs) -> {
                if (method.getName().equals("load")) {
                    Object row = margs[0];
                    int spellId = (int) row.getClass().getMethod("d").invoke(row);
                    int gfxId = (int) row.getClass().getMethod("aVt").invoke(row);

                    if (spellId > 0) {
                        if (count[0] > 0) json.append(",\n");
                        json.append("  \"").append(spellId)
                            .append("\": {\"gfxId\": ").append(gfxId)
                            .append(", \"name\": \"\"}");
                        count[0]++;
                    }
                }
                return null;
            });

        // Créer l'instance aOx
        Object aOxInstance = aOxClass.getDeclaredConstructor().newInstance();

        // Itérer
        iterMethod.invoke(store, aOxInstance, callback);

        json.append("\n}");

        // Sauvegarder
        try (FileWriter fw = new FileWriter(OUTPUT)) {
            fw.write(json.toString());
        }
        System.out.println(count[0] + " sorts extraits → " + OUTPUT);
    }
}
