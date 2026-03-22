/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;

/*
 * Renamed from fAQ
 */
public class faq_2
extends faw_2
implements awh_1,
fzd {
    public static final String TAG = "colorPicker";
    private static final int tPX = 20;
    private static final int tPY = 14;
    private static final int tPZ = 11;
    public static final int tQa = 5;
    private static final Insets tQb = new Insets(0, 0, 0, 0);
    private static final String tQc = "slider";
    private static final String tQd = "cursor";
    final fev_2 tQe = new fev_2();
    private ffq_1 tQf;
    private ffq_1 tQg;
    private boolean tQh;
    boolean tQi;
    private fbt_1 tQj;
    private fbt_1 tQk;
    private boolean tQl;
    private boolean tQm;
    float aPY;
    float aPZ;
    float aQa;
    public static final int tQn = 111972721;
    public static final int tQo = "pixmap".hashCode();
    public static final int tQp = -1415151326;

    @Override
    public void d(fhv_1 fhv_12) {
        if (fhv_12 instanceof fze) {
            this.setPixmap((fze)fhv_12);
        }
        super.d(fhv_12);
    }

    @Override
    protected void eKZ() {
        if (this.bVe != null) {
            if (this.tQf.getEntity() != null) {
                this.bVe.g(this.tQf.getEntity());
            }
            if (this.tQg.getEntity() != null) {
                this.bVe.g(this.tQg.getEntity());
            }
        }
        super.eKZ();
    }

    @Override
    public boolean LZ(int n) {
        boolean bl = super.LZ(n);
        if (this.tQf == null || this.tQg == null) {
            return bl;
        }
        if (this.tQh || this.tQf.getPixmap() != null && this.tQf.getPixmap().bOX()) {
            this.gsB();
            this.gsC();
            try {
                this.tQf.a(this.ukt, tQb, tQb, tQb);
            }
            catch (NullPointerException nullPointerException) {
                uxJ.error((Object)("imageMesh = " + String.valueOf(this.tQf)), (Throwable)nullPointerException);
            }
            try {
                this.tQg.a(this.ukt, tQb, tQb, tQb);
            }
            catch (NullPointerException nullPointerException) {
                uxJ.error((Object)("imageMesh = " + String.valueOf(this.tQg)), (Throwable)nullPointerException);
            }
            this.tQh = false;
        }
        return bl;
    }

    @Override
    public void grg() {
        if (this.tQf != null) {
            this.gsB();
            this.gsC();
            this.tQf.a(this.ukt, tQb, tQb, tQb);
            this.tQg.a(this.ukt, tQb, tQb, tQb);
        }
        super.grg();
    }

    @Override
    public void bFM() {
        super.bFM();
        this.tQi = true;
    }

    private void gsB() {
        if (this.tQf == null) {
            return;
        }
        awg_1 awg_12 = this.tQf.getPixmap();
        if (awg_12 == null) {
            return;
        }
        this.tQf.setX(0);
        this.tQf.setY(0);
        this.tQf.setWidth(this.getColorTextureWidth());
        this.tQf.setHeight(this.getColorTextureHeight());
    }

    private void gsC() {
        if (this.tQg == null) {
            return;
        }
        awg_1 awg_12 = this.tQg.getPixmap();
        if (awg_12 == null) {
            return;
        }
        this.tQg.setX(this.uki.getContentWidth() - 20);
        this.tQg.setY(0);
        this.tQg.setWidth(this.getSliderTextureWidth());
        this.tQg.setHeight(this.getSliderTextureHeight());
    }

    @Override
    public void setPixmap(fze fze2) {
        if (this.tQf != null) {
            if (this.tQf.getPixmap() != null) {
                this.tQf.getPixmap().b(this);
            }
            if (fze2.getPixmap() != null) {
                fze2.getPixmap().a(this);
            }
            this.tQf.setPixmap(fze2.getPixmap());
            this.tQh = true;
            this.setNeedsToPreProcess();
        }
    }

    public void setPixmap(awg_1 awg_12) {
        if (this.tQf != null) {
            awg_1 awg_13 = this.tQf.getPixmap();
            if (awg_13 != null) {
                awg_13.b(this);
            }
            this.tQf.setPixmap(awg_12);
            awg_12.a(this);
            this.tQh = true;
            this.setNeedsToPreProcess();
        }
    }

    private void setSliderPixmap(awg_1 awg_12) {
        if (this.tQg != null) {
            awg_1 awg_13 = this.tQg.getPixmap();
            if (awg_13 != null) {
                awg_13.b(this);
            }
            this.tQg.setPixmap(awg_12);
            awg_12.a(this);
            this.tQh = true;
            this.setNeedsToPreProcess();
        }
    }

    @Override
    public void a(awg_1 awg_12) {
        this.tQh = true;
        this.setNeedsToPreProcess();
    }

    @Override
    public void setModulationColor(axb_2 axb_22) {
    }

    @Override
    public axb_2 getModulationColor() {
        return null;
    }

    int getColorTextureWidth() {
        return this.getWidth() - 20;
    }

    int getColorTextureHeight() {
        return this.getHeight() + 1;
    }

    int getSliderTextureWidth() {
        return 20;
    }

    int getSliderTextureHeight() {
        return this.getHeight() + 1;
    }

    @Override
    public fes_2 getWidgetByThemeElementName(String string, boolean bl) {
        if (tQc.equalsIgnoreCase(string)) {
            return this.tQk;
        }
        if (tQd.equalsIgnoreCase(string)) {
            return this.tQj;
        }
        return this;
    }

    @Override
    public void aVH() {
        awg_1 awg_12;
        super.aVH();
        this.tQi = false;
        this.tQj = null;
        this.tQk = null;
        if (this.tQf != null) {
            awg_12 = this.tQf.getPixmap();
            if (awg_12 != null) {
                awg_12.b(this);
            }
            this.tQf.aVH();
            this.tQf = null;
        }
        if (this.tQg != null) {
            awg_12 = this.tQg.getPixmap();
            if (awg_12 != null) {
                awg_12.b(this);
            }
            this.tQg.aVH();
            this.tQg = null;
        }
        this.aPY = 0.0f;
        this.aPZ = 0.0f;
        this.aQa = 0.0f;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.tQi = true;
        far_1 far_12 = new far_1(this);
        far_12.aVI();
        this.a(far_12);
        this.tQf = new ffq_1();
        this.tQf.aVI();
        this.tQg = new ffq_1();
        this.tQg.aVI();
        this.ukD = false;
        this.tQj = new fbt_1();
        this.tQj.aVI();
        this.tQj.setSize(11, 11, true);
        this.d(this.tQj);
        this.tQk = new fbt_1();
        this.tQk.aVI();
        this.tQk.setSize(20, 14, true);
        this.d(this.tQk);
        this.aPY = 0.0f;
        this.aPZ = 0.0f;
        this.aQa = 0.0f;
        this.a(fzq_0.tJS, (fiq_1 fiq_12) -> {
            if (!(fiq_12 instanceof flp_2)) {
                return false;
            }
            flp_2 flp_22 = (flp_2)fiq_12;
            this.tQl = this.isWithinColorTexture(flp_22.x(this), flp_22.y(this));
            if (this.tQl) {
                this.gI(flp_22.x(this), flp_22.y(this));
                return false;
            }
            this.tQm = this.isWithinSliderTexture(flp_22.x(this), flp_22.y(this));
            if (this.tQm) {
                this.aaz(flp_22.y(this));
                return false;
            }
            return false;
        }, false);
        this.a(fzq_0.tJO, (fiq_1 fiq_12) -> {
            if (!(fiq_12 instanceof flp_2)) {
                return false;
            }
            if (this.tQl) {
                flp_2 flp_22 = (flp_2)fiq_12;
                this.gI(flp_22.x(this), flp_22.y(this));
                return false;
            }
            if (this.tQm) {
                flp_2 flp_23 = (flp_2)fiq_12;
                this.aaz(flp_23.y(this));
                return false;
            }
            return false;
        }, true);
        this.a(fzq_0.tJT, (fiq_1 fiq_12) -> {
            this.tQm = false;
            this.tQl = false;
            return false;
        }, true);
        this.a(fzq_0.tJW, (fiq_1 fiq_12) -> {
            if (!(fiq_12 instanceof flp_2)) {
                return false;
            }
            int n = ((flp_2)fiq_12).gEo() * -1;
            int n2 = n * 5;
            this.aaA(n2);
            return false;
        }, true);
    }

    private void gI(int n, int n2) {
        int n3 = GC.a(n, 0, this.getColorTextureWidth());
        int n4 = GC.a(n2, 0, this.getColorTextureHeight());
        int n5 = n3 * 360 / this.getColorTextureWidth();
        int n6 = n4 * 100 / this.getColorTextureHeight();
        int n7 = Math.round(this.aQa);
        awx_2 awx_22 = awx_2.H(n5, n6, n7);
        float[] fArray = awx_22.bQm();
        this.aPY = fArray[0];
        this.aPZ = fArray[1];
        this.aQa = fArray[2];
        this.setCursorPosition(n3, n4);
        flz_2 flz_22 = new flz_2(this);
        flz_22.setValue(awx_22);
        this.h(flz_22);
        this.gJ(20, this.getAppearance().getContentHeight());
    }

    private void aaz(int n) {
        int n2 = GC.a(n, 0, this.getSliderTextureHeight());
        this.aQa = (float)n2 * 100.0f / (float)this.getColorTextureHeight();
        this.setSliderPosition(n2);
        awx_2 awx_22 = awx_2.w(this.aPY, this.aPZ, this.aQa, 1.0f);
        flz_2 flz_22 = new flz_2(this);
        flz_22.setValue(awx_22);
        this.h(flz_22);
    }

    private void aaA(int n) {
        this.aQa = GC.b(this.aQa + (float)n, 0.0f, 100.0f);
        int n2 = GC.A(this.aQa * (float)this.getColorTextureHeight() / 100.0f);
        this.setSliderPosition(n2);
        awx_2 awx_22 = awx_2.w(this.aPY, this.aPZ, this.aQa, 1.0f);
        flz_2 flz_22 = new flz_2(this);
        flz_22.setValue(awx_22);
        this.h(flz_22);
    }

    private boolean isWithinColorTexture(int n, int n2) {
        if (n < 0 || n > this.getColorTextureWidth()) {
            return false;
        }
        return n2 >= 0 && n2 <= this.getColorTextureHeight();
    }

    private boolean isWithinSliderTexture(int n, int n2) {
        if (n < this.getColorTextureWidth() || n > this.getColorTextureWidth() + 20) {
            return false;
        }
        return n2 >= 0 && n2 <= this.getColorTextureHeight();
    }

    void setCursorPosition(int n, int n2) {
        this.tQj.setPosition(n - 5, n2 - 5);
    }

    void setSliderPosition(int n) {
        this.tQk.setPosition(this.getAppearance().getContentWidth() - 20, n - 7);
    }

    public void setValue(axb_2 axb_22) {
        if (axb_22 == null) {
            return;
        }
        float[] fArray = axb_22.bQm();
        this.aPY = fArray[0];
        this.aPZ = fArray[1];
        this.aQa = fArray[2];
        int n = Math.round(this.aPY * (float)this.getColorTextureWidth() / 360.0f);
        int n2 = Math.round(this.aPZ * (float)this.getColorTextureHeight() / 100.0f);
        this.setCursorPosition(n, n2);
        int n3 = Math.round(this.aQa * (float)this.getColorTextureHeight() / 100.0f);
        this.setSliderPosition(n3);
        this.gJ(this.getSliderTextureWidth(), this.getSliderTextureHeight());
        this.setNeedsToPreProcess();
    }

    void gJ(int n, int n2) {
        if (n <= 0 || n2 <= 0) {
            return;
        }
        awk_1 awk_12 = this.tQe.a(n, n2, "colorPickerSliderTexture" + n + n2 + this.aPY + this.aPZ, this.aPY / 360.0f, this.aPZ / 100.0f);
        this.setSliderPixmap(new awg_1(awk_12));
    }

    @Override
    public void a(fhi_2 fhi_22) {
        super.a(fhi_22);
        fhi_22.setNeedsToPreProcess();
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == -1415151326) {
            this.setOnValueChange(fic_12.b(fmr_1.class, string));
        } else if (n == 111972721) {
            this.setValue(fic_12.vm(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == tQo) {
            this.setPixmap((awg_1)object);
        } else if (n == 111972721) {
            this.setValue((axb_2)object);
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

