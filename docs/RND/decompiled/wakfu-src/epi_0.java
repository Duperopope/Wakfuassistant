/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ePi
 */
public final class epi_0
extends ero_0 {
    private static final aox_1 rcV = new enz_0(new eny_0("Params", new enx_0[0]));

    @Override
    public aox_1 bEt() {
        return rcV;
    }

    public epi_0() {
        this.bby();
    }

    public epi_0 fDC() {
        epi_0 epi_02 = new epi_0();
        return epi_02;
    }

    @Override
    public void E(QD qD) {
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgF == null) {
            return;
        }
        this.d(qD, bl);
        if (this.bgF instanceof exP) {
            ((exP)this.bgF).djC();
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
    public void aVH() {
        super.aVH();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fDC();
    }
}

