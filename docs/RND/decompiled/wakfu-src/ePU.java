/*
 * Decompiled with CFR 0.152.
 */
public class ePU
extends ero_0 {
    private static final aox_1 reH = new enz_0(new eny_0("Pas de params", new enx_0[0]));
    protected int qXs;

    @Override
    public aox_1 bEt() {
        return reH;
    }

    public ePU() {
    }

    public ePU(int n) {
        this.qXs = n;
        this.bby();
    }

    public ePU fEY() {
        ePU ePU2 = new ePU();
        ePU2.qXs = this.qXs;
        return ePU2;
    }

    @Override
    public void E(QD qD) {
    }

    @Override
    protected void c(QD qD, boolean bl) {
        if (this.bgF == null || this.bgF.baz() == null) {
            this.fHg();
            return;
        }
        ((ers_0)this.bgF.baz()).b(this.qXs, true, true);
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
    public /* synthetic */ QD bbo() {
        return this.fEY();
    }
}

