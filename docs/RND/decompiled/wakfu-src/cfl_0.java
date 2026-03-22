/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cfl
 */
final class cfl_0
extends ceK<crp, bsj_0> {
    cfl_0() {
    }

    public boolean a(crp crp2) {
        bgy bgy2 = (bgy)((bsj_0)this.jkR).qJ(crp2.Qw());
        if (bgy2 != null) {
            btn_0.b(crp2.caO(), crp2.avZ(), crp2.bha(), bgy2);
        }
        this.b(crp2);
        return false;
    }

    private void b(crp crp2) {
        aWt aWt2 = new aWt(crp2.caO(), crp2.eza().aJr(), crp2.avZ(), crp2.bha(), crp2.ezy(), crp2.cWw(), crp2.cWx(), crp2.Qw(), crp2.ezK(), crp2.ezL(), crp2.ezM());
        afw_2 afw_22 = aVi.cWF().a(crp2.bha(), (aft_2)aWt2);
        aWt2.f(new bwn_1(afw_22), new aga_1(afw_22));
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((crp)aam_22);
    }
}

