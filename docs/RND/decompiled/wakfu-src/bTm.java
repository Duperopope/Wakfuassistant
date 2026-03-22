/*
 * Decompiled with CFR 0.152.
 */
public class bTm
extends bTo {
    public bTm(int n, int n2, int n3) {
        super(n, eyw.fik().OW(n).fii(), n2, n3);
    }

    @Override
    protected String getName() {
        return aum_0.cWf().a(38, (long)this.lnF, new Object[0]);
    }

    @Override
    protected boolean enq() {
        return bTj.eno().doD().eaH().XV(this.lnF);
    }

    @Override
    protected boolean enr() {
        return true;
    }

    @Override
    protected String byf() {
        if (this.ent()) {
            return bje_1.inz.Dh(this.lnG);
        }
        if (this.ens()) {
            return bje_1.iny.Dh(this.lnG);
        }
        return bje_1.inx.Dh(this.lnG);
    }

    @Override
    protected boolean ens() {
        boz_2 boz_22 = boc_2.eht().IE(this.lnF);
        return boz_22.ehb() < 0.2f;
    }

    @Override
    protected boolean ent() {
        boz_2 boz_22 = boc_2.eht().IE(this.lnF);
        return boz_22.ehb() < 0.05f && !boz_22.ehg();
    }

    @Override
    public boolean egX() {
        return true;
    }

    @Override
    public String enu() {
        return aum_0.cWf().a(100, (long)ejj_0.qyJ.fxb(), new Object[0]);
    }
}

