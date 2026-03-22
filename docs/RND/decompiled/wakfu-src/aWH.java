/*
 * Decompiled with CFR 0.152.
 */
public class aWH
extends agb_1 {
    private bgy htb;

    public aWH(int n, int n2, int n3, bgy bgy2) {
        super(n, n2, n3);
        this.xO(n);
        this.xP(n2);
        this.xQ(n3);
        this.L(bgy2);
    }

    @Override
    protected long cbk() {
        bdj_2 bdj_22 = this.htb.ddI();
        if (bdj_22.dZ("AnimTransEffect-Fin")) {
            bdj_22.dT("AnimTransEffect-Fin");
            return bdj_22.dY("AnimTransEffect-Fin");
        }
        this.cXE();
        return 0L;
    }

    private void cXE() {
        bdj_2 bdj_22 = this.htb.ddI();
        this.htb.CK(0);
        this.htb.dkr();
        bdj_22.a(bdj_22.bqc(), new aWI(this, bdj_22));
        fse_1.gFu().a((aef_2)this.htb, "name", "nameAndLevel");
    }

    @Override
    protected void caV() {
        this.cXE();
    }

    public bgy cWO() {
        return this.htb;
    }

    public void L(bgy bgy2) {
        this.htb = bgy2;
    }
}

