/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from btg
 */
public final class btg_0 {
    private final bsS jkR;
    private final crd jkS;
    private final boolean jkT;

    public btg_0(bsS bsS2, crd crd2, boolean bl) {
        this.jkR = bsS2;
        this.jkS = crd2;
        this.jkT = bl;
    }

    public void bGy() {
        bgy bgy2 = this.jkR.kq(this.jkS.fD());
        if (bgy2 == null) {
            return;
        }
        bgy2.ddI().ddf();
        bgv_2 bgv_22 = this.dHF();
        if (this.jkT) {
            btg_0.a(bgy2, bgv_22);
        }
        this.a(bgy2, bgv_22);
    }

    private bgv_2 dHF() {
        int n = this.jkS.dut() == -1 ? 2145 : this.jkS.dut();
        return (bgv_2)bEm.dSb().Vd(n);
    }

    private void a(bgy bgy2, bgv_2 bgv_22) {
        fhy_0 fhy_02 = bgv_22.dGh();
        byte by = this.jkS.eza().aJr();
        bmx_0 bmx_02 = null;
        if (this.jkS.ezx()) {
            if (bgy2.dkB() != null) {
                bmx_02 = (bmx_0)bgy2.dkB().beS().x(this.jkS.ezy());
            } else {
                bmz_0 bmz_02 = new bmz_0(bgy2);
                bmx_02 = bmz_02.c(this.jkS.ezy());
            }
        }
        int n = bjf_1.a(bgy2.Xi(), bgy2.Sn(), bgv_22);
        if (bmx_02 == null) {
            btn_0.a(this.jkS.caO(), this.jkS.avZ(), this.jkR.d(), bgy2, fhy_02, n);
        }
        aWL aWL2 = new aWL(this.jkS.caO(), by, this.jkS.avZ(), this.jkR.d(), this.jkS.cWw(), this.jkS.cWx(), this.jkS.fD(), this.jkS.ezu(), this.jkS.ezv(), this.jkS.ezw(), this.jkS.dut(), this.jkS.cmL(), bmx_02);
        afw_2 afw_22 = aVi.cWF().a(this.jkR.d(), (aft_2)aWL2);
        aWL2.f(new bwn_1(afw_22), new aga_1(afw_22));
    }

    public static void a(bgy bgy2, fhc_0 fhc_02) {
        aPd.g("fight.itemUse", new ahv_2().ceu().c(bgy2.aZk()).cev().ceL(), new ahv_2().ceu().c(fhc_02.getName()).ceL());
    }
}

