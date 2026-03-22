/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fDY
 */
public class fdy_2
extends faw_2 {
    public static final String TAG = "valueSelector";
    public static final String uiI = "increaseButton";
    public static final String uiJ = "decreaseButton";
    public static final String uiK = "textEditor";
    fdu_1 ufu;
    private fad_1 uah;
    private fad_1 uai;
    int aQL;
    int sAD;
    int sAE;
    private String uiL;
    public static final int uiM = 381182586;
    public static final int uiN = -1395014068;
    public static final int uiO = 111972721;
    public static final int uiP = 2108744537;

    @Override
    public String getTag() {
        return TAG;
    }

    public int getValue() {
        return this.aQL;
    }

    public void setValue(int n) {
        boolean bl = (n = GC.a(n, this.sAD, this.sAE)) != this.aQL;
        int n2 = this.aQL;
        this.aQL = n;
        this.gvc();
        if (bl) {
            flz_2 flz_22 = new flz_2(this);
            flz_22.aVI();
            flz_22.setValue(this.aQL);
            flz_22.bj(n2);
            this.h(flz_22);
        }
    }

    public int getMinBound() {
        return this.sAD;
    }

    public void setMinBound(int n) {
        if (this.sAD == n) {
            return;
        }
        this.sAD = n;
        if (this.aQL < this.sAD) {
            this.setValue(n);
        }
    }

    public int getMaxBound() {
        return this.sAE;
    }

    public void setMaxBound(int n) {
        if (this.sAE == n) {
            return;
        }
        this.sAE = n;
        if (this.aQL > this.sAE) {
            this.setValue(n);
        }
    }

    public String getDisplayFormat() {
        return this.uiL;
    }

    public void setDisplayFormat(String string) {
        this.uiL = string;
        this.gvc();
    }

    @Override
    public fes_2 getWidgetByThemeElementName(String string, boolean bl) {
        if (string.equals(uiI)) {
            return this.uah;
        }
        if (string.equals(uiJ)) {
            return this.uai;
        }
        if (string.equals(uiK)) {
            return this.ufu;
        }
        return null;
    }

    public void gvc() {
        this.ufu.setText(String.format(this.uiL, this.aQL));
    }

    private void gvd() {
        this.ufu = new fdu_1();
        this.ufu.aVI();
        this.ufu.setText(String.valueOf(this.aQL));
        this.ufu.a(fzq_0.tJH, new fdz_2(this), false);
        this.d(this.ufu);
        faw_2 faw_22 = faw_2.checkOut();
        faw_22.setExpandable(false);
        frz_2 frz_22 = frz_2.checkOut();
        frz_22.setHorizontal(false);
        frz_22.setAlign(faa_2.tLO);
        faw_22.a(frz_22);
        this.uah = new fad_1();
        this.uah.aVI();
        this.uah.a(fzq_0.tJU, new fea_2(this), false);
        this.uah.setClickSoundId(fhy_2.gBq().eHY());
        this.uai = new fad_1();
        this.uai.aVI();
        this.uai.a(fzq_0.tJU, new feb_1(this), false);
        this.uai.setClickSoundId(fhy_2.gBq().eHX());
        faw_22.d(this.uah);
        faw_22.d(this.uai);
        this.d(faw_22);
    }

    @Override
    public void a(fhi_2 fhi_22) {
        int n;
        super.a(fhi_22);
        fdy_2 fdy_22 = (fdy_2)fhi_22;
        fdy_22.uiL = this.uiL;
        fdy_22.setMinBound(this.sAD);
        fdy_22.setMaxBound(this.sAE);
        fdy_22.setValue(this.aQL);
        ArrayList<fis_1> arrayList = this.uah.getListeners(fzq_0.tJU, false);
        if (arrayList != null) {
            for (n = arrayList.size() - 1; n >= 0; --n) {
                fdy_22.uah.b(fzq_0.tJU, arrayList.get(n), false);
            }
        }
        if ((arrayList = this.uai.getListeners(fzq_0.tJU, false)) != null) {
            for (n = arrayList.size() - 1; n >= 0; --n) {
                fdy_22.uai.b(fzq_0.tJU, arrayList.get(n), false);
            }
        }
        if ((arrayList = this.ufu.getListeners(fzq_0.tJH, false)) != null) {
            for (n = arrayList.size() - 1; n >= 0; --n) {
                fdy_22.ufu.b(fzq_0.tJH, arrayList.get(n), false);
            }
        }
    }

    @Override
    public void aVI() {
        super.aVI();
        this.gvd();
        this.sAD = 0;
        this.sAE = 100;
        this.aQL = 0;
        this.uiL = "%d";
    }

    @Override
    public void aVH() {
        super.aVH();
        this.ufu = null;
        this.uah = null;
        this.uai = null;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 381182586) {
            this.setMaxBound(Bw.m(string));
        } else if (n == -1395014068) {
            this.setMinBound(Bw.m(string));
        } else if (n == 111972721) {
            this.setValue(Bw.m(string));
        } else if (n == 2108744537) {
            this.setDisplayFormat(string);
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 381182586) {
            this.setMaxBound(Bw.m(object));
        } else if (n == -1395014068) {
            this.setMinBound(Bw.m(object));
        } else if (n == 111972721) {
            this.setValue(Bw.m(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

