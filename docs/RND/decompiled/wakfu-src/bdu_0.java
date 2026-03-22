/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bDU
 */
public final class bdu_0
extends Record {
    @NotNull
    final List<ffV> jLJ;
    private final int jLK;
    private final boolean jLL;
    private final boolean jLM;

    public bdu_0(@NotNull List<ffV> list, int n, boolean bl, boolean bl2) {
        this.jLJ = list;
        this.jLK = n;
        this.jLL = bl;
        this.jLM = bl2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bdu_0.class, "items;totalQuantity;warnForRarity;warnForShards", "jLJ", "jLK", "jLL", "jLM"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bdu_0.class, "items;totalQuantity;warnForRarity;warnForShards", "jLJ", "jLK", "jLL", "jLM"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bdu_0.class, "items;totalQuantity;warnForRarity;warnForShards", "jLJ", "jLK", "jLL", "jLM"}, this, object);
    }

    @NotNull
    public List<ffV> dRE() {
        return this.jLJ;
    }

    public int dRF() {
        return this.jLK;
    }

    public boolean dRG() {
        return this.jLL;
    }

    public boolean dRH() {
        return this.jLM;
    }
}

