/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cTl
 */
public class ctl_2
implements adi_1 {
    private static final Logger nIz = Logger.getLogger(ctl_2.class);
    public static final ctl_2 nIA = new ctl_2();
    private fed_1 nIB;
    private String nIC;
    private float nID = 1.0f;
    private boolean lJA;
    private ctn_1 nIE;
    private boolean bYZ = false;

    private ctl_2() {
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (this.bYZ) {
            return;
        }
        this.bYZ = true;
        ctl_2.ePw();
        this.ePt();
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!this.bYZ) {
            return;
        }
        this.bYZ = false;
        ctl_2.ePv();
        this.ePu();
    }

    private void ePt() {
        this.nIE = new ctn_1();
        fse_1.gFu().f("video", this.nIE);
        fhv_1 fhv_12 = ccj_2.g("videoCinematicDialog", 8464L);
        this.nIB = (fed_1)fhv_12.getElementMap().uH("video");
        if (this.nIB == null) {
            nIz.error((Object)"On n'a pas trouv\u00e9 le video widget dans la dialog");
        } else {
            this.nIB.a(this.nIE.ePA());
        }
        fyw_0.gqw().d("wakfu.videoCinematic", chr_1.class);
    }

    private void ePu() {
        fyw_0.gqw().tl("videoCinematicDialog");
        fyw_0.gqw().tc("wakfu.videoCinematic");
        this.nIB = null;
    }

    private static void ePv() {
        axm_1 axm_12 = aie_0.cfn().bmE();
        aam_0 aam_02 = aie_0.cfn().bmC();
        axm_12.a(aam_02, false);
        cAY.eHc().g(1.0f, 500);
        cAY.eHc().f(1.0f, 500);
        cAY.eHc().e(1.0f, 500);
    }

    protected static void ePw() {
        axm_1 axm_12 = aie_0.cfn().bmE();
        aam_0 aam_02 = aie_0.cfn().bmC();
        axm_12.a(aam_02);
        cAY.eHc().g(0.0f, 500);
        cAY.eHc().f(0.0f, 500);
        cAY.eHc().e(0.0f, 500);
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 19095: {
                this.ePy();
                return false;
            }
            case 17455: {
                dae_0 dae_02 = (dae_0)aam_22;
                this.w((Runnable)dae_02.bCv());
                return false;
            }
            case 12657: 
            case 13668: {
                return true;
            }
        }
        return false;
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

    public void setVolume(float f2) {
        this.nID = f2;
    }

    public void setDebugMode(boolean bl) {
        this.lJA = bl;
    }

    public void ePx() {
        if (this.nIB != null) {
            this.nIB.gvf();
        }
    }

    public void ePy() {
        if (!this.bYZ) {
            nIz.error((Object)"On veut jouer la video mais la frame n'est pas encore push\u00e9");
        }
        if (this.nIB == null) {
            return;
        }
        if (this.nIB instanceof fej_2) {
            ((fej_2)this.nIB).setEndedVideoRunnable(() -> crh_2.eML().bCj());
        }
        this.nIB.setVideoPath(this.nIC);
        this.nIB.setDebugMode(this.lJA);
        this.nIB.setKeepRatio(true);
        this.nIB.setVolume(this.nID);
        this.nIB.a(new bxz_2());
        this.nIB.a(new bye_2(this.nIB));
        this.nIB.ccA();
        this.nIB.setPaused(false);
    }

    public void w(Runnable runnable) {
        if (this.nIB != null && this.nIB.isPlaying()) {
            this.nIB.a(new ctm_2(runnable));
        } else {
            runnable.run();
            aue_0.cVJ().b(this);
        }
    }
}

