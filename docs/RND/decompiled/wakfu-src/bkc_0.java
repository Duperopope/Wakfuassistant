/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Comparator;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bKC
 */
public final class bkc_0
extends Record {
    private final int kpj;
    @NotNull
    private final Optional<bkc_0> kpk;
    private final int kpl;
    public static final Comparator<bkc_0> kpm = Comparator.comparingInt(bkc_0::cZc).thenComparingInt(bkc_0::bDN);

    public bkc_0(int n, @NotNull Optional<bkc_0> optional, int n2) {
        this.kpj = n;
        this.kpk = optional;
        this.kpl = n2;
    }

    public int bDN() {
        return this.ebF().map(bkc_02 -> bkc_02.bDN() + 1).orElse(0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bkc_0.class, "id;parent;displayOrder", "kpj", "kpk", "kpl"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bkc_0.class, "id;parent;displayOrder", "kpj", "kpk", "kpl"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bkc_0.class, "id;parent;displayOrder", "kpj", "kpk", "kpl"}, this, object);
    }

    public int cZa() {
        return this.kpj;
    }

    @NotNull
    public Optional<bkc_0> ebF() {
        return this.kpk;
    }

    public int cZc() {
        return this.kpl;
    }
}

