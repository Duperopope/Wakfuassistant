/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fUm
 */
public class fum_1 {
    static final float viZ = (float)Math.PI;
    static final int vja = 1;
    static final int vjb = 1;
    int vjc;
    fua_1 vjd;
    int vje;
    float[][] vig;
    int vjf;
    int vjg;
    int vjh;
    float[] vji;
    int vjj;
    int vjk;
    int vin;
    int vii;
    int vij;
    int vik;
    int vjl;
    long vhC;
    long vio;
    long vjm;
    long vjn;
    long vjo;
    long vjp;
    final float[][][][][] vjq;
    final Object[][] vjr = new Object[2][];
    fuh_2[] vjs;
    Object[] vjt;
    byte[] vhV;
    byte[] vju;
    byte[] vjv;

    public fum_1() {
        this.vjq = new float[2][][][][];
        this.vjq[0] = new float[2][][][];
        this.vjq[0][0] = new float[2][][];
        this.vjq[0][1] = new float[2][][];
        this.vjq[0][0][0] = new float[2][];
        this.vjq[0][0][1] = new float[2][];
        this.vjq[0][1][0] = new float[2][];
        this.vjq[0][1][1] = new float[2][];
        this.vjq[1] = new float[2][][][];
        this.vjq[1][0] = new float[2][][];
        this.vjq[1][1] = new float[2][][];
        this.vjq[1][0][0] = new float[2][];
        this.vjq[1][0][1] = new float[2][];
        this.vjq[1][1][0] = new float[2][];
        this.vjq[1][1][1] = new float[2][];
    }

    static float[] U(int n, int n2, int n3, int n4) {
        float[] fArray = new float[n2];
        switch (n) {
            case 0: {
                float f2;
                int n5;
                int n6 = n2 / 4 - n3 / 2;
                int n7 = n2 - n2 / 4 - n4 / 2;
                for (n5 = 0; n5 < n3; ++n5) {
                    f2 = (float)(((double)n5 + 0.5) / (double)n3 * 3.1415927410125732 / 2.0);
                    f2 = (float)Math.sin(f2);
                    f2 *= f2;
                    f2 = (float)((double)f2 * 1.5707963705062866);
                    fArray[n5 + n6] = f2 = (float)Math.sin(f2);
                }
                for (n5 = n6 + n3; n5 < n7; ++n5) {
                    fArray[n5] = 1.0f;
                }
                for (n5 = 0; n5 < n4; ++n5) {
                    f2 = (float)(((double)(n4 - n5) - 0.5) / (double)n4 * 3.1415927410125732 / 2.0);
                    f2 = (float)Math.sin(f2);
                    f2 *= f2;
                    f2 = (float)((double)f2 * 1.5707963705062866);
                    fArray[n5 + n7] = f2 = (float)Math.sin(f2);
                }
                break;
            }
            default: {
                return null;
            }
        }
        return fArray;
    }

    int a(fua_1 fua_12, boolean bl) {
        int n;
        this.vjd = fua_12;
        this.vje = fut_2.acz(fua_12.vkZ);
        this.vjr[0] = new Object[1];
        this.vjr[1] = new Object[1];
        this.vjr[0][0] = new fuj_1();
        this.vjr[1][0] = new fuj_1();
        ((fuj_1)this.vjr[0][0]).tZ(fua_12.vkY[0]);
        ((fuj_1)this.vjr[1][0]).tZ(fua_12.vkY[1]);
        this.vjq[0][0][0] = new float[1][];
        this.vjq[0][0][1] = this.vjq[0][0][0];
        this.vjq[0][1][0] = this.vjq[0][0][0];
        this.vjq[0][1][1] = this.vjq[0][0][0];
        this.vjq[1][0][0] = new float[1][];
        this.vjq[1][0][1] = new float[1][];
        this.vjq[1][1][0] = new float[1][];
        this.vjq[1][1][1] = new float[1][];
        for (n = 0; n < 1; ++n) {
            this.vjq[0][0][0][n] = fum_1.U(n, fua_12.vkY[0], fua_12.vkY[0] / 2, fua_12.vkY[0] / 2);
            this.vjq[1][0][0][n] = fum_1.U(n, fua_12.vkY[1], fua_12.vkY[0] / 2, fua_12.vkY[0] / 2);
            this.vjq[1][0][1][n] = fum_1.U(n, fua_12.vkY[1], fua_12.vkY[0] / 2, fua_12.vkY[1] / 2);
            this.vjq[1][1][0][n] = fum_1.U(n, fua_12.vkY[1], fua_12.vkY[1] / 2, fua_12.vkY[0] / 2);
            this.vjq[1][1][1][n] = fum_1.U(n, fua_12.vkY[1], fua_12.vkY[1] / 2, fua_12.vkY[1] / 2);
        }
        this.vjs = new fuh_2[fua_12.vle];
        for (n = 0; n < fua_12.vle; ++n) {
            this.vjs[n] = new fuh_2();
            this.vjs[n].a(fua_12.vlp[n]);
        }
        this.vjf = 8192;
        this.vig = new float[fua_12.vkU][];
        for (n = 0; n < fua_12.vkU; ++n) {
            this.vig[n] = new float[this.vjf];
        }
        this.vii = 0;
        this.vij = 0;
        this.vjg = this.vjl = fua_12.vkY[1] / 2;
        this.vjt = new Object[fua_12.vkZ];
        for (n = 0; n < fua_12.vkZ; ++n) {
            int n2 = fua_12.vlg[n].vlx;
            int n3 = fua_12.vlh[n2];
            this.vjt[n] = fux_1.vkJ[n3].a(this, fua_12.vlg[n], fua_12.vli[n2]);
        }
        return 0;
    }

