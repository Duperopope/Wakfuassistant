/*
 * Decompiled with CFR 0.152.
 */
public abstract class ePJ
extends eRJ {
    private static final int reo = 12;
    private int rep = 1;
    private boolean req = false;

    @Override
    protected void c(QD qD, boolean bl) {
        this.fHg();
        for (int i = 0; i < this.rep; ++i) {
            this.i((ero_0)qD);
            if (this.req && this.fHa() > 0) break;
        }
    }

    @Override
    public final void E(QD qD) {
        super.E(qD);
        this.rep = Math.min(12, this.I(qD));
        this.req = this.J(qD);
    }

    protected abstract int I(QD var1);

    protected abstract boolean J(QD var1);

    @Override
    public void aVH() {
        super.aVH();
        this.rep = 1;
    }

    @Override
    protected boolean fEL() {
        return false;
    }
}

