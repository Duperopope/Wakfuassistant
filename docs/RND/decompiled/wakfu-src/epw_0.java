/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ePW
 */
public final class epw_0
extends ero_0 {
    private static final aox_1 reJ = new enz_0(new eny_0("Params", new enx_0[0]));

    @Override
    public aox_1 bEt() {
        return reJ;
    }

    public epw_0() {
        this.bby();
    }

    public epw_0 fEZ() {
        epw_0 epw_02 = new epw_0();
        return epw_02;
    }

    @Override
    public void E(QD qD) {
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.fFa()) {
            this.fHg();
            return;
        }
        this.bgJ.bag().g((rj_0)((Object)this.bgF));
    }

    private boolean fFa() {
        return this.bgF == null || this.bgJ == null || this.bgJ.bag() == null || !(this.bgF instanceof rj_0);
    }

    @Override
    public void bbS() {
        if (this.fFa()) {
            return;
        }
        if (!this.rdU) {
            return;
        }
        this.bgJ.bag().f((rj_0)((Object)this.bgF));
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
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fEZ();
    }
}