    public int a(fua_1 fua_12) {
        this.a(fua_12, false);
        this.vjh = this.vjl;
        this.vjl -= fua_12.vkY[this.vij] / 4 + fua_12.vkY[this.vii] / 4;
        this.vhC = -1L;
        this.vio = -1L;
        return 0;
    }

    fum_1(fua_1 fua_12) {
        this();
        this.a(fua_12, false);
        this.vjh = this.vjl;
        this.vjl -= fua_12.vkY[this.vij] / 4 + fua_12.vkY[this.vii] / 4;
        this.vhC = -1L;
        this.vio = -1L;
    }

    public int a(fuf_1 fuf_12) {
        int n;
        int n2;
        int n3;
        if (this.vjl > this.vjd.vkY[1] / 2 && this.vjh > 8192) {
            n3 = this.vjl - this.vjd.vkY[1] / 2;
            n3 = this.vjh < n3 ? this.vjh : n3;
            this.vjg -= n3;
            this.vjl -= n3;
            this.vjh -= n3;
            if (n3 != 0) {
                for (n2 = 0; n2 < this.vjd.vkU; ++n2) {
                    System.arraycopy(this.vig[n2], n3, this.vig[n2], 0, this.vjg);
                }
            }
        }
        this.vii = this.vij;
        this.vij = fuf_12.vij;
        this.vik = -1;
        this.vjm += (long)fuf_12.viq;
        this.vjn += (long)fuf_12.vir;
        this.vjo += (long)fuf_12.vis;
        this.vjp += (long)fuf_12.vit;
        if (this.vio + 1L != fuf_12.vio) {
            this.vhC = -1L;
        }
        this.vio = fuf_12.vio;
        n3 = this.vjd.vkY[this.vij];
        n2 = this.vjl + this.vjd.vkY[this.vii] / 4 + n3 / 4;
        int n4 = n2 - n3 / 2;
        int n5 = n4 + n3;
        int n6 = 0;
        int n7 = 0;
        if (n5 > this.vjf) {
            this.vjf = n5 + this.vjd.vkY[1];
            for (n = 0; n < this.vjd.vkU; ++n) {
                float[] fArray = new float[this.vjf];
                System.arraycopy(this.vig[n], 0, fArray, 0, this.vig[n].length);
                this.vig[n] = fArray;
            }
        }
        switch (this.vij) {
            case 0: {
                n6 = 0;
                n7 = this.vjd.vkY[0] / 2;
                break;
            }
            case 1: {
                n6 = this.vjd.vkY[1] / 4 - this.vjd.vkY[this.vii] / 4;
                n7 = n6 + this.vjd.vkY[this.vii] / 2;
            }
        }
        for (n = 0; n < this.vjd.vkU; ++n) {
            int n8 = n4;
            int n9 = 0;
            for (n9 = n6; n9 < n7; ++n9) {
                float[] fArray = this.vig[n];
                int n10 = n8 + n9;
                fArray[n10] = fArray[n10] + fuf_12.vig[n][n9];
            }
            while (n9 < n3) {
                this.vig[n][n8 + n9] = fuf_12.vig[n][n9];
                ++n9;
            }
        }
        if (this.vhC == -1L) {
            this.vhC = fuf_12.vhC;
        } else {
            this.vhC += (long)(n2 - this.vjl);
            if (fuf_12.vhC != -1L && this.vhC != fuf_12.vhC) {
                if (this.vhC > fuf_12.vhC && fuf_12.vin != 0) {
                    n2 = (int)((long)n2 - (this.vhC - fuf_12.vhC));
                }
                this.vhC = fuf_12.vhC;
            }
        }
        this.vjl = n2;
        this.vjg = n5;
        if (fuf_12.vin != 0) {
            this.vin = 1;
        }
        return 0;
    }

    public int a(float[][][] fArray, int[] nArray) {
        if (this.vjh < this.vjl) {
            if (fArray != null) {
                for (int i = 0; i < this.vjd.vkU; ++i) {
                    nArray[i] = this.vjh;
                }
                fArray[0] = this.vig;
            }
            return this.vjl - this.vjh;
        }
        return 0;
    }

    public int acw(int n) {
        if (n != 0 && this.vjh + n > this.vjl) {
            return -1;
        }
        this.vjh += n;
        return 0;
    }

    public void clear() {
    }
}

