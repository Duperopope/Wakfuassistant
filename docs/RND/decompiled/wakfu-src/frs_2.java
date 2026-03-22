/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fRS
 */
public class frs_2
extends frr_1 {
    public static final String TAG = "tld";
    private int vby;
    private int vbz;
    private faa_2 vbA = null;
    private faa_2 vbB = null;
    public static final int vbC = 113114;
    public static final int vbD = -1354837162;
    public static final int vbE = 1041699137;
    public static final int vbF = -1139902161;

    public int getRow() {
        return this.vby;
    }

    public void setRow(int n) {
        this.vby = n;
    }

    public int getColumn() {
        return this.vbz;
    }

    public void setColumn(int n) {
        this.vbz = n;
    }

    public faa_2 getHorizontalAlign() {
        return this.vbA;
    }

    public void setHorizontalAlign(faa_2 faa_22) {
        this.vbA = faa_22;
    }

    public faa_2 getVerticalAlign() {
        return this.vbB;
    }

    public void setVerticalAlign(faa_2 faa_22) {
        this.vbB = faa_22;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        super.a(fhi_22);
        frs_2 frs_22 = (frs_2)fhi_22;
        frs_22.setRow(this.vby);
        frs_22.setColumn(this.vbz);
        frs_22.setHorizontalAlign(this.vbA);
        frs_22.setVerticalAlign(this.vbB);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.vbA = null;
        this.vbB = null;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 113114) {
            this.setRow(Bw.m(string));
        } else if (n == -1354837162) {
            this.setColumn(Bw.m(string));
        } else if (n == 1041699137) {
            this.setHorizontalAlign(faa_2.tI(string));
        } else if (n == -1139902161) {
            this.setVerticalAlign(faa_2.tI(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        return super.setPropertyAttribute(n, object);
    }
}

