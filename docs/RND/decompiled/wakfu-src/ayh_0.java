/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aYh
 */
class ayh_0
implements aqg_1<aLp> {
    ayh_0() {
    }

    public void a(aLp aLp2) {
        int n = aLp2.d();
        int n2 = aLp2.clk();
        fpt fpt2 = new fpt(n, n2);
        ayh_0.a(fpt2, aLp2.cll());
        ayh_0.a(fpt2, aLp2.clm());
        fpu.sOH.b(fpt2);
    }

    private static void a(fpt fpt2, aLr ... aLrArray) {
        for (aLr aLr2 : aLrArray) {
            fpz_0 fpz_02 = fpz_0.YB(aLr2.cls());
            fpt2.a(fpz_02);
        }
    }

    private static void a(fpt fpt2, aLq ... aLqArray) {
        for (aLq aLq2 : aLqArray) {
            int n = aLq2.aGD();
            fpf_0 fpf_02 = fpf_0.YC(aLq2.aeV());
            int n2 = aLq2.clo();
            int n3 = aLq2.clp();
            int n4 = aLq2.clq();
            int n5 = aLq2.clr();
            fpy_0 fpy_02 = new fpy_0(fpf_02, n, n2, n3, n4, n5);
            fpt2.a(fpy_02);
        }
    }

    @Override
    public /* synthetic */ void load(aqz_2 aqz_22) {
        this.a((aLp)aqz_22);
    }
}

