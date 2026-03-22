/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aZi
 */
class azi_0
implements aqg_1<aLL> {
    azi_0() {
    }

    public void a(aLL aLL2) {
        int n = aLL2.d();
        int n2 = aLL2.clf();
        short s = aLL2.clh();
        boolean bl = aLL2.bfb();
        int n3 = aLL2.cmm();
        fdl fdl2 = new fdl(n, n2, s, bl, n3);
        fda_0.rWI.a(fdl2);
        for (aln_0 aln_02 : aLL2.cmn()) {
            fdl2.fN(aln_02.azv(), aln_02.aaD());
        }
    }

    @Override
    public /* synthetic */ void load(aqz_2 aqz_22) {
        this.a((aLL)aqz_22);
    }
}

