/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from auK
 */
class auk_2 {
    int aQL;
    int dfb;
    int dfc;
    int dfd;
    int dfe;
    int dff;
    final int[] dfg = new int[500];

    auk_2() {
    }

    final void gy(long l) {
        this.dfd = 0;
        this.dfe = 0;
        int n = this.dfg.length;
        this.dfg[(int)(l % (long)n)] = this.aQL;
        long l2 = 0L;
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            int n3 = this.dfg[i];
            l2 += (long)n3;
            if (n3 < this.dfd || this.dfd <= 0) {
                this.dfd = n3;
            }
            if (n3 > this.dfe) {
                this.dfe = n3;
            }
            if (n3 == 0) continue;
            ++n2;
        }
        this.dfb = (int)GC.e((double)l2 / (double)n2);
        this.dfc = (int)GC.e((double)l2 / (double)n);
        this.dff = (int)l2;
        this.aQL = 0;
    }

    final void uG(int n) {
        this.aQL += n;
    }

    final void bMw() {
        this.aQL = 0;
        this.dfb = 0;
        this.dfd = 0;
        this.dfe = 0;
        for (int i = 0; i < this.dfg.length; ++i) {
            this.dfg[i] = 0;
        }
    }
}

