/*
 * Decompiled with CFR 0.152.
 */
public class bTq
extends bTo {
    public bTq(int n, int n2, int n3) {
        super(n, n, n2, n3);
    }

    @Override
    protected String getName() {
        return aum_0.cWf().a(37, (long)this.lnF, new Object[0]);
    }

    @Override
    protected boolean enq() {
        return bTj.eno().doD().eaH().XW(this.lnF);
    }

    @Override
    protected boolean enr() {
        return true;
    }

    @Override
    protected String byf() {
        return auc_0.cVq().a("ecosystemDifficultyIconsPath", "defaultIconPath", this.lnF, this.ent() ? 2 : (this.ens() ? 1 : 0));
    }

    @Override
    protected boolean ens() {
        boz_2 boz_22 = bod_1.ehw().IF(this.lnF);
        return boz_22.ehb() < 0.2f;
    }

    @Override
    protected boolean ent() {
        boz_2 boz_22 = bod_1.ehw().IF(this.lnF);
        return boz_22.ehb() < 0.05f && !boz_22.ehg();
    }

    @Override
    public boolean egX() {
        return false;
    }

    @Override
    public String enu() {
        return aum_0.cWf().a(100, (long)this.lnF, new Object[0]);
    }
}

