/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

/*
 * Renamed from bGY
 */
final class bgy_1
extends Record {
    final long jXa;
    private final int jXb;

    bgy_1(long l, int n) {
        this.jXa = l;
        this.jXb = n;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bgy_1.class, "itemUid;position", "jXa", "jXb"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bgy_1.class, "itemUid;position", "jXa", "jXb"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bgy_1.class, "itemUid;position", "jXa", "jXb"}, this, object);
    }

    public long dUH() {
        return this.jXa;
    }

    public int dUI() {
        return this.jXb;
    }
}

