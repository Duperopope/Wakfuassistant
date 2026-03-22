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
 * Renamed from fts
 */
public final class fts_0
extends Record {
    @NotNull
    private final abi_1 tfS;
    private final int tfT;

    public fts_0(@NotNull abi_1 abi_12, int n) {
        this.tfS = abi_12;
        this.tfT = n;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fts_0.class, "direction;editorGroupId", "tfS", "tfT"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fts_0.class, "direction;editorGroupId", "tfS", "tfT"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fts_0.class, "direction;editorGroupId", "tfS", "tfT"}, this, object);
    }

    @NotNull
    public abi_1 gmd() {
        return this.tfS;
    }

    public int glK() {
        return this.tfT;
    }
}

