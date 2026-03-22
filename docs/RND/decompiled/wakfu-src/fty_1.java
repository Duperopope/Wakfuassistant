/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fTY
 */
public class fty_1
implements ftw_1 {
    private static final Logger vhp = Logger.getLogger(fty_1.class);
    private String cHc;
    private String awN;
    private boolean qvS;
    private boolean vhq;
    private boolean crD = false;

    public fty_1(String string, String string2) {
        this.cHc = string;
        this.awN = string2;
        this.qvS = false;
        this.crD = true;
    }

    public fty_1(String string, String string2, boolean bl) {
        this.cHc = string;
        this.awN = string2;
        this.qvS = bl;
        this.crD = true;
    }

    public fty_1(apd_1 apd_12) {
        if (!apd_12.getName().equalsIgnoreCase("texture") || apd_12.fq("path") == null || apd_12.fq("id") == null) {
            return;
        }
        try {
            apd_1 apd_13;
            this.awN = apd_12.fq("path").bCt();
            apd_1 apd_14 = apd_12.fq("permanent");
            if (apd_14 != null) {
                this.qvS = apd_14.bCu();
            }
            if ((apd_13 = apd_12.fq("overridable")) != null) {
                this.vhq = apd_13.bCu();
            }
            this.cHc = apd_12.fq("id").bCt();
            this.crD = true;
        }
        catch (Exception exception) {
            vhp.error((Object)"Impossible de cr\u00e9er l'instance de texture", (Throwable)exception);
        }
    }

    @Override
    public void k(fhq_2 fhq_22) {
        if (this.crD) {
            fhq_22.a(this.cHc, this.awN, this.qvS, this.vhq);
        }
    }

    @Override
    public void a(ftj_1 ftj_12) {
        if (!this.crD) {
            return;
        }
        String string = ftj_12.gHu();
        ftj_12.a(new ftd_2(null, "loadTexture", string, "\"" + this.cHc + "\"", "\"" + this.awN + "\"", String.valueOf(this.qvS), String.valueOf(this.vhq)));
    }

    @Override
    public boolean isInitialized() {
        return this.crD;
    }
}

