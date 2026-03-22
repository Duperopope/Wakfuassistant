/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fDP
 */
public class fdp_1
extends faw_2 {
    public static final String TAG = "MRU";
    public static final String uil = "Button";
    public static final String uim = "IncreaseButton";
    public static final String uin = "DecreaseButton";
    public static final int uio = 8;
    public static final int uip = 40;
    private static final int uiq = 27;
    public static final float uir = 0.7853982f;
    private fad_1 tQx;
    frx_1 uis;
    fdy_1 uit;
    private fis_1 nay;
    private boolean tXn;
    private int tXj;
    private int tXk;
    int brI = 40;
    final ArrayList<fdw_2> uiu = new ArrayList(3);
    byte uiv;
    fad_1 uah;
    fad_1 uai;
    public static final int uiw = -938578798;

    public static float aaJ(int n) {
        switch (n) {
            case 2: {
                return 1.5707964f;
            }
            case 4: 
            case 6: {
                return 1.0471976f;
            }
        }
        return 0.7853982f;
    }

    @Override
    public void e(fhv_1 fhv_12) {
        if (fhv_12 instanceof frx_1) {
            this.uis = (frx_1)fhv_12;
        } else if (fhv_12 instanceof fad_1) {
            this.tQx = (fad_1)fhv_12;
        } else if (!(fhv_12 instanceof fes_2)) {
            super.e(fhv_12);
        }
    }

    public void a(String string, String string2, String string3, awg_1 awg_12, String string4, Iterable<fka_1> iterable, fmz_1 fmz_12, boolean bl) {
        ArrayList<fad_1> arrayList;
        if (this.uiu.isEmpty()) {
            return;
        }
        fad_1 fad_12 = (fad_1)this.tQx.gAK();
        if (string != null) {
            fad_12.setText(string);
        }
        if (string2 != null && this.uit != null) {
            fad_12.a(fzq_0.tJX, new fdq_2(this, string2, fad_12, string3), true);
            fad_12.a(fzq_0.tJY, new fds_2(this), true);
        }
        if (awg_12 != null) {
            arrayList = fze.checkOut();
            ((fze)((Object)arrayList)).setPixmap(awg_12);
            fad_12.setPixmap((fze)((Object)arrayList));
        }
        if (string4 != null) {
            fad_12.tR(string4);
        }
        fad_12.setStyle(TAG + this.getStyle() + "$buttonNorth", true);
        fad_12.setPrefSize(new fsm_1(27, 27));
        fad_12.setOnClick(fmz_12);
        fad_12.setEnabled(bl);
        fad_12.setVisible(false);
        for (fka_1 fka_12 : iterable) {
            fka_12.setRemovable(false);
            fad_12.getAppearance().d(fka_12);
        }
        arrayList = this.uiu.get((int)(this.uiu.size() - 1)).uiF;
        arrayList.add(fad_12);
        this.d(fad_12);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public fes_2 getWidgetByThemeElementName(String string, boolean bl) {
        if (uil.equalsIgnoreCase(string)) {
            if (this.tQx != null) {
                return this.tQx;
            }
            fad_1 fad_12 = new fad_1();
            fad_12.aVI();
            return fad_12;
        }
        if (uin.equalsIgnoreCase(string)) {
            return this.uai;
        }
        if (uim.equalsIgnoreCase(string)) {
            return this.uah;
        }
        return null;
    }

    public int getRadius() {
        return this.brI;
    }

    public void setRadius(int n) {
        this.brI = n;
    }

    public void gvb() {
        this.uiu.add(new fdw_2());
    }

    public int getGroupSize() {
        return this.uiu.size();
    }

    public void gL(int n, int n2) {
        this.setVisible(true);
        this.tXj = n;
        this.tXk = n2;
    }

    public void cDD() {
        this.gL(fhz_2.gAS().getX(), fhz_2.gAS().getY());
    }

    public void eKH() {
        if (this.bmg) {
            fyw_0.gqw().tl(this.nQt.getId());
        }
    }

    public void dKc() {
        this.nay = new fdt_1(this);
        fbj_1.getInstance().a(fzq_0.tJU, this.nay, false);
        this.uah.a(fzq_0.tJU, new fdu_2(this), false);
        this.uai.a(fzq_0.tJU, new fdv_2(this), false);
    }

    @Override
    public void gsm() {
        this.gsM();
        this.bFM();
    }

    @Override
    public void grg() {
        this.setSizeToPrefSize();
        int n = this.getWidth();
        int n2 = this.getHeight();
        int n3 = this.tXj - fzY.tLz.uS(n);
        int n4 = this.tXk - fzY.tLz.uT(n2);
        fys_0 fys_02 = this.uko.getAppearance();
        n3 = Math.min(Math.max(0, n3), fys_02.getContentWidth() - n);
        n4 = Math.min(Math.max(0, n4), fys_02.getContentHeight() - n2);
        this.setPosition(n3, n4);
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
        this.uit = (fdy_1)this.nQt.uH("popupText");
    }

    @Override
    public void aVI() {
        super.aVI();
        fdx_1 fdx_12 = new fdx_1(this);
        fdx_12.aVI();
        this.a(fdx_12);
        this.uah = new fad_1();
        this.uah.aVI();
        this.d(this.uah);
        this.uah.setVisible(false);
        this.uai = new fad_1();
        this.uai.aVI();
        this.d(this.uai);
        this.uai.setVisible(false);
        this.setNeedsToPostProcess();
    }

    @Override
    public void aVH() {
        super.aVH();
        fbj_1.getInstance().b(fzq_0.tJU, this.nay, false);
        this.uiu.clear();
        if (this.uis != null) {
            this.uis.gAD();
            this.uis = null;
        }
        if (this.tQx != null) {
            this.tQx.gAD();
            this.tQx = null;
        }
        if (this.uai != null) {
            this.uai.gAD();
            this.uai = null;
        }
        if (this.uah != null) {
            this.uah.gAD();
            this.uah = null;
        }
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n != -938578798) {
            return super.setXMLAttribute(n, string, fic_12);
        }
        this.setRadius(Bw.m(string));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != -938578798) {
            return super.setPropertyAttribute(n, object);
        }
        this.setRadius(Bw.m(object));
        return true;
    }

    static /* synthetic */ fhs_2 b(fdp_1 fdp_12) {
        return fdp_12.nQt;
    }
}

