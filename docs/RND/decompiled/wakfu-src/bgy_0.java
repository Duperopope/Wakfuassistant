/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bgY
 */
final class bgy_0
extends eyj_0 {
    private final oh_1 ifD;
    final /* synthetic */ bgt_0 ifE;

    bgy_0(bgt_0 bgt_02, oh_1 oh_12) {
        this.ifE = bgt_02;
        this.ifD = oh_12;
        this.ifD.DM().a(this);
    }

    @Override
    public void zl() {
        bgt_0.doq().error((Object)(this.getClass().getSimpleName() + " shouldn't be serialized client-side"));
    }

    @Override
    public void zm() {
        oj_1 oj_12 = this.ifD.Rz;
        if (oj_12 == null) {
            this.ifE.ifq.setEnabled(false);
        } else {
            eHC eHC2 = eHB.a(this.ifE.ifq.fvM(), this.ifE.ifq.fvL(), ue_0.bjV().bjc());
            this.ifE.ifq.setEnabled(true);
            this.ifE.ifq.N(uw_0.fn(oj_12.RC));
            this.ifE.ifq.q(uz_0.fp(oj_12.RD));
            eHC eHC3 = eHB.a(this.ifE.ifq.fvM(), this.ifE.ifq.fvL(), ue_0.bjV().bjc());
            bel_2.a(eHC3);
        }
    }
}

