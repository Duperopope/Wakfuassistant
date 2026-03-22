/*
 * Decompiled with CFR 0.152.
 */
public class eOP
extends eOR {
    public eOP() {
    }

    public eOP(pt_0 pt_02) {
        super(pt_02);
    }

    public eOP fDd() {
        eOP eOP2 = new eOP();
        eOP2.rcf = this.rcf;
        return eOP2;
    }

    @Override
    protected void d(pr_0 pr_02) {
        pr_02.ot(pr_02.aYD() + this.aQL);
    }

    @Override
    protected void e(pr_0 pr_02) {
        if (pr_02.aYD() - this.aQL < pr_02.aYF()) {
            pr_02.ot(pr_02.aYF());
            this.aQL = pr_02.aYD() - pr_02.aYF();
        } else {
            pr_02.ot(pr_02.aYD() - this.aQL);
        }
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fDd();
    }
}

