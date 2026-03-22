/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from SQ
 */
public class sq_0 {
    private int bpP = 0;
    private int bpQ = -1;
    private byte bpR = (byte)-1;
    private boolean bpS = true;
    public final int[] bpT = new int[32];

    public sq_0() {
    }

    public sq_0(int n, byte by, int n2, boolean bl) {
        this.bpR = by;
        this.bpP = n;
        this.bpQ = n2;
        this.bpS = bl;
    }

    public final int bga() {
        return this.bpP;
    }

    public final void a(int n, byte by, int n2, boolean bl) {
        this.bpP = n;
        this.bpQ = n2;
        this.bpR = by;
        this.bpS = bl;
    }

    public final int bgb() {
        return this.bpQ;
    }

    public byte bgc() {
        return this.bpR;
    }

    public final int a(int n, int n2, int n3, wt_0[] wt_0Array, int n4, int n5, wt_0[] wt_0Array2) {
        assert (this.bpP > 0) : "no moverHeight defined";
        assert (this.bpQ >= 0) : "no jump capacity defined";
        assert (wt_0Array != null && wt_0Array2 != null) : "startCellData and nextCellData can't be null";
        assert (n2 >= 0 && n3 > 0 && n2 + n3 < wt_0Array.length) : "startCell indexes out of bounds";
        assert (n4 >= 0 && n5 > 0 && n4 + n5 < wt_0Array2.length) : "nextCell indexes out of bounds";
        assert (n >= n2 && n < n2 + n3) : "startCellIndex out of bounds";
        assert (wv_0.a(n, n2, n3, wt_0Array, this.bpP)) : "incoming position is not valid : " + wt_0Array[n].bap + "," + wt_0Array[n].baq + ", " + wt_0Array[n].ban;
        wt_0 wt_02 = wt_0Array[n];
        if (n5 == 1) {
            wt_0 wt_03 = wt_0Array2[n4];
            if (wt_03.bNP == -1 || wt_03.bNr) {
                return 0;
            }
            int n6 = wt_03.ban - wt_02.ban;
            if (!(this.bpS && wt_02.bmh() && wt_03.bmh() || (n6 < 0 ? -n6 : n6) <= this.bpQ)) {
                return 0;
            }
            if (!sq_0.a(wt_02, wt_03)) {
                return 0;
            }
            if (n6 <= 0) {
                this.bpT[0] = n4;
                return 1;
            }
            if (n == n2 + n3 - 1) {
                this.bpT[0] = n4;
                return 1;
            }
            int n7 = wt_03.ban + this.bpP;
            for (int i = n + 1; i < n2 + n3; ++i) {
                wt_0 wt_04 = wt_0Array[i];
                if (wt_04.ban - wt_04.aXR >= n7) {
                    this.bpT[0] = n4;
                    return 1;
                }
                if (wt_04.bNr) continue;
                return 0;
            }
            this.bpT[0] = n4;
            return 1;
        }
        int n8 = 0;
        block1: for (int i = n4; i < n4 + n5; ++i) {
            wt_0 wt_05 = wt_0Array2[i];
            if (wt_05.bNP == -1 || wt_05.bNr) continue;
            int n9 = wt_05.ban - wt_02.ban;
            if ((!this.bpS || !wt_02.bmh() || !wt_05.bmh()) && (n9 < 0 ? -n9 : n9) > this.bpQ || !sq_0.a(wt_02, wt_05)) continue;
            int n10 = wt_05.ban + this.bpP;
            int n11 = Math.max(n10, wt_02.ban + this.bpP);
            block2: for (int j = i + 1; j < n4 + n5; ++j) {
                wt_0 wt_06 = wt_0Array2[j];
                int n12 = wt_06.ban - wt_06.aXR;
                if (n12 >= n11) {
                    if (n9 <= 0 || n == n2 + n3 - 1) break;
                    for (int i2 = n + 1; i2 < n2 + n3; ++i2) {
                        wt_0 wt_07 = wt_0Array[i2];
                        if (wt_07.ban - wt_07.aXR >= n10) break block2;
                        if (!wt_05.bNr) continue block1;
                    }
                }
                if (!wt_06.bNr) continue block1;
            }
            this.bpT[n8++] = i;
        }
        return n8;
    }

    public final boolean a(int n, int n2, int n3, wt_0[] wt_0Array, int n4, int n5, int n6, wt_0[] wt_0Array2) {
        int n7 = this.a(n, n2, n3, wt_0Array, n5, n6, wt_0Array2);
        if (n7 == 0) {
            return false;
        }
        for (int i = 0; i < n7; ++i) {
            if (this.bpT[i] != n4) continue;
            return true;
        }
        return false;
    }

    public static boolean a(wt_0 wt_02, wt_0 wt_03) {
        int n;
        assert (wt_02 != null) : "Can't check murfin movement validity for null cell";
        assert (wt_03 != null) : "Can't check murfin movement validity for null cell";
        int n2 = wt_02.blZ();
        if (n2 == (n = wt_03.blZ())) {
            return true;
        }
        if (!sq_0.af(wt_02.bma(), wt_03.bma())) {
            return false;
        }
        if (wt_02.bmb() == wt_03.bmb()) {
            return true;
        }
        int n3 = wt_02.blY();
        int n4 = wt_03.blY();
        switch (n3) {
            case 0: {
                return n4 == 0 || n4 == 64;
            }
            case 128: {
                return wt_02.vD() == wt_03.vD() && (n4 == 128 || n4 == 192);
            }
            case 64: {
                return n4 == 0 || n4 == 64 || n4 == 192 && wt_02.vD() == wt_03.vD();
            }
            case 192: {
                return wt_02.vD() == wt_03.vD() && (n4 == 64 || n4 == 128 || n4 == 192);
            }
        }
        assert (false) : "Type de Cellule non connu poru valider un murfin : " + n3;
        return false;
    }

    private static boolean af(int n, int n2) {
        if (n == n2) {
            return true;
        }
        return (n | n2) == 48;
    }
}

