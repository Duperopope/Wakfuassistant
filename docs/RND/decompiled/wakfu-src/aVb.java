/*
 * Decompiled with CFR 0.152.
 */
public class aVb
extends aUS {
    final abi_1 hsy;

    public aVb(int n, int n2, int n3, int n4, abi_1 abi_12) {
        super(n, n2, n3, n4);
        this.hsy = abi_12;
    }

    @Override
    protected void cWv() {
        bgy bgy2 = this.iD(this.caQ());
        if (bgy2 == null) {
            return;
        }
        bgy2.ddI().ddf();
        anp_2 anp_22 = bgy2.ddI().bvF();
        if (anp_22 != null && anp_22.bDV() && anp_22.bDU() > 0) {
            bgy2.ddI().b(new aVc(this));
        } else {
            bgy2.a(this.hsy);
        }
    }

    @Override
    protected void caV() {
        bgy bgy2 = this.iD(this.caQ());
        bgy bgy3 = this.iD(this.Qy());
        aWq.b(bgy2, bgy3);
    }
}

