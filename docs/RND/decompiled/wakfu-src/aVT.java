/*
 * Decompiled with CFR 0.152.
 */
public class aVT
extends aUS {
    private final int htH;
    private int htI;

    public aVT(int n, int n2, int n3, int n4, int n5) {
        super(n, n2, n3, n5);
        this.htH = n4;
    }

    @Override
    protected void cWv() {
        if (!this.cWs()) {
            return;
        }
        bsj_0 bsj_02 = (bsj_0)this.cja();
        bua bua2 = bsj_02.dGQ();
        bgy bgy2 = bua2.dIA();
        long l = this.caQ();
        if (aue_0.cVJ().c(cyx_2.eYd()) && cyx_2.eYd().dHq().Sn() == l) {
            aue_0.cVJ().b(cyx_2.eYd());
        }
        this.a(bsj_02, bua2, bgy2, l);
        aue_0.cVJ().etu().d(new ckB(bua2.bhM()));
    }

    private void a(bsj_0 bsj_02, bua bua2, bgy bgy2, long l) {
        boolean bl;
        if (bgy2 == null) {
            if (!bua2.eI(l)) {
                dJP.error((Object)("impossible de terminer le tour du fighter " + l));
                bsj_02.dGM();
            }
            return;
        }
        if (bgy2.Sn() != this.caQ()) {
            dJP.info((Object)"fin de tour pr\u00e9matur\u00e9e du client");
            return;
        }
        boolean bl2 = bl = !bgy2.fhm().get(2);
        if (bl) {
            bua2.eLo().rp(l);
            bua2.eLo().aa(l, this.htH);
            bua2.eLo().ab(l, this.htI);
        }
        bdj_2 bdj_22 = bgy2.ddI();
        if (bsj_02.ba((exP)bgy2)) {
            bdj_22.bd(bgy2.bcP());
        }
        if (!bsj_02.v(bgy2.Sn(), bl)) {
            dJP.error((Object)("impossible de terminer le tour du fighter " + bgy2.Sn()));
            bsj_02.dGM();
        }
    }

    @Override
    protected void caV() {
    }

    public void Ab(int n) {
        this.htI = n;
    }
}

