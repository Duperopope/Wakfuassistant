/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fUh
 */
class fuh_2 {
    int viu;
    int viv;
    fur_1 viw = new fur_1();
    float[] vix;
    int[] viy;
    fui_2 viz;
    private int[] viA = new int[15];

    fuh_2() {
    }

    int a(int n, fua_2 fua_22) {
        fua_22.hk(this.viy[n], this.viw.vnE[n]);
        return this.viw.vnE[n];
    }

    int ai(float[] fArray) {
        int n = this.k(fArray, 1);
        for (int i = 0; i < this.viu; ++i) {
            fArray[i] = this.vix[n * this.viu + i];
        }
        return n;
    }

    int a(int n, float[] fArray, fua_2 fua_22) {
        for (int i = 0; i < this.viu; ++i) {
            fArray[i] = this.vix[n * this.viu + i];
        }
        return this.a(n, fua_22);
    }

    int a(float[] fArray, fua_2 fua_22, int n, int n2) {
        int n3 = this.d(fArray, n, n2);
        return this.a(n3, fua_22);
    }

    synchronized int a(float[] fArray, int n, fua_2 fua_22, int n2) {
        int n3;
        int n4 = n2 / this.viu;
        if (this.viA.length < n4) {
            this.viA = new int[n4];
        }
        for (n3 = 0; n3 < n4; ++n3) {
            int n5 = this.a(fua_22);
            if (n5 == -1) {
                return -1;
            }
            this.viA[n3] = n5 * this.viu;
        }
        n3 = 0;
        int n6 = 0;
        while (n3 < this.viu) {
            for (int i = 0; i < n4; ++i) {
                int n7 = n + n6 + i;
                fArray[n7] = fArray[n7] + this.vix[this.viA[i] + n3];
            }
            ++n3;
            n6 += n4;
        }
        return 0;
    }

    int b(float[] fArray, int n, fua_2 fua_22, int n2) {
        if (this.viu > 8) {
            int n3 = 0;
            while (n3 < n2) {
                int n4 = this.a(fua_22);
                if (n4 == -1) {
                    return -1;
                }
                int n5 = n4 * this.viu;
                int n6 = 0;
                while (n6 < this.viu) {
                    int n7 = n + n3++;
                    fArray[n7] = fArray[n7] + this.vix[n5 + n6++];
                }
            }
        } else {
            int n8 = 0;
            while (n8 < n2) {
                int n9 = this.a(fua_22);
                if (n9 == -1) {
                    return -1;
                }
                int n10 = n9 * this.viu;
                int n11 = 0;
                switch (this.viu) {
                    case 8: {
                        int n12 = n + n8++;
                        fArray[n12] = fArray[n12] + this.vix[n10 + n11++];
                    }
                    case 7: {
                        int n13 = n + n8++;
                        fArray[n13] = fArray[n13] + this.vix[n10 + n11++];
                    }
                    case 6: {
                        int n14 = n + n8++;
                        fArray[n14] = fArray[n14] + this.vix[n10 + n11++];
                    }
                    case 5: {
                        int n15 = n + n8++;
                        fArray[n15] = fArray[n15] + this.vix[n10 + n11++];
                    }
                    case 4: {
                        int n16 = n + n8++;
                        fArray[n16] = fArray[n16] + this.vix[n10 + n11++];
                    }
                    case 3: {
                        int n17 = n + n8++;
                        fArray[n17] = fArray[n17] + this.vix[n10 + n11++];
                    }
                    case 2: {
                        int n18 = n + n8++;
                        fArray[n18] = fArray[n18] + this.vix[n10 + n11++];
                    }
                    case 1: {
                        int n19 = n + n8++;
                        fArray[n19] = fArray[n19] + this.vix[n10 + n11++];
                    }
                }
            }
        }
        return 0;
    }

