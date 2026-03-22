/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fRX
 */
public class frx_1
extends fha_2 {
    public static final String TAG = "popup";
    private faa_2 tQJ = faa_2.tLK;
    private faa_2 tCX = faa_2.tLS;
    private boolean tWW = true;
    private fes_2 vbZ;
    private int tWZ;
    private int tXa;
    public static final int vca = 92903173;
    public static final int vcb = 1905963320;
    public static final int vcc = -1472313529;
    public static final int vcd = 1485313835;
    public static final int vce = -1922149780;

    @Override
    public void d(fhv_1 fhv_12) {
        if (fhv_12 instanceof fes_2) {
            this.vbZ = (fes_2)fhv_12;
            this.vbZ.setIsATemplate(true);
            super.a(fhv_12, false);
        } else {
            super.d(fhv_12);
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public faa_2 getHotSpotPosition() {
        return this.tQJ;
    }

    public void setHotSpotPosition(faa_2 faa_22) {
        this.tQJ = faa_22;
    }

    public faa_2 getAlign() {
        return this.tCX;
    }

    public void setAlign(faa_2 faa_22) {
        this.tCX = faa_22;
    }

    public boolean getHideOnClick() {
        return this.tWW;
    }

    public void setHideOnClick(boolean bl) {
        this.tWW = bl;
    }

    public void setXOffset(int n) {
        this.tWZ = n;
    }

    public void setYOffset(int n) {
        this.tXa = n;
    }

    public fes_2 getContent() {
        return this.vbZ;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        frx_1 frx_12 = (frx_1)fhi_22;
        super.a(fhi_22);
        frx_12.setAlign(this.tCX);
        frx_12.setHotSpotPosition(this.tQJ);
        frx_12.setHideOnClick(this.tWW);
    }

    public void a(ftd_1 ftd_12) {
        this.a(ftd_12, fbj_1.getInstance().getPopupContainer());
    }

    public void a(ftd_1 ftd_12, fbw_2 fbw_22) {
        if (fbw_22 != null) {
            if (!fbw_22.isVisible()) {
                this.b(ftd_12, fbw_22);
            } else {
                frx_1.a(fbw_22);
            }
        }
    }

    public void b(ftd_1 ftd_12) {
        fbw_2 fbw_22 = fbj_1.getInstance().getPopupContainer();
        this.b(ftd_12, fbw_22);
    }

    public void b(ftd_1 ftd_12, fbw_2 fbw_22) {
        if (fbw_22 != null && ftd_12.getElementMap() != null) {
            fbw_22.setAlign(this.tCX);
            fbw_22.setHotSpotPosition(this.tQJ);
            fbw_22.setContent(this.vbZ);
            fbw_22.setClient(ftd_12);
            fbw_22.setHideOnClick(this.tWW);
            fbw_22.setXOffset(this.tWZ);
            fbw_22.setYOffset(this.tXa);
            fbw_22.cDD();
            fhy_2.gBq().eHW();
        }
    }

    public static void eKH() {
        frx_1.a(fbj_1.getInstance().getPopupContainer());
    }

    public static void a(fbw_2 fbw_22) {
        if (fbw_22 != null) {
            fbw_22.eKH();
        }
    }

    @Override
    public void aVH() {
        super.aVH();
        if (this.vbZ != null) {
            this.vbZ = null;
        }
        this.tCX = null;
        this.tQJ = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.tWW = true;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 92903173) {
            this.setAlign(faa_2.tI(string));
        } else if (n == 1905963320) {
            this.setHotSpotPosition(faa_2.tI(string));
        } else if (n == -1472313529) {
            this.setHideOnClick(Bw.aK(string));
        } else if (n == 1485313835) {
            this.setXOffset(Bw.m(string));
        } else if (n == -1922149780) {
            this.setYOffset(Bw.m(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != -1472313529) {
            return super.setPropertyAttribute(n, object);
        }
        this.setHideOnClick(Bw.l(object));
        return true;
    }
}

