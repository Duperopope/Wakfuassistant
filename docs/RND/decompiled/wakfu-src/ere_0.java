/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eRE
 */
public class ere_0
extends ero_0 {
    private static final aox_1 rip = new enz_0(new eny_0("modifie le caster de l'effet d\u00e9clench\u00e9 par la cible (le porteur de cet effet)", new enx_0[0]));

    @Override
    public aox_1 bEt() {
        return rip;
    }

    public ere_0 fGU() {
        ere_0 ere_02 = new ere_0();
        return ere_02;
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (qD != null && bl && qD.bbd() != null) {
            qD.e(qD.bbd());
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
        return this.fGU();
    }
}

