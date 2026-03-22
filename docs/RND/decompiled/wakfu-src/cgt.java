/*
 * Decompiled with CFR 0.152.
 */
class cgt
extends aUS {
    protected cgt(int n, int n2, int n3, int n4) {
        super(n, n2, n3, n4);
    }

    @Override
    protected void cWv() {
        bsS bsS2 = this.cja();
        if (bsS2 == null) {
            return;
        }
        ((bsi_0)bsS2).a(etw_0.rqU);
        ((bsi_0)bsS2).kt(ue_0.bjV().bji());
        for (bgy bgy2 : bsS2.dGs()) {
            if (bgy2 instanceof bhJ) {
                bdj_2 bdj_22 = bgy2.ddI();
                btn_0.b(bdj_22, bdj_22.dcX());
            }
            this.n(bsS2);
        }
        ((bsi_0)bsS2).dGm();
        ((bsi_0)bsS2).dGn();
        aJL.yL(bsS2.d());
    }

    private void n(bsS bsS2) {
        for (bgy bgy2 : bsS2.dGs()) {
            bgy2.ddI().ddj();
        }
    }

    @Override
    protected void caV() {
    }
}

