/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fBo
 */
public class fbo_2
extends faw_2 {
    public static final String TAG = "FoldingContainer";
    private static final String tSm = "titleBar";
    private static final String tSn = "content";
    fzx_0 tSo = fzx_0.tLq;
    faw_2 tSp;
    faw_2 tSq;
    private boolean tSr;
    private boolean tSs;
    public static final int tSt = 1000592612;
    public static final int tSu = -1268966304;

    @Override
    public void e(fhv_1 fhv_12) {
        if (fhv_12 instanceof faw_2 && ((fes_2)fhv_12).getThemeElementName().equals(tSm)) {
            if (this.tSp != null) {
                this.tSp.gAD();
            }
            this.tSp = (faw_2)fhv_12;
            this.d(this.tSp);
        } else if (fhv_12 instanceof faw_2 && ((fes_2)fhv_12).getThemeElementName().equals(tSn)) {
            if (this.tSq != null) {
                this.tSq.gAD();
            }
            this.tSq = (faw_2)fhv_12;
            this.tSq.setVisible(!this.tSr);
            this.d(this.tSq);
        } else if (!(fhv_12 instanceof fes_2)) {
            super.e(fhv_12);
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public fzx_0 getTitleBarPosition() {
        return this.tSo;
    }

    public void setTitleBarPosition(fzx_0 fzx_02) {
        this.tSo = fzx_02;
        this.bFM();
    }

    public void setFolded(boolean bl) {
        if (bl) {
            this.gsU();
        } else {
            this.gsV();
        }
    }

    public boolean isFolded() {
        return this.tSr;
    }

    public void gsU() {
        this.tSr = true;
        this.tSs = this.ukB;
        this.setExpandable(false);
        if (this.tSq != null) {
            this.tSq.setVisible(false);
        }
        this.gsm();
    }

    public void gsV() {
        this.tSr = false;
        this.setExpandable(this.tSs);
        this.tSq.setVisible(true);
        this.gsm();
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tSo = null;
        this.tSq = null;
        this.tSp = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        fbq_1 fbq_12 = new fbq_1(this);
        fbq_12.aVI();
        this.a(fbq_12);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 1000592612) {
            this.setTitleBarPosition(fic_12.b(fzx_0.class, string));
        } else if (n == -1268966304) {
            this.setFolded(Bw.aK(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 1000592612) {
            this.setTitleBarPosition((fzx_0)((Object)object));
        } else if (n == -1268966304) {
            this.setFolded(Bw.l(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

