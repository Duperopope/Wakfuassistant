/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from caY
 */
class cay_1 {
    private final long lIb;
    private final byte[] lIc = new byte[4];

    cay_1(long l) {
        this.lIb = l;
        this.erQ();
    }

    private void erQ() {
        for (int i = 0; i < 6; ++i) {
            for (int j = 0; j < 6; ++j) {
                int n = cax_1.ad(j, i, 6);
                int n2 = cax_1.ad(cax_1.Ks(j), cax_1.Ks(i), 2);
                if (!GC.g(this.lIb, n)) continue;
                int n3 = n2;
                this.lIc[n3] = (byte)(this.lIc[n3] + 1);
            }
        }
    }

    public byte eo(int n, int n2) {
        if (this.lIb == 0L) {
            return 0;
        }
        n = (n % 2 + 2) % 2;
        n2 = (n2 % 2 + 2) % 2;
        int n3 = cax_1.ad(n2, n, 2);
        return this.lIc[n3];
    }

    public byte ep(int n, int n2) {
        if (this.lIb == 0L) {
            return 0;
        }
        int n3 = cax_1.ad(cax_1.Kr(n2), cax_1.Kr(n), 2);
        return this.lIc[n3];
    }

    public boolean eq(int n, int n2) {
        if (this.lIb == 0L) {
            return false;
        }
        n = (n % 6 + 6) % 6;
        n2 = (n2 % 6 + 6) % 6;
        int n3 = cax_1.ad(n2, n, 6);
        return GC.g(this.lIb, n3);
    }

    public boolean erR() {
        return this.lIb != 0L;
    }

    public void erS() {
        for (int i = 0; i < 6; ++i) {
            for (int j = 0; j < 6; ++j) {
                int n = cax_1.ad(j, i, 6);
                System.out.print(GC.g(this.lIb, n) ? "R " : "x ");
            }
            System.out.println("");
        }
    }
}

