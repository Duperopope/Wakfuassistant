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
 * Renamed from ftn
 */
public final class ftn_0
extends Record {
    private final int tfD;
    @NotNull
    private final Int2ObjectOpenHashMap<ftm_0> tfE;

    public ftn_0(int n, @NotNull Int2ObjectOpenHashMap<ftm_0> int2ObjectOpenHashMap) {
        this.tfD = n;
        this.tfE = int2ObjectOpenHashMap;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ftn_0.class, "id;costs", "tfD", "tfE"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ftn_0.class, "id;costs", "tfD", "tfE"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ftn_0.class, "id;costs", "tfD", "tfE"}, this, object);
    }

    public int cZa() {
        return this.tfD;
    }

    @NotNull
    public Int2ObjectOpenHashMap<ftm_0> glW() {
        return this.tfE;
    }
}

