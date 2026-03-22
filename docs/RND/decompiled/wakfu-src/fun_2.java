/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fUn
 */
class fun_2
extends fuw_1 {
    float[] vjw = null;

    fun_2() {
    }

    @Override
    void a(Object object, fua_2 fua_22) {
        fup_1 fup_12 = (fup_1)object;
        fua_22.hk(fup_12.rYc, 8);
        fua_22.hk(fup_12.vjB, 16);
        fua_22.hk(fup_12.vjC, 16);
        fua_22.hk(fup_12.vjD, 6);
        fua_22.hk(fup_12.vjE, 8);
        fua_22.hk(fup_12.vjF - 1, 4);
        for (int i = 0; i < fup_12.vjF; ++i) {
            fua_22.hk(fup_12.vjG[i], 8);
        }
    }

    @Override
    Object a(fua_1 fua_12, fua_2 fua_22) {
        fup_1 fup_12 = new fup_1(this);
        fup_12.rYc = fua_22.acn(8);
        fup_12.vjB = fua_22.acn(16);
        fup_12.vjC = fua_22.acn(16);
        fup_12.vjD = fua_22.acn(6);
        fup_12.vjE = fua_22.acn(8);
        fup_12.vjF = fua_22.acn(4) + 1;
        if (fup_12.rYc < 1 || fup_12.vjB < 1 || fup_12.vjC < 1 || fup_12.vjF < 1) {
            return null;
        }
        for (int i = 0; i < fup_12.vjF; ++i) {
            fup_12.vjG[i] = fua_22.acn(8);
            if (fup_12.vjG[i] >= 0 && fup_12.vjG[i] < fua_12.vle) continue;
            return null;
        }
        return fup_12;
    }

    @Override
    Object a(fum_1 fum_12, fub_1 fub_12, Object object) {
        fua_1 fua_12 = fum_12.vjd;
        fup_1 fup_12 = (fup_1)object;
        fuq_1 fuq_12 = new fuq_1(this);
        fuq_12.vjI = fup_12.rYc;
        fuq_12.viQ = fua_12.vkY[fub_12.vlu] / 2;
        fuq_12.vjH = fup_12.vjC;
        fuq_12.vjK = fup_12;
        fuq_12.vjL.cy(fuq_12.vjH, fuq_12.vjI);
        float f2 = (float)fuq_12.vjH / fun_2.gh((float)((double)fup_12.vjB / 2.0));
        fuq_12.vjJ = new int[fuq_12.viQ];
        for (int i = 0; i < fuq_12.viQ; ++i) {
            int n = (int)Math.floor(fun_2.gh((float)((double)fup_12.vjB / 2.0 / (double)fuq_12.viQ * (double)i)) * f2);
            if (n >= fuq_12.vjH) {
                n = fuq_12.vjH;
            }
            fuq_12.vjJ[i] = n;
        }
        return fuq_12;
    }

    static float gh(float f2) {
        return (float)(13.1 * Math.atan(7.4E-4 * (double)f2) + 2.24 * Math.atan((double)(f2 * f2) * 1.85E-8) + 1.0E-4 * (double)f2);
    }

    Object bo(Object object) {
        fuo_1 fuo_12 = new fuo_1(this);
        fup_1 fup_12 = (fup_1)object;
        fuo_12.vjx = new int[fup_12.rYc];
        fuo_12.vjy = new float[fup_12.vjC];
        fuo_12.vjz = -1L;
        return fuo_12;
    }

    @Override
    void bp(Object object) {
    }

    @Override
    void bq(Object object) {
    }

    @Override
    void br(Object object) {
    }

    @Override
    int a(fuf_1 fuf_12, Object object, float[] fArray, float[] fArray2, Object object2) {
        return 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    int a(fuf_1 fuf_12, Object object, float[] fArray) {
        fuq_1 fuq_12 = (fuq_1)object;
        fup_1 fup_12 = fuq_12.vjK;
        int n = fuf_12.vih.acn(fup_12.vjD);
        if (n > 0) {
            int n2 = (1 << fup_12.vjD) - 1;
            float f2 = (float)n / (float)n2 * (float)fup_12.vjE;
            int n3 = fuf_12.vih.acn(fut_2.acp(fup_12.vjF));
            if (n3 != -1 && n3 < fup_12.vjF) {
                fun_2 fun_22 = this;
                synchronized (fun_22) {
                    int n4;
                    if (this.vjw == null || this.vjw.length < fuq_12.vjI) {
                        this.vjw = new float[fuq_12.vjI];
                    } else {
                        for (int i = 0; i < fuq_12.vjI; ++i) {
                            this.vjw[i] = 0.0f;
                        }
                    }
                    fuh_2 fuh_22 = fuf_12.vip.vjs[fup_12.vjG[n3]];
                    float f3 = 0.0f;
                    for (n4 = 0; n4 < fuq_12.vjI; ++n4) {
                        fArray[n4] = 0.0f;
                    }
                    for (n4 = 0; n4 < fuq_12.vjI; n4 += fuh_22.viu) {
                        if (fuh_22.a(this.vjw, n4, fuf_12.vih, 1, -1) != -1) continue;
                        for (int i = 0; i < fuq_12.viQ; ++i) {
                            fArray[i] = 0.0f;
                        }
                        return 0;
                    }
                    n4 = 0;
                    while (n4 < fuq_12.vjI) {
                        for (int i = 0; i < fuh_22.viu; ++i) {
                            int n5 = n4++;
                            this.vjw[n5] = this.vjw[n5] + f3;
                        }
                        f3 = this.vjw[n4 - 1];
                    }
                    fuf_2.a(fArray, fuq_12.vjJ, fuq_12.viQ, fuq_12.vjH, this.vjw, fuq_12.vjI, f2, fup_12.vjE);
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override
    Object a(fuf_1 fuf_12, Object object, Object object2) {
        int n;
        fuq_1 fuq_12 = (fuq_1)object;
        fup_1 fup_12 = fuq_12.vjK;
        float[] fArray = null;
        if (object2 instanceof float[]) {
            fArray = (float[])object2;
        }
        if ((n = fuf_12.vih.acn(fup_12.vjD)) > 0) {
            int n2 = (1 << fup_12.vjD) - 1;
            float f2 = (float)n / (float)n2 * (float)fup_12.vjE;
            int n3 = fuf_12.vih.acn(fut_2.acp(fup_12.vjF));
            if (n3 != -1 && n3 < fup_12.vjF) {
                int n4;
                fuh_2 fuh_22 = fuf_12.vip.vjs[fup_12.vjG[n3]];
                float f3 = 0.0f;
                if (fArray == null || fArray.length < fuq_12.vjI + 1) {
                    fArray = new float[fuq_12.vjI + 1];
                } else {
                    for (n4 = 0; n4 < fArray.length; ++n4) {
                        fArray[n4] = 0.0f;
                    }
                }
                for (n4 = 0; n4 < fuq_12.vjI; n4 += fuh_22.viu) {
                    if (fuh_22.c(fArray, n4, fuf_12.vih, fuh_22.viu) != -1) continue;
                    return null;
                }
                n4 = 0;
                while (n4 < fuq_12.vjI) {
                    for (int i = 0; i < fuh_22.viu; ++i) {
                        int n5 = n4++;
                        fArray[n5] = fArray[n5] + f3;
                    }
                    f3 = fArray[n4 - 1];
                }
                fArray[fuq_12.vjI] = f2;
                return fArray;
            }
        }
        return null;
    }

    @Override
    int a(fuf_1 fuf_12, Object object, Object object2, float[] fArray) {
        fuq_1 fuq_12 = (fuq_1)object;
        fup_1 fup_12 = fuq_12.vjK;
        if (object2 != null) {
            float[] fArray2 = (float[])object2;
            float f2 = fArray2[fuq_12.vjI];
            fuf_2.a(fArray, fuq_12.vjJ, fuq_12.viQ, fuq_12.vjH, fArray2, fuq_12.vjI, f2, fup_12.vjE);
            return 1;
        }
        for (int i = 0; i < fuq_12.viQ; ++i) {
            fArray[i] = 0.0f;
        }
        return 0;
    }

    static float gi(float f2) {
        return (float)Math.exp((double)f2 * 0.11512925);
    }

    static void a(float[] fArray, float[] fArray2, int n) {
        int n2;
        int n3;
        int n4 = n / 2;
        float[] fArray3 = new float[n4];
        float[] fArray4 = new float[n4];
        float[] fArray5 = new float[n4 + 1];
        float[] fArray6 = new float[n4 + 1];
        float[] fArray7 = new float[n4];
        float[] fArray8 = new float[n4];
        for (n3 = 0; n3 < n4; ++n3) {
            fArray3[n3] = (float)(-2.0 * Math.cos(fArray[n3 * 2]));
            fArray4[n3] = (float)(-2.0 * Math.cos(fArray[n3 * 2 + 1]));
        }
        for (n2 = 0; n2 < n4; ++n2) {
            fArray5[n2] = 0.0f;
            fArray6[n2] = 1.0f;
            fArray7[n2] = 0.0f;
            fArray8[n2] = 1.0f;
        }
        fArray6[n2] = 1.0f;
        fArray5[n2] = 1.0f;
        for (n3 = 1; n3 < n + 1; ++n3) {
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (n2 = 0; n2 < n4; ++n2) {
                float f4 = fArray3[n2] * fArray6[n2] + fArray5[n2];
                fArray5[n2] = fArray6[n2];
                fArray6[n2] = f3;
                f3 += f4;
                f4 = fArray4[n2] * fArray8[n2] + fArray7[n2];
                fArray7[n2] = fArray8[n2];
                fArray8[n2] = f2;
                f2 += f4;
            }
            fArray2[n3 - 1] = (f3 + fArray6[n2] + f2 - fArray5[n2]) / 2.0f;
            fArray6[n2] = f3;
            fArray5[n2] = f2;
        }
    }

    static void a(float[] fArray, float[] fArray2, float f2, fuq_1 fuq_12, String string, int n) {
        float[] fArray3 = new float[Math.max(fuq_12.vjH * 2, fuq_12.vjI * 2 + 2)];
        if (f2 == 0.0f) {
            for (int i = 0; i < fuq_12.viQ; ++i) {
                fArray[i] = 0.0f;
            }
            return;
        }
        fuq_12.vjL.a(fArray3, fArray2, f2);
        for (int i = 0; i < fuq_12.viQ; ++i) {
            fArray[i] = fArray3[fuq_12.vjJ[i]];
        }
    }
}

