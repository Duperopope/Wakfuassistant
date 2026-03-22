/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

/*
 * Renamed from cTk
 */
final class ctk_2
extends Record {
    private final boolean nIx;
    private final int nIy;

    ctk_2(boolean bl, int n) {
        this.nIx = bl;
        this.nIy = n;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ctk_2.class, "isMastery;count", "nIx", "nIy"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ctk_2.class, "isMastery;count", "nIx", "nIy"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ctk_2.class, "isMastery;count", "nIx", "nIy"}, this, object);
    }

    public boolean ePs() {
        return this.nIx;
    }

    public int aNR() {
        return this.nIy;
    }
}

