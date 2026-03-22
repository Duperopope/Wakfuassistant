/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.log4j.Logger;

/*
 * Renamed from aUB
 */
public class aub_0 {
    private static final Logger hkM = Logger.getLogger(aub_0.class);
    private static final aub_0 hkN = new aub_0();
    public static final String hkO = "clientConfig";
    private String hkP = "clientConfig/%s";
    private String hkQ = "clientConfig/%s/%s";
    private String hkR = "clientConfig/%s/%s/%s";
    private String hkS = "clientConfig/%s/%s/%s/%d";
    private String hkT = "clientConfig/%s/account.xml";
    private String hkU = "clientConfig/%s/%s/world.xml";
    private String hkV = "clientConfig/%s/%s/%s/character.xml";
    private String hkW = "clientConfig/%s/%s/%s/%d/instance.xml";
    public static final byte hkX = 1;
    public static final byte hkY = 2;
    public static final byte hkZ = 3;
    public static final byte hla = 4;
    private String hlb = null;
    private String hlc = null;
    private String hld = null;
    private long hle = -1L;
    private final Properties hlf = new Properties();
    private final Properties hlg = new Properties();
    private final Properties hlh = new Properties();
    private final Properties hli = new Properties();

    private aub_0() {
        Object object = System.getProperty("preferenceStorePath");
        object = BH.aU((String)object) ? "" : (String)object + "/";
        File file = new File((String)object + hkO);
        if (!file.exists()) {
            file.mkdir();
        }
        this.hkP = (String)object + "clientConfig/%s";
        this.hkQ = this.hkP + "/%s";
        this.hkR = this.hkQ + "/%s";
        this.hkS = this.hkR + "/%d";
        this.hkT = this.hkP + "/account.xml";
        this.hkU = this.hkQ + "/world.xml";
        this.hkV = this.hkR + "/character.xml";
        this.hkW = this.hkS + "/instance.xml";
    }

    public static aub_0 cVb() {
        return hkN;
    }

    public void kr(String string) {
        if (this.hlb == string || string != null && string.equals(this.hlb) || this.hlb != null && this.hlb.equals(string)) {
            return;
        }
        if (this.hlb != null) {
            this.cVe();
        }
        this.hlb = string;
        if (this.hlb != null) {
            this.cVd();
        } else {
            this.hlf.clear();
        }
    }

    public void ks(String string) {
        if (this.hlc == string || string != null && string.equals(this.hlc) || this.hlc != null && this.hlc.equals(string)) {
            return;
        }
        if (this.hlc != null) {
            this.cVg();
        }
        this.hlc = string;
        if (this.hlc != null) {
            this.cVf();
        } else {
            this.hlg.clear();
        }
    }

    public void dm(String string) {
        if (this.hld == string || string != null && string.equals(this.hld) || this.hld != null && this.hld.equals(string)) {
            return;
        }
        if (this.hld != null) {
            this.cVi();
        }
        this.hld = string;
        if (this.hld != null) {
            this.cVh();
        } else {
            this.hlh.clear();
        }
    }

    public void fK(long l) {
        if (this.hle == l) {
            return;
        }
        if (this.hle != -1L) {
            this.cVk();
        }
        this.hle = l;
        if (this.hle != -1L) {
            this.cVj();
        } else {
            this.hli.clear();
        }
    }

