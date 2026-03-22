/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class aYK
extends Record {
    private final boolean hxU;
    final int hxV;
    final double hxW;

    aYK(boolean bl, int n, double d2) {
        this.hxU = bl;
        this.hxV = n;
        this.hxW = d2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aYK.class, "isLootList;referenceId;dropRate", "hxU", "hxV", "hxW"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aYK.class, "isLootList;referenceId;dropRate", "hxU", "hxV", "hxW"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aYK.class, "isLootList;referenceId;dropRate", "hxU", "hxV", "hxW"}, this, object);
    }

    public boolean cqk() {
        return this.hxU;
    }

    public int cYt() {
        return this.hxV;
    }

    public double cYu() {
        return this.hxW;
    }
}

