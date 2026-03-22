/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fUJ
 */
class fuj_1 {
    int viQ;
    int vmq;
    float[] vmr;
    int[] vms;
    float vmt;
    float[] vmu = new float[1024];
    float[] vmv = new float[1024];

    fuj_1() {
    }

    void tZ(int n) {
        int n2;
        this.vms = new int[n / 4];
        this.vmr = new float[n + n / 4];
        this.vmq = (int)Math.rint(Math.log(n) / Math.log(2.0));
        this.viQ = n;
        int n3 = 0;
        int n4 = 1;
        int n5 = n3 + n / 2;
        int n6 = n5 + 1;
        int n7 = n5 + n / 2;
        int n8 = n7 + 1;
        for (n2 = 0; n2 < n / 4; ++n2) {
            this.vmr[n3 + n2 * 2] = (float)Math.cos(Math.PI / (double)n * (double)(4 * n2));
            this.vmr[n4 + n2 * 2] = (float)(-Math.sin(Math.PI / (double)n * (double)(4 * n2)));
            this.vmr[n5 + n2 * 2] = (float)Math.cos(Math.PI / (double)(2 * n) * (double)(2 * n2 + 1));
            this.vmr[n6 + n2 * 2] = (float)Math.sin(Math.PI / (double)(2 * n) * (double)(2 * n2 + 1));
        }
        for (n2 = 0; n2 < n / 8; ++n2) {
            this.vmr[n7 + n2 * 2] = (float)Math.cos(Math.PI / (double)n * (double)(4 * n2 + 2));
            this.vmr[n8 + n2 * 2] = (float)(-Math.sin(Math.PI / (double)n * (double)(4 * n2 + 2)));
        }
        n2 = (1 << this.vmq - 1) - 1;
        int n9 = 1 << this.vmq - 2;
        for (int i = 0; i < n / 8; ++i) {
            int n10 = 0;
            int n11 = 0;
            while (n9 >>> n11 != 0) {
                if ((n9 >>> n11 & i) != 0) {
                    n10 |= 1 << n11;
                }
                ++n11;
            }
            this.vms[i * 2] = ~n10 & n2;
            this.vms[i * 2 + 1] = n10;
        }
        this.vmt = 4.0f / (float)n;
    }

    void clear() {
    }

    void f(float[] fArray, float[] fArray2) {
    }

    synchronized void g(float[] fArray, float[] fArray2) {
        int n;
        if (this.vmu.length < this.viQ / 2) {
            this.vmu = new float[this.viQ / 2];
        }
        if (this.vmv.length < this.viQ / 2) {
            this.vmv = new float[this.viQ / 2];
        }
        float[] fArray3 = this.vmu;
        float[] fArray4 = this.vmv;
        int n2 = this.viQ >>> 1;
        int n3 = this.viQ >>> 2;
        int n4 = this.viQ >>> 3;
        int n5 = 1;
        int n6 = 0;
        int n7 = n2;
        for (n = 0; n < n4; ++n) {
            fArray3[n6++] = -fArray[n5 + 2] * this.vmr[(n7 -= 2) + 1] - fArray[n5] * this.vmr[n7];
            fArray3[n6++] = fArray[n5] * this.vmr[n7 + 1] - fArray[n5 + 2] * this.vmr[n7];
            n5 += 4;
        }
        n5 = n2 - 4;
        for (n = 0; n < n4; ++n) {
            fArray3[n6++] = fArray[n5] * this.vmr[(n7 -= 2) + 1] + fArray[n5 + 2] * this.vmr[n7];
            fArray3[n6++] = fArray[n5] * this.vmr[n7] - fArray[n5 + 2] * this.vmr[n7 + 1];
            n5 -= 4;
        }
        float[] fArray5 = this.a(fArray3, fArray4, this.viQ, n2, n3, n4);
        n6 = 0;
        n7 = n2;
        n = n3;
        int n8 = n - 1;
        int n9 = n3 + n2;
        int n10 = n9 - 1;
        for (int i = 0; i < n3; ++i) {
            float f2 = fArray5[n6] * this.vmr[n7 + 1] - fArray5[n6 + 1] * this.vmr[n7];
            float f3 = -(fArray5[n6] * this.vmr[n7] + fArray5[n6 + 1] * this.vmr[n7 + 1]);
            fArray2[n] = -f2;
            fArray2[n8] = f2;
            fArray2[n9] = f3;
            fArray2[n10] = f3;
            ++n;
            --n8;
            ++n9;
            --n10;
            n6 += 2;
            n7 += 2;
        }
    }

    private float[] a(float[] fArray, float[] fArray2, int n, int n2, int n3, int n4) {
        float f2;
        float f3;
        float f4;
        float f5;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9 = n3;
        int n10 = 0;
        int n11 = n3;
        int n12 = n2;
        for (n8 = 0; n8 < n3; ++n8) {
            float f6 = fArray[n9] - fArray[n10];
            fArray2[n11 + n8] = fArray[n9++] + fArray[n10++];
            float f7 = fArray[n9] - fArray[n10];
            fArray2[n8++] = f6 * this.vmr[n12 -= 4] + f7 * this.vmr[n12 + 1];
            fArray2[n8] = f7 * this.vmr[n12] - f6 * this.vmr[n12 + 1];
            fArray2[n11 + n8] = fArray[n9++] + fArray[n10++];
        }
        for (n8 = 0; n8 < this.vmq - 3; ++n8) {
            int n13 = n >>> n8 + 2;
            int n14 = 1 << n8 + 3;
            n7 = n2 - 2;
            n12 = 0;
            for (n6 = 0; n6 < n13 >>> 2; ++n6) {
                n5 = n7;
                n11 = n5 - (n13 >> 1);
                f5 = this.vmr[n12];
                f4 = this.vmr[n12 + 1];
                n7 -= 2;
                ++n13;
                for (int i = 0; i < 2 << n8; ++i) {
                    f3 = fArray2[n5] - fArray2[n11];
                    fArray[n5] = fArray2[n5] + fArray2[n11];
                    f2 = fArray2[++n5] - fArray2[++n11];
                    fArray[n5] = fArray2[n5] + fArray2[n11];
                    fArray[n11] = f2 * f5 - f3 * f4;
                    fArray[n11 - 1] = f3 * f5 + f2 * f4;
                    n5 -= n13;
                    n11 -= n13;
                }
                --n13;
                n12 += n14;
            }
            float[] fArray3 = fArray2;
            fArray2 = fArray;
            fArray = fArray3;
        }
        n8 = n;
        int n15 = 0;
        int n16 = 0;
        n7 = n2 - 1;
        for (int i = 0; i < n4; ++i) {
            n6 = this.vms[n15++];
            n5 = this.vms[n15++];
            f5 = fArray2[n6] - fArray2[n5 + 1];
            f2 = fArray2[n6 - 1] + fArray2[n5];
            f4 = fArray2[n6] + fArray2[n5 + 1];
            f3 = fArray2[n6 - 1] - fArray2[n5];
            float f8 = f5 * this.vmr[n8];
            float f9 = f2 * this.vmr[n8++];
            float f10 = f5 * this.vmr[n8];
            float f11 = f2 * this.vmr[n8++];
            fArray[n16++] = (f4 + f10 + f9) * 0.5f;
            fArray[n7--] = (-f3 + f11 - f8) * 0.5f;
            fArray[n16++] = (f3 + f11 - f8) * 0.5f;
            fArray[n7--] = (f4 - f10 - f9) * 0.5f;
        }
        return fArray;
    }
}

