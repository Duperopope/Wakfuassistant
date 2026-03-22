/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  org.jetbrains.annotations.NotNull
 */
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.OptionalInt;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from ftj
 */
public final class ftj_0
extends Record {
    private final int tfn;
    private final int tfo;
    @NotNull
    private final Int2ObjectOpenHashMap<ftl_0> tfp;
    @NotNull
    private final Int2ObjectOpenHashMap<fti_0> tfq;
    @NotNull
    private final Optional<Integer> tfr;
    private final int tfs;

    public ftj_0(int n, int n2, @NotNull Int2ObjectOpenHashMap<ftl_0> int2ObjectOpenHashMap, @NotNull Int2ObjectOpenHashMap<fti_0> int2ObjectOpenHashMap2, @NotNull Optional<Integer> optional, int n3) {
        this.tfn = n;
        this.tfo = n2;
        this.tfp = int2ObjectOpenHashMap;
        this.tfq = int2ObjectOpenHashMap2;
        this.tfr = optional;
        this.tfs = n3;
    }

    public boolean el(int n, int n2) {
        VN vN = new VN(n, n2);
        for (ftl_0 ftl_02 : this.glO().values()) {
            if (!ftl_02.glS().contains(vN)) continue;
            return true;
        }
        return false;
    }

    public OptionalInt gD(int n, int n2) {
        int n3 = vz_0.qd(n);
        int n4 = vz_0.qe(n2);
        VN vN = new VN(n3, n4);
        for (Int2ObjectMap.Entry entry : this.glO().int2ObjectEntrySet()) {
            if (!((ftl_0)entry.getValue()).glS().contains(vN)) continue;
            return OptionalInt.of(entry.getIntKey());
        }
        return OptionalInt.empty();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ftj_0.class, "id;instanceId;sectors;bridges;requiredItemRefId;displayOrder", "tfn", "tfo", "tfp", "tfq", "tfr", "tfs"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ftj_0.class, "id;instanceId;sectors;bridges;requiredItemRefId;displayOrder", "tfn", "tfo", "tfp", "tfq", "tfr", "tfs"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ftj_0.class, "id;instanceId;sectors;bridges;requiredItemRefId;displayOrder", "tfn", "tfo", "tfp", "tfq", "tfr", "tfs"}, this, object);
    }

    public int cZa() {
        return this.tfn;
    }

    public int glN() {
        return this.tfo;
    }

    @NotNull
    public Int2ObjectOpenHashMap<ftl_0> glO() {
        return this.tfp;
    }

    @NotNull
    public Int2ObjectOpenHashMap<fti_0> glP() {
        return this.tfq;
    }

    @NotNull
    public Optional<Integer> glQ() {
        return this.tfr;
    }

    public int cZc() {
        return this.tfs;
    }
}

