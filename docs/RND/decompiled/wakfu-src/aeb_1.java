/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;

/*
 * Renamed from aEB
 */
public class aeb_1
extends aev_1
implements aee_1 {
    protected static final Logger dGw = Logger.getLogger(aeb_1.class);
    public static final String dGx = "preferenceStorePath";
    public static boolean dGy = false;
    private final Properties dGz;
    private final Properties dGA;
    private boolean dGB = false;
    private String aCH;
    private boolean dGC = false;
    private boolean dGD = false;
    private boolean bXs = false;
    private final ArrayList<aec_1> dGE = new ArrayList();

    public aeb_1() {
        this.dGA = new Properties();
        this.dGz = new Properties(this.dGA);
    }

    public aeb_1(String string) {
        this();
        String string2 = System.getProperty(dGx);
        File file = new File(BH.aU(string2) ? "." : string2, string);
        File file2 = file.getParentFile();
        if (file2 != null && !file2.exists()) {
            file2.mkdirs();
        }
        this.ck(file.getAbsolutePath());
    }

    public String aLM() {
        return this.aCH;
    }

    public void ck(String string) {
        this.aCH = string;
    }

    public boolean bZV() {
        return this.dGC;
    }

    public boolean isInitialized() {
        return this.bXs;
    }

    public void dI(boolean bl) {
        this.dGC = bl;
    }

    public boolean bZW() {
        return this.dGD;
    }

    public void dJ(boolean bl) {
        this.dGD = bl;
    }

    public void buq() {
        if (this.aCH == null) {
            return;
        }
        try (FileInputStream fileInputStream = new FileInputStream(this.aCH);){
            this.gZ(fileInputStream);
        }
        catch (FileNotFoundException fileNotFoundException) {
            dGw.info((Object)("Fichier de pr\u00e9f\u00e9rences " + this.aCH + " inexistant, on le cr\u00e9e"));
        }
    }

    private void gZ(InputStream inputStream) {
        try {
            Map<String, String> map = this.bxg();
            this.dGz.load(inputStream);
            Map<String, String> map2 = this.bxg();
            this.dGB = false;
            this.bXs = true;
            this.bZX();
            this.a(map, map2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            dGw.info((Object)("Fichier de pr\u00e9f\u00e9rences " + this.aCH + " corrompu"), (Throwable)illegalArgumentException);
        }
    }

    private void bZX() {
        if (!this.dGE.isEmpty()) {
            for (int i = 0; i < this.dGE.size(); ++i) {
                this.dGE.get(i).onPreferenceStoreLoaded(this);
            }
        }
    }

    public void buR() {
        if (this.aCH == null) {
            throw new IOException("File name not specified");
        }
        try (FileOutputStream fileOutputStream = null;){
            fileOutputStream = new FileOutputStream(this.aCH);
            this.e(fileOutputStream);
        }
    }

    public void e(OutputStream outputStream) {
        this.dGz.store(outputStream, null);
        this.dGB = false;
    }

    public int lK() {
        return this.dGz.size();
    }

    public String[] bZY() {
        ArrayList arrayList = new ArrayList();
        Enumeration<?> enumeration = this.dGA.propertyNames();
        while (enumeration.hasMoreElements()) {
            arrayList.add(enumeration.nextElement());
        }
        enumeration = this.dGz.propertyNames();
        while (enumeration.hasMoreElements()) {
            Object obj = enumeration.nextElement();
            if (arrayList.contains(obj)) continue;
            arrayList.add(obj);
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }

    public void bxl() {
        Enumeration<?> enumeration = this.dGz.propertyNames();
        this.dGz.clear();
        while (enumeration.hasMoreElements()) {
            Object obj = enumeration.nextElement();
            this.dGz.setProperty(String.valueOf(obj), String.valueOf(this.dGA.getProperty(String.valueOf(obj))));
        }
        try {
            this.buR();
        }
        catch (IOException iOException) {
            dGw.error((Object)"IOException during resetToDefault", (Throwable)iOException);
        }
    }

    public boolean bZZ() {
        return this.dGB;
    }

    public void a(aec_1 aec_12) {
        this.dGE.add(aec_12);
    }

    public void b(aec_1 aec_12) {
        this.dGE.remove(aec_12);
    }

    @Override
    public boolean n(String string, boolean bl) {
        return bl ? this.dGz.containsKey(string) : this.dGz.containsKey(string) || this.dGA.containsKey(string);
    }

    @Override
    public Set<String> bxf() {
        HashSet<Object> hashSet = new HashSet<Object>();
        hashSet.addAll(this.dGz.keySet());
        hashSet.addAll(this.dGA.keySet());
        return hashSet.stream().map(Object::toString).collect(Collectors.toSet());
    }

    @Override
    public Map<String, String> bxg() {
        Set<Map.Entry<Object, Object>> set = this.dGz.entrySet();
        HashMap<String, String> hashMap = new HashMap<String, String>();
        set.forEach(entry -> hashMap.put(entry.getKey().toString(), entry.getValue().toString()));
        return hashMap;
    }

    @Override
    public void es(String string) {
        String string2 = (String)this.dGz.remove(string);
        if (string2 != null) {
            this.a(string, string2, null);
            if (this.dGC) {
                try {
                    this.buR();
                }
                catch (IOException iOException) {
                    dGw.warn((Object)("[Preferences] Could not save preference after removing property \"" + string + "\""), (Throwable)iOException);
                }
            }
        }
    }

    @Override
    public boolean eq(String string) {
        return this.dGA.containsKey(string);
    }

    @Override
    public String ep(String string) {
        if (this.dGz.containsKey(string)) {
            return this.dGz.getProperty(string);
        }
        return this.er(string);
    }

    @Override
    public String er(String string) {
        if (this.dGA.containsKey(string)) {
            return this.dGA.getProperty(string);
        }
        return null;
    }

    @Override
    public void s(String string, String string2) {
        String string3 = this.ep(string);
        if (string3 != null && string3.equals(string2) && this.hC(string)) {
            return;
        }
        if (this.dGD && !this.dGA.containsKey(string)) {
            return;
        }
        this.a(this.dGz, string, string2);
        this.dGB = true;
        this.a(string, string3, string2);
        if (this.dGC) {
            try {
                this.buR();
            }
            catch (IOException iOException) {
                dGw.warn((Object)("[Preferences] Could not save preference after setting property \"" + string + "\" to \"" + string2 + "\""), (Throwable)iOException);
            }
        }
    }

    @Override
    public void t(String string, String string2) {
        String string3 = this.er(string);
        if (string3 != null && string3.equals(string2) && this.hC(string)) {
            return;
        }
        this.a(this.dGA, string, string2);
        if (this.hE(string)) {
            this.a(string, string3, string2);
        }
    }

    private void a(Properties properties, String string, String string2) {
        if (properties == null) {
            return;
        }
        this.H(string, string2);
        properties.put(string, string2);
    }

    private void H(String string, String string2) {
        if (dGy && (string2 == null || "null".equals(string2))) {
            dGw.warn((Object)String.format("null value added in following : %s for this key : %s", this, string), (Throwable)new Exception("For stacktrace"));
        }
    }

    public String toString() {
        return String.format("%s (file related : %s)", this.getClass().getName(), this.aLM());
    }
}

