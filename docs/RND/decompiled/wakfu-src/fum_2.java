/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fUM
 */
class fum_2
extends fuy_1 {
    private static int[][][] vnk = new int[2][][];
    static int[][] vnl = null;

    fum_2() {
    }

    @Override
    void a(Object object, fua_2 fua_22) {
        int n;
        fun_1 fun_12 = (fun_1)object;
        int n2 = 0;
        fua_22.hk(fun_12.vnm, 24);
        fua_22.hk(fun_12.vnn, 24);
        fua_22.hk(fun_12.vno - 1, 24);
        fua_22.hk(fun_12.vjS - 1, 6);
        fua_22.hk(fun_12.vnp, 8);
        for (n = 0; n < fun_12.vjS; ++n) {
            int n3 = fun_12.vnq[n];
            if (fut_2.acp(n3) > 3) {
                fua_22.hk(n3, 3);
                fua_22.hk(1, 1);
                fua_22.hk(n3 >>> 3, 5);
            } else {
                fua_22.hk(n3, 4);
            }
            n2 += fut_2.acA(n3);
        }
        for (n = 0; n < n2; ++n) {
            fua_22.hk(fun_12.vnr[n], 8);
        }
    }

    @Override
    Object a(fua_1 fua_12, fua_2 fua_22) {
        int n;
        int n2 = 0;
        fun_1 fun_12 = new fun_1(this);
        fun_12.vnm = fua_22.acn(24);
        fun_12.vnn = fua_22.acn(24);
        fun_12.vno = fua_22.acn(24) + 1;
        fun_12.vjS = fua_22.acn(6) + 1;
        fun_12.vnp = fua_22.acn(8);
        for (n = 0; n < fun_12.vjS; ++n) {
            int n3 = fua_22.acn(3);
            if (fua_22.acn(1) != 0) {
                n3 |= fua_22.acn(5) << 3;
            }
            fun_12.vnq[n] = n3;
            n2 += fut_2.acA(n3);
        }
        for (n = 0; n < n2; ++n) {
            fun_12.vnr[n] = fua_22.acn(8);
        }
        if (fun_12.vnp >= fua_12.vle) {
            this.bp(fun_12);
            return null;
        }
        for (n = 0; n < n2; ++n) {
            if (fun_12.vnr[n] < fua_12.vle) continue;
            this.bp(fun_12);
            return null;
        }
        return fun_12;
    }

    @Override
    Object a(fum_1 fum_12, fub_1 fub_12, Object object) {
        int n;
        int n2;
        int n3;
        int n4;
        fun_1 fun_12 = (fun_1)object;
        fuo_2 fuo_22 = new fuo_2(this);
        int n5 = 0;
        int n6 = 0;
        fuo_22.vnw = fun_12;
        fuo_22.vnx = fub_12.vlx;
        fuo_22.vny = fun_12.vjS;
        fuo_22.vjs = fum_12.vjs;
        fuo_22.vnA = fum_12.vjs[fun_12.vnp];
        int n7 = fuo_22.vnA.viu;
        fuo_22.vnB = new int[fuo_22.vny][];
        for (n4 = 0; n4 < fuo_22.vny; ++n4) {
            n3 = fun_12.vnq[n4];
            n2 = fut_2.acp(n3);
            if (n2 == 0) continue;
            if (n2 > n6) {
                n6 = n2;
            }
            fuo_22.vnB[n4] = new int[n2];
            for (n = 0; n < n2; ++n) {
                if ((n3 & 1 << n) == 0) continue;
                fuo_22.vnB[n4][n] = fun_12.vnr[n5++];
            }
        }
        fuo_22.vnC = (int)Math.rint(Math.pow(fuo_22.vny, n7));
        fuo_22.vnz = n6;
        fuo_22.vnD = new int[fuo_22.vnC][];
        for (n4 = 0; n4 < fuo_22.vnC; ++n4) {
            n3 = n4;
            n2 = fuo_22.vnC / fuo_22.vny;
            fuo_22.vnD[n4] = new int[n7];
            for (n = 0; n < n7; ++n) {
                int n8 = n3 / n2;
                n3 -= n8 * n2;
                n2 /= fuo_22.vny;
                fuo_22.vnD[n4][n] = n8;
            }
        }
        return fuo_22;
    }

    @Override
    void bp(Object object) {
    }

    @Override
    void bq(Object object) {
    }

    static synchronized int a(fuf_1 fuf_12, Object object, float[][] fArray, int n, int n2) {
        int n3;
        fuo_2 fuo_22 = (fuo_2)object;
        fun_1 fun_12 = fuo_22.vnw;
        int n4 = fun_12.vno;
        int n5 = fuo_22.vnA.viu;
        int n6 = fun_12.vnn - fun_12.vnm;
        int n7 = n6 / n4;
        int n8 = (n7 + n5 - 1) / n5;
        if (vnk.length < n) {
            vnk = new int[n][][];
        }
        for (n3 = 0; n3 < n; ++n3) {
            if (vnk[n3] != null && vnk[n3].length >= n8) continue;
            fum_2.vnk[n3] = new int[n8][];
        }
        for (int i = 0; i < fuo_22.vnz; ++i) {
            int n9 = 0;
            int n10 = 0;
            while (n9 < n7) {
                int n11;
                if (i == 0) {
                    for (n3 = 0; n3 < n; ++n3) {
                        n11 = fuo_22.vnA.a(fuf_12.vih);
                        if (n11 == -1) {
                            return 0;
                        }
                        fum_2.vnk[n3][n10] = fuo_22.vnD[n11];
                        if (vnk[n3][n10] != null) continue;
                        return 0;
                    }
                }
                for (int j = 0; j < n5 && n9 < n7; ++j, ++n9) {
                    for (n3 = 0; n3 < n; ++n3) {
                        fuh_2 fuh_22;
                        n11 = fun_12.vnm + n9 * n4;
                        int n12 = vnk[n3][n10][j];
                        if ((fun_12.vnq[n12] & 1 << i) == 0 || (fuh_22 = fuo_22.vjs[fuo_22.vnB[n12][i]]) == null || !(n2 == 0 ? fuh_22.a(fArray[n3], n11, fuf_12.vih, n4) == -1 : n2 == 1 && fuh_22.b(fArray[n3], n11, fuf_12.vih, n4) == -1)) continue;
                        return 0;
                    }
                }
                ++n10;
            }
        }
        return 0;
    }

    static synchronized int a(fuf_1 fuf_12, Object object, float[][] fArray, int n) {
        fuo_2 fuo_22 = (fuo_2)object;
        fun_1 fun_12 = fuo_22.vnw;
        int n2 = fun_12.vno;
        int n3 = fuo_22.vnA.viu;
        int n4 = fun_12.vnn - fun_12.vnm;
        int n5 = n4 / n2;
        int n6 = (n5 + n3 - 1) / n3;
        if (vnl == null || vnl.length < n6) {
            vnl = new int[n6][];
        }
        for (int i = 0; i < fuo_22.vnz; ++i) {
            int n7 = 0;
            int n8 = 0;
            while (n7 < n5) {
                int n9;
                if (i == 0) {
                    n9 = fuo_22.vnA.a(fuf_12.vih);
                    if (n9 == -1) {
                        return 0;
                    }
                    fum_2.vnl[n8] = fuo_22.vnD[n9];
                    if (vnl[n8] == null) {
                        return 0;
                    }
                }
                for (int j = 0; j < n3 && n7 < n5; ++j, ++n7) {
                    fuh_2 fuh_22;
                    n9 = fun_12.vnm + n7 * n2;
                    int n10 = vnl[n8][j];
                    if ((fun_12.vnq[n10] & 1 << i) == 0 || (fuh_22 = fuo_22.vjs[fuo_22.vnB[n10][i]]) == null || fuh_22.a(fArray, n9, n, fuf_12.vih, n2) != -1) continue;
                    return 0;
                }
                ++n8;
            }
        }
        return 0;
    }

    @Override
    int a(fuf_1 fuf_12, Object object, float[][] fArray, int[] nArray, int n) {
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            if (nArray[i] == 0) continue;
            fArray[n2++] = fArray[i];
        }
        if (n2 != 0) {
            return fum_2.a(fuf_12, object, fArray, n2, 0);
        }
        return 0;
    }
}

