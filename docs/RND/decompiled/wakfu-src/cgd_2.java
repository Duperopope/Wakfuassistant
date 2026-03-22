/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cGD
 */
class cgd_2
extends fmz_1 {
    final /* synthetic */ bvl_0 mYJ;

    cgd_2(bvl_0 bvl_02) {
        this.mYJ = bvl_02;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(19043);
        dae_02.gj(this.mYJ.Sn());
        aaw_1.bUq().h(dae_02);
        return false;
    }
}

