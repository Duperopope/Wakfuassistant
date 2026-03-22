/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fAb
 */
public class fab_1
extends faz_2<Object>
implements fiz_1,
fja_2,
fji_2 {
    public static final String tLV = "horizontalScrollBar";
    public static final String tLW = "verticalScrollBar";
    private fey_1 tLX;
    private boolean tLY = false;
    fcj_2 tLZ;
    protected float tMa = -1.0f;
    protected float tMb = -1.0f;
    fsm_1 tMc = new fsm_1();
    boolean tMd;
    private boolean tMe = true;
    protected float tMf;
    int tMg = 1;
    protected boolean tMh;
    boolean tMi;
    boolean tMj;
    int tMk;
    boolean tMl;
    boolean tMm;
    int tMn = -1;
    int tMo = -1;
    int tMp = -1;
    int tMq = -1;
    private fzc_0 tMr = fzc_0.tGG;
    int tMs = 1;
    boolean tMt = true;
    fzi_0 tMu = fzi_0.tHa;
    ArrayList<Point> tMv;
    protected ArrayList<fcv_1> ncz;
    protected fcv_1 tMw;
    fjf_1 tMx = new fjf_1();
    protected ArrayList<Object> jLZ;
    private ArrayList<Object> tMy;
    private ArrayList<Object> tMz;
    faa_2 tMA;
    protected String tMB;
    protected fhs_2 tMC;
    private boolean tMD;
    boolean tME;
    protected fle_1 tMF;
    private fzd_0 tMG;
    private boolean tMH = true;
    private final ArrayList<fjb_1> tMI = new ArrayList();
    private final ArrayList<fjc_2> tMJ = new ArrayList();
    private boolean tMK;
    private boolean tML = false;
    public static long tMM;
    public static final int tMN = 92903173;
    public static final int tMO = 496768218;
    public static final int tMP = -1388513017;
    public static final int tMQ = -917611389;
    public static final int tMR = 1387629604;
    public static final int tMS = -995584913;
    public static final int tMT = 199368327;
    public static final int tMU = 1476414401;
    public static final int tMV = 419166325;
    public static final int tMW;
    public static final int tMX = 400843111;
    public static final int tMY = 237212369;
    public static final int tMZ = -928803358;
    public static final int tNa = -1504693302;
    public static final int tNb = -1019779949;
    public static final int tNc = 560789800;
    public static final int tNd = 417762822;
    public static final int tNe = 1602982231;
    public static final int tNf = -933261026;
    public static final int tNg = -588347635;
    public static final int tNh = -631680873;
    public static final int tNi = -1796676821;
    public static final int tNj = 1324756372;
    public static final int tNk = -1509885811;
    public static final int tNl = 66086416;
    public static final int tNm = -575832990;
    public static final int tNn = 1189020792;
    public static final int tNo = -695376203;
    public static final int tNp = 1177751890;

    protected fab_1() {
        this(false);
    }

    protected fab_1(boolean bl) {
        this.tMi = bl;
    }

    @Override
    public void d(fhv_1 fhv_12) {
        super.d(fhv_12);
        if (fhv_12 instanceof fje_2) {
            this.tMx.aB((fje_2)fhv_12);
        }
    }

    @Override
    protected void eKZ() {
        if (this.tMw != null && this.tMF != null) {
            this.bVe.g(this.tMF.gDq());
        }
        super.eKZ();
    }

    @Override
    public void eKI() {
        this.tLZ.eKI();
        super.eKI();
        this.a(fzq_0.tKa, (fiq_1 fiq_12) -> {
            flw_2 flw_22 = (flw_2)fiq_12;
            fcz_2 fcz_22 = this.tLZ.getSlider();
            if (flw_22.gBD() == fcz_22 || flw_22.gBE() == fcz_22) {
                this.setListOffset(this.ft(flw_22.getValue()));
            }
            return false;
        }, false);
        this.a(fzq_0.tJW, (fiq_1 fiq_12) -> {
            flp_2 flp_22 = (flp_2)fiq_12;
            return this.h(flp_22);
        }, false);
    }

    @Override
    public void gsh() {
        for (fcv_1 fcv_12 : this.ncz) {
            fcv_12.gsh();
        }
        this.tLZ.gsh();
        super.gsh();
    }

    public void a(fjb_1 fjb_12) {
        if (fjb_12 != null && !this.tMI.contains(fjb_12)) {
            this.tMI.add(fjb_12);
        }
    }

    public void b(fjb_1 fjb_12) {
        this.tMI.remove(fjb_12);
    }

    public void a(fjc_2 fjc_22) {
        if (!this.tMJ.contains(fjc_22)) {
            this.tMJ.add(fjc_22);
        }
    }

    public void b(fjc_2 fjc_22) {
        this.tMJ.remove(fjc_22);
    }

    public boolean getEnableDND() {
        return this.tMe;
    }

    public void setEnableDND(boolean bl) {
        if (this.tMe != bl) {
            this.tMe = bl;
            for (int i = this.ncz.size() - 1; i >= 0; --i) {
                this.ncz.get(i).setEnableDND(bl);
            }
        }
    }

    public boolean getScrollOnMouseWheel() {
        return this.tMH;
    }

    public void setScrollOnMouseWheel(boolean bl) {
        this.tMH = bl;
    }

    @Override
    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        for (fcv_1 fcv_12 : this.ncz) {
            fcv_12.setEnabled(bl);
            this.l(fcv_12);
        }
    }

    @Override
    public void setNetEnabled(boolean bl) {
        super.setNetEnabled(bl);
        for (int i = this.ncz.size() - 1; i >= 0; --i) {
            fcv_1 fcv_12 = this.ncz.get(i);
            fcv_12.setNetEnabled(bl);
            this.l(fcv_12);
        }
    }

    @Override
    public fes_2 getWidget(int n, int n2) {
        if (this.uwb || !this.bmg || !this.getAppearance().gE(n, n2) || fbj_1.getInstance().isMovePointMode()) {
            return null;
        }
        Object object = this.ukD ? null : this;
        n -= this.getAppearance().getLeftInset();
        n2 -= this.getAppearance().getBottomInset();
        Object object2 = this.ncz.iterator();
        while (object2.hasNext()) {
            fes_2 fes_22;
            fes_2 fes_23 = object2.next();
            if (fes_23.isUnloading() || (fes_22 = fes_23.getWidget(n - fes_23.getX(), n2 - fes_23.getY())) == null) continue;
            object = fes_22;
        }
        if (this.tMl && !this.tLZ.isUnloading() && (object2 = this.tLZ.getWidget(n - this.tLZ.getX(), n2 - this.tLZ.getY())) != null) {
            object = object2;
        }
        return object;
    }

    public boolean h(flp_2 flp_22) {
        if (this.tMH) {
            float f2 = this.tMf;
            this.setOffset(this.tMf + (float)flp_22.gEo());
            return this.tMf != f2;
        }
        return false;
    }

    @Override
    public void setOffset(float f2) {
        this.tLZ.getSlider().setValue(this.fs(f2));
    }

    @Override
    public float getOffset() {
        return this.tMf;
    }

    private float fs(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (this.tMb == -1.0f || this.tMa == -1.0f) {
            return 1.0f;
        }
        if (this.tMi) {
            float f3 = (float)this.getPotentialColumnCount(this.tMb) - this.tMa + (float)this.tMk;
            if (f2 > f3 + 1.0f) {
                f2 = f3 + 1.0f;
            }
            return f3 == 0.0f ? 0.0f : f2 / f3;
        }
        float f4 = (float)this.getPotentialRowCount(this.tMa) - this.tMb + (float)this.tMk;
        if (f2 > f4 + 1.0f) {
            f2 = f4 + 1.0f;
        }
        return f4 == 0.0f ? 0.0f : 1.0f - f2 / f4;
    }

    private float ft(float f2) {
        float f3;
        float f4;
        if (this.tMi) {
            f4 = (float)this.getPotentialColumnCount(this.tMb) - this.tMa + (float)this.tMk;
            f3 = f4 * f2;
        } else {
            f4 = (float)this.getPotentialRowCount(this.tMa) - this.tMb + (float)this.tMk;
            f3 = f4 * (1.0f - f2);
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        } else if (f3 > f4 + 1.0f) {
            f3 = f4 + 1.0f;
        }
        return f3;
    }

    int getPotentialRowCount(float f2) {
        ArrayList<Object> arrayList = this.getItems();
        if (arrayList == null) {
            return 0;
        }
        return (int)Math.ceil((float)arrayList.size() / f2);
    }

    int getPotentialColumnCount(float f2) {
        ArrayList<Object> arrayList = this.getItems();
        if (arrayList == null) {
            return 0;
        }
        return (int)Math.ceil((float)arrayList.size() / f2);
    }

    public void setListOffset(float f2) {
        this.setListOffset(f2, true);
    }

    public void setListOffset(float f2, boolean bl) {
        float f3 = this.tMf;
        this.tMf = f2;
        int n = (int)((Math.floor(this.tMf) - Math.floor(f3)) * (double)(this.tMi ? this.tMb : this.tMa));
        boolean bl2 = n != 0;
        float f4 = f2 - f3;
        if (bl2) {
            if (f4 > 0.0f) {
                for (var7_7 = 0; var7_7 < n; ++var7_7) {
                    this.ncz.add(this.ncz.remove(0));
                }
            } else if (f4 < 0.0f) {
                for (var7_7 = 0; var7_7 < -n; ++var7_7) {
                    this.ncz.add(0, this.ncz.remove(this.ncz.size() - 1));
                }
            }
        }
        if (bl) {
            this.getListLayout().ox(false);
        }
        if (bl2 && bl) {
            this.aay(n);
        }
        for (fjc_2 fjc_22 : this.tMJ) {
            fjc_22.fV(f2);
        }
    }

    protected void ebw() {
        this.aay(0);
    }

    protected void aay(int n) {
        if (this.tMh || this.ncz == null) {
            return;
        }
        this.gF(n, this.getCurrentOffset());
    }

    protected void gF(int n, int n2) {
        int n3 = 0;
        int n4 = this.ncz.size();
        if (n > 0) {
            n3 = n4 - n;
        } else if (n < 0) {
            n4 = -n;
        }
        while (n3 < n4) {
            if (n3 >= 0 && n3 < this.ncz.size()) {
                int n5 = n3 + n2;
                fcv_1 fcv_12 = this.ncz.get(n3);
                this.a(fcv_12, n5);
            }
            ++n3;
        }
    }

    protected void a(fcv_1 fcv_12, int n) {
        fcv_12.setContentProperty(this.tMB + "#" + n, this.tMC);
        fcv_12.setContent(this.tMG.c(this.jLZ, n));
    }

    protected int getCurrentOffset() {
        if (this.tMi) {
            return GC.B(this.tMf) * GC.C(this.tMb);
        }
        return GC.B(this.tMf) * GC.C(this.tMa);
    }

    public fzc_0 getListLayoutMode() {
        return this.tMr;
    }

    public void setListLayoutMode(fzc_0 fzc_02) {
        if (this.tMr == fzc_02) {
            return;
        }
        this.tMr = fzc_02;
        frs_1 frs_12 = null;
        switch (this.tMr) {
            case tGG: {
                frs_12 = new fag_2(this);
                break;
            }
            case tGH: {
                frs_12 = new fah_1(this);
                break;
            }
            case tGI: {
                frs_12 = new faf_1(this);
            }
        }
        frs_12.aVI();
        this.a(frs_12);
    }

    public int getIsoColumnCount() {
        return this.tMs;
    }

    public void setIsoColumnCount(int n) {
        this.tMs = n;
    }

    public boolean getIsoPositiveFactor() {
        return this.tMt;
    }

    public void setIsoPositiveFactor(boolean bl) {
        this.tMt = bl;
    }

    public void setListFilter(fey_1 fey_12) {
        this.tLX = fey_12;
        if (fey_12 != null) {
            fey_12.jR(this.tLY);
        }
    }

    public fey_1 getListFilter() {
        return this.tLX;
    }

    public boolean isEnableFilterCache() {
        return this.tLY;
    }

    public void setEnableFilterCache(boolean bl) {
        this.tLY = bl;
        if (this.tLX != null) {
            this.tLX.jR(bl);
        }
    }

    public boolean isUsePositionTween() {
        return this.ukT;
    }

    public void setHorizontal(boolean bl) {
        this.tMi = bl;
        this.tLZ.setHorizontal(bl);
        this.setOffset(this.tMf);
        this.tMD = true;
        this.setNeedsToPreProcess();
    }

    public boolean getHorizontal() {
        return this.tMi;
    }

    public void setCellSize(fsm_1 fsm_12) {
        this.tMc = fsm_12;
        this.tMD = true;
        this.setNeedsToPreProcess();
    }

    public boolean getAdaptCellSizeToContentSize() {
        return this.tMd;
    }

    public void setAdaptCellSizeToContentSize(boolean bl) {
        this.tMd = bl;
    }

    @Override
    public void setNeedsScissor(boolean bl) {
        super.setNeedsScissor(bl);
    }

    public fzi_0 getScrollbarBehaviour() {
        return this.tMu;
    }

    public void setScrollBar(boolean bl) {
        this.tMu = bl ? fzi_0.tHb : fzi_0.tHc;
    }

    public boolean isScrollBarDisplayed() {
        switch (this.tMu) {
            case tHb: {
                return true;
            }
            case tHc: {
                return false;
            }
        }
        return this.tMl;
    }

    public void setScrollBarBehaviour(fzi_0 fzi_02) {
        this.tMu = fzi_02;
    }

    @Nullable
    public fsm_1 getSliderMinDimension() {
        return this.tLZ.getSliderMinDimension();
    }

    public void setSliderMinDimension(@Nullable fsm_1 fsm_12) {
        this.tLZ.setSliderMinDimension(fsm_12);
    }

    public float getSliderMinSize() {
        return this.tLZ.getSliderMinSize();
    }

    public void setSliderMinSize(float f2) {
        this.tLZ.setSliderMinSize(f2);
    }

    public axb_2 getMouseOverColor() {
        if (this.tMF == null) {
            return null;
        }
        return this.tMF.gDp();
    }

    public void setMouseOverColor(axb_2 axb_22) {
        if (axb_22 != null) {
            if (this.tMF == null) {
                this.tMF = new fle_1();
                this.tMF.aVI();
                this.setNeedsToResetMeshes();
            }
            this.tMF.setColor(axb_22);
        } else {
            if (this.tMF != null) {
                if (this.bVe != null) {
                    this.bVe.h(this.tMF.gDq());
                }
                this.tMF.aVH();
            }
            this.tMF = null;
            this.setNeedsToResetMeshes();
        }
    }

    public int getMinDisplayedCells() {
        return this.tMg;
    }

    public void setMinDisplayedCells(int n) {
        this.tMg = n;
        this.tMD = true;
        this.setNeedsToPreProcess();
    }

    public boolean isAutoIdealSize() {
        return this.tMm;
    }

    public void setAutoIdealSize(boolean bl) {
        this.tMm = bl;
        this.tMD = true;
        this.setNeedsToPreProcess();
    }

    public void setAutoIdealSize(boolean bl, int n, int n2) {
        this.tMm = bl;
        this.tMn = n;
        this.tMo = n2;
        this.tMD = true;
        this.setNeedsToPreProcess();
    }

    public void setAutoIdealSize(boolean bl, int n, int n2, int n3, int n4) {
        this.tMm = bl;
        this.tMn = n;
        this.tMo = n2;
        this.tMp = n3;
        this.tMq = n4;
        this.tMD = true;
        this.setNeedsToPreProcess();
    }

    public int getIdealSizeMaxColumns() {
        return this.tMo;
    }

    public void setIdealSizeMaxColumns(int n) {
        this.tMo = n;
        this.tMD = true;
        this.setNeedsToPreProcess();
    }

    public int getIdealSizeMaxRows() {
        return this.tMn;
    }

    public void setIdealSizeMaxRows(int n) {
        this.tMn = n;
        this.tMD = true;
        this.setNeedsToPreProcess();
    }

    public int getIdealSizeMinColumns() {
        return this.tMq;
    }

    public void setIdealSizeMinColumns(int n) {
        this.tMq = n;
        this.tMD = true;
        this.setNeedsToPreProcess();
    }

    public int getIdealSizeMinRows() {
        return this.tMp;
    }

    public void setIdealSizeMinRows(int n) {
        this.tMp = n;
        this.tMD = true;
        this.setNeedsToPreProcess();
    }

    public void setShowOneMore(boolean bl) {
        this.tMk = bl ? 1 : 0;
        this.tMD = true;
        this.setNeedsToPreProcess();
    }

    public fzd_0 getScrollMode() {
        return this.tMG;
    }

    public void setScrollMode(fzd_0 fzd_02) {
        this.tMG = fzd_02;
    }

    public faa_2 getAlign() {
        return this.tMA;
    }

    public void setAlign(faa_2 faa_22) {
        if (this.tMi) {
            if (faa_22 == faa_2.tLL || faa_22 == faa_2.tLO || faa_22 == faa_2.tLR) {
                this.tMA = faa_22;
            }
        } else if (faa_22 == faa_2.tLN || faa_22 == faa_2.tLO || faa_22 == faa_2.tLP) {
            this.tMA = faa_22;
        }
    }

    public boolean isOppositeScrollBarPosition() {
        return this.tMj;
    }

    public void setOppositeScrollBarPosition(boolean bl) {
        this.tMj = bl;
    }

    @Deprecated
    public fsm_1 getWishedMinSize() {
        return this.getPrefSize();
    }

    @Deprecated
    public void setWishedMinSize(fsm_1 fsm_12) {
        this.setPrefSize(fsm_12);
    }

    public fsm_1 getIdealSize() {
        return this.getIdealSize(-1, -1);
    }

    public fsm_1 getIdealSize(int n, int n2) {
        fsm_1 fsm_12 = this.getContentIdealSize(n, n2, -1, -1);
        int n3 = fsm_12.width;
        int n4 = fsm_12.height;
        return new fsm_1(n3 += this.uki.getLeftInset() + this.uki.getRightInset(), n4 += this.uki.getTopInset() + this.uki.getBottomInset());
    }

    public fsm_1 getContentIdealSize(int n, int n2, int n3, int n4) {
        int n5 = 10;
        int n6 = 10;
        int n7 = this.aVo();
        int n8 = n4 == -1 ? Integer.MIN_VALUE : n4;
        int n9 = n2 == -1 ? Integer.MAX_VALUE : n2;
        int n10 = n3 == -1 ? Integer.MIN_VALUE : n3;
        int n11 = n == -1 ? Integer.MAX_VALUE : n;
        int n12 = 0;
        int n13 = 0;
        if (this.tMc.gGe() == -1.0f || this.tMc.gGd() == -1.0f) {
            if (this.tMc.gGd() != -1.0f) {
                var14_14 = (int)(1.0f / this.tMc.gGd() * 100.0f);
                n13 = Math.max(n8, Math.min(n9, var14_14));
                n12 = Math.max(n10, Math.min(n11, this.getPotentialRowCount(n13)));
            } else if (this.tMc.gGe() != -1.0f) {
                var14_14 = (int)(1.0f / this.tMc.gGe() * 100.0f);
                n12 = Math.max(n10, Math.min(n11, var14_14));
                n13 = Math.max(n8, Math.min(n9, this.getPotentialColumnCount(n12)));
            } else {
                boolean bl;
                var14_14 = n2 >= 0 || n4 >= 0 ? 1 : 0;
                boolean bl2 = bl = n >= 0 || n3 >= 0;
                if (var14_14 != 0 && !bl) {
                    n13 = Math.min(Math.max(n2, n4), n7);
                    n12 = this.getPotentialRowCount(n13);
                } else if (var14_14 == 0 && bl) {
                    n12 = Math.min(Math.max(n, n3), n7);
                    n13 = this.getPotentialColumnCount(n12);
                } else if (var14_14 != 0 && bl) {
                    if (this.tMi) {
                        n12 = Math.max(n10, Math.min(n, this.getPotentialRowCount(Math.max(1, n8))));
                        n13 = Math.max(n8, Math.min(n2, this.getPotentialColumnCount(n12)));
                    } else {
                        n13 = Math.max(n8, Math.min(n2, this.getPotentialColumnCount(Math.max(1, n10))));
                        n12 = Math.max(n10, Math.min(n, this.getPotentialRowCount(n13)));
                    }
                } else if (this.tMi) {
                    n12 = 1;
                    n13 = n7;
                } else {
                    n13 = 1;
                    n12 = n7;
                }
            }
            n6 = this.tMc.height * n12;
            n5 = this.tMc.width * n13;
        }
        if (n13 * n12 < n7 && this.tMu != fzi_0.tHc || this.tMu == fzi_0.tHb) {
            fsm_1 fsm_12 = this.tLZ.getPrefSize();
            if (this.tMi) {
                n6 += fsm_12.height;
            } else {
                n5 += fsm_12.width;
            }
        }
        return new fsm_1(n5, n6);
    }

    @Override
    public boolean isAppearanceCompatible(fys_0 fys_02) {
        return fys_02 instanceof fza;
    }

    @Override
    public fza getAppearance() {
        return (fza)this.uki;
    }

    public fcj_2 getScrollBar() {
        return this.tLZ;
    }

    @Override
    public fes_2 getWidgetByThemeElementName(String string, boolean bl) {
        if (this.tMi && tLV.equalsIgnoreCase(string) || !this.tMi && tLW.equalsIgnoreCase(string)) {
            return this.tLZ;
        }
        return super.getWidgetByThemeElementName(string, bl);
    }

    public int getOffsetByValue(Object object) {
        int n;
        for (n = 0; n < this.getItems().size() && this.getItems().get(n) != object; ++n) {
        }
        if (n == this.getItems().size()) {
            return -1;
        }
        return n;
    }

    public fcv_1 getRenderableByOffset(int n) {
        int n2 = this.tMi ? n - (int)(Math.floor(this.tMf) * Math.ceil(this.tMb)) : n - (int)(Math.floor(this.tMf) * Math.ceil(this.tMa));
        if (n2 < 0 || n2 >= this.ncz.size()) {
            return null;
        }
        return this.ncz.get(n2);
    }

    public int getOffsetByRenderable(fcv_1 fcv_12) {
        if (fcv_12 == null || this.jLZ == null) {
            return -1;
        }
        int n = this.tMi ? (int)(Math.floor(this.tMf) * Math.ceil(this.tMb)) + this.ncz.indexOf(fcv_12) : (int)(Math.floor(this.tMf) * Math.ceil(this.tMa)) + this.ncz.indexOf(fcv_12);
        if (n >= this.jLZ.size()) {
            n = -1;
        }
        return n;
    }

    @Override
    public fes_2 getWidget(String string, int n) {
        if (n >= 0 && n < this.ncz.size()) {
            return this.ncz.get(n);
        }
        return null;
    }

    float gG(int n, int n2) {
        float f2;
        if (this.tMi) {
            if (this.tMA != faa_2.tLO) {
                f2 = (float)Math.floor((float)n / (float)n2);
            } else if (this.jLZ != null && this.jLZ.size() > 0) {
                int n3 = (int)Math.floor((double)n / (double)n2);
                f2 = Math.min(this.jLZ.size(), n3);
            } else {
                f2 = 0.0f;
            }
        } else {
            f2 = (float)n / (float)n2;
        }
        return f2;
    }

    float gH(int n, int n2) {
        float f2;
        if (this.tMi) {
            f2 = (float)n / (float)n2;
        } else if (this.tMA != faa_2.tLO) {
            f2 = (int)Math.floor((double)n / (double)n2);
        } else if (this.jLZ != null && this.jLZ.size() > 0) {
            int n3 = (int)Math.floor((double)n / (double)n2);
            f2 = Math.min(this.jLZ.size(), n3);
        } else {
            f2 = 0.0f;
        }
        return f2;
    }

    void gsi() {
        if (this.tMl) {
            if (this.tMi) {
                float f2 = this.getPotentialColumnCount(this.tMb);
                if (this.tMb + (float)this.tMk > 0.0f && f2 - this.tMa + (float)this.tMk > 0.0f) {
                    this.tLZ.setEnabled(true);
                    this.tLZ.setButtonJump(1.0f / (f2 - this.tMa + (float)this.tMk));
                    this.tLZ.setSliderSize(this.tMa / (f2 + (float)this.tMk));
                } else {
                    this.tLZ.setButtonJump(0.0f);
                    this.tLZ.setEnabled(false);
                }
            } else {
                float f3 = this.getPotentialRowCount(this.tMa);
                if (this.tMa + (float)this.tMk > 0.0f && f3 - this.tMb + (float)this.tMk > 0.0f) {
                    this.tLZ.setEnabled(true);
                    this.tLZ.setButtonJump(1.0f / (f3 - this.tMb + (float)this.tMk));
                    this.tLZ.setSliderSize(this.tMb / (f3 + (float)this.tMk));
                } else {
                    this.tLZ.setButtonJump(0.0f);
                    this.tLZ.setEnabled(false);
                }
            }
        }
    }

    public void gsj() {
        this.jLZ = this.tMz;
        this.tMz = null;
        this.gsl();
        this.tMK = true;
        this.tMD = true;
        this.setNeedsToPreProcess();
    }

    public fai_1 getListLayout() {
        return (fai_1)((Object)this.tRg);
    }

    @Override
    @NotNull
    protected fcv_1 gsk() {
        fcv_1 fcv_12 = super.gsk();
        fcv_12.setCollection(this);
        fcv_12.setNonBlocking(this.ukD);
        fcv_12.setRendererManager(this.tMx);
        fcv_12.setEnableDND(this.tMe);
        fcv_12.setEnabled(this.cHn);
        fcv_12.setNetEnabled(this.ivk);
        this.l(fcv_12);
        fai_1 fai_12 = this.getListLayout();
        if (fai_12 != null) {
            fcv_12.getAppearance().setShape(fai_12.gso());
        }
        return fcv_12;
    }

    protected int j(@NotNull fcv_1 fcv_12) {
        String string = fcv_12.getContentProperty();
        if (string == null) {
            return -1;
        }
        String string2 = this.tMB + "#";
        if (!string.startsWith(string2)) {
            return -1;
        }
        try {
            String string3 = string.substring(string2.length());
            return Integer.parseInt(string3);
        }
        catch (NumberFormatException numberFormatException) {
            return -1;
        }
    }

    protected int k(fcv_1 fcv_12) {
        this.ncz.add(fcv_12);
        this.d(fcv_12);
        this.tMv.add(new Point());
        return this.ncz.indexOf(fcv_12);
    }

    public boolean isHorizontal() {
        return this.tMi;
    }

    public ArrayList<Object> getItems() {
        if (this.tMz != null) {
            return this.tMz;
        }
        return this.jLZ;
    }

    @Override
    public Iterable<Object> getUnfilteredContent() {
        return this.tMy;
    }

    @Override
    public void setContentProperty(String string, fhs_2 fhs_22) {
        this.tMB = string;
        this.tMC = fhs_22;
    }

    @Override
    public void setContent(@NotNull Iterable<Object> iterable, boolean bl) {
        if (this.uwm) {
            return;
        }
        this.tMz = new ArrayList();
        if (!bl) {
            this.tMy = new ArrayList();
        }
        for (Object object : iterable) {
            if (!bl) {
                this.tMy.add(object);
            }
            if (this.tLX != null && !this.tLX.aG(object)) continue;
            this.tMz.add(object);
        }
        if (!this.tML) {
            this.setOffset(0.0f);
        }
        if (this.tMw != null && !this.tMz.contains(this.tMw.getItemValue())) {
            this.tMw = null;
        }
        this.setNeedsToPreProcess();
        this.setNeedsToResetMeshes();
    }

    void gsl() {
        this.tMf = this.tMG.a(this.tMf, this.jLZ, this.tMi, this.tMa, this.tMb, this.tMk);
    }

    @Override
    public int getTableIndex(fcv_1 fcv_12) {
        return this.ncz.indexOf(fcv_12) + GC.B(this.tMf) * GC.C(this.tMi ? this.tMb : this.tMa);
    }

    @Override
    public int getItemIndex(Object object) {
        int n = 0;
        if (this.jLZ != null) {
            for (Object object2 : this.jLZ) {
                if (object2 == object) {
                    return n;
                }
                ++n;
            }
        }
        return -1;
    }

    @Override
    public ArrayList<fcv_1> getRenderables() {
        return this.ncz;
    }

    public fsm_1 getCellSize() {
        return this.tMc;
    }

    private void f(Object object, int n) {
        this.jLZ.add(n, object);
    }

    @Override
    public void aV(Object object) {
        if (this.jLZ == null) {
            this.jLZ = new ArrayList();
        }
        this.f(object, this.jLZ.size());
        this.tMD = true;
        this.setNeedsToPreProcess();
    }

    @Override
    public boolean f(int n, Object object) {
        if (this.jLZ == null) {
            this.jLZ = new ArrayList();
        }
        if (n >= 0 || n <= this.jLZ.size()) {
            this.f(object, n);
            this.tMD = true;
            this.setNeedsToPreProcess();
            return true;
        }
        return false;
    }

    @Override
    public int p(Object object, Object object2) {
        int n = -1;
        if (this.jLZ != null) {
            for (int i = 0; i < this.jLZ.size(); ++i) {
                if (object != this.jLZ.get(i)) continue;
                this.f(object2, i);
                n = i;
                break;
            }
            if (n != -1) {
                this.tMD = true;
                this.setNeedsToPreProcess();
            }
        }
        return n;
    }

    public void c(ArrayList<azx_1<Object, Integer>> arrayList, ArrayList<azx_1<Object, Integer>> arrayList2) {
        Point point;
        int n;
        int n2;
        fcv_1 fcv_12;
        int n3;
        int n4;
        Object object;
        int n5;
        ArrayList<fcv_1> arrayList3 = new ArrayList<fcv_1>(this.ncz.size());
        ArrayList<Object> arrayList4 = new ArrayList<Object>(this.jLZ.size());
        arrayList3.addAll(this.ncz);
        arrayList4.addAll(this.jLZ);
        int n6 = 400;
        for (n5 = 0; n5 < arrayList.size(); ++n5) {
            object = arrayList.get(n5).getFirst();
            n4 = arrayList.get(n5).aHI();
            n3 = this.jLZ.indexOf(object);
            fcv_12 = this.getRenderableByOffset(n3);
            if (fcv_12 != null) {
                n2 = this.ncz.indexOf(fcv_12);
                if (n2 != (n = n2 - n3 + n4)) {
                    fcv_12.x(fsd_2.class);
                    fcv_12.x(fsb_2.class);
                    fcv_12.a(new fsd_2(null, new Rectangle(0, this.tMc.height, this.tMc.width, 0), fcv_12, false, 0, 400, abn.cdr));
                    point = this.tMv.get(n);
                    fcv_12.a(new fsb_2(fcv_12.getX(), fcv_12.getY(), point.x, point.y, fcv_12, 400, 0, abn.cdp));
                    fcv_12.a(new fsd_2(new Rectangle(0, this.tMc.height, this.tMc.width, 0), new Rectangle(0, 0, this.tMc.width, this.tMc.height), fcv_12, true, 400, 400, abn.cdr));
                }
                if (n >= 0 && n < this.ncz.size()) {
                    arrayList3.set(n, fcv_12);
                }
            }
            arrayList4.set(n4, object);
        }
        for (n5 = 0; n5 < arrayList2.size(); ++n5) {
            object = arrayList2.get(n5).getFirst();
            n4 = arrayList2.get(n5).aHI();
            n3 = this.jLZ.indexOf(object);
            if (n3 == n4) continue;
            fcv_12 = this.getRenderableByOffset(n3);
            if (fcv_12 != null) {
                n2 = this.ncz.indexOf(fcv_12);
                n = n2 - n3 + n4;
                fcv_12.x(fsb_2.class);
                point = this.tMv.get(n);
                fcv_12.a(new fsb_2(fcv_12.getX(), fcv_12.getY(), point.x, point.y, fcv_12, 400, 400, abn.cdr));
                if (n >= 0 && n < this.ncz.size()) {
                    arrayList3.set(n, fcv_12);
                }
            }
            arrayList4.set(n4, object);
        }
        this.ncz = arrayList3;
        this.jLZ = arrayList4;
    }

    public void g(Object object, int n) {
        this.c(object, n, false);
    }

    public void c(Object object, int n, boolean bl) {
        fcv_1 fcv_12;
        int n2 = this.jLZ.indexOf(object);
        if (n < 0 || n >= this.jLZ.size() || n2 == n) {
            return;
        }
        if (bl && (fcv_12 = this.getRenderableByOffset(n2)) != null) {
            int n3 = this.ncz.indexOf(fcv_12);
            Point point = fcv_12.ukp;
            int n4 = Math.max(0, n3 - n2 + n);
            if (n2 < n) {
                for (int i = n3 + 1; i <= n4; ++i) {
                    fcv_1 fcv_13 = this.ncz.get(i);
                    fcv_13.a(new fsb_2(fcv_13.getX(), fcv_13.getY(), point.x, point.y, fcv_13, 700, 300, abn.cdr));
                    point = fcv_13.ukp;
                }
            } else {
                for (int i = n3 - 1; i >= n4; --i) {
                    fcv_1 fcv_14 = this.ncz.get(i);
                    fcv_14.a(new fsb_2(fcv_14.getX(), fcv_14.getY(), point.x, point.y, fcv_14, 700, 300, abn.cdr));
                    point = fcv_14.ukp;
                }
            }
            fcv_12.a(new fsd_2(null, new Rectangle(0, this.tMc.height, this.tMc.width, 0), fcv_12, false, 0, 700, abn.cdr));
            fcv_12.a(new fsb_2(fcv_12.getX(), fcv_12.getY(), point.x, point.y, fcv_12, 700, 0, abn.cdp));
            fcv_12.a(new fsd_2(new Rectangle(0, this.tMc.height, this.tMc.width, 0), new Rectangle(0, 0, this.tMc.width, this.tMc.height), fcv_12, true, 700, 700, abn.cdr));
            this.ncz.add(n4, this.ncz.remove(n3));
        }
        this.jLZ.add(n, this.jLZ.remove(n2));
        this.tMD = true;
        this.setNeedsToPreProcess();
    }

    public void q(Object object, Object object2) {
        boolean bl;
        int n = this.jLZ.indexOf(object);
        int n2 = this.jLZ.indexOf(object2);
        if (n == -1 || n2 == -1) {
            return;
        }
        int n3 = (int)(Math.floor(this.tMf) * (double)(this.tMi ? this.tMb : this.tMa));
        int n4 = (int)(Math.floor(this.tMf + (this.tMi ? this.tMa : this.tMb)) * (double)(this.tMi ? this.tMb : this.tMa));
        boolean bl2 = n >= n3 && n <= n4;
        boolean bl3 = bl = n2 >= n3 && n2 <= n4;
        if (bl2 && bl) {
            fcv_1 fcv_12 = this.getRenderableByOffset(n);
            fcv_1 fcv_13 = this.getRenderableByOffset(n2);
            fcv_12.a(new fsd_2(null, new Rectangle(fcv_12.getX(), this.tMc.height + fcv_12.getY(), this.tMc.width, 0), fcv_12, false, 0, 250, abn.cdp));
            fcv_12.a(new fsb_2(fcv_12.getX(), fcv_12.getY(), fcv_13.getX(), fcv_13.getY(), fcv_12, 250, 0, abn.cdp));
            fcv_12.a(new fsd_2(new Rectangle(fcv_12.getX(), this.tMc.height + fcv_12.getY(), this.tMc.width, 0), new Rectangle(fcv_12.getX(), fcv_12.getY(), this.tMc.width, this.tMc.height), fcv_12, true, 250, 250, abn.cdp));
            fcv_13.a(new fsd_2(null, new Rectangle(fcv_13.getX(), this.tMc.height + fcv_13.getY(), this.tMc.width, 0), fcv_13, false, 0, 250, abn.cdp));
            fcv_13.a(new fsb_2(fcv_13.getX(), fcv_13.getY(), fcv_12.getX(), fcv_12.getY(), fcv_13, 250, 0, abn.cdp));
            fcv_13.a(new fsd_2(new Rectangle(fcv_13.getX(), this.tMc.height + fcv_13.getY(), this.tMc.width, 0), new Rectangle(fcv_13.getX(), fcv_13.getY(), this.tMc.width, this.tMc.height), fcv_13, true, 250, 250, abn.cdp));
        } else if (bl2 || bl) {
            if (!bl2) {
                fcv_1 fcv_14 = this.getRenderableByOffset(n2);
                abb_2.bUA().a(new fac_2(this, fcv_14, object), 250L, 0, 1L);
                fcv_14.a(new fsd_2(null, new Rectangle(fcv_14.getX(), this.tMc.height + fcv_14.getY(), this.tMc.width, 0), fcv_14, false, 0, 250, abn.cdr));
                fcv_14.a(new fsd_2(new Rectangle(fcv_14.getX(), this.tMc.height + fcv_14.getY(), this.tMc.width, 0), new Rectangle(fcv_14.getX(), fcv_14.getY(), this.tMc.width, this.tMc.height), fcv_14, true, 250, 250, abn.cdr));
            } else {
                fcv_1 fcv_15 = this.getRenderableByOffset(n);
                abb_2.bUA().a(new fad_2(this, fcv_15, object2), 250L, 0, 1L);
                fcv_15.a(new fsd_2(null, new Rectangle(fcv_15.getX(), this.tMc.height + fcv_15.getY(), this.tMc.width, 0), fcv_15, false, 0, 250, abn.cdr));
                fcv_15.a(new fsd_2(new Rectangle(fcv_15.getX(), this.tMc.height + fcv_15.getY(), this.tMc.width, 0), new Rectangle(fcv_15.getX(), fcv_15.getY(), this.tMc.width, this.tMc.height), fcv_15, true, 250, 250, abn.cdr));
            }
        }
        this.jLZ.set(n, object2);
        this.jLZ.set(n2, object);
    }

    @Override
    public void aW(Object object) {
        this.jLZ.remove(object);
        this.tMD = true;
        this.setNeedsToPreProcess();
    }

    @Override
    public boolean r(Object object, Object object2) {
        boolean bl = false;
        if (this.jLZ != null) {
            for (int i = 0; i < this.jLZ.size(); ++i) {
                if (object != this.jLZ.get(i)) continue;
                this.jLZ.set(i, object2);
                bl = true;
                break;
            }
            if (bl) {
                this.tMD = true;
                this.setNeedsToPreProcess();
            }
            return bl;
        }
        return false;
    }

    @Override
    public Object getValue(int n) {
        if (this.jLZ != null) {
            return this.jLZ.get(n);
        }
        return null;
    }

    @Override
    public int aVo() {
        ArrayList<Object> arrayList = this.getItems();
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override
    protected void b(fiq_1 fiq_12, boolean bl) {
        if (!(fiq_12.gBF() || fiq_12.gBy() != fzq_0.tJB && fiq_12.gBy() != fzq_0.tJC)) {
            fiq_12.oZ(true);
            fhy_2.gBq().eHP();
        }
    }

    @Override
    public void aVH() {
        super.aVH();
        this.ncz.clear();
        this.tMv.clear();
        this.jLZ = null;
        this.tMz = null;
        if (this.tLX != null) {
            this.tLX.a(null);
            this.tLX.brX();
        }
        this.tLX = null;
        this.tMB = null;
        this.tMC = null;
        this.tMx = null;
        if (this.tMF != null) {
            if (this.bVe != null) {
                this.bVe.h(this.tMF.gDq());
            }
            this.tMF.aVH();
            this.tMF = null;
        }
        this.tMw = null;
        this.tMI.clear();
        this.tMJ.clear();
    }

    @Override
    public void aVI() {
        super.aVI();
        this.ukD = false;
        this.tMK = false;
        fza fza2 = new fza();
        fza2.aVI();
        fza2.setWidget(this);
        this.d(fza2);
        fag_2 fag_22 = new fag_2(this);
        fag_22.aVI();
        this.a(fag_22);
        this.tLZ = new fcj_2();
        this.tLZ.aVI();
        this.tLZ.setCanBeCloned(false);
        this.tLZ.setHorizontal(this.tMi);
        this.d(this.tLZ);
        this.tMG = fzd_0.tGK;
        if (!this.tMi) {
            this.tLZ.getSlider().setValue(1.0f);
            this.tMA = faa_2.tLL;
        } else {
            this.tMA = faa_2.tLN;
        }
        this.ncz = new ArrayList();
        this.tMv = new ArrayList();
        this.tMe = true;
        this.tMH = true;
        this.ukW = true;
    }

    @Override
    public void bFM() {
        super.bFM();
    }

    @Override
    public boolean LZ(int n) {
        boolean bl = super.LZ(n);
        if (this.tMz != null) {
            this.gsj();
            this.tME = true;
            this.setNeedsToPostProcess();
        }
        if (this.tMD) {
            super.gsm();
            this.bFM();
            this.tMD = false;
        }
        return bl;
    }

    @Override
    public void gsm() {
    }

    @Override
    public boolean LY(int n) {
        boolean bl = super.LY(n);
        if (this.tME) {
            this.ebw();
            this.tME = false;
        }
        if (this.tMK) {
            for (int i = this.tMI.size() - 1; i >= 0; --i) {
                this.tMI.get(i).eOq();
            }
            this.tMK = false;
        }
        return bl;
    }

    public void setKeepOffset(boolean bl) {
        if (this.tML == bl) {
            return;
        }
        this.tML = bl;
    }

    @Override
    public void setHideContainerWithoutItem(boolean bl) {
        super.setHideContainerWithoutItem(bl);
        for (fcv_1 fcv_12 : this.ncz) {
            fcv_12.setHideWithoutItem(this.isHideContainerWithoutItem());
        }
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fab_1 fab_12 = (fab_1)fhi_22;
        super.a(fhi_22);
        fab_12.setAlign(this.tMA);
        fab_12.setAdaptCellSizeToContentSize(this.tMd);
        fab_12.setAutoIdealSize(this.tMm, this.tMn, this.tMo, this.tMp, this.tMq);
        fab_12.setCellSize((fsm_1)this.tMc.clone());
        fab_12.setHorizontal(this.tMi);
        fab_12.setMinDisplayedCells(this.tMg);
        fab_12.setMouseOverColor(this.getMouseOverColor());
        fab_12.setOffset(this.tMf);
        fab_12.setOppositeScrollBarPosition(this.tMj);
        fab_12.setShowOneMore(this.tMk > 0);
        fab_12.setScrollBarBehaviour(this.tMu);
        fab_12.setEnableDND(this.tMe);
        fab_12.setListFilter(this.tLX);
        fab_12.setEnableFilterCache(this.tLY);
        fab_12.setScrollMode(this.tMG);
        fab_12.setListLayoutMode(this.tMr);
        fab_12.setIsoColumnCount(this.tMs);
        fab_12.setIsoPositiveFactor(true);
        fab_12.setScrollOnMouseWheel(this.tMH);
        fab_12.ukM = true;
        if (this.jLZ != null) {
            fab_12.setContent(this.jLZ);
        }
        fab_12.setKeepOffset(this.tML);
        fab_12.setNeedsToPreProcess();
        for (int i = fab_12.tRe.size() - 1; i >= 0; --i) {
            fes_2 fes_22 = (fes_2)fab_12.tRe.get(i);
            if (fes_22 == fab_12.tLZ) continue;
            fes_22.gAD();
        }
        fab_12.setSliderMinDimension(this.getSliderMinDimension());
        fab_12.setSliderMinSize(this.getSliderMinSize());
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 92903173) {
            this.setAlign(faa_2.tI(string));
        } else if (n == 496768218) {
            this.setAdaptCellSizeToContentSize(Bw.aK(string));
        } else if (n == -1388513017) {
            this.setAutoIdealSize(Bw.aK(string));
        } else if (n == -917611389) {
            this.setCellSize(fic_12.vn(string));
        } else if (n == 1387629604) {
            this.setHorizontal(Bw.aK(string));
        } else if (n == -995584913) {
            this.setIdealSizeMaxColumns(Bw.m(string));
        } else if (n == 199368327) {
            this.setIdealSizeMaxRows(Bw.m(string));
        } else if (n == 1476414401) {
            this.setIdealSizeMinColumns(Bw.m(string));
        } else if (n == 419166325) {
            this.setIdealSizeMinRows(Bw.m(string));
        } else if (n == 237212369) {
            this.setListOffset(Bw.m(string));
        } else if (n == -928803358) {
            this.setMinDisplayedCells(Bw.m(string));
        } else if (n == -1504693302) {
            this.setMouseOverColor(fic_12.vm(string));
        } else if (n == -1019779949) {
            this.setOffset(Bw.m(string));
        } else if (n == 560789800) {
            this.setOppositeScrollBarPosition(Bw.aK(string));
        } else if (n == 417762822) {
            this.setScrollBar(Bw.aK(string));
        } else if (n == 1602982231) {
            this.setScrollBarBehaviour(fzi_0.tw(string));
        } else if (n == -933261026) {
            this.setShowOneMore(Bw.aK(string));
        } else if (n == -588347635) {
            this.setPrefSize(fic_12.vn(string));
        } else if (n == -631680873) {
            this.setEnableDND(Bw.aK(string));
        } else if (n == -1509885811) {
            this.setIsoPositiveFactor(Bw.aK(string));
        } else if (n == 1324756372) {
            this.setIsoColumnCount(Bw.m(string));
        } else if (n == 66086416) {
            this.setScrollMode(fic_12.b(fzd_0.class, string));
        } else if (n == -575832990) {
            this.setScrollOnMouseWheel(Bw.aK(string));
        } else if (n == -1796676821) {
            this.setListLayoutMode(fic_12.b(fzc_0.class, string));
        } else if (n == 400843111) {
            this.setEnableFilterCache(Bw.aK(string));
        } else if (n == 1189020792) {
            this.setKeepOffset(Bw.b(string, false));
        } else if (n == -695376203) {
            this.setSliderMinDimension(fic_12.vn(string));
        } else if (n == 1177751890) {
            this.setSliderMinSize(Bw.o(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 237212369) {
            this.setListOffset(Bw.m(object));
        } else if (n == -1019779949) {
            this.setOffset(Bw.m(object));
        } else if (n == 417762822) {
            this.setScrollBar(Bw.l(object));
        } else if (n == -995584913) {
            this.setIdealSizeMaxColumns(Bw.m(object));
        } else if (n == 199368327) {
            this.setIdealSizeMaxRows(Bw.m(object));
        } else if (n == 1476414401) {
            this.setIdealSizeMinColumns(Bw.m(object));
        } else if (n == 419166325) {
            this.setIdealSizeMinRows(Bw.m(object));
        } else if (n == tMW) {
            this.setListFilter((fey_1)object);
        } else if (n == 400843111) {
            this.setEnableFilterCache(Bw.l(object));
        } else if (n == -631680873) {
            this.setEnableDND(Bw.l(object));
        } else if (n == -1509885811) {
            this.setIsoPositiveFactor(Bw.l(object));
        } else if (n == 1189020792) {
            this.setKeepOffset(Bw.l(object));
        } else if (n == -695376203) {
            this.setSliderMinDimension((fsm_1)object);
        } else if (n == 1177751890) {
            this.setSliderMinSize(Bw.o(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }

    @Override
    public String getStyleTag() {
        return "List";
    }

    static {
        tMW = "listFilter".hashCode();
    }
}

