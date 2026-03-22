/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

final class bhh
extends eyj_0 {
    private final qb_2 ifU;
    final /* synthetic */ bgt_0 ifV;

    bhh(bgt_0 bgt_02, qb_2 qb_22) {
        this.ifV = bgt_02;
        this.ifU = qb_22;
        this.ifU.DM().a(this);
    }

    @Override
    public void zl() {
        bgt_0.dop().error((Object)(this.getClass().getSimpleName() + " shouldn't be serialized client-side"));
    }

    @Override
    public void zm() {
        this.ifV.ifj = new fia_0();
        fig_0.ssF.a(this.ifV.ifj, !this.ifV.a(evv_1.oxg));
        ArrayList<qe_2> arrayList = this.ifU.UY;
        for (qe_2 qe_22 : arrayList) {
            this.ifV.ifj.a(qe_22.Vd, uw_0.fn(qe_22.Ve), uw_0.fn(qe_22.Vf));
            this.ifV.ifj.fW(qe_22.Vd, qe_22.Vg);
            this.ifV.ifj.e(qe_22.Vd, uw_0.fn(qe_22.Vh));
        }
    }
}

