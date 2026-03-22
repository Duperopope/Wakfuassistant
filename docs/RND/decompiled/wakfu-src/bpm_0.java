/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bpM
 */
public final class bpm_0
extends Record {
    private final long iXW;
    private final long iXX;

    public bpm_0(@Nullable Long l, @Nullable Long l2) {
        this(l == null ? Long.MIN_VALUE : l, l2 == null ? Long.MAX_VALUE : l2);
    }

    public bpm_0(long l, long l2) {
        this.iXW = l;
        this.iXX = l2;
    }

    boolean Fe(int n) {
        return this.iXW <= (long)n && (long)n <= this.iXX;
    }

    private boolean isValid() {
        return this.iXW != Long.MIN_VALUE || this.iXX != Long.MAX_VALUE;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bpm_0.class, "minValue;maxValue", "iXW", "iXX"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bpm_0.class, "minValue;maxValue", "iXW", "iXX"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bpm_0.class, "minValue;maxValue", "iXW", "iXX"}, this, object);
    }

    public long aVh() {
        return this.iXW;
    }

    public long aVg() {
        return this.iXX;
    }
}

