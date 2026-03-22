/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fCb
 */
public class fcb_2
extends faw_2 {
    public static final String TAG = "PopupMenu";
    public static final String tXg = "Button";
    public static final String tXh = "Label";
    public static final String tXi = "Separator";
    private faa_2 tQJ = faa_2.tLK;
    private int tXj = -1;
    private int tXk = -1;
    private fis_1 nay;
    private fis_1 tXl;
    private fad_1 tQx;
    private fbv_2 tPW;
    private fcy_2 tXm;
    private boolean tXn = false;
    public static final int tXo = 1905963320;

    @Override
    public void e(fhv_1 fhv_12) {
        if (fhv_12 instanceof fad_1) {
            this.tQx = (fad_1)fhv_12;
        } else if (fhv_12 instanceof fbv_2) {
            this.tPW = (fbv_2)fhv_12;
        } else if (fhv_12 instanceof fcy_2) {
            this.tXm = (fcy_2)fhv_12;
        } else if (!(fhv_12 instanceof fes_2)) {
            super.e(fhv_12);
        }
    }

    public void a(String string, awg_1 awg_12) {
        fbv_2 fbv_22 = (fbv_2)this.tPW.gAK();
        fbv_22.setText(string);
        this.d(fbv_22);
    }

    public void a(String string, fmz_1 fmz_12, boolean bl) {
        this.a(string, null, fmz_12, bl);
    }

    public void a(String string, @Nullable String string2, fmz_1 fmz_12, boolean bl) {
        fad_1 fad_12 = (fad_1)this.tQx.gAK();
        this.d(fad_12);
        fad_12.setText(string);
        if (string2 != null) {
            fad_12.setStyle(string2);
        }
        fad_12.setOnClick(fmz_12);
        fad_12.setEnabled(bl);
    }

    public void gtE() {
        fcy_2 fcy_22 = (fcy_2)this.tXm.gAK();
        this.d(fcy_22);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public fes_2 getWidgetByThemeElementName(String string, boolean bl) {
        if (tXg.equalsIgnoreCase(string)) {
            if (this.tQx != null) {
                return this.tQx;
            }
            fad_1 fad_12 = new fad_1();
            fad_12.aVI();
            return fad_12;
        }
        if (tXh.equalsIgnoreCase(string)) {
            if (this.tPW != null) {
                return this.tPW;
            }
            fbv_2 fbv_22 = new fbv_2();
            fbv_22.aVI();
            return fbv_22;
        }
        if (tXi.equalsIgnoreCase(string)) {
            if (this.tXm != null) {
                return this.tXm;
            }
            fcy_2 fcy_22 = new fcy_2();
            fcy_22.aVI();
            return fcy_22;
        }
        return null;
    }

    public void setHotSpotPosition(faa_2 faa_22) {
        this.tQJ = faa_22;
    }

    public void gL(int n, int n2) {
        this.setVisible(true);
        this.tXj = n;
        this.tXk = n2;
    }

    public void cDD() {
        this.gL(fhz_2.gAS().getX(), fhz_2.gAS().getY());
    }

    public void dKc() {
        this.nay = new fcc_1(this);
        this.tXl = new fcd_1(this);
        fbj_1.getInstance().a(fzq_0.tJU, this.nay, false);
        fbj_1.getInstance().a(fzq_0.tJS, this.tXl, false);
    }

    @Override
    public void grg() {
        this.setSizeToPrefSize();
        this.tXj -= this.tQJ.uS(this.getWidth());
        this.tXk -= this.tQJ.uT(this.getHeight());
        fch_1 fch_12 = this.getWidgetParentOfType(fch_1.class);
        this.tXj = Math.min(fch_12.getWidth() - this.getWidth(), this.tXj);
        if (this.tXk < 0) {
            this.tXk = 0;
        }
        this.tXk = Math.min(fch_12.getHeight() - this.getHeight(), this.tXk);
        this.setPosition(this.tXj, this.tXk);
        super.grg();
    }

    @Override
    public boolean LY(int n) {
        boolean bl = super.LY(n);
        if (!this.tXn) {
            this.dKc();
            this.tXn = true;
        }
        return bl;
    }

    @Override
    public void onChildrenAdded() {
        super.onChildrenAdded();
        this.setStyle(this.ukL[0], true);
    }

    @Override
    public void aVI() {
        super.aVI();
        frz_2 frz_22 = frz_2.checkOut();
        frz_22.setHorizontal(false);
        this.a(frz_22);
        this.setNeedsToPostProcess();
    }

    @Override
    public void aVH() {
        super.aVH();
        fbj_1.getInstance().b(fzq_0.tJU, this.nay, false);
        fbj_1.getInstance().b(fzq_0.tJS, this.tXl, false);
        if (this.tQx != null) {
            this.tQx.gAD();
            this.tQx = null;
        }
        if (this.tPW != null) {
            this.tPW.gAD();
            this.tPW = null;
        }
        if (this.tXm != null) {
            this.tXm.gAD();
            this.tXm = null;
        }
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n != 1905963320) {
            return super.setXMLAttribute(n, string, fic_12);
        }
        this.setHotSpotPosition(faa_2.tI(string));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != 1905963320) {
            return super.setPropertyAttribute(n, object);
        }
        this.setHotSpotPosition((faa_2)((Object)object));
        return true;
    }

    static /* synthetic */ fhs_2 a(fcb_2 fcb_22) {
        return fcb_22.nQt;
    }

    static /* synthetic */ fhs_2 b(fcb_2 fcb_22) {
        return fcb_22.nQt;
    }

    static /* synthetic */ fhs_2 c(fcb_2 fcb_22) {
        return fcb_22.nQt;
    }
}

