/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ayq
 */
final class ayq_1
extends aym_1 {
    @Override
    public ayi_1 a(int n, int n2, ayi_1 ayi_12, ayj_1 ayj_12, ayj_1 ayj_13) {
        ayi_1 ayi_13 = new ayi_1(n, n2);
        int n3 = ayi_13.dso;
        int n4 = ayi_13.dsp;
        this.b(n3, n4, ayi_12, ayj_12, ayj_13);
        for (int i = 0; i < n3; ++i) {
            for (int j = 0; j < n4; ++j) {
                ayi_13.dsn[i][j] = this.cx(i, j);
            }
        }
        return ayi_13;
    }
}

