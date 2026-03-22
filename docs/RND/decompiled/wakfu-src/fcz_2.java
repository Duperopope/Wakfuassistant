/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fCZ
 */
public class fcz_2
extends faw_2
implements fzd {
    public static final String TAG = "Slider";
    public static final String ubq = "horizontalButton";
    public static final String ubr = "verticalButton";
    public static final String ubs = "horizontalSeparator";
    public static final String ubt = "verticalSeparator";
    private static final float ubu = 0.01f;
    float awY = 0.0f;
    private float ubv = 0.0f;
    private int sAD = 0;
    private int sAE = 1;
    private int ubw = Integer.MIN_VALUE;
    private int ubx = Integer.MAX_VALUE;
    boolean uby = true;
    boolean ubz = true;
    boolean ubA = false;
    int ubB = 0;
    boolean iNr = false;
    private boolean ubC = false;
    boolean tMi = true;
    private float ubD = 0.15f;
    private float ubE = 0.01f;
    float uag = 0.05f;
    fad_1 tQx;
    int ubF;
    int ubG;
    private fis_1 tND = null;
    private fis_1 tNF = null;
    private fis_1 ubH;
    ArrayList<fbt_1> ubI = new ArrayList();
    fze tEl = null;
    axb_2 ncL = null;
    boolean tZi = false;
    boolean ubJ = false;
    private boolean tMH;
    public static final int ubK = -867683742;
    public static final int ubL = -293147356;
    public static final int ubM = 1387629604;
    public static final int ubN = 381182586;
    public static final int ubO = -1395014068;
    public static final int ubP = -1638048016;
    public static final int ubQ = 880722626;
    public static final int ubR = 3273774;
    public static final int ubS = 1106146434;
    public static final int ubT = 111972721;
    public static final int ubU = -56707504;
    public static final int ubV = -575832990;

    @Override
    public void d(fhv_1 fhv_12) {
        if (fhv_12 instanceof fad_1 && this.tQx != fhv_12) {
            if (this.tQx != null) {
                this.m((fhv_1)this.tQx);
            }
            this.tQx = (fad_1)fhv_12;
            this.tQx.setUsePositionTween(this.iNr && this.ubC);
        } else if (fhv_12 instanceof fze) {
            this.setPixmap((fze)fhv_12);
        }
        super.d(fhv_12);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public float getValue() {
        return this.fy(this.awY);
    }

    public void setValue(float f2) {
        this.setValue(f2, false);
    }

    public void setValue(float f2, boolean bl) {
        if (!bl && f2 == this.awY) {
            return;
        }
        int n = this.getEffectiveMinBound();
        int n2 = this.getEffectiveMaxBound();
        this.ubv = f2;
        if (f2 < (float)n) {
            f2 = n;
        } else if (f2 > (float)n2) {
            f2 = n2;
        }
        this.awY = f2;
        flw_2 flw_22 = new flw_2(this);
        flw_22.setValue(f2);
        this.h(flw_22);
        this.uby = true;
        this.setNeedsToMiddleProcess();
    }

    public void setNumFixedValues(int n) {
        assert (n >= 0) : "Invalid value. numFixedValues must be >= 0";
        this.ubB = n;
        this.ubA = this.ubB != 0;
        this.bFM();
        if (this.ubA) {
            this.setValue(this.ubv);
        }
    }

    public int getMinBound() {
        return this.sAD;
    }

    public void setMinBound(int n) {
        this.sAD = n;
    }

    public int getMaxBound() {
        return this.sAE;
    }

    public void setMaxBound(int n) {
        this.sAE = n;
    }

    public int getInnerMinBound() {
        return this.ubw;
    }

    public void setInnerMinBound(int n) {
        this.ubw = n;
    }

    public int getInnerMaxBound() {
        return this.ubx;
    }

    public void setInnerMaxBound(int n) {
        this.ubx = n;
    }

    public double getJump() {
        return this.uag;
    }

    public void setJump(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        this.uag = f2;
    }

    public boolean isHorizontal() {
        return this.tMi;
    }

    public void setHorizontal(boolean bl) {
        this.tMi = bl;
    }

    public double getSliderSize() {
        return this.ubD;
    }

    public void setSliderSize(float f2) {
        this.ubD = f2 = GC.b(f2, this.ubE, 1.0f);
        this.ubz = true;
        this.setNeedsToMiddleProcess();
    }

    public float getSliderMinSize() {
        return this.ubE;
    }

    public void setSliderMinSize(float f2) {
        if (this.ubE == f2) {
            return;
        }
        this.ubE = f2;
        this.setSliderSize(this.ubD);
    }

    public boolean getScrollOnMouseWheel() {
        return this.tMH;
    }

    public void setScrollOnMouseWheel(boolean bl) {
        this.tMH = bl;
    }

    public fad_1 getButton() {
        return this.tQx;
    }

    @Override
    public fes_2 getWidgetByThemeElementName(String string, boolean bl) {
        if ((this.tMi || bl) && ubq.equalsIgnoreCase(string)) {
            return this.tQx;
        }
        if ((!this.tMi || bl) && ubr.equalsIgnoreCase(string)) {
            return this.tQx;
        }
        return null;
    }

    @Override
    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        this.tQx.setEnabled(bl);
    }

    @Override
    public void setNetEnabled(boolean bl) {
        super.setNetEnabled(bl);
        this.tQx.setNetEnabled(bl);
    }

    public boolean getReadOnly() {
        return this.iNr;
    }

    public void setReadOnly(boolean bl) {
        this.iNr = bl;
        this.tQx.setUsePositionTween(this.iNr && this.ubC);
    }

    public void setUseTween(boolean bl) {
        this.ubC = bl;
        this.tQx.setUsePositionTween(this.iNr && this.ubC);
    }

    @Override
    public void setPixmap(fze fze2) {
        if (fze2 != this.tEl) {
            this.tEl = fze2;
            this.tZi = true;
            this.setNeedsToPreProcess();
        }
    }

    @Override
    public void setModulationColor(axb_2 axb_22) {
        if (this.ncL == axb_22) {
            return;
        }
        this.ncL = axb_22;
        for (int i = this.ubI.size() - 1; i >= 0; --i) {
            this.ubI.get(i).setModulationColor(axb_22);
        }
    }

    @Override
    public void setNonBlocking(boolean bl) {
        this.setNonBlocking(bl, true);
    }

    @Override
    public axb_2 getModulationColor() {
        return this.ncL;
    }

    void gur() {
        if (this.ubB <= 1 || !this.ubA || this.ubI.size() <= 0) {
            return;
        }
        if (this.tMi) {
            int n = this.ubI.get(0).getWidth();
            int n2 = this.tQx.getWidth() / 2 - n / 2;
            float f2 = (float)(this.getAppearance().getContentWidth() - this.tQx.getWidth()) / (float)(this.ubB - 1);
            for (int i = 0; i < this.ubI.size(); ++i) {
                fbt_1 fbt_12 = this.ubI.get(i);
                fbt_12.setPosition((int)(f2 * (float)i + (float)n2), 0);
            }
        } else {
            int n = this.ubI.get(0).getHeight();
            int n3 = this.tQx.getHeight() / 2 - n / 2;
            float f3 = (float)(this.getAppearance().getContentHeight() - this.tQx.getHeight()) / (float)(this.ubB - 1);
            for (int i = 0; i < this.ubI.size(); ++i) {
                fbt_1 fbt_13 = this.ubI.get(i);
                fbt_13.setPosition(0, (int)(f3 * (float)i + (float)n3));
            }
        }
        this.ubJ = false;
        this.setNeedsToMiddleProcess();
    }

    @Override
    public void bFM() {
        this.ubz = true;
        this.uby = true;
        this.ubJ = true;
        this.setNeedsToMiddleProcess();
        super.bFM();
    }

    private int getEffectiveMinBound() {
        if (this.ubw > this.sAD && this.ubw < this.ubx && this.ubw < this.sAE) {
            return this.ubw;
        }
        return this.sAD;
    }

    private int getEffectiveMaxBound() {
        int n;
        int n2 = n = this.ubA ? this.sAD + this.ubB - 1 : this.sAE;
        if (this.ubx < n && this.ubx > this.sAD && this.ubx > this.ubw) {
            return this.ubx;
        }
        return n;
    }

    float fy(float f2) {
        int n = this.sAD;
        int n2 = this.ubA ? this.sAD + this.ubB - 1 : this.sAE;
        float f3 = f2 * (float)(n2 - n) + (float)n;
        if (this.ubA) {
            f3 = Math.round(f3);
        }
        return f3;
    }

    float fz(float f2) {
        int n = this.sAD;
        int n2 = this.ubA ? this.sAD + this.ubB - 1 : this.sAE;
        return (f2 - (float)n) / (float)(n2 - n);
    }

    public void gus() {
        int n;
        int n2;
        fsm_1 fsm_12 = this.tQx.getPrefSize();
        if (this.tMi) {
            n2 = this.getAppearance().getContentHeight();
            n = Math.max((int)((float)this.getAppearance().getContentWidth() * this.ubD), fsm_12.width);
        } else {
            n = this.getAppearance().getContentWidth();
            n2 = Math.max((int)((float)this.getAppearance().getContentHeight() * this.ubD), fsm_12.height);
        }
        this.tQx.setSize(n, n2);
        if (this.ubI != null && this.ubI.size() > 0) {
            fsm_1 fsm_13 = this.ubI.get(0).getPrefSize();
            int n3 = this.tMi ? fsm_13.width : n;
            int n4 = this.tMi ? n2 : fsm_13.height;
            for (fbt_1 fbt_12 : this.ubI) {
                fbt_12.setSize(n3, n4);
            }
        }
        this.ubz = false;
        this.setNeedsToMiddleProcess();
    }

    public void gut() {
        int n;
        int n2;
        if (this.tMi) {
            n2 = 0;
            n = (int)(this.fz(this.awY) * (float)Math.max(0, this.getAppearance().getContentWidth() - this.tQx.getWidth()));
        } else {
            n = 0;
            n2 = (int)(this.fz(this.awY) * (float)Math.max(0, this.getAppearance().getContentHeight() - this.tQx.getHeight()));
        }
        this.tQx.setPosition(n, n2);
        this.uby = false;
        this.setNeedsToMiddleProcess();
    }

    public void guu() {
        this.tND = new fda_1(this);
        this.a(fzq_0.tJS, this.tND, false);
        this.tNF = new fdb_2(this);
        this.a(fzq_0.tJO, this.tNF, true);
        this.ubH = fiq_12 -> {
            if (this.iNr) {
                return false;
            }
            if (!this.tMH) {
                return false;
            }
            float f2 = this.ubA ? 1.0f / (float)this.ubB + 0.001f : this.uag;
            int n = ((flp_2)fiq_12).gEo() * -1;
            float f3 = f2 * (float)n;
            this.setValue(this.fy(this.fz(this.awY) + f3));
            return false;
        };
        this.a(fzq_0.tJW, this.ubH, false);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tQx = null;
        this.ubI.clear();
        this.ubz = false;
        this.tEl = null;
        this.ubJ = false;
        this.ubE = 0.01f;
    }

    @Override
    public void aVI() {
        super.aVI();
        fdc_1 fdc_12 = new fdc_1(this);
        fdc_12.aVI();
        this.a(fdc_12);
        this.tQx = new fad_1();
        this.tQx.aVI();
        this.tQx.setCanBeCloned(false);
        this.d(this.tQx);
        this.ubF = 0;
        this.ubG = 0;
        this.ukD = false;
        this.guu();
    }

    @Override
    public boolean aaB(int n) {
        boolean bl = super.aaB(n);
        if (this.ubz || this.uby) {
            this.bFM();
        }
        return bl;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fcz_2 fcz_22 = (fcz_2)fhi_22;
        super.a(fcz_22);
        fcz_22.awY = this.awY;
        fcz_22.sAD = this.sAD;
        fcz_22.sAE = this.sAE;
        fcz_22.ubw = this.ubw;
        fcz_22.ubx = this.ubx;
        fcz_22.ubA = this.ubA;
        fcz_22.ubB = this.ubB;
        fcz_22.ubv = this.ubv;
        fcz_22.tMi = this.tMi;
        fcz_22.uag = this.uag;
        fcz_22.ubD = this.ubD;
        fcz_22.ubI = this.ubI;
        fcz_22.setReadOnly(this.iNr);
        fcz_22.setUseTween(this.ubC);
        fcz_22.setModulationColor(this.ncL);
        fcz_22.setScrollOnMouseWheel(this.tMH);
        fcz_22.b(fzq_0.tJS, this.tND, true);
        fcz_22.b(fzq_0.tJO, this.tNF, true);
        fcz_22.b(fzq_0.tJW, this.ubH, true);
        fcz_22.ukM = true;
        fcz_22.setNeedsToPreProcess();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 1387629604) {
            this.setHorizontal(Bw.aK(string));
        } else if (n == -867683742) {
            this.setReadOnly(Bw.aK(string));
        } else if (n == -293147356) {
            this.setUseTween(Bw.aK(string));
        } else if (n == 381182586) {
            this.setMaxBound(Bw.m(string));
        } else if (n == -1395014068) {
            this.setMinBound(Bw.m(string));
        } else if (n == -1638048016) {
            this.setInnerMaxBound(Bw.m(string));
        } else if (n == 880722626) {
            this.setInnerMinBound(Bw.m(string));
        } else if (n == 3273774) {
            this.setJump(Bw.o(string));
        } else if (n == 1106146434) {
            this.setSliderSize(Bw.o(string));
        } else if (n == 111972721) {
            this.setValue(Bw.o(string));
        } else if (n == -56707504) {
            this.setNumFixedValues(Bw.m(string));
        } else if (n == -575832990) {
            this.setScrollOnMouseWheel(Bw.aK(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 1387629604) {
            this.setHorizontal(Bw.l(object));
        } else if (n == -867683742) {
            this.setReadOnly(Bw.l(object));
        } else if (n == -293147356) {
            this.setUseTween(Bw.l(object));
        } else if (n == 381182586) {
            this.setMaxBound(Bw.m(object));
        } else if (n == -1395014068) {
            this.setMinBound(Bw.m(object));
        } else if (n == -1638048016) {
            this.setInnerMaxBound(Bw.m(object));
        } else if (n == 880722626) {
            this.setInnerMinBound(Bw.m(object));
        } else if (n == 3273774) {
            this.setJump(Bw.o(object));
        } else if (n == 1106146434) {
            this.setSliderSize(Bw.o(object));
        } else if (n == 111972721) {
            this.setValue(Bw.o(object));
        } else if (n == -56707504) {
            this.setNumFixedValues(Bw.m(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

