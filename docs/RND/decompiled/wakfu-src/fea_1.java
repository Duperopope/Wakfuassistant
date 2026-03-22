/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fEA
 */
public class fea_1
extends faw_2 {
    public static final String TAG = "WindowMovePoint";
    public static final String umQ = "WMP";
    fey_2 lAX;
    boolean umR = false;
    boolean umS = false;
    int umT;
    int umU;
    fch_1 umV;
    private fis_1 mTP;
    boolean tMi = true;
    boolean kuf = true;
    public static final int umW = 1387629604;
    public static final int umX = -1984141450;

    @Override
    public String getTag() {
        return TAG;
    }

    public void setHorizontal(boolean bl) {
        this.tMi = bl;
    }

    public boolean isHorizontal() {
        return this.tMi;
    }

    public boolean isVertical() {
        return this.kuf;
    }

    public void setVertical(boolean bl) {
        this.kuf = bl;
    }

    public fey_2 getWindow() {
        return this.lAX;
    }

    public void setDragMousePosition(int n, int n2) {
        this.umR = true;
        this.umT = n - this.lAX.getDisplayX();
        this.umU = n2 - this.lAX.getDisplayY();
    }

    public void dKc() {
        this.mTP = new feb_2(this);
        fbj_1.getInstance().a(fzq_0.tJT, this.mTP, false);
        this.a(fzq_0.tJO, new fec_1(this), false);
    }

    @Override
    public void eKI() {
        super.eKI();
        this.lAX = this.getWidgetParentOfType(fey_2.class);
        if (this.lAX != null) {
            this.umV = this.lAX.getWidgetParentOfType(fch_1.class);
            this.lAX.a(this);
        }
    }

    @Override
    public void aVH() {
        super.aVH();
        fbj_1.getInstance().b(fzq_0.tJT, this.mTP, false);
        this.lAX = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.dKc();
        this.setCursorType(fzo_0.tHO);
        this.ukD = false;
        this.tMi = true;
        this.kuf = true;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fea_1 fea_12 = (fea_1)fhi_22;
        super.a(fhi_22);
        fea_12.setHorizontal(this.tMi);
        fea_12.setVertical(this.kuf);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 1387629604) {
            this.setHorizontal(Bw.aK(string));
        } else if (n == -1984141450) {
            this.setVertical(Bw.aK(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 1387629604) {
            this.setHorizontal(Bw.l(object));
        } else if (n == -1984141450) {
            this.setVertical(Bw.l(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }

    @Override
    public fes_2 getWidget(int n, int n2) {
        return fbj_1.getInstance().isMovePointMode() ? this : super.getWidget(n, n2);
    }

    @Override
    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        this.gsv();
    }

    @Override
    public void setNetEnabled(boolean bl) {
        super.setNetEnabled(bl);
        this.gsv();
    }

    private void gsv() {
        if (this.isEnabledFull()) {
            this.setCurrentCursorType(fzo_0.tHO);
        } else {
            this.setCurrentCursorType(fzo_0.tHq);
        }
    }
}

