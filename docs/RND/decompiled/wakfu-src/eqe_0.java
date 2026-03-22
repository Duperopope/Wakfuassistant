/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eQE
 */
public class eqe_0
extends ero_0 {
    private static final aox_1 rgm = new enz_0(new eny_0("Normal", new enx_0("ia (1) ou pas d'ia (0)", eNA.qYD)));

    @Override
    public aox_1 bEt() {
        return rgm;
    }

    public eqe_0 fFH() {
        eqe_0 eqe_02 = new eqe_0();
        return eqe_02;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgF != null && this.bgF instanceof exP) {
            ((exP)this.bgF).lk(this.aQL == 1);
        }
    }

    @Override
    public void bbS() {
        if (this.bgF != null && this.bgF instanceof exP) {
            exP exP2 = (exP)this.bgF;
            exP2.lk(exP2.dmh());
        }
        super.bbS();
    }

    @Override
    public void E(QD qD) {
        short s = this.fHf();
        if (this.bgC != null) {
            int n = ((enk_0)this.bgC).a(0, s, ene_0.qPu);
            this.aQL = n > 0 ? 1 : 0;
        }
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
    public /* synthetic */ QD bbo() {
        return this.fFH();
    }
}