    int c(float[] fArray, int n, fua_2 fua_22, int n2) {
        int n3 = 0;
        while (n3 < n2) {
            int n4 = this.a(fua_22);
            if (n4 == -1) {
                return -1;
            }
            int n5 = n4 * this.viu;
            int n6 = 0;
            while (n6 < this.viu) {
                fArray[n + n3++] = this.vix[n5 + n6++];
            }
        }
        return 0;
    }

    int a(float[][] fArray, int n, int n2, fua_2 fua_22, int n3) {
        int n4 = 0;
        int n5 = n / n2;
        while (n5 < (n + n3) / n2) {
            int n6 = this.a(fua_22);
            if (n6 == -1) {
                return -1;
            }
            int n7 = n6 * this.viu;
            for (int i = 0; i < this.viu; ++i) {
                float[] fArray2 = fArray[n4++];
                int n8 = n5++;
                fArray2[n8] = fArray2[n8] + this.vix[n7 + i];
                if (n4 != n2) continue;
                n4 = 0;
            }
        }
        return 0;
    }

    int a(fua_2 fua_22) {
        int n = 0;
        fui_2 fui_22 = this.viz;
        int n2 = fua_22.acl(fui_22.viD);
        if (n2 >= 0) {
            n = fui_22.viB[n2];
            fua_22.acm(fui_22.viC[n2]);
            if (n <= 0) {
                return -n;
            }
        }
        do {
            switch (fua_22.gHC()) {
                case 0: {
                    n = fui_22.viE[n];
                    break;
                }
                case 1: {
                    n = fui_22.viF[n];
                    break;
                }
                default: {
                    return -1;
                }
            }
        } while (n > 0);
        return -n;
    }

    int a(float[] fArray, int n, fua_2 fua_22, int n2, int n3) {
        int n4 = this.a(fua_22);
        if (n4 == -1) {
            return -1;
        }
        switch (n3) {
            case -1: {
                int n5 = 0;
                int n6 = 0;
                while (n5 < this.viu) {
                    fArray[n + n6] = this.vix[n4 * this.viu + n5];
                    ++n5;
                    n6 += n2;
                }
                break;
            }
            case 0: {
                int n7 = 0;
                int n8 = 0;
                while (n7 < this.viu) {
                    int n9 = n + n8;
                    fArray[n9] = fArray[n9] + this.vix[n4 * this.viu + n7];
                    ++n7;
                    n8 += n2;
                }
                break;
            }
            case 1: {
                int n10 = 0;
                int n11 = 0;
                while (n10 < this.viu) {
                    int n12 = n + n11;
                    fArray[n12] = fArray[n12] * this.vix[n4 * this.viu + n10];
                    ++n10;
                    n11 += n2;
                }
                break;
            }
        }
        return n4;
    }

    int k(float[] fArray, int n) {
        int n2 = -1;
        float f2 = 0.0f;
        int n3 = 0;
        for (int i = 0; i < this.viv; ++i) {
            if (this.viw.vnE[i] > 0) {
                float f3 = fuh_2.a(this.viu, this.vix, n3, fArray, n);
                if (n2 == -1 || f3 < f2) {
                    f2 = f3;
                    n2 = i;
                }
            }
            n3 += this.viu;
        }
        return n2;
    }

    int d(float[] fArray, int n, int n2) {
        int n3 = this.k(fArray, n);
        switch (n2) {
            case 0: {
                int n4 = 0;
                int n5 = 0;
                while (n4 < this.viu) {
                    int n6 = n5;
                    fArray[n6] = fArray[n6] - this.vix[n3 * this.viu + n4];
                    ++n4;
                    n5 += n;
                }
                break;
            }
            case 1: {
                int n7 = 0;
                int n8 = 0;
                while (n7 < this.viu) {
                    float f2 = this.vix[n3 * this.viu + n7];
                    if (f2 == 0.0f) {
                        fArray[n8] = 0.0f;
                    } else {
                        int n9 = n8;
                        fArray[n9] = fArray[n9] / f2;
                    }
                    ++n7;
                    n8 += n;
                }
                break;
            }
        }
        return n3;
    }

    void clear() {
    }

