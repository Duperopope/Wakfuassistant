/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

/*
 * Renamed from bpv
 */
final class bpv_0
extends Record {
    final int iVK;
    final double iVL;

    bpv_0(int n, double d2) {
        this.iVK = n;
        this.iVL = d2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bpv_0.class, "referenceId;dropRate", "iVK", "iVL"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bpv_0.class, "referenceId;dropRate", "iVK", "iVL"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bpv_0.class, "referenceId;dropRate", "iVK", "iVL"}, this, object);
    }

    public int cYt() {
        return this.iVK;
    }

    public double cYu() {
        return this.iVL;
    }
}

