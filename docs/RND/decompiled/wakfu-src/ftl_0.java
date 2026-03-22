/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from ftl
 */
public final class ftl_0
extends Record {
    private final int tfw;
    @NotNull
    private final Set<VN> tfx;
    private final int tfy;

    public ftl_0(int n, @NotNull Set<VN> set, int n2) {
        this.tfw = n;
        this.tfx = set;
        this.tfy = n2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ftl_0.class, "id;partitionCoords;maxPaddock", "tfw", "tfx", "tfy"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ftl_0.class, "id;partitionCoords;maxPaddock", "tfw", "tfx", "tfy"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ftl_0.class, "id;partitionCoords;maxPaddock", "tfw", "tfx", "tfy"}, this, object);
    }

    public int cZa() {
        return this.tfw;
    }

    @NotNull
    public Set<VN> glS() {
        return this.tfx;
    }

    public int glT() {
        return this.tfy;
    }
}

