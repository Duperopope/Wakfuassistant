/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ePA
 */
public class epa_0
extends ero_0 {
    private static final aox_1 rdO = new enz_0(new eny_0("Standard", new enx_0[0]), new eny_0("Affichage flottant (ExecutionStatusConstants)", new enx_0("", eNA.qYC)), new eny_0("2 params", new enx_0("1", eNA.qYC), new enx_0("2", eNA.qYC)));

    @Override
    public aox_1 bEt() {
        return rdO;
    }

    public epa_0 fEz() {
        return new epa_0();
    }

    @Override
    public void bby() {
        super.bby();
    }

    @Override
    protected void c(QD qD, boolean bl) {
    }

    @Override
    public void E(QD qD) {
        if (this.bgC != null && ((enk_0)this.bgC).fAn() > 0) {
            this.fh((byte)((enk_0)this.bgC).a(0, (short)0, ene_0.qPu));
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
    public void bbS() {
        super.bbS();
    }

    @Override
    public boolean bce() {
        return true;
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fEz();
    }
}

