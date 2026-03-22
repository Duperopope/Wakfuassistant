/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bDW
 */
public final class bdw_0
extends Record {
    private final int jLT;
    @NotNull
    private final String jLU;

    public bdw_0(int n, @NotNull String string) {
        this.jLT = n;
        this.jLU = string;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bdw_0.class, "totalQuantity;countString", "jLT", "jLU"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bdw_0.class, "totalQuantity;countString", "jLT", "jLU"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bdw_0.class, "totalQuantity;countString", "jLT", "jLU"}, this, object);
    }

    public int dRF() {
        return this.jLT;
    }

    @NotNull
    public String dRI() {
        return this.jLU;
    }
}

