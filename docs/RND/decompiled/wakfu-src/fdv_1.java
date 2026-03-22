/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from fDv
 */
public class fdv_1
extends faw_2
implements fgs_2 {
    public static final String TAG = "textEditorPlus";
    public static final String ufl = "textEditor";
    public static final String ufm = "searchButton";
    public static final String ufn = "clearButton";
    public static final String ufo = "list";
    protected boolean ufp = false;
    protected boolean ufq = false;
    protected boolean ufr = false;
    private int tQy = -1;
    private faa_2 tQJ = faa_2.tLL;
    private faa_2 tCX = faa_2.tLR;
    private fza_0 tQz = fza_0.tGr;
    private boolean ufs = false;
    private int uft = Integer.MAX_VALUE;
    protected fdu_1 ufu;
    protected fad_1 ufv;
    protected fad_1 ufw;
    private fbz_2 nGl = null;
    boolean tQi;
    private fis_1 ufx;
    private fis_1 ufy;
    private fis_1 ufz;
    private fis_1 ufA;
    private fga_2 ueZ;
    private fis_1 tQD;
    private fis_1 ufB;
    private fis_1 tND;
    private fis_1 mTP;
    private fis_1 ufC;
    boolean ufD;
    private boolean tQv = false;
    private boolean tQw = false;
    private final fey_1<String, ?> ufE = new fez_1();
    private final List<Consumer<@NotNull fdu_1>> ufF = new LinkedList<Consumer<fdu_1>>();
    private final List<Consumer<@NotNull fdu_1>> ufG = new LinkedList<Consumer<fdu_1>>();
    public static final int ufH = 92903173;
    public static final int ufI = -1249482096;
    public static final int ufJ = 3148879;
    public static final int ufK = 48371712;
    public static final int ufL = -919628796;
    public static final int ufM = 1307418143;
    public static final int ufN = -1326227699;
    public static final int ufO = 400381634;
    public static final int ufP = -1375815020;
    public static final int ufQ = -467842239;
    public static final int ufR = 139285235;
    public static final int ufS = 2068626633;
    public static final int ufT = -1206239059;
    public static final int ufU = 390232059;
    public static final int ufV = -515807685;
    public static final int ufW = -1439500848;
    public static final int ufX = 3556653;
    public static final int ufY = -1852365066;
    public static final int ufZ = 1153931755;
    public static final int uga = -1152148181;
    public static final int ugb = 3744723;
    public static final int ugc = 1913333550;
    public static final int ugd = -1655575466;
    public static final int uge = -625591907;
    public static final int ugf = -470861862;
    public static final int ugg = 1249389695;
    public static final int ugh = 381878489;
    public static final int ugi = 73055982;
    public static final int ugj = 1216985755;
    public static final int ugk = -336545092;
    public static final int ugl = 1602416228;
    public static final int ugm = 1453943993;
    public static final int ugn = -1784789924;
    public static final int ugo = 534924003;
    public static final int ugp = 105252970;
    public static final int ugq = fdu_1.ufk;
    public static final int ugr = -410343712;
    public static final int ugs = -2072642759;
    public static final int ugt = 1492073575;
    public static final int ugu = -1351906386;
    public static final int ugv = 428573020;
    public static final int ugw = 844056925;
    public static final int ugx = "selectedValue".hashCode();
    public static final int ugy = 1905963320;
    public static final int ugz = -406349635;
    public static final int ugA = 408593605;
    public static final int ugB = 583200901;
    public static final int ugC = 193923019;

    public void setWithSearchButton(boolean bl) {
        if (bl == this.ufp) {
            return;
        }
        this.ufp = bl;
        this.ufv.setVisible(this.ufp);
        this.guQ();
    }

    public void setWithClearButton(boolean bl) {
        if (bl == this.ufq) {
            return;
        }
        this.ufq = bl;
        this.guQ();
    }

    public void setOnSearch(fmn_1 fmn_12) {
        this.a(fmn_12.gBy(), fmn_12, true);
    }

    public void setOnClear(fme_2 fme_22) {
        this.a(fme_22.gBy(), fme_22, true);
    }

    public void setSearchOnPressEnter(boolean bl) {
        if (this.ufr == bl) {
            return;
        }
        if (this.isMultiline() && bl) {
            return;
        }
        this.ufr = bl;
    }

    public void clear() {
        this.x(fdu_1::clear);
    }

    @Override
    public fes_2 getWidgetByThemeElementName(String string, boolean bl) {
        if (ufl.equalsIgnoreCase(string)) {
            return this.ufu;
        }
        if (ufm.equalsIgnoreCase(string)) {
            return this.ufv;
        }
        if (ufn.equalsIgnoreCase(string)) {
            return this.ufw;
        }
        if (ufo.equalsIgnoreCase(string)) {
            return this.nGl;
        }
        return this;
    }

    @Override
    public void gsm() {
        super.gsm();
        this.tQi = true;
    }

    @Override
    public void bFM() {
        super.bFM();
        this.tQi = true;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tQi = false;
        this.ufD = false;
        this.ufv.b(fzq_0.tJU, this.ufx, false);
        this.ufx = null;
        this.ufw.b(fzq_0.tJU, this.ufy, false);
        this.ufy = null;
        this.ufu.b(fzq_0.tJF, this.ufz, false);
        this.ufz = null;
        this.ufu.b(fzq_0.tJH, this.ufA, false);
        this.ufA = null;
        this.ufu.b(this.ueZ);
        this.ueZ = null;
        this.ufu = null;
        this.ufv = null;
        this.ufw = null;
        this.ufq = false;
        this.ufp = false;
        this.ufF.clear();
        this.ufG.clear();
        fbj_1.getInstance().b(fzq_0.tJS, this.tND, false);
        fbj_1.getInstance().b(fzq_0.tJT, this.mTP, false);
        this.tCX = null;
        this.tQJ = null;
        if (this.nGl != null) {
            this.b(fzq_0.tJA, this.ufC, true);
            this.nGl.b(fzq_0.tJI, this.tQD, false);
            this.nGl.gAD();
            this.nGl = null;
        }
    }

    @Override
    public void aVI() {
        super.aVI();
        this.tQi = true;
        fzp fzp2 = new fzp();
        fzp2.aVI();
        fzp2.setWidget(this);
        this.d(fzp2);
        fdx_2 fdx_22 = new fdx_2(this);
        fdx_22.aVI();
        this.a(fdx_22);
        this.ufu = new fdu_1();
        this.ufu.aVI();
        this.ufu.setCanBeCloned(false);
        this.ueZ = (string, string2) -> {
            if (!this.ufq) {
                return;
            }
            boolean bl = BH.bi(string2);
            if (this.ufD == bl) {
                return;
            }
            this.ufD = bl;
            this.guQ();
        };
        this.ufu.a(this.ueZ);
        this.ufD = false;
        this.guP();
        this.ufz = fiq_12 -> {
            if (!(fiq_12 instanceof fli_2)) {
                return false;
            }
            fli_2 fli_22 = (fli_2)fiq_12;
            this.e(fli_22);
            return false;
        };
        this.ufu.a(fzq_0.tJF, this.ufz, false);
        this.ufA = fiq_12 -> {
            if (!(fiq_12 instanceof fli_2)) {
                return false;
            }
            fli_2 fli_22 = (fli_2)fiq_12;
            this.d(fli_22);
            return false;
        };
        this.ufu.a(fzq_0.tJH, this.ufA, false);
        this.d(this.ufu);
        this.ufu.setListFilter(this.ufE);
        this.nGl = new fbz_2();
        this.nGl.aVI();
        this.ufv = new fad_1();
        this.ufv.aVI();
        this.ufv.setCanBeCloned(false);
        this.ufv.setVisible(false);
        this.ufx = fiq_12 -> {
            this.h(new flu_2(this.ufu, this.ufu.getText()));
            return false;
        };
        this.ufv.a(fzq_0.tJU, this.ufx, false);
        this.d(this.ufv);
        this.ufw = new fad_1();
        this.ufw.aVI();
        this.ufw.setCanBeCloned(false);
        this.ufw.setVisible(false);
        this.ufy = fiq_12 -> {
            String string = this.ufu.getText();
            this.ufu.clear();
            this.h(new flq_2(this.ufu, string));
            return false;
        };
        this.ufw.a(fzq_0.tJU, this.ufy, false);
        this.d(this.ufw);
        this.guO();
    }

    private void d(fli_2 fli_22) {
        if (this.isMultiline()) {
            return;
        }
        if (this.nGl == null) {
            return;
        }
        int n = this.nGl.getSelectedOffset();
        if (fli_22.bCC() == 38) {
            if (n == 0) {
                this.gsH();
            } else {
                int n2 = n - 1;
                this.nGl.setSelectedOffset(n2, false);
                if ((float)n2 < this.nGl.getOffset()) {
                    this.nGl.setOffset(this.nGl.getOffset() - (float)GC.C(this.nGl.getOffset() - (float)n2));
                } else if ((float)n2 > this.nGl.getOffset() + (float)this.tQy - 1.0f) {
                    this.nGl.setOffset(n2);
                }
            }
        } else if (fli_22.bCC() == 40) {
            boolean bl = !this.tQv;
            this.gsI();
            int n3 = bl ? n : Math.min(n + 1, this.nGl.getItems().size());
            this.nGl.setSelectedOffset(n3, false);
            if (bl) {
                this.nGl.setOffset(n3);
            } else if ((float)n3 > this.nGl.getOffset() + (float)this.tQy - 1.0f) {
                this.nGl.setOffset(this.nGl.getOffset() + (float)GC.C((float)(n3 - this.tQy + 1) - this.nGl.getOffset()));
            }
        } else if (fli_22.bCC() == 10) {
            this.nGl.gtg();
            this.gsH();
        } else if (fli_22.gDW() != '\uffff') {
            this.gsI();
        }
    }

    private void e(fli_2 fli_22) {
        if (!this.ufr) {
            return;
        }
        if (fli_22.bCC() != 10) {
            return;
        }
        this.h(new flu_2(this.ufu, this.ufu.getText()));
    }

    private void guO() {
        this.ufB = fiq_12 -> {
            if (this.D(fiq_12) || this.E(fiq_12)) {
                this.gsH();
            } else if (this.tQz.grB() && this.isEnabledFull()) {
                this.gsI();
            }
            return false;
        };
        this.a(fzq_0.tJU, this.ufB, false);
        this.tND = fiq_12 -> {
            flp_2 flp_22 = (flp_2)fiq_12;
            if (this.tQv) {
                if (this.uki == null) {
                    return true;
                }
                if (this.uki.gE(flp_22.x(this), flp_22.y(this))) {
                    return true;
                }
                fza fza2 = this.nGl.getAppearance();
                if (fza2 == null) {
                    return true;
                }
                if (!fza2.gE(flp_22.x(this.nGl), flp_22.y(this.nGl))) {
                    this.gsH();
                    return true;
                }
            }
            return false;
        };
        fbj_1.getInstance().a(fzq_0.tJS, this.tND, false);
        this.mTP = fiq_12 -> {
            flp_2 flp_22 = (flp_2)fiq_12;
            if (!this.tQw && this.tQv) {
                fiq_1 fiq_13 = flp_22.gBG();
                if (fiq_13 == null) {
                    return true;
                }
                if (this.C(fiq_13)) {
                    return true;
                }
                if (fiq_13.gBE() == this.ufu) {
                    return true;
                }
                if (this.tQz.grC()) {
                    this.gsH();
                }
                return true;
            }
            if (this.tQw) {
                this.tQw = false;
            }
            return false;
        };
        fbj_1.getInstance().a(fzq_0.tJT, this.mTP, false);
        this.tQD = fiq_12 -> {
            flk_2 flk_22 = (flk_2)fiq_12;
            if (this.tQz.grC() && flk_22.bqr()) {
                this.setSelectedValue(flk_22.getValue());
                this.gsH();
            }
            flk_2 flk_23 = new flk_2(this, flk_22.gDZ(), flk_22.getValue(), flk_22.wp(), flk_22.bqr());
            this.h(flk_23);
            return false;
        };
        this.ufC = fiq_12 -> {
            boolean bl;
            fle_2 fle_22 = (fle_2)fiq_12;
            boolean bl2 = bl = fle_22.gBE().getParentOfType(fdv_1.class) == this;
            if (bl || fle_22.gDO()) {
                this.gsI();
            } else {
                this.gsH();
            }
            return false;
        };
        this.a(fzq_0.tJA, this.ufC, true);
        this.ufE.z(string -> {
            if (this.tQv) {
                this.guU();
            }
        });
    }

    private boolean C(fiq_1 fiq_12) {
        fcj_2 fcj_22 = this.nGl.getScrollBar();
        if (fcj_22 == null) {
            return false;
        }
        fcz_2 fcz_22 = fcj_22.getSlider();
        if (fcz_22 == null) {
            return false;
        }
        return fiq_12.gBE() == fcz_22.getButton();
    }

    private boolean D(fiq_1 fiq_12) {
        if (!this.ufq || this.ufw == null) {
            return false;
        }
        return fiq_12 != null && fiq_12.gBE() == this.ufw;
    }

    private boolean E(fiq_1 fiq_12) {
        if (!this.ufp || this.ufv == null) {
            return false;
        }
        return fiq_12 != null && fiq_12.gBE() == this.ufv;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fdv_1 fdv_12 = (fdv_1)fhi_22;
        super.a(fdv_12);
        fdv_12.setWithSearchButton(this.ufp);
        fdv_12.setWithClearButton(this.ufq);
        fdv_12.setSearchOnPressEnter(this.ufr);
        fdv_12.ufF.addAll(this.ufG);
        fdv_12.ufF.addAll(this.ufF);
        fdv_12.guP();
        if (this.nGl != null) {
            fes_2 fes_22 = (fes_2)this.nGl.gAK();
            fes_22.ukM = false;
            fes_22.gAF();
            fdv_12.d(fes_22);
        }
        fdv_12.setMaxRows(this.tQy);
        fdv_12.setHotSpotPosition(this.tQJ);
        fdv_12.setAlign(this.tCX);
        fdv_12.setBehaviour(this.tQz);
        fdv_12.setDisplayListOnlyIfTextPresent(this.ufs);
        fdv_12.setDisplayListThreshold(this.uft);
        fdv_12.b(fzq_0.tJS, this.tND, false);
        fdv_12.b(fzq_0.tJT, this.mTP, false);
        fdv_12.b(fzq_0.tJU, this.ufB, false);
        if (this.ufu != null) {
            this.ufu.a(fdv_12.ufu);
            fdv_12.ufu.b(this.ueZ);
            fdv_12.ufu.b(fzq_0.tJF, this.ufz, false);
            fdv_12.ufu.b(fzq_0.tJH, this.ufA, false);
        }
        if (this.ufv != null) {
            this.ufv.a(fdv_12.ufv);
            fdv_12.ufv.b(fzq_0.tJU, this.ufx, false);
        }
        if (this.ufw != null) {
            this.ufw.a(fdv_12.ufw);
            fdv_12.ufw.b(fzq_0.tJU, this.ufy, false);
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    private void guP() {
        if (this.ufu == null) {
            return;
        }
        this.ufF.forEach(consumer -> {
            consumer.accept(this.ufu);
            this.ufG.add((Consumer<fdu_1>)consumer);
        });
        this.ufF.clear();
    }

    private void x(Consumer<@NotNull fdu_1> consumer) {
        if (this.ufu != null) {
            consumer.accept(this.ufu);
            this.ufG.add(consumer);
        } else {
            this.ufF.add(consumer);
        }
    }

    private <T> T e(Function<@NotNull fdu_1, T> function) {
        if (this.ufu != null) {
            T t = function.apply(this.ufu);
            this.ufG.add(function::apply);
            return t;
        }
        this.ufF.add(function::apply);
        return null;
    }

    @Override
    public void setAlign(faa_2 faa_22) {
        this.x((fdu_1 fdu_12) -> fdu_12.setAlign(faa_22));
        if (faa_22 != null) {
            this.tCX = faa_22;
        }
    }

    @Override
    public boolean isSelectable() {
        if (this.ufu == null) {
            return false;
        }
        return this.ufu.isSelectable();
    }

    @Override
    public void setSelectable(boolean bl) {
        this.x((fdu_1 fdu_12) -> fdu_12.setSelectable(bl));
    }

    @Override
    public boolean isSelectOnFocus() {
        if (this.ufu == null) {
            return false;
        }
        return this.ufu.isSelectOnFocus();
    }

    @Override
    public void setSelectOnFocus(boolean bl) {
        this.x((fdu_1 fdu_12) -> fdu_12.setSelectOnFocus(bl));
    }

    @Override
    public boolean isEnableOnlySelectablePartInteraction() {
        if (this.ufu == null) {
            return false;
        }
        return this.ufu.isEnableOnlySelectablePartInteraction();
    }

    @Override
    public void setEnableOnlySelectablePartInteraction(boolean bl) {
        this.x((fdu_1 fdu_12) -> fdu_12.setEnableOnlySelectablePartInteraction(bl));
    }

    @Override
    public boolean isAutoHorizontalScrolled() {
        if (this.ufu == null) {
            return false;
        }
        return this.ufu.isAutoHorizontalScrolled();
    }

    @Override
    public void setAutoHorizontalScrolled(boolean bl) {
        this.x((fdu_1 fdu_12) -> fdu_12.setAutoHorizontalScrolled(bl));
    }

    @Override
    public int getMaxCharacters() {
        if (this.ufu == null) {
            return 0;
        }
        return this.ufu.getMaxCharacters();
    }

    @Override
    public void setMaxCharacters(int n) {
        this.x((fdu_1 fdu_12) -> fdu_12.setMaxCharacters(n));
    }

    @Override
    public boolean isPassword() {
        if (this.ufu == null) {
            return false;
        }
        return this.ufu.isPassword();
    }

    @Override
    public void setPassword(boolean bl) {
        this.x((fdu_1 fdu_12) -> fdu_12.setPassword(bl));
    }

    @Override
    public String getRestrict() {
        if (this.ufu == null) {
            return null;
        }
        return this.ufu.getRestrict();
    }

    @Override
    public void setRestrict(String string) {
        this.x((fdu_1 fdu_12) -> fdu_12.setRestrict(string));
    }

    @Override
    public boolean isEditable() {
        if (this.ufu == null) {
            return false;
        }
        return this.ufu.isEditable();
    }

    @Override
    public void setEditable(boolean bl) {
        this.x((fdu_1 fdu_12) -> fdu_12.setEditable(bl));
    }

    @Override
    public String getGhostText() {
        if (this.ufu == null) {
            return null;
        }
        return this.ufu.getGhostText();
    }

    @Override
    public void setGhostText(@Nullable Object object) {
        this.x((fdu_1 fdu_12) -> fdu_12.setGhostText(object));
    }

    @Override
    public boolean isUnicodeRestrict() {
        if (this.ufu == null) {
            return false;
        }
        return this.ufu.isUnicodeRestrict();
    }

    @Override
    public void setUnicodeRestrict(boolean bl) {
        this.x((fdu_1 fdu_12) -> fdu_12.setUnicodeRestrict(bl));
    }

    @Override
    public boolean isDisplayGhostTextOnFocusLost() {
        if (this.ufu == null) {
            return false;
        }
        return this.ufu.isDisplayGhostTextOnFocusLost();
    }

    @Override
    public void setDisplayGhostTextOnFocusLost(boolean bl) {
        this.x((fdu_1 fdu_12) -> fdu_12.setDisplayGhostTextOnFocusLost(bl));
    }

    @Override
    public boolean isReplaceNullByGhostText() {
        if (this.ufu == null) {
            return false;
        }
        return this.ufu.isReplaceNullByGhostText();
    }

    @Override
    public void setReplaceNullByGhostText(boolean bl) {
        this.x((fdu_1 fdu_12) -> fdu_12.setReplaceNullByGhostText(bl));
    }

    @Override
    public ffb_2<String, ?> getListFilter() {
        if (this.ufu == null) {
            return null;
        }
        return this.ufu.getListFilter();
    }

    @Override
    public void setListFilter(ffb_2<String, ?> ffb_22) {
        this.x((fdu_1 fdu_12) -> fdu_12.setListFilter(ffb_22));
    }

    @Override
    public void tO(String string) {
        this.x((fdu_1 fdu_12) -> fdu_12.tO(string));
    }

    @Override
    public boolean isJustify() {
        if (this.ufu == null) {
            return false;
        }
        return this.ufu.isJustify();
    }

    @Override
    public void setJustify(boolean bl) {
        this.x((fdu_1 fdu_12) -> fdu_12.setJustify(bl));
    }

    @Override
    public void setFont(awx_1 awx_12) {
        this.x((fdu_1 fdu_12) -> fdu_12.setFont(awx_12));
    }

    @Override
    public void setHorizontalAlignment(fzY fzY2) {
        this.x((fdu_1 fdu_12) -> fdu_12.setHorizontalAlignment(fzY2));
    }

    @Override
    public void setVerticalAlignment(fzY fzY2) {
        this.x((fdu_1 fdu_12) -> fdu_12.setVerticalAlignment(fzY2));
    }

    @Override
    public boolean isBrightenColor() {
        if (this.ufu == null) {
            return false;
        }
        return this.ufu.isBrightenColor();
    }

    @Override
    public void setBrightenColor(boolean bl) {
        this.x((fdu_1 fdu_12) -> fdu_12.setBrightenColor(bl));
    }

    @Override
    public boolean isDarkenColor() {
        if (this.ufu == null) {
            return false;
        }
        return this.ufu.isDarkenColor();
    }

    @Override
    public void setDarkenColor(boolean bl) {
        this.x((fdu_1 fdu_12) -> fdu_12.setDarkenColor(bl));
    }

    @Override
    public int getMinWidth() {
        if (this.ufu == null) {
            return 0;
        }
        return this.ufu.getMinWidth();
    }

    @Override
    public void setMinWidth(int n) {
        this.x((fdu_1 fdu_12) -> fdu_12.setMinWidth(n));
    }

    @Override
    public int getMaxWidth() {
        if (this.ufu == null) {
            return 0;
        }
        return this.ufu.getMaxWidth();
    }

    @Override
    public void setMaxWidth(int n) {
        this.x((fdu_1 fdu_12) -> fdu_12.setMaxWidth(n));
    }

    @Override
    public boolean isInheritParentWidth() {
        if (this.ufu == null) {
            return true;
        }
        return this.ufu.isInheritParentWidth();
    }

    @Override
    public void setInheritParentWidth(boolean bl) {
        this.x((fdu_1 fdu_12) -> fdu_12.setInheritParentWidth(bl));
    }

    @Override
    public boolean isUseParentMaxWidth() {
        if (this.ufu == null) {
            return false;
        }
        return this.ufu.isUseParentMaxWidth();
    }

    @Override
    public void setUseParentMaxWidth(boolean bl) {
        this.x((fdu_1 fdu_12) -> fdu_12.setInheritParentWidth(bl));
    }

    @Override
    public fzk_0 getMinSizeComputationBehaviour() {
        if (this.ufu == null) {
            return fzk_0.tHo;
        }
        return this.ufu.getMinSizeComputationBehaviour();
    }

    @Override
    public void setMinSizeComputationBehaviour(fzk_0 fzk_02) {
        this.x((fdu_1 fdu_12) -> fdu_12.setMinSizeComputationBehaviour(fzk_02));
    }

    @Override
    public boolean isMultiline() {
        if (this.ufu == null) {
            return false;
        }
        return this.ufu.isMultiline();
    }

    @Override
    public void setMultiline(boolean bl) {
        if (bl && this.ufr) {
            this.setSearchOnPressEnter(false);
        }
        this.x((fdu_1 fdu_12) -> fdu_12.setMultiline(bl));
    }

    @Override
    public int getMaxLines() {
        if (this.ufu == null) {
            return Integer.MAX_VALUE;
        }
        return this.ufu.getMaxLines();
    }

    @Override
    public void setMaxLines(int n) {
        this.x((fdu_1 fdu_12) -> fdu_12.setMaxLines(n));
    }

    @Override
    public int getLineHeight() {
        if (this.ufu == null) {
            return -1;
        }
        return this.ufu.getLineHeight();
    }

    @Override
    public void setLineHeight(int n) {
        this.x((fdu_1 fdu_12) -> fdu_12.setLineHeight(n));
    }

    @Override
    public fzu_0 getOrientation() {
        if (this.ufu == null) {
            return null;
        }
        return this.ufu.getOrientation();
    }

    @Override
    public void setOrientation(fzu_0 fzu_02) {
        this.x((fdu_1 fdu_12) -> fdu_12.setOrientation(fzu_02));
    }

    @Override
    public String getText() {
        if (this.ufu == null) {
            return null;
        }
        return this.ufu.getText();
    }

    @Override
    @Nullable
    public String setText(@Nullable Object object) {
        return this.e((fdu_1 fdu_12) -> fdu_12.setText(object));
    }

    @Override
    public boolean isUseHighContrast() {
        if (this.ufu == null) {
            return false;
        }
        return this.ufu.isUseHighContrast();
    }

    @Override
    public void setUseHighContrast(boolean bl) {
        this.x((fdu_1 fdu_12) -> fdu_12.setUseHighContrast(bl));
    }

    @Override
    public boolean isEnableShrinking() {
        if (this.ufu == null) {
            return false;
        }
        return this.ufu.isEnableShrinking();
    }

    @Override
    public void setEnableShrinking(boolean bl) {
        this.x((fdu_1 fdu_12) -> fdu_12.setEnableShrinking(bl));
    }

    @Override
    public void setZoom(float f2) {
        this.x((fdu_1 fdu_12) -> fdu_12.setZoom(f2));
    }

    @Override
    public void setDisplayCharDelay(long l) {
        this.x((fdu_1 fdu_12) -> fdu_12.setDisplayCharDelay(l));
    }

    @Override
    public boolean isEnableAutoZoomShrink() {
        if (this.ufu == null) {
            return false;
        }
        return this.ufu.isEnableAutoZoomShrink();
    }

    @Override
    public void setEnableAutoZoomShrink(boolean bl) {
        this.x((fdu_1 fdu_12) -> fdu_12.setEnableAutoZoomShrink(bl));
    }

    @Override
    public void setColor(axb_2 axb_22, @Nullable String string) {
        this.x((fdu_1 fdu_12) -> fdu_12.setColor(axb_22, string));
    }

    @Override
    public void setFocused(boolean bl) {
        if (this.ufu != null) {
            this.ufu.setFocused(bl);
        } else {
            super.setFocused(bl);
        }
    }

    protected void guQ() {
        this.guS();
        this.guR();
        this.guT();
        this.bFM();
    }

    public void setSearchButtonDisplaySize(@NotNull fsm_1 fsm_12) {
        this.ufv.setSize(fsm_12);
        this.ufv.setDisplaySize(fsm_12);
        this.guQ();
    }

    public void setClearButtonDisplaySize(@NotNull fsm_1 fsm_12) {
        this.ufw.setSize(fsm_12);
        this.ufw.setDisplaySize(fsm_12);
        this.guQ();
    }

    protected void guR() {
        if (!this.ukx) {
            return;
        }
        fsm_1 fsm_12 = new fsm_1(this.ukw);
        if (this.ufq) {
            fsm_12.width -= this.getClearButtonFullWidth();
        }
        if (this.ufp) {
            fsm_12.width -= this.getSearchButtonFullWidth();
        }
        this.x((fdu_1 fdu_12) -> fdu_12.setPrefSize(fsm_12));
    }

    @Override
    public void setPrefSize(fsm_1 fsm_12) {
        super.setPrefSize(fsm_12);
        this.guR();
        this.bFM();
    }

    protected void guS() {
        if (!this.ukv) {
            return;
        }
        fsm_1 fsm_12 = new fsm_1(this.uku);
        if (this.ufq) {
            fsm_12.width -= this.getClearButtonFullWidth();
        }
        if (this.ufp) {
            fsm_12.width -= this.getSearchButtonFullWidth();
        }
        this.x((fdu_1 fdu_12) -> fdu_12.setMinSize(fsm_12));
    }

    @Override
    public void setMinSize(fsm_1 fsm_12) {
        super.setMinSize(fsm_12);
        this.guS();
        this.bFM();
    }

    protected void guT() {
        if (!this.ukz) {
            return;
        }
        fsm_1 fsm_12 = new fsm_1(this.uky);
        if (this.ufq) {
            fsm_12.width -= this.getClearButtonFullWidth();
        }
        if (this.ufp) {
            fsm_12.width -= this.getSearchButtonFullWidth();
        }
        this.x((fdu_1 fdu_12) -> fdu_12.setMaxSize(fsm_12));
    }

    @Override
    public void setMaxSize(fsm_1 fsm_12) {
        super.setMaxSize(fsm_12);
        this.guT();
        this.bFM();
    }

    protected int getSearchButtonFullWidth() {
        if (!this.ufp) {
            return 0;
        }
        return this.ufv.getWidth() + this.ufv.getAppearance().getInsetWidth();
    }

    protected int getSearchButtonHeight() {
        if (!this.ufp) {
            return 0;
        }
        return this.ufv.getHeight() + this.ufv.getAppearance().getInsetHeight();
    }

    protected int getClearButtonFullWidth() {
        if (!this.ufq) {
            return 0;
        }
        return this.ufw.getWidth() + this.ufw.getAppearance().getInsetWidth();
    }

    protected int getClearButtonHeight() {
        if (!this.ufq) {
            return 0;
        }
        return this.ufw.getHeight() + this.ufw.getAppearance().getInsetHeight();
    }

    @Override
    public void d(fhv_1 fhv_12) {
        if (fhv_12 instanceof fbz_2) {
            if (this.nGl != null) {
                this.nGl.aZp();
            }
            this.nGl = (fbz_2)fhv_12;
            this.nGl.setModalLevel((short)30000);
            this.nGl.setListFilter(this.ufE);
            this.ufE.a(this.nGl);
            this.as(this.nGl);
        } else {
            super.d(fhv_12);
        }
    }

    private void as(fbz_2 fbz_22) {
        fbz_22.a(fzq_0.tJI, this.tQD, false);
        this.a(fzq_0.tJA, this.ufC, true);
    }

    private void gsH() {
        if (this.tQv) {
            this.nGl.gAC();
            this.tQv = false;
            fhy_2.gBq().eHS();
        }
    }

    private void gsI() {
        if (this.nGl == null || !this.isEnabledFull()) {
            return;
        }
        if (this.nGl.aVo() > this.uft) {
            this.gsH();
            return;
        }
        if (!this.tQv) {
            if (this.ufs && this.getText().isEmpty()) {
                return;
            }
            if (this.nGl.aVo() > this.uft) {
                return;
            }
            this.guU();
            this.nGl.setNonBlocking(false);
            fbj_1.getInstance().getLayeredContainer().d(this.nGl, 29500);
            this.tQv = true;
            this.tQw = true;
            fhy_2.gBq().eHR();
        }
    }

    private void guU() {
        ArrayList<Object> arrayList = this.nGl.getItems();
        if (arrayList == null || arrayList.isEmpty()) {
            this.nGl.setVisible(false);
            return;
        }
        this.nGl.setVisible(true);
        int n = this.nGl.getIdealSize((int)this.tQy, (int)-1).height;
        int n2 = this.getDisplayY();
        fbj_1 fbj_12 = fbj_1.getInstance();
        faa_2 faa_22 = this.tCX;
        faa_2 faa_23 = this.tQJ;
        int n3 = this.getDisplayY() + faa_22.uT(this.getHeight()) - faa_23.uT(n);
        if (n3 < 0 || n3 > fbj_12.getAppearance().getContentHeight() - n) {
            faa_22 = faa_22.gse();
            faa_23 = faa_23.gse();
        }
        n3 = this.getDisplayY() + faa_22.uT(this.getHeight()) - faa_23.uT(n);
        n3 = GC.a(n3, 0, fbj_12.getAppearance().getContentHeight() - n);
        if (n2 - n < 0 && n2 + this.getHeight() + n > fbj_12.getHeight()) {
            n = n2;
            n3 = 0;
        }
        this.nGl.setSizeToPrefSize();
        int n4 = Math.max(this.nGl.getWidth(), this.getWidth() - this.getLeftMargin() - this.getRightMargin());
        this.nGl.setSize(n4, n);
        this.nGl.setPosition(this.getDisplayX() + this.getLeftMargin(), n3);
    }

    public void setMaxRows(int n) {
        this.tQy = n;
    }

    public void setHotSpotPosition(faa_2 faa_22) {
        if (faa_22 != null) {
            this.tQJ = faa_22;
        }
    }

    public fbz_2 getList() {
        return this.nGl;
    }

    public void setBehaviour(fza_0 fza_02) {
        this.tQz = fza_02;
    }

    @Override
    public @Unmodifiable @NotNull List<fhv_1> getIndirectChildren() {
        ArrayList<fhv_1> arrayList = new ArrayList<fhv_1>(super.getIndirectChildren());
        if (this.nGl != null) {
            arrayList.add(this.nGl);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Object getSelectedValue() {
        return this.nGl == null ? null : this.nGl.getSelectedValue();
    }

    public void setSelectedValue(Object object) {
        if (object == null) {
            return;
        }
        if (this.nGl != null) {
            this.nGl.setSelectedValue(object);
            Object object2 = this.nGl.getSelectedValue();
            if (object != object2 && !object.equals(object2) && object2 != null) {
                uxJ.warn((Object)("Cannot find the selected value in the content - 'content' attribute must be defined before 'selectedValue' - " + String.valueOf(object) + " - " + String.valueOf(object2)));
            }
        }
    }

    public void setAutoListFilter(boolean bl) {
        if (bl) {
            this.ufu.setListFilter(this.ufE);
        } else {
            this.ufE.bc("");
            this.ufu.setListFilter(null);
        }
    }

    public void setDisplayListOnlyIfTextPresent(boolean bl) {
        this.ufs = bl;
    }

    public void setDisplayListThreshold(int n) {
        this.uft = n;
    }

    @Override
    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        this.x((fdu_1 fdu_12) -> fdu_12.setEnabled(bl));
        if (this.ufv != null) {
            this.ufv.setEnabled(bl);
        }
        if (this.ufw != null) {
            this.ufw.setEnabled(bl);
        }
        if (this.nGl != null) {
            this.nGl.setEnabled(bl);
        }
        if (!this.isEnabledFull()) {
            this.gsH();
        }
    }

    @Override
    public void setNetEnabled(boolean bl) {
        super.setNetEnabled(bl);
        this.x((fdu_1 fdu_12) -> fdu_12.setNetEnabled(bl));
        if (this.ufv != null) {
            this.ufv.setNetEnabled(bl);
        }
        if (this.ufw != null) {
            this.ufw.setNetEnabled(bl);
        }
        if (this.nGl != null) {
            this.nGl.setNetEnabled(bl);
        }
        if (!this.isEnabledFull()) {
            this.gsH();
        }
    }

    @Override
    public void a(fzq_0 fzq_02, fis_1 fis_12, boolean bl, @Nullable Integer n) {
        switch (fzq_02) {
            case tJH: 
            case tJF: 
            case tJG: {
                this.x((fdu_1 fdu_12) -> fdu_12.a(fzq_02, fis_12, bl, n));
                break;
            }
            default: {
                super.a(fzq_02, fis_12, bl, n);
            }
        }
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        switch (n) {
            case -410343712: {
                this.setWithSearchButton(Bw.aK(string));
                return true;
            }
            case -2072642759: {
                this.setWithClearButton(Bw.aK(string));
                return true;
            }
            case 1492073575: {
                this.setOnSearch(fic_12.b(fmn_1.class, string));
                return true;
            }
            case -1351906386: {
                this.setOnClear(fic_12.b(fme_2.class, string));
                return true;
            }
            case 428573020: {
                this.setSearchOnPressEnter(Bw.aK(string));
                return true;
            }
            case 1249389695: {
                this.setAutoHorizontalScrolled(Bw.aK(string));
                return true;
            }
            case 73055982: 
            case 381878489: {
                this.setMaxCharacters(Bw.m(string));
                return true;
            }
            case 1216985755: {
                this.setPassword(Bw.aK(string));
                return true;
            }
            case -336545092: {
                this.setRestrict(fic_12.a(string, this.nQt));
                return true;
            }
            case 1602416228: {
                this.setEditable(Bw.aK(string));
                return true;
            }
            case -1784789924: {
                this.tX(fic_12.a(string, this.nQt));
                return true;
            }
            case 1453943993: {
                this.setUnicodeRestrict(Bw.aK(string));
                return true;
            }
            case 534924003: {
                this.setDisplayGhostTextOnFocusLost(Bw.aK(string));
                return true;
            }
            case 105252970: {
                this.setReplaceNullByGhostText(Bw.aK(string));
                return true;
            }
            case -1655575466: {
                this.setSelectable(Bw.aK(string));
                return true;
            }
            case -625591907: {
                this.setSelectOnFocus(Bw.aK(string));
                return true;
            }
            case -470861862: {
                this.setEnableOnlySelectablePartInteraction(Bw.aK(string));
                return true;
            }
            case 92903173: {
                this.setAlign(faa_2.tI(string));
                return true;
            }
            case -1249482096: {
                this.setJustify(Bw.aK(string));
                return true;
            }
            case 3148879: {
                this.setFont(fic_12.vq(string));
                return true;
            }
            case 1307418143: {
                this.setHorizontalAlignment(fzY.tG(string));
                return true;
            }
            case 48371712: {
                this.setBrightenColor(Bw.aK(string));
                return true;
            }
            case -919628796: {
                this.setDarkenColor(Bw.aK(string));
                return true;
            }
            case -1326227699: {
                this.setVerticalAlignment(fzY.tG(string));
                return true;
            }
            case 400381634: {
                this.setMaxWidth(Bw.m(string));
                return true;
            }
            case -1375815020: {
                this.setMinWidth(Bw.m(string));
                return true;
            }
            case -1206239059: {
                this.setMultiline(Bw.aK(string));
                return true;
            }
            case 390232059: {
                this.setMaxLines(Bw.m(string));
                return true;
            }
            case -515807685: {
                this.setLineHeight(Bw.m(string));
                return true;
            }
            case -467842239: {
                this.setInheritParentWidth(Bw.aK(string));
                return true;
            }
            case 139285235: {
                this.setUseParentMaxWidth(Bw.aK(string));
                return true;
            }
            case 2068626633: {
                this.setMinSizeComputationBehaviour(fic_12.b(fzk_0.class, string));
                return true;
            }
            case -1439500848: {
                this.setOrientation(fzu_0.tC(string));
                return true;
            }
            case 3556653: {
                this.setText(fic_12.a(string, this.nQt));
                return true;
            }
            case 1153931755: {
                this.setUseHighContrast(Bw.aK(string));
                return true;
            }
            case -1852365066: {
                this.setEnableShrinking(Bw.aK(string));
                return true;
            }
            case 3744723: {
                this.setZoom(Bw.o(string));
                return true;
            }
            case -1152148181: {
                this.setDisplayCharDelay(Bw.p(string));
                return true;
            }
            case 1913333550: {
                this.setEnableAutoZoomShrink(Bw.aK(string));
                return true;
            }
            case 844056925: {
                this.setMaxRows(Bw.m(string));
                return true;
            }
            case 1905963320: {
                this.setHotSpotPosition(faa_2.tI(string));
                return true;
            }
            case -406349635: {
                this.setBehaviour(fic_12.b(fza_0.class, string));
                return true;
            }
            case 408593605: {
                this.setAutoListFilter(Bw.aK(string));
                return true;
            }
            case 583200901: {
                this.setDisplayListOnlyIfTextPresent(Bw.aK(string));
                return true;
            }
            case 193923019: {
                this.setDisplayListThreshold(Bw.m(string));
                return true;
            }
        }
        return super.setXMLAttribute(n, string, fic_12);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -410343712) {
            this.setWithSearchButton(Bw.l(object));
            return true;
        }
        if (n == -2072642759) {
            this.setWithClearButton(Bw.l(object));
            return true;
        }
        if (n == 428573020) {
            this.setSearchOnPressEnter(Bw.l(object));
            return true;
        }
        if (n == 1249389695) {
            this.setAutoHorizontalScrolled(Bw.l(object));
            return true;
        }
        if (n == 73055982 || n == 381878489) {
            this.setMaxCharacters(Bw.m(object));
            return true;
        }
        if (n == 1216985755) {
            this.setPassword(Bw.l(object));
            return true;
        }
        if (n == -336545092) {
            this.setRestrict((String)object);
            return true;
        }
        if (n == 1602416228) {
            this.setEditable(Bw.l(object));
            return true;
        }
        if (n == -1784789924) {
            this.setGhostText(object);
            return true;
        }
        if (n == ugq) {
            this.setListFilter((ffb_2)object);
            return true;
        }
        if (n == 1453943993) {
            this.setUnicodeRestrict(Bw.l(object));
            return true;
        }
        if (n == 534924003) {
            this.setDisplayGhostTextOnFocusLost(Bw.l(object));
            return true;
        }
        if (n == 105252970) {
            this.setReplaceNullByGhostText(Bw.l(object));
            return true;
        }
        if (n == -1655575466) {
            this.setSelectable(Bw.l(object));
            return true;
        }
        if (n == -625591907) {
            this.setSelectOnFocus(Bw.l(object));
            return true;
        }
        if (n == -470861862) {
            this.setEnableOnlySelectablePartInteraction(Bw.l(object));
            return true;
        }
        if (n == 3556653) {
            this.setText(object);
            return true;
        }
        if (n == 92903173) {
            this.setAlign((faa_2)((Object)object));
            return true;
        }
        if (n == -1249482096) {
            this.setJustify(Bw.l(object));
            return true;
        }
        if (n == 3148879) {
            this.setFont((awm_2)object);
            return true;
        }
        if (n == 48371712) {
            this.setBrightenColor(Bw.l(object));
            return true;
        }
        if (n == -919628796) {
            this.setDarkenColor(Bw.l(object));
            return true;
        }
        if (n == 1307418143) {
            this.setHorizontalAlignment((fzY)((Object)object));
            return true;
        }
        if (n == -1326227699) {
            this.setVerticalAlignment((fzY)((Object)object));
            return true;
        }
        if (n == 400381634) {
            this.setMaxWidth(Bw.m(object));
            return true;
        }
        if (n == -1375815020) {
            this.setMinWidth(Bw.m(object));
            return true;
        }
        if (n == -1206239059) {
            this.setMultiline(Bw.l(object));
            return true;
        }
        if (n == 390232059) {
            this.setMaxLines(Bw.m(object));
            return true;
        }
        if (n == -515807685) {
            this.setLineHeight(Bw.m(object));
            return true;
        }
        if (n == -467842239) {
            this.setInheritParentWidth(Bw.l(object));
            return true;
        }
        if (n == 139285235) {
            this.setUseParentMaxWidth(Bw.l(object));
            return true;
        }
        if (n == 2068626633) {
            this.setMinSizeComputationBehaviour((fzk_0)((Object)object));
            return true;
        }
        if (n == -1439500848) {
            this.setOrientation((fzu_0)((Object)object));
            return true;
        }
        if (n == -1852365066) {
            this.setEnableShrinking(Bw.l(object));
            return true;
        }
        if (n == 1153931755) {
            this.setUseHighContrast(Bw.l(object));
            return true;
        }
        if (n == 3744723) {
            this.setZoom(Bw.o(object));
            return true;
        }
        if (n == -1152148181) {
            this.setDisplayCharDelay(Bw.p(object));
            return true;
        }
        if (n == 1913333550) {
            this.setEnableAutoZoomShrink(Bw.l(object));
            return true;
        }
        if (n == 844056925) {
            this.setMaxRows(Bw.m(object));
            return true;
        }
        if (n == 1905963320) {
            this.setHotSpotPosition((faa_2)((Object)object));
            return true;
        }
        if (n == ugx) {
            this.setSelectedValue(object);
            return true;
        }
        if (n == 408593605) {
            this.setAutoListFilter(Bw.l(object));
            return true;
        }
        if (n == 583200901) {
            this.setDisplayListOnlyIfTextPresent(Bw.l(object));
            return true;
        }
        if (n == 193923019) {
            this.setDisplayListThreshold(Bw.m(object));
            return true;
        }
        return super.setPropertyAttribute(n, object);
    }

    @Override
    public boolean a(int n, String string, fic_1 fic_12) {
        switch (n) {
            case 3556653: {
                this.tO(fic_12.a(string, this.nQt));
                return true;
            }
        }
        return super.a(n, string, fic_12);
    }

    @Override
    public boolean g(int n, Object object) {
        switch (n) {
            case 3556653: {
                this.tO(String.valueOf(object));
                return true;
            }
        }
        return super.g(n, object);
    }
}

