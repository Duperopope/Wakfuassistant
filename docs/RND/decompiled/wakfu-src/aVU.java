/*
 * Decompiled with CFR 0.152.
 */
public class aVU
extends aUS {
    private long htJ;

    public aVU(int n, int n2, int n3, int n4) {
        super(n, n2, n3, n4);
    }

    @Override
    protected void cWv() {
        Object object;
        bgy bgy2 = this.iD(this.caQ());
        if (bgy2 == null) {
            dJP.error((Object)"D\u00e9but de tour demand\u00e9 pour un fighter inexistant ??");
            return;
        }
        if (!bgy2.a(exe_1.rEi)) {
            object = bgy2.ddI();
            ((bdj_2)object).be(bgy2.bcP());
        }
        object = (bsj_0)this.cja();
        ((bsj_0)object).dGQ().eu(this.htJ);
        if (this.cWs() && !((euq_0)object).bq(bgy2)) {
            dJP.error((Object)("impossible de d\u00e9buter le tour du fighter " + bgy2.Sn()));
            ((bsj_0)object).dGM();
        }
        cuu_1.eRU().bZ(bgy2);
        if (aue_0.cVJ().cVK() == bgy2) {
            bqm_0.jbp.b(new brj_1());
        }
    }

    public void iF(long l) {
        this.htJ = l;
    }

    @Override
    protected void caV() {
    }
}

