/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aYP
 */
class ayp_0
implements aqg_1<amm_0> {
    ayp_0(ayo_0 ayo_02) {
    }

    public void a(amm_0 amm_02) {
        int n = amm_02.d();
        short s = amm_02.cnD();
        short s2 = amm_02.cnE();
        int[] nArray = amm_02.cnF();
        ewv_1 ewv_12 = new ewv_1(n, s, s2);
        for (int n2 : nArray) {
            ewp_1 ewp_12 = ewu_1.rCG.Tb(n2);
            if (ewp_12 == null) continue;
            ewv_12.c(ewp_12);
        }
        ewu_1.rCG.a(ewv_12);
    }

    @Override
    public /* synthetic */ void load(aqz_2 aqz_22) {
        this.a((amm_0)aqz_22);
    }
}

