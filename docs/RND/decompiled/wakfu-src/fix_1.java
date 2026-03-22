/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.net.URL;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fIX
 */
public class fix_1 {
    private static final Logger uDd = Logger.getLogger(fix_1.class);
    private final ArrayList<fhv_1> uDe;
    private final int uDf;
    private final String uDg;
    private final URL uDh;
    private final fhk_1 uDi;
    private static int laa = 0;

    protected fix_1(String string, int n) {
        fyc_0 fyc_02 = fyw_0.gqw().te(string);
        if (fyc_02 == null) {
            throw new Exception("Ressource invalide : " + string);
        }
        if (fyc_02.tCR != null) {
            fhk_1 fhk_12 = null;
            try {
                fhk_12 = fyc_02.tCR.newInstance();
            }
            catch (Exception exception) {
                // empty catch block
            }
            this.uDh = null;
            this.uDi = fhk_12;
        } else {
            this.uDi = null;
            this.uDh = fyc_02.tCS;
        }
        this.uDf = n;
        this.uDg = string;
        this.uDe = new ArrayList(n);
    }

    private boolean y(fhv_1 fhv_12) {
        if (this.uDe.size() < this.uDf) {
            this.uDe.add(fhv_12);
            return true;
        }
        return false;
    }

    public fhv_1 gCB() {
        if (this.uDe.size() > 0) {
            return this.uDe.remove(0);
        }
        return null;
    }

    public int acu() {
        return this.uDf;
    }

    public String gCC() {
        return this.uDg;
    }

    public boolean gCD() {
        return this.uDf > this.uDe.size();
    }

    public void gCE() {
        fhu_1 fhu_12 = fyw_0.gqw().gqC();
        while (this.gCD()) {
            fhv_1 fhv_12 = null;
            fhs_2 fhs_22 = fhu_12.uP(this.uDg + laa++);
            if (this.uDi != null) {
                fhv_12 = (fhv_1)this.uDi.a(fhu_12, fhs_22);
            } else if (this.uDh != null) {
                try {
                    fhv_12 = fyw_0.gqw().a(this.uDh, fhu_12, fhs_22, false, null, null, null);
                }
                catch (Exception exception) {
                    uDd.error((Object)("Probl\u00e8me lors du changement d'un xml : " + String.valueOf(this.uDh)), (Throwable)exception);
                }
            }
            if (fhv_12 == null) continue;
            if (!this.y(fhv_12)) {
                fhv_12.aZp();
                continue;
            }
            uDd.info((Object)("Chargement d'une ressource " + this.uDg));
        }
    }

    public void clean() {
        for (int i = this.uDe.size() - 1; i >= 0; --i) {
            this.uDe.get(i).aZp();
        }
        this.uDe.clear();
    }
}

