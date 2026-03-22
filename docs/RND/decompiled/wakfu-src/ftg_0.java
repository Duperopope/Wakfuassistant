/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

/*
 * Renamed from ftg
 */
public final class ftg_0
extends Record {
    private final int tfd;

    public ftg_0(int n) {
        this.tfd = n;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ftg_0.class, "id", "tfd"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ftg_0.class, "id", "tfd"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ftg_0.class, "id", "tfd"}, this, object);
    }

    public int cZa() {
        return this.tfd;
    }
}

