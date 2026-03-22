/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class aho
extends Record {
    private final ahn_0 cwT;
    private final boolean cwU;

    public aho(ahn_0 ahn_02, boolean bl) {
        this.cwT = ahn_02;
        this.cwU = bl;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aho.class, "mode;hideTaskBar", "cwT", "cwU"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aho.class, "mode;hideTaskBar", "cwT", "cwU"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aho.class, "mode;hideTaskBar", "cwT", "cwU"}, this, object);
    }

    public ahn_0 bAa() {
        return this.cwT;
    }

    public boolean bAb() {
        return this.cwU;
    }
}

