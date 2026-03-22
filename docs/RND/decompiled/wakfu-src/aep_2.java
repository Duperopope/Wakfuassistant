/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

/*
 * Renamed from aEp
 */
public class aep_2 {
    private static final Logger dFw = Logger.getLogger(aep_2.class);
    private static final int dFx = 0;
    public static final aep_2 dFy = new aep_2();
    private final HashMap<String, String> dFz = new HashMap();
    private String aCH;
    private final Object dFA = new Object();

    public void ck(String string) {
        this.aCH = string;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void G(String string, String string2) {
        Object object = this.dFA;
        synchronized (object) {
            this.dFz.put(string, string2);
            this.buR();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String hp(String string) {
        Object object = this.dFA;
        synchronized (object) {
            return this.dFz.get(string);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void buq() {
        Object object = this.dFA;
        synchronized (object) {
            this.dFz.clear();
            try {
                apl_1 apl_12 = apl_1.dw(fq_0.by(this.aCH));
                int n = apl_12.aIA();
                int n2 = apl_12.aIA();
                for (int i = 0; i < n2; ++i) {
                    this.dFz.put(apl_12.aIC(), apl_12.aIC());
                }
                apl_12.close();
            }
            catch (FileNotFoundException fileNotFoundException) {
                dFw.info((Object)"No cache data file");
            }
            catch (IOException iOException) {
                dFw.warn((Object)("Probl\u00e8me \u00e0 l'ouverture des donn\u00e9es de cache : " + iOException.getMessage()), (Throwable)iOException);
            }
            catch (RuntimeException runtimeException) {
                dFw.error((Object)"Runtime exception during fill of ETagMap", (Throwable)runtimeException);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void buR() {
        Object object = this.dFA;
        synchronized (object) {
            try {
                FileOutputStream fileOutputStream = fq_0.bO(this.aCH);
                fs_0 fs_02 = new fs_0(fileOutputStream);
                fs_02.mz(0);
                fs_02.mz(this.dFz.size());
                for (Map.Entry<String, String> entry : this.dFz.entrySet()) {
                    fs_02.bo(entry.getKey());
                    fs_02.bo(entry.getValue());
                }
                fs_02.close();
                fileOutputStream.close();
            }
            catch (IOException iOException) {
                dFw.warn((Object)("Probl\u00e8me \u00e0 la sauvegarde des donn\u00e9es de cache :" + iOException.getMessage()));
            }
        }
    }
}

