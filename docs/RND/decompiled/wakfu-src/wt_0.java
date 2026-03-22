/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Wt
 */
public final class wt_0
extends ws_0 {
    public static final int bNt = 128;
    public static final int bNu = 64;
    public static final int bNv = 48;
    public static final int bNw = 16;
    private static final int bNx = 192;
    private static final int bNy = 48;
    public static final int bNz = 15;
    private static final int bNA = 207;
    public static final int bNB = 0;
    public static final int bNC = 128;
    public static final int bND = 64;
    public static final int bNE = 192;
    public static final int bNF = 1;
    public static final int bNG = 2;
    public static final int bNH = 4;
    public static final int bNI = 8;
    public static final int bNJ = 16;
    public static final int bNK = 32;
    public static final int bNL = 64;
    public static final int bNM = 128;
    public static final int bNN = 256;
    public static final int bNO = 512;
    public byte bNP;
    public byte bNQ = 0;
    public short bNR;

    public wt_0() {
    }

    public wt_0(wt_0 wt_02) {
        this.d(wt_02);
    }

    @Deprecated
    public static wt_0[] blX() {
        wt_0[] wt_0Array = new wt_0[32];
        for (int i = 0; i < wt_0Array.length; ++i) {
            wt_0Array[i] = new wt_0();
        }
        return wt_0Array;
    }

    public static short a(wt_0[] wt_0Array, ww_0 ww_02, int n, int n2, short s) {
        short s2;
        block2: {
            int n3;
            block1: {
                s2 = -1;
                n3 = ww_02.a(n, n2, wt_0Array, 0);
                if (n3 != 1) break block1;
                if (wt_0Array[0].ban != s) break block2;
                s2 = 0;
                break block2;
            }
            for (int i = 0; i < n3; ++i) {
                if (wt_0Array[i].ban != s || wt_0Array[i].bNr) continue;
                s2 = (short)i;
                break;
            }
        }
        return s2;
    }

    public void d(wt_0 wt_02) {
        this.bap = wt_02.bap;
        this.baq = wt_02.baq;
        this.ban = wt_02.ban;
        this.aXR = wt_02.aXR;
        this.bNr = wt_02.bNr;
        this.bNP = wt_02.bNP;
        this.bNQ = wt_02.bNQ;
        this.bNR = wt_02.bNR;
    }

    public String toString() {
        return "CellPathData(" + this.bap + "," + this.baq + "," + this.ban + "," + this.aXR + ")";
    }

    public int blY() {
        return this.bNQ & 0xC0;
    }

    public int blZ() {
        return this.bNQ;
    }

    public int bma() {
        return this.bNQ & 0x30;
    }

    public int bmb() {
        return this.bNQ & 0xFFFFFF30;
    }

    public int vD() {
        return this.bNQ & 0xF;
    }

    public boolean bmc() {
        return (this.bNR & 1) == 1;
    }

    public boolean bmd() {
        return (this.bNR & 2) == 2;
    }

    public boolean bme() {
        return (this.bNR & 4) == 4;
    }

    public boolean bmf() {
        return (this.bNR & 0x20) == 32;
    }

    public boolean bmg() {
        return (this.bNR & 8) == 8;
    }

    public boolean bmh() {
        return (this.bNR & 0x40) == 64;
    }

    public boolean bmi() {
        return (this.bNR & 0x80) == 128;
    }

    public boolean bmj() {
        return (this.bNR & 0x10) == 16;
    }

    public boolean bmk() {
        return (this.bNR & 0x100) == 256;
    }

    public boolean bml() {
        return (this.bNR & 0x200) == 512;
    }

    public static boolean qn(int n) {
        return (n & 0x80) == 128;
    }

    public static boolean qo(int n) {
        return (n & 0x40) == 64;
    }

    @Override
    public ws_0 b(ws_0 ws_02) {
        wt_0 wt_02 = new wt_0();
        wt_0.a(this, ws_02, wt_02);
        wt_0 wt_03 = ws_02.ban >= this.ban ? (wt_0)ws_02 : this;
        wt_02.bNP = wt_03.bNP;
        wt_02.bNQ = wt_03.bNQ;
        wt_02.bNR = wt_03.bNR;
        return wt_02;
    }
}

