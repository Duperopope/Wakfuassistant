/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eOQ
 */
public class eoq_0
extends eOR {
    public eoq_0() {
    }

    public eoq_0(pt_0 pt_02) {
        super(pt_02);
    }

    public eoq_0 fDe() {
        eoq_0 eoq_02 = new eoq_0();
        eoq_02.rcf = this.rcf;
        return eoq_02;
    }

    @Override
    protected void d(pr_0 pr_02) {
        if (pr_02.aYD() - this.aQL < pr_02.aYF()) {
            pr_02.ot(pr_02.aYF());
            this.aQL = pr_02.aYD() - pr_02.aYF();
        } else {
            pr_02.ot(pr_02.aYD() - this.aQL);
        }
    }

    @Override
    protected void e(pr_0 pr_02) {
        pr_02.ot(pr_02.aYD() + this.aQL);
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fDe();
    }
}

