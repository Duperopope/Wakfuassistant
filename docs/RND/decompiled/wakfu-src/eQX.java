/*
 * Decompiled with CFR 0.152.
 */
public final class eQX
extends ero_0 {
    private static final aox_1 rgQ = new enz_0(new eny_0("Annulation d'un lancer de sort", new enx_0[0]));

    @Override
    public aox_1 bEt() {
        return rgQ;
    }

    public eQX fFX() {
        eQX eQX2 = new eQX();
        return eQX2;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgF != null) {
            this.bgF.f(exe_1.rDR);
        }
    }

    @Override
    public void bbS() {
        if (this.bgF != null) {
            this.bgF.h(exe_1.rDR);
        }
        super.bbS();
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
    public void E(QD qD) {
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fFX();
    }
}

