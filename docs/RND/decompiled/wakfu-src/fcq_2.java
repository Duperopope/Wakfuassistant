/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fCQ
 */
public class fcq_2
extends faw_2 {
    public static final String TAG = "ScrollContainer";
    public static final String uav = "horizontalScrollBar";
    public static final String uaw = "verticalScrollBar";
    fcj_2 uax;
    fcj_2 uay;
    fzi_0 uaz = fzi_0.tHa;
    fzi_0 uaA = fzi_0.tHa;
    boolean uaB = false;
    boolean uaC = false;
    faa_2 uaD = null;
    boolean uaE = true;
    float uaF = 1.0f;
    boolean uaG = false;
    boolean uaH = false;
    fih_1 uaI;
    boolean uaJ;
    float uaK;
    float uaL;
    fzx_0 uaM = fzx_0.tLs;
    fzx_0 uaN = fzx_0.tLr;
    private boolean uaO = false;
    fes_2 uaP;
    float uaQ;
    private fik_1 uaR;
    public static final int uaS = -1806562365;
    public static final int uaT = -701523813;
    public static final int uaU = 971572077;
    public static final int uaV = -1755568757;
    public static final int uaW = 1346443385;
    public static final int uaX = 1472700865;
    public static final int uaY = -1149170541;
    public static final int uaZ = 1295085049;
    public static final int uba = -1326786357;
    public static final int ubb = 1177751890;
    public static final int ubc = -1986013536;
    public static final int ubd = 577708274;
    public static final int ube = -537903381;
    public static final int ubf = 740886190;

    @Override
    public void l(fes_2 fes_22) {
        if (fes_22 != this.uax && fes_22 != this.uay) {
            if (this.uaP != null) {
                this.m((fhv_1)this.uaP);
            }
            this.uaP = fes_22;
            this.uaP.setSize(this.uaP.getPrefSize());
        }
        super.l(fes_22);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public fzx_0 getVerticalScrollBarAlignment() {
        return this.uaM;
    }

    public void setVerticalScrollBarAlignment(fzx_0 fzx_02) {
        this.uaM = fzx_02;
    }

    public fzx_0 getHorizontalScrollBarAlignment() {
        return this.uaN;
    }

    public void setHorizontalScrollBarAlignment(fzx_0 fzx_02) {
        this.uaN = fzx_02;
    }

    public fzi_0 getVerticalScrollBarBehaviour() {
        return this.uaz;
    }

    public void setVerticalScrollBarBehaviour(fzi_0 fzi_02) {
        if (this.uaz == null || this.uaz != fzi_02) {
            this.uaz = fzi_02;
            this.uaO = true;
            this.setNeedsToPreProcess();
        }
    }

    public void setVerticalScrollBarPosition(float f2) {
        this.uax.setValue(f2);
    }

    public fzi_0 getHorizontalScrollBarBehaviour() {
        return this.uaA;
    }

    public void setHorizontalScrollBarBehaviour(fzi_0 fzi_02) {
        if (this.uaA == null || this.uaA != fzi_02) {
            this.uaA = fzi_02;
            this.uaO = true;
            this.setNeedsToPreProcess();
        }
    }

    public void setHorizontalScrollBarPosition(float f2) {
        this.uay.setValue(f2);
    }

    public void setHorizontalSliderMinDimension(@Nullable fsm_1 fsm_12) {
        this.uay.setSliderMinDimension(fsm_12);
    }

    @Nullable
    public fsm_1 getHorizontalSliderMinDimension() {
        return this.uay.getSliderMinDimension();
    }

    public void setVerticalSliderMinDimension(@Nullable fsm_1 fsm_12) {
        this.uax.setSliderMinDimension(fsm_12);
    }

    @Nullable
    public fsm_1 getVerticalSliderMinDimension() {
        return this.uax.getSliderMinDimension();
    }

    public float getSliderMinSize() {
        return this.uax.getSliderMinSize();
    }

    public void setSliderMinSize(float f2) {
        this.uay.setSliderMinSize(f2);
        this.uax.setSliderMinSize(f2);
    }

    public boolean isEnableScrollBar() {
        return this.uaE;
    }

    public void setEnableScrollBar(boolean bl) {
        this.uaE = bl;
        this.uaO = true;
        this.setNeedsToPreProcess();
    }

    public faa_2 getInnerWidgetAlign() {
        return this.uaD;
    }

    public void setInnerWidgetAlign(faa_2 faa_22) {
        this.uaD = faa_22;
    }

    public fcj_2 getVerticalScrollBar() {
        return this.uax;
    }

    public fcj_2 getHorizontalScrollBar() {
        return this.uay;
    }

    public float getPageJumpRatio() {
        return this.uaQ;
    }

    public void setAutoScrollVertical(boolean bl) {
        this.uaG = bl;
    }

    public void setAutoScrollHorizontal(boolean bl) {
        this.uaH = bl;
    }

    public void setDndListenerContentValidator(fih_1 fih_12) {
        this.uaI = fih_12;
        if (this.uaR == null) {
            this.uaR = new fcr_1(this);
            fil_1.gBx().a(this.uaR);
        }
    }

    public void setPageJumpRatio(float f2) {
        this.uaQ = f2;
    }

    @Override
    public fes_2 getWidgetByThemeElementName(String string, boolean bl) {
        if (uav.equalsIgnoreCase(string)) {
            return this.uay;
        }
        if (uaw.equalsIgnoreCase(string)) {
            return this.uax;
        }
        return null;
    }

    @Override
    public axl_2 getScissor(fes_2 fes_22) {
        if (fes_22 == this.uax || fes_22 == this.uay) {
            return axl_2.t(this.getScreenX() + this.uki.getLeftInset(), this.getScreenY() + this.uki.getBottomInset(), this.ukt.width - this.uki.getLeftInset() - this.uki.getRightInset(), this.ukt.height - this.uki.getBottomInset() - this.uki.getTopInset());
        }
        return axl_2.t(this.getScreenX() + this.uki.getLeftInset() + (this.uaB && this.uaM == fzx_0.tLt ? this.uax.getWidth() : 0), this.getScreenY() + this.uki.getBottomInset() + (this.uaC && this.uaN == fzx_0.tLr ? this.uay.getHeight() : 0), this.ukt.width - this.uki.getLeftInset() - this.uki.getRightInset() - (this.uaB ? this.uax.getWidth() : 0), (int)(this.uaF * (float)(this.ukt.height - this.uki.getBottomInset() - this.uki.getTopInset() - (this.uaC ? this.uay.getHeight() : 0))));
    }

    @Override
    public fes_2 getWidget(int n, int n2) {
        if (this.uwb || !this.bmg || !this.getAppearance().gE(n, n2) || fbj_1.getInstance().isMovePointMode()) {
            return null;
        }
        fes_2 fes_22 = null;
        if (this.uaC && !this.uay.isUnloading() && (fes_22 = this.uay.getWidget((n -= this.getAppearance().getLeftInset()) - this.uay.ukp.x, (n2 -= this.getAppearance().getBottomInset()) - this.uay.ukp.y)) != null) {
            return fes_22;
        }
        if (this.uaB && !this.uax.isUnloading() && (fes_22 = this.uax.getWidget(n - this.uax.ukp.x, n2 - this.uax.ukp.y)) != null) {
            return fes_22;
        }
        if (this.uaB && this.uaC && n2 < this.uax.getY()) {
            return this.ukD ? null : this;
        }
        if (this.uaP != null && !this.uaP.isUnloading()) {
            fes_22 = this.uaP.getWidget(n - this.uaP.ukp.x, n2 - this.uaP.ukp.y);
        }
        return fes_22 != null ? fes_22 : (this.ukD ? null : this);
    }

    public void fw(float f2) {
        this.uax.setValue(f2);
    }

    public void fx(float f2) {
        this.uay.setValue(f2);
    }

    @Override
    public void bFM() {
        super.bFM();
    }

    @Override
    public void aVH() {
        super.aVH();
        this.uax = null;
        this.uay = null;
        if (this.uaR != null) {
            fil_1.gBx().b(this.uaR);
            this.uaR = null;
        }
    }

    @Override
    public void aVI() {
        super.aVI();
        fcv_2 fcv_22 = new fcv_2(this);
        fcv_22.aVI();
        this.a(fcv_22);
        this.ukD = false;
        this.a(fzq_0.tJS, false);
        this.a(fzq_0.tJT, false);
        this.a(fzq_0.tJU, false);
        this.a(fzq_0.tJV, false);
        this.a(fzq_0.tJO, false);
        this.a(fzq_0.tJN, false);
        this.a(fzq_0.tJP, false);
        this.uaF = 1.0f;
        this.uaQ = 0.5f;
        this.uax = new fcj_2();
        this.uax.aVI();
        this.uax.setCanBeCloned(false);
        this.uax.setHorizontal(false);
        this.uax.setValue(1.0f);
        this.d(this.uax);
        this.uax.a(fzq_0.tKa, new fcs_2(this), false);
        this.uay = new fcj_2();
        this.uay.aVI();
        this.uay.setCanBeCloned(false);
        this.uay.setHorizontal(true);
        this.uay.setValue(0.0f);
        this.d(this.uay);
        this.uay.a(fzq_0.tKa, new fct_1(this), false);
        this.a(fzq_0.tJW, new fcu_2(this), false);
        this.uaE = true;
        this.ukW = true;
    }

    public void gul() {
        this.x(fcw_2.class);
        this.uaF = 1.0f;
    }

    public void gum() {
        this.a(new fcw_2(this, this.uaF, 0.0f, this, 10000, 5000, abn.cdr));
    }

    @Override
    public boolean LZ(int n) {
        boolean bl = super.LZ(n);
        if (this.uaO) {
            this.gsm();
            this.uaO = false;
        }
        if (this.uaJ) {
            this.uax.setValue(GC.b(this.uax.getValue() + this.uaK, 0.0f, 1.0f));
            this.uay.setValue(GC.b(this.uay.getValue() + this.uaL, 0.0f, 1.0f));
            return true;
        }
        return bl;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fcq_2 fcq_22 = (fcq_2)fhi_22;
        super.a(fcq_22);
        fcq_22.uaA = this.uaA;
        fcq_22.uaN = this.uaN;
        fcq_22.uaz = this.uaz;
        fcq_22.uaM = this.uaM;
        fcq_22.uaD = this.uaD;
        fcq_22.uaE = this.uaE;
        fcq_22.uaQ = this.uaQ;
        fcq_22.uaI = this.uaI;
        fcq_22.uaG = this.uaG;
        fcq_22.uaH = this.uaH;
        fcq_22.setHorizontalSliderMinDimension(this.getHorizontalSliderMinDimension());
        fcq_22.setVerticalSliderMinDimension(this.getVerticalSliderMinDimension());
        fcq_22.setSliderMinSize(this.getSliderMinSize());
        fcq_22.ukM = true;
        fcq_22.setNeedsToPreProcess();
    }

    void gun() {
        this.af(this.uay.getSlider().getValue());
        this.ag(this.uax.getSlider().getValue());
    }

    void af(double d2) {
        int n = this.uaP.getSize().width;
        int n2 = this.uki.getContentWidth();
        if (this.uaB) {
            n2 = (int)((double)n2 - this.uax.getSize().getWidth());
        }
        int n3 = this.uaD == null || n - n2 > 0 ? -((int)((double)(n - n2) * d2)) : this.uaD.cf(n, n2);
        if (this.uaB && this.uaM == fzx_0.tLt) {
            n3 = (int)((double)n3 + this.uax.getSize().getWidth());
        }
        this.uaP.setX(n3);
    }

    void ag(double d2) {
        int n = this.uaP.getSize().height;
        int n2 = this.uki.getContentHeight();
        if (this.uaC) {
            n2 = (int)((double)n2 - this.uay.getSize().getHeight());
        }
        int n3 = this.uaD == null || n - n2 > 0 ? -((int)((double)(n - n2) * d2)) : this.uaD.cg(n, n2);
        if (this.uaC && this.uaN == fzx_0.tLr) {
            n3 = (int)((double)n3 + this.uay.getSize().getHeight());
        }
        this.uaP.setY(n3);
    }

    public boolean guo() {
        return (double)this.getAppearance().getContentHeight() < this.uaP.getPrefSize().getHeight();
    }

    public boolean gup() {
        return (double)this.getAppearance().getContentWidth() < this.uaP.getPrefSize().getWidth();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        return switch (n) {
            case -1806562365 -> {
                this.setEnableScrollBar(Bw.aK(string));
                yield true;
            }
            case -701523813 -> {
                this.setHorizontalScrollBarBehaviour(fzi_0.tw(string));
                yield true;
            }
            case 971572077 -> {
                this.setVerticalScrollBarBehaviour(fzi_0.tw(string));
                yield true;
            }
            case -537903381 -> {
                this.setInnerWidgetAlign(faa_2.tI(string));
                yield true;
            }
            case -1755568757 -> {
                this.setHorizontalScrollBarPosition(Bw.o(string));
                yield true;
            }
            case 1346443385 -> {
                this.setVerticalScrollBarPosition(Bw.o(string));
                yield true;
            }
            case 1472700865 -> {
                this.setHorizontalScrollBarAlignment(fzx_0.tF(string));
                yield true;
            }
            case -1149170541 -> {
                this.setVerticalScrollBarAlignment(fzx_0.tF(string));
                yield true;
            }
            case 1295085049 -> {
                this.setHorizontalSliderMinDimension(fic_12.vn(string));
                yield true;
            }
            case -1326786357 -> {
                this.setVerticalSliderMinDimension(fic_12.vn(string));
                yield true;
            }
            case 1177751890 -> {
                this.setSliderMinSize(Bw.o(string));
                yield true;
            }
            case 740886190 -> {
                this.setPageJumpRatio(Bw.o(string));
                yield true;
            }
            case -1986013536 -> {
                this.setAutoScrollHorizontal(Bw.aK(string));
                yield true;
            }
            case 577708274 -> {
                this.setAutoScrollVertical(Bw.aK(string));
                yield true;
            }
            default -> super.setXMLAttribute(n, string, fic_12);
        };
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        return switch (n) {
            case -1806562365 -> {
                this.setEnableScrollBar(Bw.l(object));
                yield true;
            }
            case -701523813 -> {
                this.setHorizontalScrollBarBehaviour((fzi_0)((Object)object));
                yield true;
            }
            case 971572077 -> {
                this.setVerticalScrollBarBehaviour((fzi_0)((Object)object));
                yield true;
            }
            case -537903381 -> {
                this.setInnerWidgetAlign(faa_2.aU(object));
                yield true;
            }
            case -1755568757 -> {
                this.setHorizontalScrollBarPosition(Bw.o(object));
                yield true;
            }
            case 1346443385 -> {
                this.setVerticalScrollBarPosition(Bw.o(object));
                yield true;
            }
            case 1472700865 -> {
                this.setHorizontalScrollBarAlignment((fzx_0)((Object)object));
                yield true;
            }
            case -1149170541 -> {
                this.setVerticalScrollBarAlignment((fzx_0)((Object)object));
                yield true;
            }
            case 1295085049 -> {
                this.setHorizontalSliderMinDimension((fsm_1)object);
                yield true;
            }
            case -1326786357 -> {
                this.setVerticalSliderMinDimension((fsm_1)object);
                yield true;
            }
            case 1177751890 -> {
                this.setSliderMinSize(Bw.o(object));
                yield true;
            }
            case 740886190 -> {
                this.setPageJumpRatio(Bw.o(object));
                yield true;
            }
            case -1986013536 -> {
                this.setAutoScrollHorizontal(Bw.l(object));
                yield true;
            }
            case 577708274 -> {
                this.setAutoScrollVertical(Bw.l(object));
                yield true;
            }
            default -> super.setPropertyAttribute(n, object);
        };
    }
}

