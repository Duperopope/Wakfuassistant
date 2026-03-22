/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

/*
 * Renamed from bYG
 */
public final class byg_1
extends Record {
    private final int lAr;
    private final int lAs;
    private final int lAt;

    public byg_1(int n, int n2, int n3) {
        this.lAr = n;
        this.lAs = n2;
        this.lAt = n3;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{byg_1.class, "fadeInMs;fullyVisibleMs;fadeOutMs", "lAr", "lAs", "lAt"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{byg_1.class, "fadeInMs;fullyVisibleMs;fadeOutMs", "lAr", "lAs", "lAt"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{byg_1.class, "fadeInMs;fullyVisibleMs;fadeOutMs", "lAr", "lAs", "lAt"}, this, object);
    }

    public int epk() {
        return this.lAr;
    }

    public int epl() {
        return this.lAs;
    }

    public int epm() {
        return this.lAt;
    }
}

