/*
 * Decompiled with CFR 0.152.
 */
public abstract class ceK<M extends aam_2, F extends bsS>
implements ceJ<M, F> {
    protected F jkR;
    private int lSB = 0;

    @Override
    public void k(F f2) {
        this.jkR = f2;
    }

    @Override
    public abstract boolean b(M var1);

    @Override
    public final int euJ() {
        return this.lSB;
    }

    @Override
    public final void KP(int n) {
        this.lSB = n;
    }
}

