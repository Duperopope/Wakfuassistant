/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fUd
 */
public class fud_2 {
    byte[] vhL;
    int vhM;
    int vhN;
    private int vhO;
    int[] vhP;
    long[] vhQ;
    int vhR;
    int vhS;
    int vhT;
    int vhU;
    final byte[] vhV = new byte[282];
    int vhW;
    public int vhB;
    int vhA;
    int vhX;
    int vhY;
    long vhD;
    long vhC;

    public fud_2() {
        this.bkZ();
    }

    fud_2(int n) {
        this();
        this.tZ(n);
    }

    void bkZ() {
        this.vhM = 16384;
        this.vhL = new byte[this.vhM];
        this.vhR = 1024;
        this.vhP = new int[this.vhR];
        this.vhQ = new long[this.vhR];
    }

    public void eIm() {
        this.gHQ();
    }

    public void tZ(int n) {
        if (this.vhL == null) {
            this.bkZ();
        } else {
            int n2;
            for (n2 = 0; n2 < this.vhL.length; ++n2) {
                this.vhL[n2] = 0;
            }
            for (n2 = 0; n2 < this.vhP.length; ++n2) {
                this.vhP[n2] = 0;
            }
            for (n2 = 0; n2 < this.vhQ.length; ++n2) {
                this.vhQ[n2] = 0L;
            }
        }
        this.vhX = n;
    }

    public void clear() {
        this.vhL = null;
        this.vhP = null;
        this.vhQ = null;
    }

    void bJh() {
        this.clear();
    }

    void acr(int n) {
        if (this.vhM <= this.vhN + n) {
            this.vhM += n + 1024;
            byte[] byArray = new byte[this.vhM];
            System.arraycopy(this.vhL, 0, byArray, 0, this.vhL.length);
            this.vhL = byArray;
        }
    }

    void acs(int n) {
        if (this.vhR <= this.vhS + n) {
            this.vhR += n + 32;
            int[] nArray = new int[this.vhR];
            System.arraycopy(this.vhP, 0, nArray, 0, this.vhP.length);
            this.vhP = nArray;
            long[] lArray = new long[this.vhR];
            System.arraycopy(this.vhQ, 0, lArray, 0, this.vhQ.length);
            this.vhQ = lArray;
        }
    }

    public int a(fub_2 fub_22) {
        int n = fub_22.vhz / 255 + 1;
        if (this.vhO != 0) {
            this.vhN -= this.vhO;
            if (this.vhN != 0) {
                System.arraycopy(this.vhL, this.vhO, this.vhL, 0, this.vhN);
            }
            this.vhO = 0;
        }
        this.acr(fub_22.vhz);
        this.acs(n);
        System.arraycopy(fub_22.vhx, fub_22.vhy, this.vhL, this.vhN, fub_22.vhz);
        this.vhN += fub_22.vhz;
        for (int i = 0; i < n - 1; ++i) {
            this.vhP[this.vhS + i] = 255;
            this.vhQ[this.vhS + i] = this.vhC;
        }
        this.vhP[this.vhS + i] = fub_22.vhz % 255;
        long l = fub_22.vhC;
        this.vhQ[this.vhS + i] = l;
        this.vhC = l;
        int n2 = this.vhS;
        this.vhP[n2] = this.vhP[n2] | 0x100;
        this.vhS += n;
        ++this.vhD;
        if (fub_22.vhB != 0) {
            this.vhB = 1;
        }
        return 0;
    }

    public int b(fub_2 fub_22) {
        int n;
        if (this.vhT <= (n = this.vhU++)) {
            return 0;
        }
        if ((this.vhP[n] & 0x400) != 0) {
            ++this.vhD;
            return -1;
        }
        int n2 = this.vhP[n] & 0xFF;
        int n3 = 0;
        fub_22.vhx = this.vhL;
        fub_22.vhy = this.vhO;
        fub_22.vhB = this.vhP[n] & 0x200;
        fub_22.vhA = this.vhP[n] & 0x100;
        n3 += n2;
        while (n2 == 255) {
            int n4 = this.vhP[++n];
            n2 = n4 & 0xFF;
            if ((n4 & 0x200) != 0) {
                fub_22.vhB = 512;
            }
            n3 += n2;
        }
        fub_22.vhD = this.vhD++;
        fub_22.vhC = this.vhQ[n];
        fub_22.vhz = n3;
        this.vhO += n3;
        this.vhU = n + 1;
        return 1;
    }

