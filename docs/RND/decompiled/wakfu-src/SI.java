/*
 * Decompiled with CFR 0.152.
 */
public class SI<T>
implements SH {
    private final T boX;
    private final short boY;

    public SI(T t, short s) {
        this.boX = t;
        this.boY = s;
    }

    @Override
    public int d() {
        return this.boX.hashCode();
    }

    @Override
    public short bdn() {
        return this.boY;
    }

    @Override
    public ang_2 bdo() {
        return null;
    }

    public T getValue() {
        return this.boX;
    }
}

