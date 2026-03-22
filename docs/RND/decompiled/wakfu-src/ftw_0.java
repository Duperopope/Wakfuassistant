/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  org.jetbrains.annotations.NotNull
 */
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from ftw
 */
public final class ftw_0
extends Record {
    @NotNull
    private final Int2ObjectOpenHashMap<ftt_0> tge;

    public ftw_0(@NotNull Int2ObjectOpenHashMap<ftt_0> int2ObjectOpenHashMap) {
        this.tge = int2ObjectOpenHashMap;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ftw_0.class, "biomeDataMap", "tge"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ftw_0.class, "biomeDataMap", "tge"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ftw_0.class, "biomeDataMap", "tge"}, this, object);
    }

    @NotNull
    public Int2ObjectOpenHashMap<ftt_0> gml() {
        return this.tge;
    }
}

