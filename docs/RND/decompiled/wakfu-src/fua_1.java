/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fUA
 */
public class fua_1 {
    private static final int vkM = -136;
    private static final int vkN = -135;
    private static final byte[] vkO = "vorbis".getBytes();
    private static final int vkP = 1;
    private static final int vkQ = 2;
    private static final int vkR = 3;
    private static final int vkS = 1;
    private static final int vkT = 1;
    public int aeb;
    public int vkU;
    public int vjB;
    int vkV;
    int vkW;
    int vkX;
    final int[] vkY = new int[2];
    int vkZ;
    int vla;
    int vlb;
    int vlc;
    int vld;
    int vle;
    int vlf;
    fub_1[] vlg = null;
    int[] vlh = null;
    Object[] vli = null;
    int[] vlj = null;
    Object[] vlk = null;
    int[] vll = null;
    Object[] vlm = null;
    int[] vln = null;
    Object[] vlo = null;
    fur_1[] vlp = null;
    final fuk_1[] vlq = new fuk_1[64];
    int vlr;
    float vls;
    float vlt;

    public void bkZ() {
        this.vjB = 0;
    }

    public void clear() {
        int n;
        for (n = 0; n < this.vkZ; ++n) {
            this.vlg[n] = null;
        }
        this.vlg = null;
        for (n = 0; n < this.vla; ++n) {
            fux_1.vkJ[this.vlh[n]].bp(this.vli[n]);
        }
        this.vli = null;
        for (n = 0; n < this.vlb; ++n) {
            fuz_1.vkL[this.vlj[n]].bp(this.vlk[n]);
        }
        this.vlk = null;
        for (n = 0; n < this.vlc; ++n) {
            fuw_1.vkI[this.vll[n]].bp(this.vlm[n]);
        }
        this.vlm = null;
        for (n = 0; n < this.vld; ++n) {
            fuy_1.vkK[this.vln[n]].bp(this.vlo[n]);
        }
        this.vlo = null;
        for (n = 0; n < this.vle; ++n) {
            if (this.vlp[n] == null) continue;
            this.vlp[n].clear();
            this.vlp[n] = null;
        }
        this.vlp = null;
        for (n = 0; n < this.vlf; ++n) {
            this.vlq[n].gHW();
        }
    }

    int d(fua_2 fua_22) {
        this.aeb = fua_22.acn(32);
        if (this.aeb != 0) {
            return -1;
        }
        this.vkU = fua_22.acn(8);
        this.vjB = fua_22.acn(32);
        this.vkV = fua_22.acn(32);
        this.vkW = fua_22.acn(32);
        this.vkX = fua_22.acn(32);
        this.vkY[0] = 1 << fua_22.acn(4);
        this.vkY[1] = 1 << fua_22.acn(4);
        if (this.vjB < 1 || this.vkU < 1 || this.vkY[0] < 8 || this.vkY[1] < this.vkY[0] || fua_22.acn(1) != 1) {
            this.clear();
            return -1;
        }
        return 0;
    }

    int e(fua_2 fua_22) {
        int n;
        this.vle = fua_22.acn(8) + 1;
        if (this.vlp == null || this.vlp.length != this.vle) {
            this.vlp = new fur_1[this.vle];
        }
        for (n = 0; n < this.vle; ++n) {
            this.vlp[n] = new fur_1();
            if (this.vlp[n].b(fua_22) == 0) continue;
            this.clear();
            return -1;
        }
        this.vlb = fua_22.acn(6) + 1;
        if (this.vlj == null || this.vlj.length != this.vlb) {
            this.vlj = new int[this.vlb];
        }
        if (this.vlk == null || this.vlk.length != this.vlb) {
            this.vlk = new Object[this.vlb];
        }
        for (n = 0; n < this.vlb; ++n) {
            this.vlj[n] = fua_22.acn(16);
            if (this.vlj[n] < 0 || this.vlj[n] >= 1) {
                this.clear();
                return -1;
            }
            this.vlk[n] = fuz_1.vkL[this.vlj[n]].a(this, fua_22);
            if (this.vlk[n] != null) continue;
            this.clear();
            return -1;
        }
        this.vlc = fua_22.acn(6) + 1;
        if (this.vll == null || this.vll.length != this.vlc) {
            this.vll = new int[this.vlc];
        }
        if (this.vlm == null || this.vlm.length != this.vlc) {
            this.vlm = new Object[this.vlc];
        }
        for (n = 0; n < this.vlc; ++n) {
            this.vll[n] = fua_22.acn(16);
            if (this.vll[n] < 0 || this.vll[n] >= 2) {
                this.clear();
                return -1;
            }
            this.vlm[n] = fuw_1.vkI[this.vll[n]].a(this, fua_22);
            if (this.vlm[n] != null) continue;
            this.clear();
            return -1;
        }
        this.vld = fua_22.acn(6) + 1;
        if (this.vln == null || this.vln.length != this.vld) {
            this.vln = new int[this.vld];
        }
        if (this.vlo == null || this.vlo.length != this.vld) {
            this.vlo = new Object[this.vld];
        }
        for (n = 0; n < this.vld; ++n) {
            this.vln[n] = fua_22.acn(16);
            if (this.vln[n] < 0 || this.vln[n] >= 3) {
                this.clear();
                return -1;
            }
            this.vlo[n] = fuy_1.vkK[this.vln[n]].a(this, fua_22);
            if (this.vlo[n] != null) continue;
            this.clear();
            return -1;
        }
        this.vla = fua_22.acn(6) + 1;
        if (this.vlh == null || this.vlh.length != this.vla) {
            this.vlh = new int[this.vla];
        }
        if (this.vli == null || this.vli.length != this.vla) {
            this.vli = new Object[this.vla];
        }
        for (n = 0; n < this.vla; ++n) {
            this.vlh[n] = fua_22.acn(16);
            if (this.vlh[n] < 0 || this.vlh[n] >= 1) {
                this.clear();
                return -1;
            }
            this.vli[n] = fux_1.vkJ[this.vlh[n]].a(this, fua_22);
            if (this.vli[n] != null) continue;
            this.clear();
            return -1;
        }
        this.vkZ = fua_22.acn(6) + 1;
        if (this.vlg == null || this.vlg.length != this.vkZ) {
            this.vlg = new fub_1[this.vkZ];
        }
        for (n = 0; n < this.vkZ; ++n) {
            this.vlg[n] = new fub_1();
            this.vlg[n].vlu = fua_22.acn(1);
            this.vlg[n].vlv = fua_22.acn(16);
            this.vlg[n].vlw = fua_22.acn(16);
            this.vlg[n].vlx = fua_22.acn(8);
            if (this.vlg[n].vlv < 1 && this.vlg[n].vlw < 1 && this.vlg[n].vlx < this.vla) continue;
            this.clear();
            return -1;
        }
        if (fua_22.acn(1) != 1) {
            this.clear();
            return -1;
        }
        return 0;
    }

