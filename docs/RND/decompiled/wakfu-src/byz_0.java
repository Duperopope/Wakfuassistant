/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from byz
 */
class byz_0
extends agb_1 {
    final /* synthetic */ rh_0 jCM;
    final /* synthetic */ byy_0 jCN;

    byz_0(byy_0 byy_02, int n, int n2, int n3, rh_0 rh_02) {
        this.jCN = byy_02;
        this.jCM = rh_02;
        super(n, n2, n3);
    }

    @Override
    protected long cbk() {
        bsS bsS2 = bsU.dHk().Ft(this.jCN.jCL.ibY);
        if (bsS2 == null) {
            return 0L;
        }
        if (bsS2 instanceof bsj_0) {
            ((bsj_0)bsS2).qG(this.Sn());
        }
        this.jCN.jCL.e(this.jCM);
        return 0L;
    }

    @Override
    protected void caV() {
    }
}

