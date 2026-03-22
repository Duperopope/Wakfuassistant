/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from bIF
 */
public class bif_2
extends bip_2
implements afR {
    private static final Logger khb = Logger.getLogger(bif_2.class);
    private static final bif_2 khc = new bif_2();
    public static final String khd = "currentMapName";
    public static final String khe = "currentTerritoryName";
    public static final String khf = "currentTerritoryIconUrl";
    public static final String khg = "currentTerritoryNationName";
    public static final String khh = "currentProtectorDescription";
    public static final String khi = "availableMapsCoords";
    public static final String khj = "displayedPosition";
    public static final String khk = "displayTerritories";
    public static final String khl = "recommendedLevel";
    public static final String khm = "protectorAnimatedElem";
    public static final String khn = "protectorAnimName";
    public static final String[] kho = new String[]{"displayedPosition", "availableMapsCoords", "displayTerritories"};
    public static final String[] khp = new String[kho.length + bip_2.kfR.length];
    private static final int khq = 1000;
    private int epK = -1;
    private ZC khr;
    private float cbl = 1.0f;
    private int khs;
    private int kht;
    private boolean khu;
    private ahk_1 khv;

    private bif_2() {
        big_2.dZd();
    }

    public String dYN() {
        long l = this.dYd();
        if (l != -1L) {
            return aum_0.cWf().a(77, l, new Object[0]);
        }
        return null;
    }

    public static bif_2 dYO() {
        return khc;
    }

    public void setDisplayTerritories(boolean bl) {
        if (this.khu == bl) {
            return;
        }
        this.khu = bl;
        this.dYh();
    }

    public boolean dYs() {
        return this.khu;
    }

    @Override
    public void dXL() {
        super.dXL();
        fse_1.gFu().f("map", this);
    }

    public fbh_2 dYP() {
        return (fbh_2)this.kfX;
    }

    public void a(fbh_2 fbh_22) {
        super.a(fbh_22);
        this.dYf();
        if (fbh_22 == null) {
            this.dYY();
        }
    }

    public void a(float f2, float f3, float f4, long l, Object object, boolean bl) {
        this.a(2, f2, f3, f4, l, object, null, bl);
    }

    public void dYQ() {
        this.dYk();
        bir_1.dZt().removeAll();
    }

    public void a(int n, float f2, float f3, float f4, long l, Object object, String string, boolean bl) {
        if (string == null) {
            string = aum_0.cWf().c("compass", new Object[0]);
        }
        this.a(0L, n, f2, f3, f4, l, string, object, bit_2.kgo, aid_0.dUO, bl);
    }

    public void a(long l, int n, float f2, float f3, float f4, long l2, String string, Object object, fso_1 fso_12, float[] fArray, boolean bl) {
        bir_1.dZt().a(n, l, (int)f2, (int)f3, (int)f4, object, this, bl);
        this.a(f2, f3, f4, l2, string, object, fso_12, fArray);
        this.dYj().pq(true);
    }

    public void x(int n, long l) {
        this.dYk();
        bir_1.dZt().k(n, l);
    }

    public static boolean Hc(int n) {
        return bir_1.dZt().sf(n);
    }

    @Override
    public Object eu(String string) {
        return switch (string) {
            case khi -> adu.buC().buD().toArray();
            case khj -> new StringBuilder("x=").append(this.khs).append(" y=").append(this.kht);
            case khk -> this.khu;
            case khe -> {
                if (this.dYb()) {
                    yield aum_0.cWf().c("desc.havenWorld", new Object[0]);
                }
                Optional<ffl_2> var4_4 = this.dYR();
                if (var4_4.isPresent()) {
                    yield var4_4.get().gvT().dZs();
                }
                if (this.kfZ != null) {
                    yield this.kfZ.dZs();
                }
                yield null;
            }
            case khd -> {
                if (this.dYb()) {
                    yield aum_0.cWf().c("desc.havenWorld", new Object[0]);
                }
                yield this.dYN();
            }
            case khf -> this.dYU().map(n -> auc_0.cVq().a("passportStampIconsPath", "defaultIconPath", n)).orElse(null);
            case khg -> this.dYU().map(n -> aum_0.cWf().a(39, (long)n.intValue(), new Object[0])).orElse(null);
            case khm -> {
                Optional<foP> var4_5 = this.dYS();
                if (var4_5.isPresent()) {
                    yield bTf.Jw(var4_5.get().d());
                }
                yield this.khr;
            }
            case khn -> bkr_0.kny.bkI();
            case khh -> {
                Optional<foP> var4_6 = this.dYS();
                foP var5_8 = var4_6.orElse(this.dYT());
                if (var5_8 == null) {
                    yield null;
                }
                ahv_2 var6_10 = new ahv_2();
                bJu.a(var6_10, (bJr)var5_8);
                yield var6_10.ceL();
            }
            case khl -> {
                if (this.dYb()) {
                    yield null;
                }
                Optional<ffl_2> var4_7 = this.dYR();
                if (var4_7.isPresent()) {
                    ffh_2 var5_9 = (ffh_2)var4_7.get().gvT();
                    yield var5_9.dYn();
                }
                if (this.kfZ != null) {
                    yield this.kfZ.dYn();
                }
                yield null;
            }
            default -> super.eu(string);
        };
    }

    private Optional<ffl_2> dYR() {
        if (this.kfX == null) {
            return Optional.empty();
        }
        return Optional.ofNullable(((fbh_2)this.kfX).getSelectedMapZone());
    }

    private Optional<foP> dYS() {
        Optional<ffl_2> optional = this.dYR();
        if (optional.isEmpty()) {
            return Optional.empty();
        }
        ffq_2 ffq_22 = optional.get().gvT();
        if (!(ffq_22 instanceof bJL)) {
            return Optional.empty();
        }
        bJL bJL2 = (bJL)ffq_22;
        return Optional.ofNullable(bJL2.eaX().doW());
    }

    private foP dYT() {
        bJK bJK2 = (bJK)fpk.sNF.Yn(this.dYW());
        if (bJK2 == null) {
            return null;
        }
        foP foP2 = bJK2.doW();
        if (foP2 == null) {
            return null;
        }
        return foP2;
    }

    private Optional<Integer> dYU() {
        int n = this.dYS().map(foP::d).orElse(this.epK);
        int n2 = bjx_0.klY.HE(n);
        if (n2 == -1 || n2 == 0) {
            return Optional.empty();
        }
        return Optional.of(n2);
    }

    public void dYV() {
        fse_1.gFu().a((aef_2)this, khl, khe, khf, khm, khh);
    }

    public int dYW() {
        if (this.kfZ instanceof bio_2) {
            return ((bio_2)this.kfZ).clk();
        }
        return -1;
    }

    @Override
    public String[] bxk() {
        return khp;
    }

    public void dL(int n, int n2) {
        this.khs = n;
        this.kht = n2;
        fse_1.gFu().a((aef_2)this, khj);
    }

    @Override
    public float getZoomScale() {
        return this.cbl;
    }

    @Override
    public void setZoomScale(float f2) {
        this.cbl = f2;
        super.setZoomScale(f2);
    }

    @Override
    protected void dXZ() {
        super.dXZ();
        this.a(this.dYT());
        this.dYX();
        fse_1.gFu().a((aef_2)this, khe, khh, khe, khd, khf, khg, khl);
    }

    private void dYX() {
        long l;
        if (!aue_0.cVJ().c(cwh_1.eVi())) {
            return;
        }
        if (this.kfZ instanceof bir_2) {
            bir_2 bir_22 = (bir_2)this.kfZ;
            l = bir_22.aYj();
        } else {
            l = 600197L;
        }
        if (this.khv == null || this.khv.ccR() != l) {
            this.dYY();
            if (l != -1L) {
                this.khv = cAY.eHc().r(l, true);
                if (this.khv != null) {
                    this.khv.cI(0.0f);
                    this.khv.br(1.0f, 1000.0f);
                }
            }
        }
    }

    private void dYY() {
        if (this.khv != null) {
            this.khv.dZ(true);
            this.khv.br(0.0f, 1000.0f);
            this.khv = null;
        }
    }

    @Override
    protected void dYh() {
        fbh_2 fbh_22 = this.dYP();
        if (fbh_22 == null) {
            return;
        }
        fbh_22.setAllMapZonesVisible(this.khu && this.kfZ != null && this.kfZ.dYs());
        boolean bl = this.dXU();
        if (bl) {
            fbh_22.setDragEnabled(false);
            fbh_22.setDropEnabled(false);
            fbh_22.setLandMarkZoom(0.75f);
            fbh_22.setUseAlternateTexture(true);
        } else {
            fbh_22.setDragEnabled(true);
            fbh_22.setDropEnabled(true);
            fbh_22.setLandMarkZoom(1.0f);
            fbh_22.setUseAlternateTexture(false);
        }
        fse_1.gFu().a((aef_2)this, khk);
        fse_1.gFu().a((aef_2)this.dYi().dYJ(), "noFilterSelected");
    }

    public void dYZ() {
        ffl_2 ffl_22 = this.dYP().getSelectedMapZone();
        if (ffl_22 == null) {
            return;
        }
        bip_1 bip_12 = (bip_1)ffl_22.gvT();
        if (!bip_12.dXU()) {
            return;
        }
        bip_12.a(this);
    }

    @Override
    public boolean dYa() {
        if (aue_0.cVJ().c(ctw_1.eRl())) {
            return false;
        }
        return super.dYa();
    }

    @Override
    public void a(biq_1 biq_12) {
        if (this.dYb()) {
            this.dYc();
        } else {
            super.a(biq_12);
        }
        if (!this.dYa() && aue_0.cVJ().c(cwh_1.eVi())) {
            aue_0.cVJ().b(cwh_1.eVi());
        }
        this.a(this.dYT());
        fse_1.gFu().a((aef_2)this, "isMapAvailable", khd, khh, khf, khg, khe, khm, khl);
    }

    @Override
    public fso_1 dXT() {
        return bit_2.kgs;
    }

    @Override
    public void dYf() {
        super.dYf();
        fbh_2 fbh_22 = this.dYP();
        if (fbh_22 == null) {
            return;
        }
        acd_1 acd_12 = aue_0.cVJ().cVK().aZw();
        fbh_22.setPlayerMapZone(acd_12.getX(), acd_12.getY());
        this.dYh();
    }

    public void dZa() {
        fse_1.gFu().a((aef_2)this, "isMapAvailable");
    }

    @Override
    public void byq() {
        this.dYQ();
    }

    private void a(foP foP2) {
        int n;
        int n2 = n = foP2 == null ? -1 : foP2.d();
        if (this.epK == n) {
            return;
        }
        this.epK = n;
        if (this.khr != null) {
            this.khr.bpI();
            this.khr = null;
        }
        if (n != -1) {
            this.khr = bTf.Jw(n);
        }
        fse_1.gFu().a((aef_2)this, khm, khn);
    }

    public void dZb() {
        this.dYi().b(bRr.laj);
        if (this.kfZ instanceof bio_2 || this.kfZ instanceof bic_2) {
            this.dYf();
        }
    }

    public void dZc() {
        bih_2.dZf().clear();
        big_2.dZd();
    }

    @Override
    public /* synthetic */ fbb_2 dXM() {
        return this.dYP();
    }

    static {
        System.arraycopy(kho, 0, khp, 0, kho.length);
        System.arraycopy(bip_2.kfR, 0, khp, kho.length, bip_2.kfR.length);
    }
}

