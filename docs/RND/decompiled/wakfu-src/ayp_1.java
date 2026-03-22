/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ayp
 */
final class ayp_1
extends aym_1 {
    @Override
    public ayi_1 a(int n, int n2, ayi_1 ayi_12, ayj_1 ayj_12, ayj_1 ayj_13) {
        ayi_1 ayi_13 = new ayi_1(n, n);
        int n3 = ayi_13.dso;
        int n4 = ayi_13.dsp;
        this.b(n3, n2, ayi_12, ayj_12, ayj_13);
        int n5 = ayi_13.bjW;
        int n6 = ayi_13.bjX;
        double d2 = Math.PI * 2;
        int n7 = n * n;
        for (int i = 0; i < n3; ++i) {
            int n8 = i - n5;
            int n9 = Math.abs(n8);
            n9 *= n9;
            for (int j = 0; j < n4; ++j) {
                int n10;
                int n11 = j - n6;
                int n12 = Math.abs(n11);
                if ((n10 = n9 + (n12 *= n12)) > n7) continue;
                double d3 = (Math.atan2(n11, n8) + Math.PI * 2) % (Math.PI * 2) / (Math.PI * 2);
                int n13 = (int)(d3 * (double)n2);
                n10 = GC.mU(n10);
                ayi_13.dsn[i][j] = this.cx(n10, n13);
            }
        }
        return ayi_13;
    }
}

