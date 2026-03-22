/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fUc
 */
public class fuc_2 {
    private static final int[] vhE = new int[256];
    public byte[] vhF;
    public int vhG;
    public int vhH;
    public byte[] vhI;
    public int vhJ;
    public int vhK;

    public void eIm() {
        this.vhF = null;
        this.vhG = 0;
        this.vhH = 0;
        this.vhI = null;
        this.vhJ = 0;
        this.vhK = 0;
    }

    int gHG() {
        return this.vhF[this.vhG + 4] & 0xFF;
    }

    int gHH() {
        return this.vhF[this.vhG + 5] & 1;
    }

    public int gHI() {
        return this.vhF[this.vhG + 5] & 2;
    }

    public int gHJ() {
        return this.vhF[this.vhG + 5] & 4;
    }

    public long gHK() {
        long l = this.vhF[this.vhG + 13] & 0xFF;
        l = l << 8 | (long)(this.vhF[this.vhG + 12] & 0xFF);
        l = l << 8 | (long)(this.vhF[this.vhG + 11] & 0xFF);
        l = l << 8 | (long)(this.vhF[this.vhG + 10] & 0xFF);
        l = l << 8 | (long)(this.vhF[this.vhG + 9] & 0xFF);
        l = l << 8 | (long)(this.vhF[this.vhG + 8] & 0xFF);
        l = l << 8 | (long)(this.vhF[this.vhG + 7] & 0xFF);
        l = l << 8 | (long)(this.vhF[this.vhG + 6] & 0xFF);
        return l;
    }

    public int gHL() {
        return this.vhF[this.vhG + 14] & 0xFF | (this.vhF[this.vhG + 15] & 0xFF) << 8 | (this.vhF[this.vhG + 16] & 0xFF) << 16 | (this.vhF[this.vhG + 17] & 0xFF) << 24;
    }

    int gHM() {
        return this.vhF[this.vhG + 18] & 0xFF | (this.vhF[this.vhG + 19] & 0xFF) << 8 | (this.vhF[this.vhG + 20] & 0xFF) << 16 | (this.vhF[this.vhG + 21] & 0xFF) << 24;
    }

    void gHN() {
        int n;
        int n2 = 0;
        for (n = 0; n < this.vhH; ++n) {
            n2 = n2 << 8 ^ vhE[n2 >>> 24 & 0xFF ^ this.vhF[this.vhG + n] & 0xFF];
        }
        for (n = 0; n < this.vhK; ++n) {
            n2 = n2 << 8 ^ vhE[n2 >>> 24 & 0xFF ^ this.vhI[this.vhJ + n] & 0xFF];
        }
        this.vhF[this.vhG + 22] = (byte)n2;
        this.vhF[this.vhG + 23] = (byte)(n2 >>> 8);
        this.vhF[this.vhG + 24] = (byte)(n2 >>> 16);
        this.vhF[this.vhG + 25] = (byte)(n2 >>> 24);
    }

    public fuc_2 gHO() {
        return this.b(new fuc_2());
    }

    public fuc_2 b(fuc_2 fuc_22) {
        byte[] byArray = new byte[this.vhH];
        System.arraycopy(this.vhF, this.vhG, byArray, 0, this.vhH);
        fuc_22.vhH = this.vhH;
        fuc_22.vhF = byArray;
        fuc_22.vhG = 0;
        byArray = new byte[this.vhK];
        System.arraycopy(this.vhI, this.vhJ, byArray, 0, this.vhK);
        fuc_22.vhK = this.vhK;
        fuc_22.vhI = byArray;
        fuc_22.vhJ = 0;
        return fuc_22;
    }

    private static int acq(int n) {
        int n2 = n << 24;
        for (int i = 0; i < 8; ++i) {
            if ((n2 & Integer.MIN_VALUE) != 0) {
                n2 = n2 << 1 ^ 0x4C11DB7;
                continue;
            }
            n2 <<= 1;
        }
        return n2;
    }

    static {
        for (int i = 0; i < vhE.length; ++i) {
            fuc_2.vhE[i] = fuc_2.acq(i);
        }
    }
}

