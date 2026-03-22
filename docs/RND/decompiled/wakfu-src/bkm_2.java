/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bkM
 */
class bkm_2
implements asi_2 {
    final /* synthetic */ bkk_2 irU;

    bkm_2(bkk_2 bkk_22) {
        this.irU = bkk_22;
    }

    @Override
    public void bud() {
        if (this.irU.irO != null) {
            this.irU.irO.ac(this.irU.irP);
            this.irU.irO = null;
        }
    }

    @Override
    public void bue() {
    }

    @Override
    public void buf() {
        this.irU.irP.ddI().setVisible(false);
    }

    @Override
    public void bug() {
        asj_2.bJt().b(this);
        this.irU.dsU();
    }
}

