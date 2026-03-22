/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eOW
 */
public final class eow_0
extends ero_0 {
    private static final aox_1 rcw = new enz_0(new eny_0("Id de la charac", new enx_0("Id de la charac", eNA.qYD)), new eny_0("Ratio", new enx_0("Id de la charac", eNA.qYD), new enx_0("Ratio \u00e0 copier (defaut = 100%)", eNA.qYC)));
    private byte piY = (byte)-1;
    private int dfe;

    @Override
    protected void b(io_1 io_12) {
        io_12.a(ii_1.MR().em(this.piY).ek(this.dfe));
    }

    @Override
    protected void f(im_1 im_12) {
        if (im_12.Qz()) {
            ii_1 ii_12 = im_12.QA();
            this.piY = GC.ct(ii_12.LT());
            this.dfe = ii_12.getValue();
        }
    }

    @Override
    public aox_1 bEt() {
        return rcw;
    }

    public eow_0() {
        this.bby();
    }

    public eow_0 fDm() {
        eow_0 eow_02 = new eow_0();
        eow_02.piY = this.piY;
        eow_02.dfe = this.dfe;
        return eow_02;
    }

    @Override
    public void E(QD qD) {
    }

    @Override
    public void bbF() {
        exx_2 exx_22;
        if (!this.bbt()) {
            return;
        }
        if (this.bgC == null) {
            return;
        }
        if (((enk_0)this.bgC).fAn() >= 1) {
            this.piY = (byte)((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu);
        }
        int n = 100;
        if (((enk_0)this.bgC).fAn() >= 2) {
            n = ((enk_0)this.bgC).a(1, this.fHf(), ene_0.qPu);
        }
        if ((exx_22 = exx_2.c(this.piY)) == null) {
            bgA.error((Object)("Charac parametree inconnue " + this.piY));
            return;
        }
        if (!this.bgE.a(exx_22) || !this.bgF.a(exx_22)) {
            return;
        }
        int n2 = this.bgE.b(exx_22).aYD();
        this.dfe = n2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : VJ.bt((float)(n2 * n) / 100.0f);
        this.aQL = VJ.bt((float)(this.bgE.c(exx_22) * n) / 100.0f);
        super.bbF();
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgE == null || this.bgF == null) {
            this.fHg();
            return;
        }
        exx_2 exx_22 = exx_2.c(this.piY);
        if (exx_22 == null) {
            bgA.error((Object)("Charac parametree inconnue " + this.piY));
            this.fHg();
            return;
        }
        if (!this.bgE.a(exx_22) || !this.bgF.a(exx_22)) {
            this.fHg();
            return;
        }
        this.bgF.b(exx_22).ot(this.dfe);
        this.bgF.b(exx_22).op(this.aQL);
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
        this.piY = (byte)-1;
        super.aVH();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fDm();
    }
}

