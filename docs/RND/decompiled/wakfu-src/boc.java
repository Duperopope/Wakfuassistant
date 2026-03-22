/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class boc
extends Record {
    private final long iMu;
    private final int iMv;
    private final int iMw;

    boc(long l, int n, int n2) {
        this.iMu = l;
        this.iMv = n;
        this.iMw = n2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{boc.class, "characterId;year;month", "iMu", "iMv", "iMw"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{boc.class, "characterId;year;month", "iMu", "iMv", "iMw"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{boc.class, "characterId;year;month", "iMu", "iMv", "iMw"}, this, object);
    }

    public long dAt() {
        return this.iMu;
    }

    public int dAu() {
        return this.iMv;
    }

    public int dAv() {
        return this.iMw;
    }
}

