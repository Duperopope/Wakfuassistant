/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fEd
 */
public abstract class fed_1
extends fes_2 {
    private static final int uiW = 32;
    private static final int uiX = 32;
    private static final int uiY = 4096;
    private static final int uiZ = 4096;
    protected static final Logger uja = Logger.getLogger(fed_1.class);
    public static final String TAG = "Video";
    protected fgd_1 ujb;
    private String awN;
    private boolean lJA;
    private fef_1 ujc;
    private boolean dPv;
    private float nID;
    private long ujd;
    private boolean uje;
    private final fhw_1 ujf = new fee_1(this);
    public static final int ujg = 1332819776;
    public static final int ujh = -1760125050;
    public static final int uji = -630741988;

    protected fed_1() {
    }

    public static fed_1 checkOut() {
        fej_2 fej_22 = new fej_2();
        ((fed_1)fej_22).aVI();
        return fej_22;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.ujb.aVH();
        this.ujb = null;
        this.ujd = -1L;
        this.uje = false;
        this.ujc = fef_1.ujk;
        fyw_0.gqw().gqD().b(this.ujf);
    }

    @Override
    public void aVI() {
        super.aVI();
        this.uje = false;
        this.nID = 1.0f;
        this.ujc = fef_1.ujk;
        this.dPv = false;
        this.awN = null;
        this.ujd = 0L;
        fys_0 fys_02 = fys_0.checkOut();
        fys_02.setWidget(this);
        this.d(fys_02);
        this.setNeedsToPreProcess();
        if (fyw_0.gqw().gqD() != null) {
            fyw_0.gqw().gqD().a(this.ujf);
        }
        this.ujb = new fgd_1();
        this.ujb.aVI();
        this.ujb.setFlipVerticaly(true);
        this.setMinSize(new fsm_1(32, 32));
        this.setMaxSize(new fsm_1(4096, 4096));
        this.setSize(this.getMinSize());
    }

    protected void setState(fef_1 fef_12) {
        this.ujc = fef_12;
    }

    public String getVideoPath() {
        return this.awN;
    }

    public void setVideoPath(String string) {
        this.awN = string;
    }

    public boolean getDebugMode() {
        return this.lJA;
    }

    public void setDebugMode(boolean bl) {
        this.lJA = bl;
    }

    public void ccA() {
        if (this.isPlaying()) {
            return;
        }
        if (this.isPaused()) {
            this.setPaused(false);
            return;
        }
        if (this.gve()) {
            this.ujc = fef_1.ujl;
            this.setNeedsToPreProcess();
        } else {
            uja.info((Object)"Unable to set video as 'PLAYING'");
        }
    }

    protected abstract boolean gve();

    public void setPaused(boolean bl) {
        if (!this.isInitialized()) {
            return;
        }
        if (this.oH(bl)) {
            this.ujc = bl ? fef_1.ujm : fef_1.ujl;
        }
        this.setNeedsToPreProcess();
    }

    public abstract void setSpu(int var1);

    protected abstract boolean oH(boolean var1);

    public abstract boolean gvf();

    public boolean isPaused() {
        return this.ujc == fef_1.ujm;
    }

    public boolean isPlaying() {
        return this.ujc == fef_1.ujl;
    }

    public abstract void fB(float var1);

    public abstract void a(ahz_2 var1);

    public boolean isInitialized() {
        return this.ujc != fef_1.ujk;
    }

    public abstract long getVideoDuration();

    protected abstract long getVideoPosition();

    protected abstract awr_1 getVideoTextureProducer();

    public void setVolume(float f2) {
        if (f2 > this.nID) {
            this.dPv = false;
        }
        this.nID = f2;
        this.fC(this.dPv ? 0.0f : f2);
    }

    protected abstract void fC(float var1);

    public float getVolume() {
        return this.nID;
    }

    public void oI(boolean bl) {
        if (bl == this.dPv) {
            return;
        }
        this.dPv = bl;
        this.fC(this.dPv ? 0.0f : this.nID);
    }

    public boolean isMuted() {
        return this.dPv;
    }

    @Override
    public boolean LZ(int n) {
        boolean bl = super.LZ(n);
        if (!this.isInitialized()) {
            return bl;
        }
        long l = this.getVideoPosition();
        if (this.ujd != l) {
            this.ujd = l;
            flz_2 flz_22 = new flz_2(this);
            flz_22.bj(this.ujd);
            flz_22.setValue(l);
            this.h(flz_22);
        }
        return this.isPlaying() || bl;
    }

    @Override
    public boolean LY(int n) {
        super.LY(n);
        if (this.getVideoTextureProducer().bPN() && this.uki != null) {
            this.ujb.a(this.getVideoTextureProducer(), this.uki.getMargin(), this.uki.getBorder(), this.uki.getPadding());
        }
        return true;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isAppearanceCompatible(fys_0 fys_02) {
        return true;
    }

    @Override
    protected void eKZ() {
        super.eKZ();
        if (this.bVe != null && this.ujb != null && this.ujb.getEntity() != null) {
            this.bVe.g(this.ujb.getEntity());
        }
    }

    @Override
    public void setSize(int n, int n2) {
        super.setSize(n, n2);
        this.ujb.setSize(n, n2);
        this.setNeedsToPreProcess();
    }

    public void setOnTimeChange(fmr_1 fmr_12) {
        this.a(fzq_0.tKd, fmr_12, false);
    }

    public void setKeepRatio(boolean bl) {
        this.uje = bl;
        this.ujb.setKeepRatio(this.uje);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 1332819776) {
            this.setVideoPath(string);
        } else if (n == -630741988) {
            this.a(fzq_0.tKd, fic_12.b(fmr_1.class, string), false);
        } else if (n == -1760125050) {
            this.setKeepRatio(fic_12.b(Boolean.class, string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 1332819776) {
            this.setVideoPath((String)object);
        } else if (n == -1760125050) {
            this.setKeepRatio((Boolean)object);
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

