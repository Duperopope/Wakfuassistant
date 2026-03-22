/*
 * Decompiled with CFR 0.152.
 */
final class ceX
extends ceK<crd, bsS> {
    private crd lSG;
    private boolean jkT = true;

    ceX() {
    }

    public void jf(boolean bl) {
        this.jkT = bl;
    }

    public boolean a(crd crd2) {
        this.lSG = crd2;
        bgy bgy2 = this.jkR.kq(crd2.fD());
        if (bgy2 == null) {
            return false;
        }
        bgy2.ddI().ddf();
        bgv_2 bgv_22 = this.dHF();
        if (this.jkT) {
            btg_0.a(bgy2, bgv_22);
        }
        this.a(bgy2, bgv_22);
        return false;
    }

    private bgv_2 dHF() {
        int n = this.lSG.dut() == -1 ? 2145 : this.lSG.dut();
        return (bgv_2)bEm.dSb().Vd(n);
    }

    private void a(bgy bgy2, bgv_2 bgv_22) {
        fhy_0 fhy_02 = bgv_22.dGh();
        int n = btq_1.d(fhy_02);
        byte by = this.lSG.eza().aJr();
        bmx_0 bmx_02 = null;
        if (this.lSG.ezx()) {
            if (bgy2.dkB() != null) {
                bmx_02 = (bmx_0)bgy2.dkB().beS().x(this.lSG.ezy());
            } else {
                bmz_0 bmz_02 = new bmz_0(bgy2);
                bmx_02 = bmz_02.c(this.lSG.ezy());
            }
        }
        int n2 = bjf_1.a(bgy2.Xi(), bgy2.Sn(), bgv_22);
        if (bmx_02 == null) {
            btn_0.a(this.lSG.caO(), this.lSG.avZ(), this.jkR.d(), bgy2, fhy_02, n2);
        }
        aWL aWL2 = new aWL(this.lSG.caO(), by, this.lSG.avZ(), this.jkR.d(), this.lSG.cWw(), this.lSG.cWx(), this.lSG.fD(), this.lSG.ezu(), this.lSG.ezv(), this.lSG.ezw(), this.lSG.dut(), this.lSG.cmL(), bmx_02);
        afw_2 afw_22 = aVi.cWF().a(this.jkR.d(), (aft_2)aWL2);
        aWL2.f(new bwn_1(afw_22));
        aWL2.f(new aga_1(afw_22));
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((crd)aam_22);
    }
}

