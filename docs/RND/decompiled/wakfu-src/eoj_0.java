/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eOJ
 */
public class eoj_0
extends ero_0 {
    private static final aox_1 rbZ = new enz_0(new eny_0("En fonction du caster", new enx_0("Valeur en %", eNA.qYC), new enx_0("Augmente la valeur courante (0 non 1 oui)", eNA.qYD), new enx_0("Diminue \u00e0 la d\u00e9sapplication (0 g\u00e9n\u00e9ralement. Si vous h\u00e9sitez, demandez ! Bug \u00e0 l'horizon)", eNA.qYD)));
    private exx_2 rca;
    private boolean rcb = true;
    private boolean rcc = true;
    private int rcd = 0;

    @Override
    public aox_1 bEt() {
        return rbZ;
    }

    private eoj_0() {
        this.bby();
    }

    public eoj_0(exx_2 exx_22) {
        this.rca = exx_22;
        this.bby();
    }

    public eoj_0 fCW() {
        eoj_0 eoj_02 = new eoj_0();
        eoj_02.rca = this.rca;
        return eoj_02;
    }

    @Override
    public void bby() {
        super.bby();
        this.oC(3);
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgF == null || !this.bgF.a(this.rca)) {
            this.mk(true);
            return;
        }
        if (this.bgF != null && this.bgF.a(this.rca)) {
            pr_0 pr_02 = this.bgF.b(this.rca);
            int n = pr_02.aYE();
            int n2 = pr_02.aYD();
            pr_02.or(this.aQL);
            if (this.bbt()) {
                this.aQL = pr_02.aYE() - n;
                this.rcd = pr_02.aYD() - n2;
            }
            if (this.rcb) {
                pr_02.nt(this.rcd);
                this.rdU = true;
            }
        } else {
            this.mk(true);
        }
    }

    @Override
    public void E(QD qD) {
        if (this.bgC == null) {
            return;
        }
        short s = this.fHf();
        int n = ((enk_0)this.bgC).a(0, s, ene_0.qPu);
        this.rcb = ((enk_0)this.bgC).a(1, s, ene_0.qPu) != 0;
        boolean bl = this.rcc = ((enk_0)this.bgC).a(2, s, ene_0.qPu) != 0;
        if (this.bgE != null && this.bgE.a(this.rca)) {
            this.aQL = n * this.bgE.b(this.rca).aYD() / 100;
        }
    }

    @Override
    public void bbS() {
        if (this.rdU && this.bgF != null && this.bgF.a(this.rca)) {
            pr_0 pr_02 = this.bgF.b(this.rca);
            if (pr_02.aYB() > 0) {
                pr_02.oq(this.rcd > pr_02.aYB() ? pr_02.aYB() - 1 : this.rcd);
            }
            pr_02.or(-this.aQL);
        }
        super.bbS();
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
        super.aVH();
        this.rcd = 0;
        this.rcb = true;
        this.rcc = true;
    }

    @Override
    protected void b(io_1 io_12) {
        io_12.a(ii_1.MR().u(this.rcb).v(this.rcc).ek(this.rcd));
    }

    @Override
    protected void f(im_1 im_12) {
        if (im_12.Qz()) {
            ii_1 ii_12 = im_12.QA();
            this.rcb = ii_12.Mx();
            this.rcc = ii_12.Mz();
            this.rcd = ii_12.getValue();
        }
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fCW();
    }
}

