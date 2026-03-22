/*
 * Decompiled with CFR 0.152.
 */
public abstract class Yg<M extends YY, T>
extends Yb<M> {
    private T bTL;

    protected Yg(M m) {
        super(m);
    }

    protected abstract T getValue();

    public final T boq() {
        if (this.bTL == null) {
            this.bTL = this.getValue();
        }
        return this.bTL;
    }

    @Override
    public void qF(int n) {
        this.bTL = null;
    }

    public abstract float floatValue();

    public abstract int intValue();

    public abstract String bor();
}

