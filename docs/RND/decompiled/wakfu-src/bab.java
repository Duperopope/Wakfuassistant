/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

final class bab
extends Record {
    private final int hyH;
    private final Optional<Integer> hyI;
    private final int hyJ;

    bab(int n, Optional<Integer> optional, int n2) {
        this.hyH = n;
        this.hyI = optional;
        this.hyJ = n2;
    }

    Optional<bkc_0> cYZ() {
        Optional<bkc_0> optional;
        if (this.cZb().isPresent()) {
            Optional<bkc_0> optional2 = bkd_0.ebG().HO(this.cZb().get());
            if (optional2.isEmpty()) {
                return Optional.empty();
            }
            optional = optional2;
        } else {
            optional = Optional.empty();
        }
        return Optional.of(new bkc_0(this.cZa(), optional, this.cZc()));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bab.class, "id;parentId;displayOrder", "hyH", "hyI", "hyJ"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bab.class, "id;parentId;displayOrder", "hyH", "hyI", "hyJ"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bab.class, "id;parentId;displayOrder", "hyH", "hyI", "hyJ"}, this, object);
    }

    public int cZa() {
        return this.hyH;
    }

    public Optional<Integer> cZb() {
        return this.hyI;
    }

    public int cZc() {
        return this.hyJ;
    }
}

