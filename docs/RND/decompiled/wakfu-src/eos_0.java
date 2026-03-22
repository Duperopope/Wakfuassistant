/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eOS
 */
public final class eos_0
extends ero_0 {
    private static final aox_1 rcp = new enz_0(new eny_0("Min de la Charac = valeur", new enx_0("valeur", eNA.qYC)), new eny_0("Min de la Charac = valeur. valeur en % du max", new enx_0("valeur", eNA.qYC), new enx_0("valeur en % du max de la charac de la cible (0 = non, 1 = oui)", eNA.qYD)));
    private boolean pCf;
    private exx_2 rca;

    @Override
    public aox_1 bEt() {
        return rcp;
    }

    public eos_0(exx_2 exx_22) {
        this.rca = exx_22;
        this.bby();
    }

    private eos_0() {
    }

    public eos_0 fDg() {
        eos_0 eos_02 = new eos_0();
        eos_02.rca = this.rca;
        return eos_02;
    }

    @Override
    public void E(QD qD) {
        short s = this.fHf();
        this.pCf = false;
        if (this.bgC == null) {
            return;
        }
        if (((enk_0)this.bgC).fAn() >= 1) {
            this.aQL = ((enk_0)this.bgC).a(0, s, ene_0.qPu);
        }
        if (((enk_0)this.bgC).fAn() >= 2) {
            boolean bl = this.pCf = ((enk_0)this.bgC).a(1, s, ene_0.qPu) == 1;
        }
        if (this.pCf) {
            pr_0 pr_02 = this.bgF.b(this.rca);
            this.aQL = GC.C((float)(pr_02.aYD() * this.aQL) / 100.0f);
        }
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgF == null || !this.bgF.a(this.rca)) {
            this.fHg();
            return;
        }
        pr_0 pr_02 = this.bgF.b(this.rca);
        int n = pr_02.aYF();
        if (this.bbt()) {
            pr_02.ou(this.aQL);
            this.aQL = pr_02.aYF() - n;
        } else {
            pr_02.ou(pr_02.aYF() + this.aQL);
        }
    }

    @Override
    public void bbS() {
        if (this.bgF == null || !this.bgF.a(this.rca)) {
            return;
        }
        pr_0 pr_02 = this.bgF.b(this.rca);
        pr_02.ou(pr_02.aYF() - this.aQL);
    }

    @Override
    public boolean bbA() {
        return false;
    }

    @Override
    public boolean bbB() {
        return true;
    }

    @Override
    public boolean bbC() {
        return false;
    }

    @Override
    public void aVH() {
        this.rca = null;
        this.pCf = false;
        super.aVH();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fDg();
    }
}

