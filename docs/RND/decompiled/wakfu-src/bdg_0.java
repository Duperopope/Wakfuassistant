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
 * Renamed from bDG
 */
public final class bdg_0
extends Record {
    @NotNull
    private final ffs_0 jKP;
    private final short jKQ;

    public bdg_0(@NotNull ffs_0 ffs_02, short s) {
        this.jKP = ffs_02;
        this.jKQ = s;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bdg_0.class, "bag;position", "jKP", "jKQ"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bdg_0.class, "bag;position", "jKP", "jKQ"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bdg_0.class, "bag;position", "jKP", "jKQ"}, this, object);
    }

    @NotNull
    public ffs_0 dRh() {
        return this.jKP;
    }

    public short dRi() {
        return this.jKQ;
    }
}

