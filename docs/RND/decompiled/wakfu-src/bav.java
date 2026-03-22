/*
 * Decompiled with CFR 0.152.
 */
class bav
implements aqg_1<aLy> {
    bav() {
    }

    public void a(aLy aLy2) {
        frh_0 frh_02 = new frh_0(aLy2.clL(), aLy2.clf(), aLy2.azv(), aLy2.clM(), aLy2.clx(), fre_0.hD(aLy2.cly()));
        for (aLz aLz2 : aLy2.clN()) {
            frI frI2 = new frI(aLz2.d(), (short)aLz2.clO(), aLz2.clB(), aLz2.clu(), aLz2.clv(), aLz2.clw());
            frh_02.a(frI2);
            frI2.c(bau.a(aLz2.clE()));
        }
        frb_0.sYO.a(frh_02);
    }

    @Override
    public /* synthetic */ void load(aqz_2 aqz_22) {
        this.a((aLy)aqz_22);
    }
}

