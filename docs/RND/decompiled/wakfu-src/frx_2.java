/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fRx
 */
public class frx_2
extends frr_1 {
    public static final String TAG = "gld";
    private faa_2 tCX = faa_2.tLO;
    private faa_2 uZQ = faa_2.tLO;
    private boolean uZR = false;
    private boolean bmh = true;
    public static final int uZS = 92903173;
    public static final int uZT = -285611051;
    public static final int uZU = -266541503;

    @Override
    public String getTag() {
        return TAG;
    }

    public faa_2 getAlign() {
        return this.tCX;
    }

    public void setAlign(faa_2 faa_22) {
        this.tCX = faa_22;
    }

    public faa_2 getInitAlign() {
        return this.uZQ;
    }

    public void setInitAlign(faa_2 faa_22) {
        this.uZQ = faa_22;
    }

    public boolean isInitValue() {
        return this.uZR;
    }

    public void setInitValue(boolean bl) {
        this.uZR = bl;
    }

    public boolean isUsable() {
        return !this.uZR || this.bmh || fbj_1.getInstance().isResized();
    }

    public void setUsable(boolean bl) {
        this.bmh = bl;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        super.a(fhi_22);
        ((frx_2)fhi_22).setAlign(this.tCX);
        ((frx_2)fhi_22).setAlign(this.uZQ);
        ((frx_2)fhi_22).setInitValue(this.uZR);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tCX = null;
        this.uZQ = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.uZR = false;
        this.bmh = true;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 92903173) {
            this.setAlign(faa_2.tI(string));
        } else if (n == -285611051) {
            this.setInitAlign(faa_2.tI(string));
        } else if (n == -266541503) {
            this.setInitValue(Bw.aK(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }
}

