/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eQM
 */
public class eqm_0
extends eON {
    private static final aox_1 rgA = new enz_0(new aow_1[0]);

    @Override
    public aox_1 bEt() {
        return rgA;
    }

    private eqm_0() {
    }

    public eqm_0(pt_0 pt_02) {
        this.rcf = pt_02;
        this.rcs = false;
        this.bby();
    }

    public eqm_0 fFP() {
        eqm_0 eqm_02 = new eqm_0();
        eqm_02.rcf = this.rcf;
        eqm_02.rcs = false;
        return eqm_02;
    }

    @Override
    public void E(QD qD) {
        qu_0 qu_02 = this.fCZ();
        if (!qu_02.a(this.rcf)) {
            this.aQL = 0;
            return;
        }
        pr_0 pr_02 = qu_02.b(this.rcf);
        this.aQL = pr_02.aYD() - pr_02.aYB();
    }

    @Override
    public /* synthetic */ eON fCE() {
        return this.fFP();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fFP();
    }
}

