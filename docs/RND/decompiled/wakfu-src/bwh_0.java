/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bwH
 */
public abstract class bwh_0<T extends bwh_0> {
    private boolean jzE = true;

    public abstract boolean dLQ();

    public abstract void dMy();

    public abstract void dMz();

    public void hl(boolean bl) {
        this.dMz();
    }

    public abstract void a(T var1);

    final boolean dMS() {
        return this.jzE;
    }

    final void p(Runnable runnable) {
        this.jzE = false;
        runnable.run();
        this.jzE = true;
    }
}

