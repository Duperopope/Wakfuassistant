/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bYz
 */
public final class byz_1
extends Record {
    @NotNull
    private final String lzM;
    @Nullable
    private final bya_1 lzN;

    public byz_1(@NotNull String string, @Nullable bya_1 bya_12) {
        this.lzM = string;
        this.lzN = bya_12;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{byz_1.class, "line;dataType", "lzM", "lzN"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{byz_1.class, "line;dataType", "lzM", "lzN"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{byz_1.class, "line;dataType", "lzM", "lzN"}, this, object);
    }

    @NotNull
    public String epf() {
        return this.lzM;
    }

    @Nullable
    public bya_1 epg() {
        return this.lzN;
    }
}

