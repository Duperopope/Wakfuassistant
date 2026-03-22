/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jetbrains.annotations.NotNull;

public final class ffY
extends Record {
    @NotNull
    private final ffV shC;
    private final short shD;

    public ffY(@NotNull ffV ffV2, short s) {
        this.shC = ffV2;
        this.shD = s;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ffY.class, "item;quantity", "shC", "shD"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ffY.class, "item;quantity", "shC", "shD"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ffY.class, "item;quantity", "shC", "shD"}, this, object);
    }

    @NotNull
    public ffV dRT() {
        return this.shC;
    }

    public short fWB() {
        return this.shD;
    }
}

