/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fUG
 */
class fug_2
extends fux_1 {
    static int vlP = 0;
    float[][] vlQ = null;
    int[] vlR = null;
    int[] vlS = null;
    Object[] vlT = null;

    fug_2() {
    }

    @Override
    void bp(Object object) {
    }

    @Override
    void bq(Object object) {
    }

    @Override
    Object a(fum_1 fum_12, fub_1 fub_12, Object object) {
        fua_1 fua_12 = fum_12.vjd;
        fui_1 fui_12 = new fui_1(this);
        fuh_1 fuh_12 = fui_12.vme = (fuh_1)object;
        fui_12.vmd = fub_12;
        fui_12.vmf = new Object[fuh_12.vlU];
        fui_12.vmg = new Object[fuh_12.vlU];
        fui_12.vmi = new Object[fuh_12.vlU];
        fui_12.vmk = new fuz_1[fuh_12.vlU];
        fui_12.vml = new fuw_1[fuh_12.vlU];
        fui_12.vmm = new fuy_1[fuh_12.vlU];
        for (int i = 0; i < fuh_12.vlU; ++i) {
            int n = fuh_12.vlW[i];
            int n2 = fuh_12.vlX[i];
            int n3 = fuh_12.vlY[i];
            fui_12.vmk[i] = fuz_1.vkL[fua_12.vlj[n]];
            fui_12.vmf[i] = fui_12.vmk[i].a(fum_12, fub_12, fua_12.vlk[n]);
            fui_12.vml[i] = fuw_1.vkI[fua_12.vll[n2]];
            fui_12.vmg[i] = fui_12.vml[i].a(fum_12, fub_12, fua_12.vlm[n2]);
            fui_12.vmm[i] = fuy_1.vkK[fua_12.vln[n3]];
            fui_12.vmi[i] = fui_12.vmm[i].a(fum_12, fub_12, fua_12.vlo[n3]);
        }
        if (fua_12.vlf == 0 || fum_12.vjc != 0) {
            // empty if block
        }
        fui_12.vmn = fua_12.vkU;
        return fui_12;
    }

    @Override
    void a(fua_1 fua_12, Object object, fua_2 fua_22) {
        int n;
        fuh_1 fuh_12 = (fuh_1)object;
        if (fuh_12.vlU > 1) {
            fua_22.hk(1, 1);
            fua_22.hk(fuh_12.vlU - 1, 4);
        } else {
            fua_22.hk(0, 1);
        }
        if (fuh_12.vma > 0) {
            fua_22.hk(1, 1);
            fua_22.hk(fuh_12.vma - 1, 8);
            for (n = 0; n < fuh_12.vma; ++n) {
                fua_22.hk(fuh_12.vmb[n], fut_2.acz(fua_12.vkU));
                fua_22.hk(fuh_12.vmc[n], fut_2.acz(fua_12.vkU));
            }
        } else {
            fua_22.hk(0, 1);
        }
        fua_22.hk(0, 2);
        if (fuh_12.vlU > 1) {
            for (n = 0; n < fua_12.vkU; ++n) {
                fua_22.hk(fuh_12.vlV[n], 4);
            }
        }
        for (n = 0; n < fuh_12.vlU; ++n) {
            fua_22.hk(fuh_12.vlW[n], 8);
            fua_22.hk(fuh_12.vlX[n], 8);
            fua_22.hk(fuh_12.vlY[n], 8);
        }
    }

    @Override
    Object a(fua_1 fua_12, fua_2 fua_22) {
        int n;
        fuh_1 fuh_12 = new fuh_1(this);
        fuh_12.vlU = fua_22.acn(1) != 0 ? fua_22.acn(4) + 1 : 1;
        if (fua_22.acn(1) != 0) {
            fuh_12.vma = fua_22.acn(8) + 1;
            for (n = 0; n < fuh_12.vma; ++n) {
                int n2 = fuh_12.vmb[n] = fua_22.acn(fut_2.acz(fua_12.vkU));
                int n3 = fuh_12.vmc[n] = fua_22.acn(fut_2.acz(fua_12.vkU));
                if (n2 >= 0 && n3 >= 0 && n2 != n3 && n2 < fua_12.vkU && n3 < fua_12.vkU) continue;
                fuh_12.gHW();
                return null;
            }
        }
        if (fua_22.acn(2) > 0) {
            fuh_12.gHW();
            return null;
        }
        if (fuh_12.vlU > 1) {
            for (n = 0; n < fua_12.vkU; ++n) {
                fuh_12.vlV[n] = fua_22.acn(4);
                if (fuh_12.vlV[n] < fuh_12.vlU) continue;
                fuh_12.gHW();
                return null;
            }
        }
        for (n = 0; n < fuh_12.vlU; ++n) {
            fuh_12.vlW[n] = fua_22.acn(8);
            if (fuh_12.vlW[n] >= fua_12.vlb) {
                fuh_12.gHW();
                return null;
            }
            fuh_12.vlX[n] = fua_22.acn(8);
            if (fuh_12.vlX[n] >= fua_12.vlc) {
                fuh_12.gHW();
                return null;
            }
            fuh_12.vlY[n] = fua_22.acn(8);
            if (fuh_12.vlY[n] < fua_12.vld) continue;
            fuh_12.gHW();
            return null;
        }
        return fuh_12;
    }

    @Override
    synchronized int a(fuf_1 fuf_12, Object object) {
        int n;
        int n2;
        int n3;
        fum_1 fum_12 = fuf_12.vip;
        fua_1 fua_12 = fum_12.vjd;
        fui_1 fui_12 = (fui_1)object;
        fuh_1 fuh_12 = fui_12.vme;
        fub_1 fub_12 = fui_12.vmd;
        int n4 = fuf_12.vil = fua_12.vkY[fuf_12.vij];
        float[] fArray = fum_12.vjq[fuf_12.vij][fuf_12.vii][fuf_12.vik][fub_12.vlv];
        if (this.vlQ == null || this.vlQ.length < fua_12.vkU) {
            this.vlQ = new float[fua_12.vkU][];
            this.vlS = new int[fua_12.vkU];
            this.vlR = new int[fua_12.vkU];
            this.vlT = new Object[fua_12.vkU];
        }
        for (n3 = 0; n3 < fua_12.vkU; ++n3) {
            float[] fArray2 = fuf_12.vig[n3];
            n2 = fuh_12.vlV[n3];
            this.vlT[n3] = fui_12.vml[n2].a(fuf_12, fui_12.vmg[n2], this.vlT[n3]);
            this.vlS[n3] = this.vlT[n3] != null ? 1 : 0;
            for (n = 0; n < n4 / 2; ++n) {
                fArray2[n] = 0.0f;
            }
        }
        for (n3 = 0; n3 < fuh_12.vma; ++n3) {
            if (this.vlS[fuh_12.vmb[n3]] == 0 && this.vlS[fuh_12.vmc[n3]] == 0) continue;
            this.vlS[fuh_12.vmb[n3]] = 1;
            this.vlS[fuh_12.vmc[n3]] = 1;
        }
        for (n3 = 0; n3 < fuh_12.vlU; ++n3) {
            int n5 = 0;
            for (n2 = 0; n2 < fua_12.vkU; ++n2) {
                if (fuh_12.vlV[n2] != n3) continue;
                this.vlR[n5] = this.vlS[n2] != 0 ? 1 : 0;
                this.vlQ[n5++] = fuf_12.vig[n2];
            }
            fui_12.vmm[n3].a(fuf_12, fui_12.vmi[n3], this.vlQ, this.vlR, n5);
        }
        for (n3 = fuh_12.vma - 1; n3 >= 0; --n3) {
            float[] fArray3 = fuf_12.vig[fuh_12.vmb[n3]];
            float[] fArray4 = fuf_12.vig[fuh_12.vmc[n3]];
            for (n = 0; n < n4 / 2; ++n) {
                float f2 = fArray3[n];
                float f3 = fArray4[n];
                if (f2 > 0.0f) {
                    if (f3 > 0.0f) {
                        fArray3[n] = f2;
                        fArray4[n] = f2 - f3;
                        continue;
                    }
                    fArray4[n] = f2;
                    fArray3[n] = f2 + f3;
                    continue;
                }
                if (f3 > 0.0f) {
                    fArray3[n] = f2;
                    fArray4[n] = f2 + f3;
                    continue;
                }
                fArray4[n] = f2;
                fArray3[n] = f2 - f3;
            }
        }
        for (n3 = 0; n3 < fua_12.vkU; ++n3) {
            float[] fArray5 = fuf_12.vig[n3];
            int n6 = fuh_12.vlV[n3];
            fui_12.vml[n6].a(fuf_12, fui_12.vmg[n6], this.vlT[n3], fArray5);
        }
        for (n3 = 0; n3 < fua_12.vkU; ++n3) {
            float[] fArray6 = fuf_12.vig[n3];
            ((fuj_1)fum_12.vjr[fuf_12.vij][0]).g(fArray6, fArray6);
        }
        for (n3 = 0; n3 < fua_12.vkU; ++n3) {
            int n7;
            float[] fArray7 = fuf_12.vig[n3];
            if (this.vlS[n3] != 0) {
                for (n7 = 0; n7 < n4; ++n7) {
                    int n8 = n7;
                    fArray7[n8] = fArray7[n8] * fArray[n7];
                }
                continue;
            }
            for (n7 = 0; n7 < n4; ++n7) {
                fArray7[n7] = 0.0f;
            }
        }
        return 0;
    }
}

