/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cYH
 */
public class cyh_2
implements adi_1 {
    protected static final Logger nZb = Logger.getLogger(cyh_2.class);
    private static final cyh_2 nZc = new cyh_2();
    private String nIC;
    private boolean lJA;
    aaj_0 bRH;
    final Runnable nZd = new cyi_1(this);
    private alx_2 ikv;

    public static cyh_2 eYs() {
        return nZc;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        aam_22.d();
        return true;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public void setVideoPath(String string) {
        this.nIC = string;
    }

    public void setDebugMode(boolean bl) {
        this.lJA = bl;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            if (this.nIC == null) {
                nZb.error((Object)"Impossible de charger la frame de lecture video sans d\u00e9finir la video \u00e0 jouer");
                return;
            }
            this.ikv = string -> {
                if (string.equals("videoLoadingDialog")) {
                    aue_0.cVJ().b(cyh_2.eYs());
                }
            };
            fyw_0.gqw().a(this.ikv);
            axm_1 axm_12 = aie_0.cfn().bmE();
            aam_0 aam_02 = aie_0.cfn().bmC();
            axm_12.a(aam_02);
            cAY.eHc().ed(false);
            if (!this.eYt()) {
                aue_0.cVJ().b(cyh_2.eYs());
            }
            fyw_0.gqw().d("wakfu.videoLoading", chs_1.class);
            fse_1.gFu().f("isNewWorldReady", false);
            abg_2.bUP().a(this.nZd, 500L);
        }
    }

    public void h(aaj_0 aaj_02) {
        this.bRH = aaj_02;
    }

    private boolean eYt() {
        try {
            fhv_1 fhv_12 = ccj_2.g("videoLoadingDialog", 8448L);
            fed_1 fed_12 = (fed_1)fhv_12.getElementMap().uH("video");
            fed_12.setDebugMode(this.lJA);
            fed_12.setVideoPath(this.nIC);
            fed_12.ccA();
            fed_12.setPaused(false);
            fed_12.a(new cyj_2(this));
            return true;
        }
        catch (Exception exception) {
            nZb.error((Object)("Erreur durant la tentative de lecture de la video " + this.nIC), (Throwable)exception);
            fyw_0.gqw().tl("videoLoadingDialog");
            return false;
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            axm_1 axm_12 = aie_0.cfn().bmE();
            aam_0 aam_02 = aie_0.cfn().bmC();
            axm_12.a(aam_02, false);
            cAY.eHc().ed(true);
            this.nIC = null;
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("videoLoadingDialog");
            this.bRH = null;
            fse_1.gFu().vX("isNewWorldReady");
            fyw_0.gqw().tc("wakfu.videoLoading");
        }
    }
}

