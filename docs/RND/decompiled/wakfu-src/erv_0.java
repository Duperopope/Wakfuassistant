/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eRv
 */
public final class erv_0
extends ero_0 {
    private static final aox_1 rhZ = new enz_0(new eny_0("Carac \u00e0 inverser", new enx_0("Carac 1", eNA.qYD), new enx_0("Carac 2", eNA.qYD)));
    private byte ria;
    private byte rib;
    private int ric;
    private int rid;

    @Override
    protected void b(io_1 io_12) {
        io_12.a(ii_1.MR().em(this.ria).ek(this.ric).ep(this.rib).eq(this.rid));
    }

    @Override
    protected void f(im_1 im_12) {
        if (im_12.Qz()) {
            ii_1 ii_12 = im_12.QA();
            this.ria = GC.ct(ii_12.LT());
            this.ric = ii_12.getValue();
            this.rib = GC.ct(ii_12.Mg());
            this.rid = ii_12.Mi();
        }
    }

    @Override
    public aox_1 bEt() {
        return rhZ;
    }

    public erv_0() {
        this.bby();
    }

    public erv_0 fGJ() {
        erv_0 erv_02 = new erv_0();
        return erv_02;
    }

    @Override
    public void E(QD qD) {
        if (this.bgC == null) {
            return;
        }
        this.ria = (byte)((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu);
        this.rib = (byte)((enk_0)this.bgC).a(1, this.fHf(), ene_0.qPu);
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgF == null) {
            this.fHg();
            return;
        }
        exx_2 exx_22 = exx_2.c(this.ria);
        exx_2 exx_23 = exx_2.c(this.rib);
        if (exx_22 == null || exx_23 == null) {
            bgA.error((Object)"Impossible d'executer l'effet, l'une des carac est inconnue");
            this.fHg();
            return;
        }
        pr_0 pr_02 = this.bgF.b(exx_22);
        pr_0 pr_03 = this.bgF.b(exx_23);
        if (pr_02 == null || pr_03 == null) {
            bgA.warn((Object)"Impossible d'executer l'effet, l'une des carac est inconnue");
            this.fHg();
            return;
        }
        if (this.bbt()) {
            this.ric = pr_02.aYB();
            this.rid = pr_03.aYB();
        }
        pr_02.oq(this.ric);
        pr_02.nt(this.rid);
        pr_03.oq(this.rid);
        pr_03.nt(this.ric);
    }

    @Override
    public void bbS() {
        exx_2 exx_22 = exx_2.c(this.ria);
        exx_2 exx_23 = exx_2.c(this.rib);
        if (exx_22 == null || exx_23 == null) {
            return;
        }
        pr_0 pr_02 = this.bgF.b(exx_22);
        pr_0 pr_03 = this.bgF.b(exx_23);
        if (pr_02 == null || pr_03 == null) {
            return;
        }
        pr_02.oq(this.rid);
        pr_02.nt(this.ric);
        pr_03.oq(this.ric);
        pr_03.nt(this.rid);
    }

    @Override
    public boolean bbA() {
        return true;
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
        this.ria = (byte)-1;
        this.rib = (byte)-2;
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fGJ();
    }
}