    public int a(fuj_2 fuj_22, fub_2 fub_22) {
        fua_2 fua_22 = new fua_2();
        if (fub_22 != null) {
            fua_22.f(fub_22.vhx, fub_22.vhy, fub_22.vhz);
            byte[] byArray = new byte[6];
            int n = fua_22.acn(8);
            fua_22.l(byArray, 6);
            if (byArray[0] != 118 || byArray[1] != 111 || byArray[2] != 114 || byArray[3] != 98 || byArray[4] != 105 || byArray[5] != 115) {
                return -1;
            }
            switch (n) {
                case 1: {
                    if (fub_22.vhA == 0) {
                        return -1;
                    }
                    if (this.vjB != 0) {
                        return -1;
                    }
                    return this.d(fua_22);
                }
                case 3: {
                    if (this.vjB == 0) {
                        return -1;
                    }
                    return fuj_22.b(fua_22);
                }
                case 5: {
                    if (this.vjB == 0 || fuj_22.viN == null) {
                        return -1;
                    }
                    return this.e(fua_22);
                }
            }
        }
        return -1;
    }

    int f(fua_2 fua_22) {
        fua_22.hk(1, 8);
        fua_22.fb(vkO);
        fua_22.hk(0, 32);
        fua_22.hk(this.vkU, 8);
        fua_22.hk(this.vjB, 32);
        fua_22.hk(this.vkV, 32);
        fua_22.hk(this.vkW, 32);
        fua_22.hk(this.vkX, 32);
        fua_22.hk(fut_2.acz(this.vkY[0]), 4);
        fua_22.hk(fut_2.acz(this.vkY[1]), 4);
        fua_22.hk(1, 1);
        return 0;
    }

    int g(fua_2 fua_22) {
        int n;
        fua_22.hk(5, 8);
        fua_22.fb(vkO);
        fua_22.hk(this.vle - 1, 8);
        for (n = 0; n < this.vle; ++n) {
            if (this.vlp[n].c(fua_22) == 0) continue;
            return -1;
        }
        fua_22.hk(this.vlb - 1, 6);
        for (n = 0; n < this.vlb; ++n) {
            fua_22.hk(this.vlj[n], 16);
            fuz_1.vkL[this.vlj[n]].a(this.vlk[n], fua_22);
        }
        fua_22.hk(this.vlc - 1, 6);
        for (n = 0; n < this.vlc; ++n) {
            fua_22.hk(this.vll[n], 16);
            fuw_1.vkI[this.vll[n]].a(this.vlm[n], fua_22);
        }
        fua_22.hk(this.vld - 1, 6);
        for (n = 0; n < this.vld; ++n) {
            fua_22.hk(this.vln[n], 16);
            fuy_1.vkK[this.vln[n]].a(this.vlo[n], fua_22);
        }
        fua_22.hk(this.vla - 1, 6);
        for (n = 0; n < this.vla; ++n) {
            fua_22.hk(this.vlh[n], 16);
            fux_1.vkJ[this.vlh[n]].a(this, this.vli[n], fua_22);
        }
        fua_22.hk(this.vkZ - 1, 6);
        for (n = 0; n < this.vkZ; ++n) {
            fua_22.hk(this.vlg[n].vlu, 1);
            fua_22.hk(this.vlg[n].vlv, 16);
            fua_22.hk(this.vlg[n].vlw, 16);
            fua_22.hk(this.vlg[n].vlx, 8);
        }
        fua_22.hk(1, 1);
        return 0;
    }

    public int e(fub_2 fub_22) {
        fua_2 fua_22 = new fua_2();
        fua_22.f(fub_22.vhx, fub_22.vhy, fub_22.vhz);
        if (fua_22.acn(1) != 0) {
            return -135;
        }
        int n = 0;
        for (int i = this.vkZ; i > 1; i >>>= 1) {
            ++n;
        }
        int n2 = fua_22.acn(n);
        if (n2 == -1) {
            return -136;
        }
        return this.vkY[this.vlg[n2].vlu];
    }

    public String toString() {
        return "version:" + this.aeb + ", channels:" + this.vkU + ", rate:" + this.vjB + ", bitrate:" + this.vkV + "," + this.vkW + "," + this.vkX;
    }
}

