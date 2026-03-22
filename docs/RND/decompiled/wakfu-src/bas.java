/*
 * Decompiled with CFR 0.152.
 */
class bas
implements aqg_1<aon_0> {
    bas(bar bar2) {
    }

    public void a(aon_0 aon_02) {
        int[] nArray = aon_02.cjX();
        if (nArray.length > 0) {
            int n = nArray[0];
            enk_0 enk_02 = bat_2.cZD().Ay(n);
            if (enk_02 == null) {
                bar.hyT.error((Object)("Probl\u00e8me de chargmeent de Timelinebuff " + aon_02.d()));
            } else {
                ewc_1.rBP.a(enk_02, aon_02.d());
            }
            ewc_1.rBP.fG(n, aon_02.aVt());
            ewc_1.rBP.a(ewd_1.SN(aon_02.aHp()), n);
            if (aon_02.cyo()) {
                ewc_1.rBP.w(enk_02);
            }
        }
    }

    @Override
    public /* synthetic */ void load(aqz_2 aqz_22) {
        this.a((aon_0)aqz_22);
    }
}

