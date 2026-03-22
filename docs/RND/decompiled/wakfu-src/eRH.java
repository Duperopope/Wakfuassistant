/*
 * Decompiled with CFR 0.152.
 */
public class eRH
extends ero_0 {
    private static final aox_1 riu = new enz_0(new eny_0("modifie la cible de l'effet d\u00e9clench\u00e9 par le caster", new enx_0[0]));

    @Override
    public aox_1 bEt() {
        return riu;
    }

    public eRH fGX() {
        eRH eRH2 = new eRH();
        return eRH2;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (qD != null && bl && this.bgE != null) {
            qD.f(this.bgE);
        }
        this.mk(true);
    }

    @Override
    public void E(QD qD) {
        short s = this.fHf();
        if (this.bgC != null) {
            // empty if block
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
        return this.fGX();
    }
}