    public int c(fuc_2 fuc_22) {
        byte[] byArray = fuc_22.vhF;
        int n = fuc_22.vhG;
        byte[] byArray2 = fuc_22.vhI;
        int n2 = fuc_22.vhJ;
        int n3 = fuc_22.vhK;
        int n4 = 0;
        int n5 = fuc_22.gHG();
        int n6 = fuc_22.gHH();
        int n7 = fuc_22.gHI();
        int n8 = fuc_22.gHJ();
        long l = fuc_22.gHK();
        int n9 = fuc_22.gHL();
        int n10 = fuc_22.gHM();
        int n11 = byArray[n + 26] & 0xFF;
        int n12 = this.vhU;
        int n13 = this.vhO;
        if (n13 != 0) {
            this.vhN -= n13;
            if (this.vhN != 0) {
                System.arraycopy(this.vhL, n13, this.vhL, 0, this.vhN);
            }
            this.vhO = 0;
        }
        if (n12 != 0) {
            if (this.vhS - n12 != 0) {
                System.arraycopy(this.vhP, n12, this.vhP, 0, this.vhS - n12);
                System.arraycopy(this.vhQ, n12, this.vhQ, 0, this.vhS - n12);
            }
            this.vhS -= n12;
            this.vhT -= n12;
            this.vhU = 0;
        }
        if (n9 != this.vhX) {
            return -1;
        }
        if (n5 > 0) {
            return -1;
        }
        this.acs(n11 + 1);
        if (n10 != this.vhY) {
            for (n12 = this.vhT; n12 < this.vhS; ++n12) {
                this.vhN -= this.vhP[n12] & 0xFF;
            }
            this.vhS = this.vhT++;
            if (this.vhY != -1) {
                this.vhP[this.vhS++] = 1024;
            }
            if (n6 != 0) {
                n7 = 0;
                while (n4 < n11) {
                    n13 = byArray[n + 27 + n4] & 0xFF;
                    n2 += n13;
                    n3 -= n13;
                    if (n13 < 255) {
                        ++n4;
                        break;
                    }
                    ++n4;
                }
            }
        }
        if (n3 != 0) {
            this.acr(n3);
            System.arraycopy(byArray2, n2, this.vhL, this.vhN, n3);
            this.vhN += n3;
        }
        n12 = -1;
        while (n4 < n11) {
            this.vhP[this.vhS] = n13 = byArray[n + 27 + n4] & 0xFF;
            this.vhQ[this.vhS] = -1L;
            if (n7 != 0) {
                int n14 = this.vhS;
                this.vhP[n14] = this.vhP[n14] | 0x100;
                n7 = 0;
            }
            if (n13 < 255) {
                n12 = this.vhS;
            }
            ++this.vhS;
            ++n4;
            if (n13 >= 255) continue;
            this.vhT = this.vhS;
        }
        if (n12 != -1) {
            this.vhQ[n12] = l;
        }
        if (n8 != 0) {
            this.vhB = 1;
            if (this.vhS > 0) {
                int n15 = this.vhS - 1;
                this.vhP[n15] = this.vhP[n15] | 0x200;
            }
        }
        this.vhY = n10 + 1;
        return 0;
    }

    public int d(fuc_2 fuc_22) {
        int n;
        int n2 = 0;
        int n3 = this.vhS > 255 ? 255 : this.vhS;
        int n4 = 0;
        int n5 = 0;
        long l = this.vhQ[0];
        if (n3 == 0) {
            return 0;
        }
        if (this.vhA == 0) {
            l = 0L;
            for (n2 = 0; n2 < n3; ++n2) {
                if ((this.vhP[n2] & 0xFF) >= 255) continue;
                ++n2;
                break;
            }
        } else {
            for (n2 = 0; n2 < n3 && n5 <= 4096; n5 += this.vhP[n2] & 0xFF, ++n2) {
                l = this.vhQ[n2];
            }
        }
        System.arraycopy("OggS".getBytes(), 0, this.vhV, 0, 4);
        this.vhV[4] = 0;
        this.vhV[5] = 0;
        if ((this.vhP[0] & 0x100) == 0) {
            this.vhV[5] = (byte)(this.vhV[5] | 1);
        }
        if (this.vhA == 0) {
            this.vhV[5] = (byte)(this.vhV[5] | 2);
        }
        if (this.vhB != 0 && this.vhS == n2) {
            this.vhV[5] = (byte)(this.vhV[5] | 4);
        }
        this.vhA = 1;
        for (n = 6; n < 14; ++n) {
            this.vhV[n] = (byte)l;
            l >>>= 8;
        }
        int n6 = this.vhX;
        for (n = 14; n < 18; ++n) {
            this.vhV[n] = (byte)n6;
            n6 >>>= 8;
        }
        if (this.vhY == -1) {
            this.vhY = 0;
        }
        n6 = this.vhY++;
        for (n = 18; n < 22; ++n) {
            this.vhV[n] = (byte)n6;
            n6 >>>= 8;
        }
        this.vhV[22] = 0;
        this.vhV[23] = 0;
        this.vhV[24] = 0;
        this.vhV[25] = 0;
        this.vhV[26] = (byte)n2;
        for (n = 0; n < n2; ++n) {
            this.vhV[n + 27] = (byte)this.vhP[n];
            n4 += this.vhV[n + 27] & 0xFF;
        }
        fuc_22.vhF = this.vhV;
        fuc_22.vhG = 0;
        fuc_22.vhH = this.vhW = n2 + 27;
        fuc_22.vhI = this.vhL;
        fuc_22.vhJ = this.vhO;
        fuc_22.vhK = n4;
        this.vhS -= n2;
        System.arraycopy(this.vhP, n2, this.vhP, 0, this.vhS * 4);
        System.arraycopy(this.vhQ, n2, this.vhQ, 0, this.vhS * 8);
        this.vhO += n4;
        fuc_22.gHN();
        return 1;
    }

    public int e(fuc_2 fuc_22) {
        if (this.vhB != 0 && this.vhS != 0 || this.vhN - this.vhO > 4096 || this.vhS >= 255 || this.vhS != 0 && this.vhA == 0) {
            return this.d(fuc_22);
        }
        return 0;
    }

    public int gHP() {
        return this.vhB;
    }

    public int gHQ() {
        this.vhN = 0;
        this.vhO = 0;
        this.vhS = 0;
        this.vhT = 0;
        this.vhU = 0;
        this.vhW = 0;
        this.vhB = 0;
        this.vhA = 0;
        this.vhY = -1;
        this.vhD = 0L;
        this.vhC = 0L;
        return 0;
    }
}

