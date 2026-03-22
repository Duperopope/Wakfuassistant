/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jetbrains.annotations.NotNull;

final class fiI<D>
extends Record {
    @NotNull
    private final D ssK;
    private final int ssL;

    fiI(@NotNull D d2, int n) {
        this.ssK = d2;
        this.ssL = n;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fiI.class, "drop;cumulativeWeight", "ssK", "ssL"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fiI.class, "drop;cumulativeWeight", "ssK", "ssL"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fiI.class, "drop;cumulativeWeight", "ssK", "ssL"}, this, object);
    }

    @NotNull
    public D fZZ() {
        return this.ssK;
    }

    public int gaa() {
        return this.ssL;
    }
}

