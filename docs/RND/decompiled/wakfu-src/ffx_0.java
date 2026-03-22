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
 * Renamed from ffX
 */
public final class ffx_0
extends Record {
    @NotNull
    private final ffV shA;
    private final short shB;

    public ffx_0(@NotNull ffV ffV2, short s) {
        this.shA = ffV2;
        this.shB = s;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ffx_0.class, "item;position", "shA", "shB"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ffx_0.class, "item;position", "shA", "shB"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ffx_0.class, "item;position", "shA", "shB"}, this, object);
    }

    @NotNull
    public ffV dRT() {
        return this.shA;
    }

    public short dRi() {
        return this.shB;
    }
}