    private void b(Properties properties, String string, String string2) {
        File file = new File(string);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (!(file = new File(string2)).exists()) {
            try {
                file.createNewFile();
            }
            catch (IOException iOException) {
                hkM.warn((Object)("impossible de cr\u00e9er le fichier de compte " + string2 + " : " + iOException.getMessage()));
            }
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(string2);
            properties.load(fileInputStream);
            ((InputStream)fileInputStream).close();
        }
        catch (IOException iOException) {
            hkM.warn((Object)("Impossible de charger le fichier de propri\u00e9t\u00e9s de compte " + string2));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(Properties properties, String string) {
        if (string == null) {
            hkM.warn((Object)"Impossible de sauver les propri\u00e9t\u00e9s d'un fichier inconnu");
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(string);
            properties.store(fileOutputStream, null);
        }
        catch (IOException iOException) {
            hkM.warn((Object)("Probl\u00e8me \u00e0 l'enregistrement du fichier " + string));
        }
        finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                }
                catch (IOException iOException) {
                    hkM.warn((Object)("Probl\u00e8me \u00e0 la fermeture du fichier de propri\u00e9t\u00e9s " + string));
                }
            }
        }
    }

    private void cVc() {
        if (this.hlb == null) {
            return;
        }
        this.cVe();
        if (this.hlc == null) {
            return;
        }
        this.cVg();
        if (this.hld == null) {
            return;
        }
        this.cVi();
        if (this.hle == -1L) {
            return;
        }
        this.cVk();
    }

    public void cVd() {
        if (this.hlb == null) {
            return;
        }
        this.b(this.hlf, this.cVl(), String.format(this.hkT, this.hlb));
        this.cVf();
    }

    public void cVe() {
        if (this.hlb != null) {
            this.a(this.hlf, String.format(this.hkT, this.hlb));
        }
    }

    public void cVf() {
        if (this.hlb != null && this.hlc != null) {
            this.b(this.hlg, this.cVm(), String.format(this.hkU, this.hlb, this.hlc));
            this.cVh();
        }
    }

    public void cVg() {
        if (this.hlb != null && this.hlc != null) {
            this.a(this.hlg, String.format(this.hkU, this.hlb, this.hlc));
        }
    }

    public void cVh() {
        if (this.hlb != null && this.hlc != null && this.hld != null) {
            this.b(this.hlh, this.cVn(), String.format(this.hkV, this.hlb, this.hlc, this.hld));
            this.cVj();
        }
    }

    public void cVi() {
        if (this.hlb != null && this.hlc != null && this.hld != null) {
            this.a(this.hlh, String.format(this.hkV, this.hlb, this.hlc, this.hld));
        }
    }

    public void cVj() {
        if (this.hlb != null && this.hlc != null && this.hld != null && this.hle != -1L) {
            this.b(this.hli, this.cVo(), String.format(this.hkW, this.hlb, this.hlc, this.hld, this.hle));
        }
    }

    public void cVk() {
        if (this.hlb != null && this.hlc != null && this.hld != null && this.hle != -1L) {
            this.a(this.hli, String.format(this.hkW, this.hlb, this.hlc, this.hld, this.hle));
        }
    }

    public String cVl() {
        return String.format(this.hkP, this.hlb);
    }

    public String cVm() {
        return String.format(this.hkQ, this.hlb, this.hlc);
    }

    public String cVn() {
        return String.format(this.hkR, this.hlb, this.hlc, this.hld);
    }

    public String cVo() {
        return this.iw(this.hle);
    }

    public String iw(long l) {
        return String.format(this.hkS, this.hlb, this.hlc, this.hld, l);
    }

    public String cVp() {
        return this.hlc;
    }

    private Properties aX(byte by) {
        switch (by) {
            case 1: {
                return this.hlf;
            }
            case 2: {
                return this.hlg;
            }
            case 3: {
                return this.hlh;
            }
            case 4: {
                return this.hli;
            }
        }
        hkM.warn((Object)("Domaine invalide : " + by));
        return null;
    }

    public void a(byte by, String string, String string2) {
        Properties properties = this.aX(by);
        if (properties == null) {
            return;
        }
        properties.setProperty(string, string2);
        this.cVc();
    }

    public void a(byte by, String string, byte by2) {
        this.a(by, string, String.valueOf(by2));
    }

    public void a(byte by, String string, int n) {
        this.a(by, string, String.valueOf(n));
    }

    public void a(byte by, String string, short s) {
        this.a(by, string, String.valueOf(s));
    }

    public void a(byte by, String string, float f2) {
        this.a(by, string, String.valueOf(f2));
    }

    public void a(byte by, String string, double d2) {
        this.a(by, string, String.valueOf(d2));
    }

    public void a(byte by, String string, long l) {
        this.a(by, string, String.valueOf(l));
    }

    public void b(byte by, String string, boolean bl) {
        this.a(by, string, String.valueOf(bl));
    }

    public String a(byte by, String string) {
        Properties properties = this.aX(by);
        if (properties == null) {
            return null;
        }
        return properties.getProperty(string);
    }

    public boolean b(byte by, String string) {
        return Bw.aK(this.a(by, string));
    }

    public byte c(byte by, String string) {
        return Bw.q(this.a(by, string));
    }

    public short d(byte by, String string) {
        return Bw.r(this.a(by, string));
    }

    public int e(byte by, String string) {
        return Bw.m(this.a(by, string));
    }

    public long f(byte by, String string) {
        return Bw.p(this.a(by, string));
    }

    public float g(byte by, String string) {
        return Bw.o(this.a(by, string));
    }

    public double h(byte by, String string) {
        return Bw.n(this.a(by, string));
    }

    public boolean i(byte by, String string) {
        Properties properties = this.aX(by);
        return properties != null && properties.containsKey(string);
    }

    public void j(byte by, String string) {
        Properties properties = this.aX(by);
        if (properties == null) {
            return;
        }
        properties.remove(string);
    }
}