    private static float a(int n, float[] fArray, int n2, float[] fArray2, int n3) {
        float f2 = 0.0f;
        for (int i = 0; i < n; ++i) {
            float f3 = fArray[n2 + i] - fArray2[i * n3];
            f2 += f3 * f3;
        }
        return f2;
    }

    int a(fur_1 fur_12) {
        this.viw = fur_12;
        this.viv = fur_12.viv;
        this.viu = fur_12.viu;
        this.vix = fur_12.gHZ();
        this.viz = this.gHU();
        if (this.viz == null) {
            this.clear();
            return -1;
        }
        return 0;
    }

    static int[] g(int[] nArray, int n) {
        int n2;
        int n3;
        int n4;
        int[] nArray2 = new int[33];
        int[] nArray3 = new int[n];
        for (n4 = 0; n4 < n; ++n4) {
            n3 = nArray[n4];
            if (n3 <= 0) continue;
            n2 = nArray2[n3];
            if (n3 < 32 && n2 >>> n3 != 0) {
                return null;
            }
            nArray3[n4] = n2;
            int n5 = n3;
            while (n5 > 0) {
                if ((nArray2[n5] & 1) != 0) {
                    if (n5 == 1) {
                        nArray2[1] = nArray2[1] + 1;
                        break;
                    }
                    nArray2[n5] = nArray2[n5 - 1] << 1;
                    break;
                }
                int n6 = n5--;
                nArray2[n6] = nArray2[n6] + 1;
            }
            for (n5 = n3 + 1; n5 < 33 && nArray2[n5] >>> 1 == n2; ++n5) {
                n2 = nArray2[n5];
                nArray2[n5] = nArray2[n5 - 1] << 1;
            }
        }
        for (n4 = 0; n4 < n; ++n4) {
            n3 = 0;
            for (n2 = 0; n2 < nArray[n4]; ++n2) {
                n3 <<= 1;
                n3 |= nArray3[n4] >>> n2 & 1;
            }
            nArray3[n4] = n3;
        }
        return nArray3;
    }

    fui_2 gHU() {
        int n;
        int n2;
        int n3;
        int n4;
        int n5 = 0;
        fui_2 fui_22 = new fui_2(this);
        fui_22.viE = new int[this.viv * 2];
        int[] nArray = fui_22.viE;
        fui_22.viF = new int[this.viv * 2];
        int[] nArray2 = fui_22.viF;
        int[] nArray3 = fuh_2.g(this.viw.vnE, this.viw.viv);
        if (nArray3 == null) {
            return null;
        }
        fui_22.viG = this.viv * 2;
        for (n4 = 0; n4 < this.viv; ++n4) {
            if (this.viw.vnE[n4] <= 0) continue;
            n3 = 0;
            for (n2 = 0; n2 < this.viw.vnE[n4] - 1; ++n2) {
                n = nArray3[n4] >>> n2 & 1;
                if (n == 0) {
                    if (nArray[n3] == 0) {
                        nArray[n3] = ++n5;
                    }
                    n3 = nArray[n3];
                    continue;
                }
                if (nArray2[n3] == 0) {
                    nArray2[n3] = ++n5;
                }
                n3 = nArray2[n3];
            }
            if ((nArray3[n4] >>> n2 & 1) == 0) {
                nArray[n3] = -n4;
                continue;
            }
            nArray2[n3] = -n4;
        }
        fui_22.viD = fut_2.acp(this.viv) - 4;
        if (fui_22.viD < 5) {
            fui_22.viD = 5;
        }
        n4 = 1 << fui_22.viD;
        fui_22.viB = new int[n4];
        fui_22.viC = new int[n4];
        for (n3 = 0; n3 < n4; ++n3) {
            n2 = 0;
            n = 0;
            for (n = 0; n < fui_22.viD && (n2 > 0 || n == 0); ++n) {
                n2 = (n3 & 1 << n) != 0 ? nArray2[n2] : nArray[n2];
            }
            fui_22.viB[n3] = n2;
            fui_22.viC[n3] = n;
        }
        return fui_22;
    }
}

