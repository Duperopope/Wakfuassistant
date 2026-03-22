/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from ftq
 */
public final class ftq_0
extends Record {
    private final int tfM;
    @NotNull
    private final Map<abi_1, fts_0> tfN;
    @NotNull
    private final Optional<ftg_0> tfO;
    public static final abi_1 tfP = abi_1.dzm;

    public ftq_0(int n, @NotNull Map<abi_1, fts_0> map, @NotNull Optional<ftg_0> optional) {
        this.tfM = n;
        this.tfN = map;
        this.tfO = optional;
    }

    public fts_0 glZ() {
        fts_0 fts_02 = this.tfN.get(tfP);
        if (fts_02 != null) {
            return fts_02;
        }
        return this.tfN.values().iterator().next();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ftq_0.class, "id;viewDataMap;barrierCategory", "tfM", "tfN", "tfO"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ftq_0.class, "id;viewDataMap;barrierCategory", "tfM", "tfN", "tfO"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ftq_0.class, "id;viewDataMap;barrierCategory", "tfM", "tfN", "tfO"}, this, object);
    }

    public int cZa() {
        return this.tfM;
    }

    @NotNull
    public Map<abi_1, fts_0> gma() {
        return this.tfN;
    }

    @NotNull
    public Optional<ftg_0> gmb() {
        return this.tfO;
    }
}

