/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eOZ
 */
public class eoz_0
extends ero_0 {
    private static final aox_1 rcA = new enz_0(new eny_0("Pas de param", new enx_0[0]), new eny_0("D\u00e9clenchement des triggers KO", new enx_0("D\u00e9clenche les triggers KO (oui = 0 (defaut), non = 1)", eNA.qYD)));
    private boolean rcB;

    @Override
    public aox_1 bEt() {
        return rcA;
    }

    public eoz_0() {
        this.bby();
        this.oC(192);
    }

    public eoz_0 fDo() {
        eoz_0 eoz_02 = new eoz_0();
        this.bgO = 1;
        return eoz_02;
    }

    @Override
    public void bby() {
        super.bby();
        this.oC(192);
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgF == null) {
            this.mk(true);
            return;
        }
        if (!this.bgF.a(exx_2.rGi)) {
            this.fHg();
            return;
        }
        this.bgF.b(exx_2.rGi).aYP();
        if (this.rcB) {
            this.bgF.f(exe_1.rEm);
        }
        if (this.bgF.a(exx_2.rGs)) {
            this.bgF.b(exx_2.rGs).ot(0);
        }
    }

    @Override
    public void E(QD qD) {
        this.rcB = false;
        if (this.bgC == null) {
            return;
        }
        if (((enk_0)this.bgC).fAn() == 0) {
            return;
        }
        if (((enk_0)this.bgC).fAn() >= 1) {
            this.rcB = ((enk_0)this.bgC).a(0, this.fHf(), ene_0.qPu) == 1;
        }
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
    protected boolean bce() {
        return true;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.rcB = false;
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fDo();
    }
}

