/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import org.apache.log4j.Logger;

/*
 * Renamed from aDQ
 */
public class adq_1 {
    private static final Logger dEo = Logger.getLogger(adq_1.class);

    public static ArrayList<String> hj(String string) {
        ArrayList<String> arrayList = new ArrayList<String>();
        String string2 = string.replace('.', '/');
        URL uRL = adq_1.class.getClassLoader().getResource(string2);
        if (uRL == null) {
            throw new RuntimeException("Unexpected problem: No resource for " + string2);
        }
        uRL.getPath();
        if (uRL.toString().startsWith("jar:")) {
            adq_1.a(uRL, string, arrayList);
        } else {
            adq_1.a(new File(uRL.getPath()), string, arrayList);
        }
        return arrayList;
    }

    public static ArrayList<String> a(ArrayList<String> arrayList, Class clazz) {
        ArrayList<String> arrayList2 = new ArrayList<String>();
        for (String string : arrayList) {
            if (string.startsWith("-")) continue;
            if (string.contains("*")) {
                adq_1.a(arrayList2, string, clazz);
                continue;
            }
            if (!adq_1.b(string, clazz)) continue;
            arrayList2.add(string);
        }
        for (String string : arrayList) {
            if (!string.startsWith("-")) continue;
            adq_1.a(arrayList2, string.substring(1));
        }
        return arrayList2;
    }

    private static void a(ArrayList<String> arrayList, String string, Class clazz) {
        String string2 = string.substring(0, string.indexOf("*") - 1);
        for (String string3 : adq_1.hj(string2)) {
            if (!string3.matches(string) || !adq_1.b(string3, clazz)) continue;
            arrayList.add(string3);
        }
    }

    private static boolean b(String string, Class clazz) {
        try {
            Class<?> clazz2 = Class.forName(string);
            while (clazz2.getSuperclass() != null) {
                if (clazz2 == clazz) {
                    return true;
                }
                clazz2 = clazz2.getSuperclass();
            }
            return false;
        }
        catch (ExceptionInInitializerError exceptionInInitializerError) {
            dEo.error((Object)"", (Throwable)exceptionInInitializerError);
            return false;
        }
    }

    private static void a(ArrayList<String> arrayList, String string) {
        for (int i = arrayList.size() - 1; i >= 0; --i) {
            if (!arrayList.get(i).matches(string)) continue;
            arrayList.remove(i);
        }
    }

    private static void a(File file, String string, ArrayList<String> arrayList) {
        String[] stringArray = file.list();
        for (int i = 0; i < stringArray.length; ++i) {
            File file2;
            String string2 = stringArray[i];
            String string3 = null;
            if (string2.endsWith(".class")) {
                string3 = string + "." + string2.substring(0, string2.length() - 6);
            }
            if (string3 != null) {
                arrayList.add(string3);
            }
            if (!(file2 = new File(file, string2)).isDirectory()) continue;
            adq_1.a(file2, string + "." + string2, arrayList);
        }
    }

    private static void a(URL uRL, String string, ArrayList<String> arrayList) {
        JarFile jarFile;
        String string2 = string.replace('.', '/');
        String string3 = uRL.getPath();
        String string4 = string3.replaceFirst("[.]jar[!].*", ".jar").replaceFirst("file:", "");
        try {
            jarFile = new JarFile(string4);
        }
        catch (IOException iOException) {
            throw new RuntimeException("Unexpected IOException reading JAR File '" + string4 + "'", iOException);
        }
        Enumeration<JarEntry> enumeration = jarFile.entries();
        while (enumeration.hasMoreElements()) {
            JarEntry jarEntry = enumeration.nextElement();
            String string5 = jarEntry.getName();
            String string6 = null;
            if (string5.endsWith(".class") && string5.startsWith(string2) && string5.length() > string2.length() + "/".length()) {
                string6 = string5.replace('/', '.').replace('\\', '.').replace(".class", "");
            }
            if (string6 == null) continue;
            arrayList.add(string6);
        }
    }

    public static void main(String[] stringArray) {
    }
}

