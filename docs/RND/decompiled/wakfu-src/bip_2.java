/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Collection;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bIp
 */
public abstract class bip_2
implements aeh_2,
ady_0<ads_0> {
    private static final Logger kfG = Logger.getLogger(bip_2.class);
    public static final String kfH = "map";
    public static final String kfI = "mapId";
    public static final String kfJ = "zoomScale";
    public static final String kfK = "canZoomIn";
    public static final String kfL = "canZoomOut";
    public static final String kfM = "centerX";
    public static final String kfN = "centerY";
    public static final String kfO = "centerZ";
    public static final String kfP = "isMapAvailable";
    public static final String kfQ = "landmarks";
    public static final String[] kfR = new String[]{"map", "zoomScale", "canZoomIn", "canZoomOut", "centerX", "centerY", "centerZ", "isMapAvailable"};
    private static final String[] kfS = new String[]{"centerX", "centerY", "centerZ"};
    private double kfT;
    private double kfU;
    private double kfV;
    private long kfW;
    protected fbb_2 kfX;
    private final bid_2 kfY = new bid_2();
    protected biq_1 kfZ;

    public void dXL() {
        fse_1.gFu().f("landMark.filters", this.kfY.dYJ());
    }

    public fbb_2 dXM() {
        return this.kfX;
    }

    public void a(fbb_2 fbb_22) {
        this.kfX = fbb_22;
        this.kfY.a(this.kfX);
        if (this.kfX != null && this.dYb()) {
            this.dYc();
        }
    }

    public ffp_2 dXN() {
        return this.kfZ;
    }

    public void lv(long l) {
        this.kfW = l;
    }

    public void a(biq_1 biq_12) {
        if (this.dXM() != null) {
            this.dXM().setForceDisplayEntity(false);
        }
        this.kfZ = biq_12;
        fse_1.gFu().a((aef_2)this, kfH, kfI, kfP);
        if (this.kfZ != null) {
            this.kfZ.a(this);
        }
        this.dXZ();
    }

    public void a(ads_0 ads_02, int n, int n2, short s) {
        this.kfY.a(ads_02.Sn(), 0, (float)n, (float)n2, s, aue_0.cVJ().cVK().aqZ());
    }

    public void dXO() {
        aag_0 aag_02 = aie_0.cfn().bmC().bqL();
        this.e(aag_02.bsf(), aag_02.bsg(), aag_02.getAltitude());
    }

    public abstract float getZoomScale();

    public void setZoomScale(float f2) {
        this.dXQ();
    }

    public double bWL() {
        return this.kfT;
    }

    public double bWM() {
        return this.kfU;
    }

    public double dXP() {
        return this.kfV;
    }

    public void e(double d2, double d3, double d4) {
        this.kfT = d2;
        this.kfU = d3;
        this.kfV = d4;
        this.dXR();
    }

    private void dXQ() {
        fse_1.gFu().a((aef_2)this, kfJ, kfK, kfL);
    }

    private void dXR() {
        fse_1.gFu().a((aef_2)this, kfS);
    }

    @Nullable
    protected String dXS() {
        return this.kfZ != null ? this.kfZ.dYr() : null;
    }

    @Override
    public Object eu(String string) {
        return switch (string) {
            case kfP -> this.dYa();
            case kfH -> this.dXS();
            case kfI -> this.dYd();
            case kfJ -> Float.valueOf(this.getZoomScale());
            case kfK -> this.dXU();
            case kfL -> this.dXV();
            case kfM -> this.bWL();
            case kfN -> this.bWM();
            case kfO -> this.dXP();
            case kfQ -> this.kfY;
            default -> null;
        };
    }

    @Override
    public String[] bxk() {
        return kfR;
    }

    public abstract fso_1 dXT();

    public boolean dXU() {
        return this.kfZ != null && this.kfZ.dXU();
    }

    public boolean dXV() {
        return this.kfZ != null && this.kfZ.dXV();
    }

    public void dXW() {
        if (this.dXU()) {
            this.kfZ.b(this);
            this.dXQ();
        }
    }

    public void dXX() {
        if (this.dXV()) {
            this.kfZ.c(this);
            this.dXQ();
        }
    }

    private void dXY() {
        this.dXZ();
    }

    protected void dXZ() {
        boolean bl;
        fbb_2 fbb_22 = this.dXM();
        long l = this.dYd();
        boolean bl2 = bl = l == aue_0.cVJ().cVK().aqZ();
        if (fbb_22 != null) {
            fbb_22.setDisplayPoints(true);
            fbb_22.setDisplayCompass(true);
        }
        this.dYf();
        this.dYh();
        fse_1.gFu().a((aef_2)this, kfH);
    }

    public boolean dYa() {
        if (this.dYb()) {
            return true;
        }
        String string = this.dXS();
        return string != null && bl_0.bl(string);
    }

    public final boolean dYb() {
        return caf_2.lFq.eqR();
    }

    protected final void dYc() {
        if (this.dXM() == null) {
            return;
        }
        cav_2 cav_22 = caf_2.lFq.eqP();
        biy_2.a(cav_22, this.dXM());
        this.kfZ = null;
        this.kfY.dYy();
    }

    public long dYd() {
        if (this.dYb()) {
            return caf_2.lFq.eqP().bhh();
        }
        if (this.kfZ instanceof bic_2) {
            return this.kfZ.Sn();
        }
        if (this.kfZ instanceof bio_2) {
            return ((bio_2)this.kfZ).aqZ();
        }
        return -1L;
    }

    public boolean dYe() {
        return aue_0.cVJ().cVK().aqZ() == this.dYd();
    }

    protected void dYf() {
        fbb_2 fbb_22 = this.dXM();
        if (fbb_22 == null) {
            return;
        }
        try {
            fbb_22.setMapAnmPath(auc_0.kG("worldMapAnmFilePath"));
        }
        catch (fu_0 fu_02) {
            kfG.error((Object)fu_02.getMessage());
        }
        this.dYg();
    }

    protected void dYg() {
        fbb_2 fbb_22 = this.dXM();
        if (fbb_22 == null) {
            return;
        }
        fbb_22.gtl();
        if (this.kfZ != null) {
            Collection<ffp_2> collection = this.kfZ.dYw();
            for (ffp_2 ffp_22 : collection) {
                fbb_22.a(ffp_22);
            }
        }
    }

    protected abstract void dYh();

    public bid_2 dYi() {
        return this.kfY;
    }

    public void a(long l, int n, float f2, float f3, float f4, long l2, String string, Object object, fso_1 fso_12, String string2, float[] fArray) {
        this.kfY.a(l, n, f2, f3, f4, string, object, fso_12, string2, fArray, l2);
    }

    public void k(int n, long l) {
        this.kfY.k(n, l);
    }

    public void a(long l, int n, float f2, float f3, float f4, long l2, String string, Object object, fso_1 fso_12, float[] fArray) {
        this.kfY.a(l, n, f2, f3, f4, l2, string, object, fso_12, fArray);
    }

    public void w(int n, long l) {
        this.kfY.w(n, l);
    }

    public void a(float f2, float f3, float f4, long l, String string, Object object, fso_1 fso_12, float[] fArray) {
        this.kfY.a(f2, f3, f4, l, string, object, fso_12, fArray);
    }

    protected fsn_1 dYj() {
        return this.kfY.dYj();
    }

    public void dYk() {
        this.kfY.dYk();
    }

    public void removeAll() {
        this.kfY.removeAll();
    }

    @Override
    public /* synthetic */ void cellPositionChanged(afW afW2, int n, int n2, short s) {
        this.a((ads_0)afW2, n, n2, s);
    }
}

