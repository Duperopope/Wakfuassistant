/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aZh
 */
class azh_0
implements aqg_1<aol_0> {
    azh_0() {
    }

    public void a(aol_0 aol_02) {
        fdf_0 fdf_02 = new fdf_0(aol_02.coK());
        fda_0.rWI.a(fdf_02);
        for (aom_0 aom_02 : aol_02.cyd()) {
            int n = aom_02.cye();
            int n2 = aom_02.clf();
            int n3 = aom_02.getX();
            int n4 = aom_02.getY();
            int n5 = aom_02.NN();
            int n6 = aom_02.blh();
            abi_1 abi_12 = abi_1.wG(aom_02.coI());
            ang_2 ang_22 = null;
            try {
                ang_22 = ehu_0.rY(aom_02.clB());
            }
            catch (Exception exception) {
                aYY.hyd.warn((Object)("TP id=" + fdf_02.d() + "  " + exception.getMessage() + " (criteria='" + aom_02.clB() + "')"));
            }
            if (ang_22 == null) {
                ang_22 = amz_2.cIw;
            }
            int n7 = aom_02.bBE();
            short s = aom_02.cyf();
            int n8 = aom_02.cnM();
            short s2 = aom_02.cyg();
            boolean bl = aom_02.cnO();
            short s3 = aom_02.cyh();
            boolean bl2 = aom_02.cyi();
            int n9 = aom_02.cyj();
            fdg_0 fdg_02 = new fdg_0(n, n2, n3, n4, n5, (short)n6, abi_12, ang_22, n7, s, n8, s2, bl, s3, bl2, n9);
            fdf_02.l(fdg_02);
            fdg_02.b(new frl_0(aom_02.cyk(), aom_02.cyl(), aom_02.cym(), aom_02.cyn()));
        }
    }

    @Override
    public /* synthetic */ void load(aqz_2 aqz_22) {
        this.a((aol_0)aqz_22);
    }
}

