/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fDq
 */
public class fdq_1
extends faz_2<aef_2>
implements fcx_1,
fgn_2,
fiz_1,
fja_2,
fji_2,
fyo_0 {
    public static final String TAG = "table";
    public static final String udP = "button";
    public static final String udQ = "directSortButton";
    public static final String udR = "indirectSortButton";
    public static final String udS = "oddCell";
    public static final String udT = "evenCell";
    public static final String udU = "scrollBar";
    public static final String udV = "mouseOver";
    public static final String udW = "mouseOverCell";
    public static final String udX = "selected";
    ArrayList<fad_1> nam;
    ArrayList<fgm_2> udY;
    ArrayList<aef_2> jLZ;
    private List<aef_2> udZ;
    private fey_1 tLX;
    private boolean tLY = false;
    ArrayList<fcv_1> ncz;
    fcj_2 tLZ;
    boolean tMl = false;
    boolean tMh;
    int crT;
    private int tTA = -1;
    private int uea = -1;
    private fcv_1 tTz;
    fcv_1 tMw;
    private String tMB = null;
    private fhs_2 tMC = null;
    private boolean ueb;
    private boolean uec;
    int[] dwq = null;
    ArrayList<fle_1> ued;
    private fle_1 tMF;
    private fle_1 uee;
    private fle_1 tPK;
    fzi_0 tMu;
    int uef;
    int ueg;
    int tQy;
    private boolean tMe;
    fgo_2 ueh;
    private axb_2 uei;
    private axb_2 uej;
    private boolean tTu = true;
    private boolean tTt;
    private boolean tTv = true;
    private final ArrayList<fjb_1> uek = new ArrayList();
    private final ArrayList<fjc_2> uel = new ArrayList();
    private boolean tML = false;
    @NotNull
    private final fis_1 uem = fiq_12 -> !this.isEnabledFull();
    @NotNull
    private final fis_1 uen = fiq_12 -> {
        flp_2 flp_22 = (flp_2)fiq_12;
        this.setOffset(this.crT + flp_22.gEo());
        return false;
    };
    @NotNull
    private final fis_1 ueo = fiq_12 -> {
        flw_2 flw_22 = (flw_2)fiq_12;
        this.setTableOffset(this.fA(flw_22.getValue()));
        return false;
    };
    @NotNull
    private final List<fmg_2> uep = new LinkedList<fmg_2>();
    public static final int ueq = -1675365079;
    public static final int uer = -631680873;
    public static final int ues = 1063854923;
    public static final int uet = 844056925;
    public static final int ueu = 1602982231;
    public static final int uev = 1039818982;
    public static final int uew = -1763504454;
    public static final int uex = 1189020792;
    public static final int uey = "tableFilter".hashCode();
    public static final int uez = 400843111;
    public static final int ueA = 901829030;
    public static final int ueB = "tableModel".hashCode();

    @Override
    @NotNull
    protected fcv_1 gsk() {
        fcv_1 fcv_12 = super.gsk();
        fcv_12.setCollection(this);
        fcv_12.setNonBlocking(this.ukD);
        fcv_12.setEnableDND(this.tMe);
        fcv_12.setEnabled(this.cHn);
        fcv_12.setNetEnabled(this.ivk);
        this.l(fcv_12);
        fcv_12.setCanBeCloned(false);
        fcv_12.a(fzq_0.tJS, (fiq_1 fiq_12) -> {
            if (this.isEnabledFull() && this.isSelectEvent(fiq_12)) {
                fcv_1 fcv_12;
                this.setMousePressedAppearanceState(fcv_12, this.tTz == (fcv_12 = (fcv_1)fiq_12.gBD()));
            }
            return false;
        }, false);
        fcv_12.a(fzq_0.tJU, (fiq_1 fiq_12) -> {
            if (this.isEnabledFull() && this.isSelectEvent(fiq_12)) {
                fcv_1 fcv_12 = (fcv_1)fiq_12.gBD();
                fcv_1 fcv_13 = this.tTt && this.tTz == fcv_12 ? null : fcv_12;
                this.p(fcv_13);
                this.setMousePressedAppearanceState(fcv_12, this.tTz == fcv_12);
            }
            return false;
        }, false);
        fcv_12.a(fzq_0.tJT, (fiq_1 fiq_12) -> {
            if (this.isEnabledFull()) {
                fcv_1 fcv_12;
                this.setMouseOverAppearanceState(fcv_12, this.tTz == (fcv_12 = (fcv_1)fiq_12.gBD()));
            }
            return false;
        }, false);
        fcv_12.a(fzq_0.tJQ, (fiq_1 fiq_12) -> {
            fcv_1 fcv_12;
            if (this.isEnabledFull() && (fcv_12 = (fcv_1)fiq_12.gBD()).getItemValue() != null) {
                this.o(this.tMw);
                this.tMw = fcv_12;
                this.setMouseOverAppearanceState(this.tMw, this.tTz == fcv_12);
                if (this.tMF != null) {
                    this.tMF.f(0, this.tMw.getY(), this.uki.getContentWidth() - this.tLZ.getWidth(), this.tMw.getHeight(), this.uki.getTopInset(), this.uki.getBottomInset(), this.uki.getLeftInset(), this.uki.getRightInset());
                    this.setNeedsToResetMeshes();
                }
                if (this.uee != null) {
                    this.uee.a(this.tMw.getPosition(), this.tMw.getSize(), this.uki.getTotalInsets());
                }
            }
            return false;
        }, false);
        fcv_12.a(fzq_0.tJR, (fiq_1 fiq_12) -> {
            if (this.isEnabledFull()) {
                this.b(this.tMw, this.tTz == fcv_12);
                this.tMw = null;
                this.setNeedsToResetMeshes();
            }
            return false;
        }, false);
        return fcv_12;
    }

    public boolean isSelectEvent(fiq_1 fiq_12) {
        if (!this.tTu) {
            return false;
        }
        if (!this.tTv) {
            return true;
        }
        if (!(fiq_12 instanceof flp_2)) {
            return false;
        }
        return ((flp_2)fiq_12).gEk();
    }

    protected void r(fcv_1 fcv_12) {
        this.ncz.add(fcv_12);
        this.d(fcv_12);
        int n = this.ncz.indexOf(fcv_12);
        this.a(fcv_12, this.tTA == n);
    }

    @Override
    public void d(fhv_1 fhv_12) {
        super.d(fhv_12);
        if (fhv_12 instanceof fgm_2) {
            fgm_2 fgm_22 = (fgm_2)fhv_12;
            this.a(fgm_22, fgm_22.isVisible());
            fgm_22.setVisibilityListener(this);
        }
    }

    private void h(fgm_2 fgm_22) {
        this.udY.add(fgm_22);
        this.udY.sort(Comparator.comparingInt(fgm_2::getColumnIndex));
        fad_1 fad_12 = new fad_1();
        fad_12.aVI();
        this.d(fad_12);
        fad_12.setElementMap(this.nQt);
        fad_12.setChildrenAdded(true);
        fad_12.setCanBeCloned(false);
        fad_12.setPixmapAlign(fzx_0.tLs);
        String string = this.getStyle();
        StringBuilder stringBuilder = new StringBuilder(TAG);
        if (string != null) {
            stringBuilder.append(string);
        }
        stringBuilder.append("$").append(udP);
        String string2 = stringBuilder.toString();
        fad_12.setStyle(string2, true);
        fad_12.setText(fgm_22.getName());
        fad_12.setEnabled(this.cHn && fgm_22.getSortable());
        fad_12.setNetEnabled(this.ivk);
        if (fgm_22.getHeaderAlignment() != null) {
            fad_12.setAlign(fgm_22.getHeaderAlignment());
        }
        if (!fgm_22.getSortable()) {
            fad_12.setPixmap(null);
        }
        fad_12.a(fzq_0.tJU, new fdr_2(this, fgm_22, fad_12, string2, string), false);
        this.nam.add(this.udY.indexOf(fgm_22), fad_12);
        this.setTableDirty();
    }

    @Override
    protected void eKZ() {
        for (int i = this.ued.size() - 1; i >= 0; --i) {
            this.bVe.g(this.ued.get(i).gDq());
        }
        if (this.tPK != null && this.tTz != null) {
            this.bVe.g(this.tPK.gDq());
        }
        if (this.tMF != null && this.tMw != null) {
            this.bVe.g(this.tMF.gDq());
        }
        if (this.uee != null && this.tMw != null) {
            this.bVe.g(this.uee.gDq());
        }
        super.eKZ();
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public fes_2 getWidgetByThemeElementName(String string, boolean bl) {
        if (string.equals(udU)) {
            return this.tLZ;
        }
        return super.getWidgetByThemeElementName(string, bl);
    }

    @Override
    public void setColor(axb_2 axb_22, String string) {
        if (string == null || string.equals(udV)) {
            if (axb_22 != null) {
                if (this.tMF == null) {
                    this.tMF = new fle_1();
                    this.tMF.aVI();
                    this.setNeedsToResetMeshes();
                }
                this.tMF.setColor(axb_22);
            } else {
                if (this.tMF != null) {
                    this.tMF.aVH();
                }
                this.tMF = null;
                this.setNeedsToResetMeshes();
            }
        } else if (string.equals(udW)) {
            if (axb_22 != null) {
                if (this.uee == null) {
                    this.uee = new fle_1();
                    this.uee.aVI();
                    this.setNeedsToResetMeshes();
                }
                this.uee.setColor(axb_22);
            } else {
                if (this.uee != null) {
                    this.uee.aVH();
                }
                this.uee = null;
                this.setNeedsToResetMeshes();
            }
        } else if (string.equals(udX)) {
            if (axb_22 != null) {
                if (this.tPK == null) {
                    this.tPK = new fle_1();
                    this.tPK.aVI();
                    this.setNeedsToResetMeshes();
                }
                this.tPK.setColor(axb_22);
            } else {
                if (this.tPK != null) {
                    this.tPK.aVH();
                }
                this.tPK = null;
                this.setNeedsToResetMeshes();
            }
        } else if (string.equals(udT)) {
            this.uei = axb_22;
        } else if (string.equals(udS)) {
            this.uej = axb_22;
        }
    }

    @Override
    public void setContentProperty(String string, fhs_2 fhs_22) {
        this.tMB = string;
        this.tMC = fhs_22;
    }

    public void setSelectionable(boolean bl) {
        this.tTu = bl;
    }

    @Override
    public boolean isSelectable() {
        return this.tTu;
    }

    public boolean isSelectOnlyOnLeftClick() {
        return this.tTv;
    }

    public void setSelectOnlyOnLeftClick(boolean bl) {
        this.tTv = bl;
    }

    public fzi_0 getScrollBarBehaviour() {
        return this.tMu;
    }

    public void setScrollBarBehaviour(fzi_0 fzi_02) {
        this.tMu = fzi_02;
    }

    public int getCellHeight() {
        return this.uef;
    }

    public void setCellHeight(int n) {
        this.uef = n;
    }

    public int getMinRows() {
        return this.ueg;
    }

    public void setMinRows(int n) {
        this.ueg = n;
    }

    public int getMaxRows() {
        return this.tQy;
    }

    public void setMaxRows(int n) {
        this.tQy = n;
    }

    public boolean isEnableDND() {
        return this.tMe;
    }

    public void setEnableDND(boolean bl) {
        this.tMe = bl;
    }

    @Override
    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        for (fcv_1 fcv_12 : this.ncz) {
            fcv_12.setEnabled(bl);
            this.l(fcv_12);
        }
        int n = this.nam.size();
        for (int i = 0; i < n; ++i) {
            this.nam.get(i).setEnabled(bl && this.udY.get(i).getSortable());
        }
    }

    @Override
    public void setNetEnabled(boolean bl) {
        super.setNetEnabled(bl);
        for (fcv_1 fcv_12 : this.ncz) {
            fcv_12.setNetEnabled(bl);
            this.l(fcv_12);
        }
        int n = this.nam.size();
        for (int i = 0; i < n; ++i) {
            this.nam.get(i).setNetEnabled(bl);
        }
    }

    @Override
    public void setContent(@NotNull Iterable<aef_2> iterable, boolean bl) {
        assert (this.jLZ != null);
        aef_2 aef_22 = null;
        if (this.tTA != -1) {
            aef_22 = this.jLZ.get(this.dwq[this.tTA]);
        }
        this.jLZ.clear();
        for (aef_2 aef_23 : iterable) {
            if (bl && this.tLX != null && !this.tLX.aG(aef_23)) continue;
            this.jLZ.add(aef_23);
        }
        if (!bl) {
            this.udZ = new ArrayList<aef_2>(this.jLZ);
        }
        this.dwq = null;
        if (!this.tML) {
            this.setOffset(0.0f);
        }
        int n = this.getSelectedOffsetByValue(aef_22);
        if (!(this.crT != 0 && this.getRenderableByOffset(this.crT) != null || this.tML)) {
            this.setOffset(0.0f);
        }
        this.n(this.tTz);
        if (n != -1) {
            this.setSelectedOffset(n, false);
        } else {
            aef_2 aef_23;
            this.tTA = GC.a(this.tTA, -1, this.jLZ.size() - 1);
            this.tTz = this.getRenderableByOffset(this.tTA);
            this.setSelectedAppearanceState(this.tTz);
            if (this.dwq == null) {
                this.guB();
            }
            aef_23 = null;
            if (this.tTA != -1) {
                aef_23 = this.jLZ.get(this.dwq[this.tTA]);
            }
            if (aef_22 != aef_23) {
                flz_2 flz_22 = new flz_2(this);
                flz_22.bj(aef_22);
                flz_22.setValue(aef_23);
                this.h(flz_22);
            }
            this.gth();
        }
        this.setTableDirty();
        this.setValuesDirty();
    }

    fcv_1 getRenderableByPosition(int n, int n2) {
        int n3 = n * this.udY.size() + n2;
        if (n3 < 0 || n3 >= this.ncz.size()) {
            return null;
        }
        return this.ncz.get(n3);
    }

    private void setTableDirty() {
        this.uec = true;
        this.setNeedsToPreProcess();
    }

    void setValuesDirty() {
        this.ueb = true;
        this.setNeedsToPostProcess();
    }

    public void setTableFilter(fey_1 fey_12) {
        this.tLX = fey_12;
        if (this.tLX != null) {
            this.tLX.a(this);
            this.tLX.jR(this.tLY);
        }
    }

    public fey_1 getTableFilter() {
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

    @Override
    public Object getValue(int n) {
        if (n < 0 || n >= this.jLZ.size()) {
            return null;
        }
        return this.jLZ.get(n);
    }

    @Override
    public int getTableIndex(fcv_1 fcv_12) {
        return this.ncz.indexOf(fcv_12);
    }

    @Override
    public int getItemIndex(Object object) {
        return this.jLZ.indexOf(object);
    }

    @Override
    public Iterable<aef_2> getUnfilteredContent() {
        return this.udZ;
    }

    @Override
    public fes_2 getWidget(String string, int n) {
        if (n >= 0 && n < this.ncz.size()) {
            return this.ncz.get(n);
        }
        return null;
    }

    @Override
    public ArrayList<fcv_1> getRenderables() {
        return this.ncz;
    }

    public void setTableModel(fgo_2 fgo_22) {
        this.ueh = fgo_22;
    }

    public fgo_2 getTableModel() {
        return this.ueh;
    }

    @Override
    public float getOffset() {
        return this.crT;
    }

    @Override
    public void setOffset(float f2) {
        if ((float)this.crT == f2) {
            return;
        }
        float f3 = this.fs(f2);
        this.tLZ.getSlider().setValue(f3, true);
    }

    private void setTableOffset(int n) {
        if (this.crT == n) {
            return;
        }
        this.crT = n;
        for (fjc_2 fjc_22 : this.uel) {
            fjc_22.fV(n);
        }
        this.setValuesDirty();
    }

    public int getSelectedOffsetByValue(Object object) {
        if (this.jLZ == null) {
            return -1;
        }
        int n = this.jLZ.indexOf(object);
        if (n == -1) {
            return -1;
        }
        if (this.dwq == null) {
            this.guB();
        }
        for (int i = 0; i < this.dwq.length; ++i) {
            if (this.dwq[i] != n) continue;
            return i;
        }
        return -1;
    }

    public int getOffsetByRenderable(fcv_1 fcv_12) {
        if (fcv_12 == null || this.jLZ == null) {
            return -1;
        }
        int n = this.crT + this.ncz.indexOf(fcv_12) / this.udY.size();
        if (n >= this.jLZ.size()) {
            n = -1;
        }
        return n;
    }

    public fcv_1 getRenderableByOffset(int n) {
        if (n == -1 || this.jLZ == null) {
            return null;
        }
        int n2 = (n - this.crT) * this.udY.size();
        if (n2 < 0 || n2 >= this.ncz.size()) {
            return null;
        }
        return this.ncz.get(n2);
    }

    public void setSelectedOffset(int n, boolean bl) {
        if (n == this.tTA && !bl) {
            return;
        }
        int n2 = this.tTA;
        this.tTA = n;
        this.n(this.tTz);
        this.tTz = this.getRenderableByOffset(n);
        this.setSelectedAppearanceState(this.tTz);
        if (this.dwq == null) {
            this.guB();
        }
        aef_2 aef_22 = null;
        aef_2 aef_23 = null;
        if (n2 != -1) {
            aef_22 = this.jLZ.get(this.dwq[n2]);
        }
        if (this.tTA != -1) {
            aef_23 = this.jLZ.get(this.dwq[this.tTA]);
        }
        if (aef_22 != aef_23) {
            flz_2 flz_22 = new flz_2(this);
            flz_22.bj(aef_22);
            flz_22.setValue(aef_23);
            this.h(flz_22);
        }
        this.gth();
    }

    private void gth() {
        if (this.tTz != null && this.tPK != null) {
            this.tPK.f(0, this.tTz.getY(), this.uki.getContentWidth() - this.tLZ.getWidth(), this.tTz.getHeight(), this.uki.getTopInset(), this.uki.getBottomInset(), this.uki.getLeftInset(), this.uki.getRightInset());
        }
        this.setNeedsToResetMeshes();
    }

    private void p(fcv_1 fcv_12) {
        if (fcv_12 == this.tTz) {
            return;
        }
        if (fcv_12 != null) {
            this.setSelectedOffset(this.getOffsetByRenderable(fcv_12), false);
        } else {
            this.tTA = -1;
        }
    }

    private float fs(float f2) {
        int n;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if ((n = this.jLZ.size() - this.ncz.size() / this.udY.size()) <= 0) {
            return 1.0f;
        }
        if (f2 > (float)(n + 1)) {
            f2 = n + 1;
        }
        return 1.0f - f2 / (float)n;
    }

    private int fA(float f2) {
        float f3 = this.jLZ.size() - this.ncz.size() / this.udY.size();
        float f4 = f3 - (float)Math.round(f3 * f2);
        if (f3 < 0.0f || f4 < 0.0f) {
            f4 = 0.0f;
        } else if (f4 > f3 + 1.0f) {
            f4 = f3 + 1.0f;
        }
        return Math.round(f4);
    }

    public void ebw() {
        int n;
        int n2;
        if (this.tMh || this.ncz == null) {
            return;
        }
        this.guB();
        this.n(this.tTz);
        this.tTz = null;
        int n3 = this.crT;
        for (n2 = 0; n2 < this.ncz.size(); n2 += this.udY.size()) {
            n = n2 / this.udY.size() + n3;
            fcv_1 fcv_12 = this.ncz.get(n2);
            if (n2 < 0 || n2 >= this.ncz.size() || this.jLZ == null || n < 0 || n >= this.jLZ.size() || n != this.tTA) continue;
            this.tTz = fcv_12;
            this.setSelectedAppearanceState(this.tTz);
            break;
        }
        n2 = this.ncz.size() / this.udY.size();
        for (n = 0; n < n2; ++n) {
            int n4 = n + n3;
            int n5 = n4 >= this.dwq.length ? n4 : this.dwq[n4];
            this.ued.get(n).setColor(n4 % 2 == 0 ? this.uei : this.uej);
            for (int i = this.udY.size() - 1; i >= 0; --i) {
                fgm_2 fgm_22 = this.udY.get(i);
                fcv_1 fcv_13 = this.getRenderableByPosition(n, i);
                String string = fgm_22.getField();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.tMB);
                stringBuilder.append("#").append(n5);
                if (string != null) {
                    stringBuilder.append("/").append(fgm_22.getField());
                }
                fcv_13.setContentProperty(stringBuilder.toString(), this.tMC);
                if (this.jLZ != null && n5 >= 0 && n5 < this.jLZ.size()) {
                    aef_2 aef_22 = this.jLZ.get(n5);
                    if (aef_22 != null) {
                        if (string != null) {
                            fcv_13.setContent(aef_22.eu(fgm_22.getField()));
                            continue;
                        }
                        fcv_13.setContent(aef_22);
                        continue;
                    }
                    fcv_13.setContent(null);
                    continue;
                }
                fcv_13.setContent(null);
            }
        }
        this.gth();
    }

    private void guB() {
        if (this.dwq == null && this.ueh != null) {
            this.dwq = this.ueh.af(this.jLZ);
        }
        if (this.dwq == null) {
            this.dwq = fgo_2.abj(this.jLZ.size());
        }
    }

    @Override
    public boolean LZ(int n) {
        boolean bl = super.LZ(n);
        if (this.uec) {
            super.gsm();
            this.bFM();
            this.uec = false;
        }
        return bl;
    }

    @Override
    public boolean LY(int n) {
        boolean bl = super.LY(n);
        if (this.ueb) {
            this.ebw();
            this.ueb = false;
        }
        for (int i = this.uek.size() - 1; i >= 0; --i) {
            this.uek.get(i).eOq();
        }
        return bl;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        System.arraycopy(this.ukL, 0, ((fes_2)fhi_22).ukL, 0, this.ukL.length);
        super.a(fhi_22);
        fdq_1 fdq_12 = (fdq_1)fhi_22;
        fdq_12.setCellHeight(this.uef);
        fdq_12.setMinRows(this.ueg);
        fdq_12.setMaxRows(this.tQy);
        fdq_12.setEnableDND(this.tMe);
        fdq_12.setTableModel(this.ueh);
        fdq_12.setScrollBarBehaviour(this.tMu);
        fdq_12.setSelectionable(this.tTu);
        fdq_12.setSelectOnlyOnLeftClick(this.tTv);
        fdq_12.setTableFilter(this.tLX);
        fdq_12.setEnableFilterCache(this.tLY);
        fdq_12.b(fzq_0.tKa, this.uem, true);
        fdq_12.b(fzq_0.tKa, this.uem, false);
        fdq_12.b(fzq_0.tKa, this.ueo, false);
        fdq_12.b(fzq_0.tJW, this.uem, true);
        fdq_12.b(fzq_0.tJW, this.uem, false);
        fdq_12.b(fzq_0.tJW, this.uen, false);
        fdq_12.uep.addAll(this.uep);
    }

    @Override
    public void eKI() {
        this.tLZ.eKI();
        super.eKI();
        this.a(fzq_0.tKa, this.uem, true, 0);
        this.a(fzq_0.tKa, this.uem, false, 0);
        this.a(fzq_0.tKa, this.ueo, false);
        this.a(fzq_0.tJW, this.uem, true, 0);
        this.a(fzq_0.tJW, this.uem, false, 0);
        this.a(fzq_0.tJW, this.uen, false);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.b(fzq_0.tKa, this.uem, true);
        this.b(fzq_0.tKa, this.uem, false);
        this.b(fzq_0.tKa, this.ueo, false);
        this.b(fzq_0.tJW, this.uem, true);
        this.b(fzq_0.tJW, this.uem, false);
        this.b(fzq_0.tJW, this.uen, false);
        for (fmg_2 fmg_22 : this.uep) {
            this.b(fmg_22.gBy(), fmg_22, true);
        }
        this.uep.clear();
        this.uei = null;
        this.uej = null;
        if (this.tMF != null) {
            this.tMF.aVH();
            this.tMF = null;
        }
        if (this.uee != null) {
            this.uee.aVH();
            this.uee = null;
        }
        if (this.tPK != null) {
            this.tPK.aVH();
            this.tPK = null;
        }
        if (this.ued != null) {
            for (int i = this.ued.size() - 1; i >= 0; --i) {
                this.ued.get(i).aVH();
            }
            this.ued = null;
        }
        this.tTz = null;
        this.tMw = null;
        this.nam = null;
        this.tLZ = null;
        this.udY = null;
        this.jLZ = null;
        this.ueh = null;
        this.ncz = null;
        if (this.tLX != null) {
            this.tLX.a(null);
            this.tLX.brX();
        }
        this.tLX = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        fdt_2 fdt_22 = new fdt_2(this);
        fdt_22.aVI();
        this.a(fdt_22);
        this.tLZ = new fcj_2();
        this.tLZ.aVI();
        this.tLZ.setHorizontal(false);
        this.tLZ.setValue(1.0f);
        this.tLZ.setCanBeCloned(false);
        this.d(this.tLZ);
        this.ueg = -1;
        this.tQy = -1;
        this.uef = 30;
        this.tMe = true;
        this.crT = 0;
        this.tMh = false;
        this.uec = false;
        this.ukD = false;
        this.tTu = true;
        this.tTt = false;
        this.tTv = true;
        this.tTA = -1;
        this.uea = -1;
        this.ncz = new ArrayList();
        this.nam = new ArrayList();
        this.udY = new ArrayList();
        this.jLZ = new ArrayList();
        this.ued = new ArrayList();
        this.tMu = fzi_0.tHa;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == -1675365079) {
            this.setCellHeight(Bw.m(string));
        } else if (n == -631680873) {
            this.setEnableDND(Bw.aK(string));
        } else if (n == 1063854923) {
            this.setMinRows(Bw.m(string));
        } else if (n == 844056925) {
            this.setMaxRows(Bw.m(string));
        } else if (n == 1039818982) {
            this.setSelectionable(Bw.aK(string));
        } else if (n == -1763504454) {
            this.setSelectOnlyOnLeftClick(Bw.aK(string));
        } else if (n == 1602982231) {
            this.setScrollBarBehaviour(fzi_0.tw(string));
        } else if (n == 1189020792) {
            this.setKeepOffset(Bw.b(string, false));
        } else if (n == 901829030) {
            this.setOnColumnHeaderClick(fic_12.b(fmg_2.class, string));
        } else if (n == 400843111) {
            this.setEnableFilterCache(Bw.aK(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == uey) {
            this.setTableFilter((fey_1)object);
        } else if (n == 400843111) {
            this.setEnableFilterCache(Bw.l(object));
        } else if (n == ueB) {
            this.setTableModel((fgo_2)object);
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }

    @Override
    public void aW(Object object) {
    }

    @Override
    public void aV(Object object) {
    }

    @Override
    public boolean f(int n, Object object) {
        return false;
    }

    @Override
    public int p(Object object, Object object2) {
        return -1;
    }

    @Override
    public boolean r(Object object, Object object2) {
        return false;
    }

    @Override
    public int aVo() {
        return this.jLZ.size();
    }

    @Override
    public void a(fgm_2 fgm_22, boolean bl) {
        if (bl) {
            if (this.udY.contains(fgm_22)) {
                return;
            }
            this.h(fgm_22);
        } else {
            if (!this.udY.contains(fgm_22)) {
                return;
            }
            int n = this.udY.indexOf(fgm_22);
            this.udY.remove(fgm_22);
            fad_1 fad_12 = this.nam.remove(n);
            if (fad_12 != null) {
                fad_12.setVisible(false);
            }
            this.setTableDirty();
            this.setNeedsToPreProcess();
        }
    }

    public void setKeepOffset(boolean bl) {
        if (this.tML == bl) {
            return;
        }
        this.tML = bl;
    }

    public void setOnColumnHeaderClick(fmg_2 fmg_22) {
        if (this.uep.contains(fmg_22)) {
            return;
        }
        this.uep.add(fmg_22);
        this.a(fmg_22.gBy(), fmg_22, true);
    }

    @Override
    public void setHideContainerWithoutItem(boolean bl) {
        super.setHideContainerWithoutItem(bl);
        for (fcv_1 fcv_12 : this.ncz) {
            fcv_12.setHideWithoutItem(this.isHideContainerWithoutItem());
        }
    }

    static /* synthetic */ Logger aGh() {
        return uxJ;
    }

    static /* synthetic */ Logger aGi() {
        return uxJ;
    }

    static /* synthetic */ Logger aGj() {
        return uxJ;
    }
}

