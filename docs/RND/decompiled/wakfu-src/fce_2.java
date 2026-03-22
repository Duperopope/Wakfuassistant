/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fCe
 */
public class fce_2
extends faw_2
implements fzc {
    public static final String TAG = "progressBar";
    private ffz_1 tXr;
    boolean tMi = true;
    private float tXs = 1.0f;
    private float tXt = 1.5707964f;
    public static final float tXu = 0.0f;
    public static final float tXv = 1.0f;
    private float tXw = 0.0f;
    private float tXx = 1.0f;
    private float awY = 0.0f;
    private float tXy = 0.0f;
    float tXz = 0.0f;
    private boolean tXA = true;
    private boolean tXB = true;
    private fcf_2 tXC;
    private boolean tXD = false;
    private boolean tXE = true;
    float[] tXF = null;
    final ArrayList<fbt_1> tXG = new ArrayList();
    boolean tXH = false;
    fze tEl = null;
    private long tXI = -1L;
    private abn tXJ;
    public static final int tXK = 1387629604;
    public static final int tXL = 825634873;
    public static final int tXM = 1615814651;
    public static final int tXN = 381182586;
    public static final int tXO = -1395014068;
    public static final int tXP = 1714350876;
    public static final int tXQ = -407672363;
    public static final int tXR = -2079976199;
    public static final int tXS = 111972721;
    public static final int tXT = -418368371;
    public static final int tXU = 627673908;
    public static final int tXV = "markers".hashCode();
    public static final int tXW = 145579295;
    public static final int tXX = -627831160;
    public static final int tXY = 2139943149;
    public static final int tXZ = -933964366;

    @Override
    public void d(fhv_1 fhv_12) {
        if (fhv_12 instanceof fze) {
            this.setPixmap((fze)fhv_12);
        }
        super.d(fhv_12);
    }

    public void setPixmap(fze fze2) {
        if (fze2 != this.tEl) {
            this.tEl = fze2;
            this.setNeedsToPreProcess();
        }
    }

    @Override
    public void bFM() {
        this.tXH = true;
        super.bFM();
    }

    @Override
    protected void eKZ() {
        super.eKZ();
        this.bVe.g(this.tXr.getEntity());
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isAppearanceCompatible(fys_0 fys_02) {
        return fys_02 instanceof fzg;
    }

    @Override
    public fzg getAppearance() {
        return (fzg)this.uki;
    }

    public boolean getUseIncreaseProgressTween() {
        return this.tXA;
    }

    public void setUseIncreaseProgressTween(boolean bl) {
        this.tXA = bl;
    }

    public boolean getUseDecreaseProgressTween() {
        return this.tXB;
    }

    public void setUseDecreaseProgressTween(boolean bl) {
        this.tXB = bl;
    }

    public void setPixmaps(fze fze2, fze fze3, fze fze4, fze fze5, fze fze6, fze fze7, fze fze8, fze fze9, fze fze10) {
        if (this.tXC == fcf_2.tYa) {
            this.setDisplayType(fcf_2.tYb);
        }
        this.tXr.setPixmaps(fze2.getPixmap(), fze3.getPixmap(), fze4.getPixmap(), fze5.getPixmap(), fze6.getPixmap(), fze7.getPixmap(), fze8.getPixmap(), fze9.getPixmap(), fze10.getPixmap());
        int n = fze2.getPixmap().getWidth() + fze4.getPixmap().getWidth();
        int n2 = fze2.getPixmap().getHeight() + fze8.getPixmap().getHeight();
        this.setMinSize(new fsm_1(n, n2));
    }

    @Override
    public void setModulationColor(axb_2 axb_22) {
        if (this.tXr != null) {
            this.tXr.setModulationColor(axb_22);
        }
        for (int i = this.tXG.size() - 1; i >= 0; --i) {
            this.tXG.get(i).setModulationColor(axb_22);
        }
    }

    @Override
    public axb_2 getModulationColor() {
        if (this.tXr != null) {
            return this.tXr.getModulationColor();
        }
        return null;
    }

    public void setColor(axb_2 axb_22, String string) {
        if (string == null || string.equalsIgnoreCase(TAG)) {
            this.tXr.setColor(axb_22);
            this.setMinSize(new fsm_1(0, 0));
        } else if (string.equals("progressBarBorder")) {
            this.tXr.setBorderColor(axb_22);
        }
    }

    public void setInnerPosition(faa_2 faa_22) {
        if (this.tXr != null) {
            this.tXr.setPosition(faa_22);
        }
    }

    public void setInnerBorder(Insets insets) {
        if (this.tXr != null) {
            this.tXr.setBorder(insets);
        }
        this.setMinSize(new fsm_1(insets.left + insets.right, insets.bottom + insets.top));
    }

    public float getMinBound() {
        return this.tXw;
    }

    public void setMinBound(float f2) {
        this.tXw = f2;
        if (this.awY < this.tXw) {
            this.setValue(this.tXw);
        }
        this.gtF();
    }

    public float getMaxBound() {
        return this.tXx;
    }

    public void setMaxBound(float f2) {
        this.tXx = f2;
        if (this.awY > this.tXx) {
            this.setValue(this.tXx);
        }
        this.gtF();
    }

    public float getPercentage() {
        return Math.max(0.0f, Math.min(1.0f, (this.awY - this.tXw) / (this.tXx - this.tXw)));
    }

    private float getVisualPercentage() {
        return Math.max(0.0f, Math.min(1.0f, (this.tXz - this.tXw) / (this.tXx - this.tXw)));
    }

    public float getValue() {
        return this.awY;
    }

    public fsr_2 setValue(float f2) {
        f2 = GC.b(f2, this.tXw, this.tXx);
        boolean bl = this.tXA && f2 > this.awY || this.tXB && f2 < this.awY;
        this.x(fco_1.class);
        fco_1 fco_12 = new fco_1(this, this.tXD ? this.tXx - this.tXz : this.tXz, this.tXD ? this.tXx - f2 : f2, this, 0, bl ? (int)(this.tXI != -1L ? this.tXI : 500L) : 0, this.tXJ);
        this.a(fco_12);
        this.awY = f2;
        return fco_12;
    }

    public abn getEasing() {
        return this.tXJ;
    }

    public void setEasing(@NotNull abn abn2) {
        this.tXJ = abn2;
    }

    public float getInitialValue() {
        return this.tXy;
    }

    public void setInitialValue(float f2) {
        this.tXy = f2;
        this.tXz = f2;
        this.awY = this.tXy;
        this.gtF();
    }

    public float getFullCirclePercentage() {
        return this.tXs;
    }

    public void setFullCirclePercentage(float f2) {
        this.tXs = f2;
        if (this.tXr != null) {
            this.tXr.setFullCirclePercentage(f2);
        }
    }

    public float getDeltaAngle() {
        return this.tXt;
    }

    public void setDeltaAngle(float f2) {
        this.tXt = f2;
        if (this.tXr != null) {
            this.tXr.setDeltaAngle(f2);
        }
    }

    public fcf_2 getDisplayType() {
        return this.tXC;
    }

    public void setDisplayType(fcf_2 fcf_22) {
        if (this.tXC != fcf_22 || this.tXr == null) {
            this.tXC = fcf_22;
            axb_2 axb_22 = null;
            axb_2 axb_23 = null;
            axb_2 axb_24 = null;
            Insets insets = null;
            if (this.tXr != null) {
                axb_22 = this.tXr.getColor();
                axb_23 = this.tXr.getBorderColor();
                axb_24 = this.tXr.getModulationColor();
                insets = this.tXr.getBorder();
                this.tXr.aVH();
            }
            this.tXr = this.tXC.gtG();
            this.tXr.aVI();
            this.tXr.setHorizontal(this.tMi);
            this.tXr.setColor(axb_22);
            this.tXr.setBorderColor(axb_23);
            this.tXr.setModulationColor(axb_24);
            if (insets != null) {
                this.tXr.setBorder(insets);
            }
            this.tXr.setFullCirclePercentage(this.tXs);
            this.tXr.setDeltaAngle(this.tXt);
            if (this.uki != null) {
                fzg fzg2 = (fzg)this.uki;
                fzg2.grl();
            }
            this.tXr.setClockwise(this.tXE);
        }
    }

    public boolean isHorizontal() {
        return this.tMi;
    }

    public void setHorizontal(boolean bl) {
        this.tMi = bl;
        if (this.tXr != null) {
            this.tXr.setHorizontal(bl);
        }
    }

    public boolean isInversed() {
        return this.tXD;
    }

    public void setInversed(boolean bl) {
        this.tXD = bl;
    }

    public void setInnerRadiusFactor(float f2) {
        if (this.tXr instanceof ffc_1) {
            ((ffc_1)this.tXr).setInnerRadiusFactor(f2);
        }
    }

    public void setInnerRadius(float f2) {
        this.setInnerRadiusFactor(f2);
    }

    public void setOuterRadius(float f2) {
        this.setOuterRadiusFactor(f2);
    }

    public void setOuterRadiusFactor(float f2) {
        if (this.tXr instanceof ffc_1) {
            ((ffc_1)this.tXr).setOuterRadiusFactor(f2);
        }
    }

    public void setMarkers(float[] fArray) {
        if (this.tXF != null && Arrays.equals(this.tXF, fArray)) {
            return;
        }
        this.tXF = fArray;
        this.bFM();
    }

    public void setTweenDuration(long l) {
        this.tXI = l;
    }

    public ffz_1 getProgressBarMesh() {
        return this.tXr;
    }

    public void setClockwise(boolean bl) {
        this.tXE = bl;
        this.tXr.setClockwise(bl);
    }

    @Override
    public void grg() {
        super.grg();
        this.gtF();
    }

    public void gtF() {
        if (this.tXr != null) {
            int n;
            int n2;
            int n3 = this.uki.getContentWidth();
            int n4 = this.uki.getContentHeight();
            float f2 = this.getVisualPercentage();
            if (this.tMi) {
                if (this.tXD) {
                    n2 = this.uki.getLeftInset() + (int)((float)n3 * f2) + 1;
                    f2 = 1.0f - f2;
                } else {
                    n2 = this.uki.getLeftInset();
                }
                n = this.uki.getBottomInset();
            } else {
                if (this.tXD) {
                    n = this.uki.getBottomInset() + (int)((float)n4 * f2) + 1;
                    f2 = 1.0f - f2;
                } else {
                    n = this.uki.getBottomInset();
                }
                n2 = this.uki.getLeftInset();
            }
            this.tXr.a(n2, n, n3, n4, f2);
        }
    }

    @Override
    public boolean aaB(int n) {
        boolean bl = super.aaB(n);
        if (this.tXH) {
            this.bFM();
        }
        return bl;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fce_2 fce_22 = (fce_2)fhi_22;
        super.a(fhi_22);
        fce_22.setDisplayType(this.getDisplayType());
        fce_22.setUseIncreaseProgressTween(this.tXA);
        fce_22.setUseDecreaseProgressTween(this.tXB);
        fce_22.setHorizontal(this.tMi);
        fce_22.setValue(this.awY);
        fce_22.setInitialValue(this.tXy);
        fce_22.setMaxBound(this.tXx);
        fce_22.setMinBound(this.tXw);
        fce_22.setFullCirclePercentage(this.tXs);
        fce_22.setDeltaAngle(this.tXt);
        fce_22.tEl = this.tEl;
        fce_22.setInversed(this.tXD);
        fce_22.setTweenDuration(this.tXI);
        fce_22.setNeedsToPreProcess();
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tXr.aVH();
        this.tXr = null;
        this.tXG.clear();
        this.tXH = false;
        this.tEl = null;
        this.tXF = null;
        this.tXI = -1L;
    }

    @Override
    public void aVI() {
        super.aVI();
        fzg fzg2 = new fzg();
        fzg2.aVI();
        fzg2.setWidget(this);
        this.d(fzg2);
        fcn_2 fcn_22 = new fcn_2(this);
        fcn_22.aVI();
        this.a(fcn_22);
        this.tXs = 1.0f;
        this.tXt = 1.5707964f;
        this.tMi = true;
        this.tXB = true;
        this.tXA = true;
        this.tXD = false;
        this.setDisplayType(fcf_2.tYa);
        this.setNonBlocking(false);
        this.tXJ = abn.cdp;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 1387629604) {
            this.setHorizontal(Bw.aK(string));
        } else if (n == 1615814651) {
            this.setDeltaAngle(Bw.o(string));
        } else if (n == 381182586) {
            this.setMaxBound(Bw.o(string));
        } else if (n == 825634873) {
            this.setFullCirclePercentage(Bw.o(string));
        } else if (n == -1395014068) {
            this.setMinBound(Bw.o(string));
        } else if (n == -407672363) {
            this.setUseIncreaseProgressTween(Bw.aK(string));
        } else if (n == -2079976199) {
            this.setUseDecreaseProgressTween(Bw.aK(string));
        } else if (n == 111972721) {
            this.setValue(Bw.o(string));
        } else if (n == -418368371) {
            this.setInitialValue(Bw.o(string));
        } else if (n == 1714350876) {
            this.setDisplayType(fcf_2.tN(string));
        } else if (n == 627673908) {
            this.setInversed(Bw.aK(string));
        } else if (n == -627831160) {
            this.setInnerRadiusFactor(Bw.o(string));
        } else if (n == 2139943149) {
            this.setOuterRadiusFactor(Bw.o(string));
        } else if (n == 145579295) {
            this.setTweenDuration(Bw.p(string));
        } else if (n == -933964366) {
            this.setClockwise(Bw.aK(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 381182586) {
            this.setMaxBound(Bw.o(object));
            return true;
        } else if (n == -1395014068) {
            this.setMinBound(Bw.o(object));
            return true;
        } else if (n == 111972721) {
            this.setValue(Bw.o(object));
            return true;
        } else if (n == -418368371) {
            this.setInitialValue(Bw.o(object));
            return true;
        } else if (n == 627673908) {
            this.setInversed(Bw.l(object));
            return true;
        } else if (n == tXV) {
            if (object != null && !(object instanceof float[])) return false;
            this.setMarkers((float[])object);
            return true;
        } else if (n == 145579295) {
            this.setTweenDuration(Bw.p(object));
            return true;
        } else {
            if (n != -933964366) return super.setPropertyAttribute(n, object);
            this.setClockwise(Bw.l(object));
        }
        return true;
    }
}

