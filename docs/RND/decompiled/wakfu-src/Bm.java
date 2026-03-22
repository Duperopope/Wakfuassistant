/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Preconditions
 */
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.Objects;

final class Bm<E, D>
extends Bj<E, D> {
    private final D att;

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public D aHA() {
        return this.att;
    }

    @Override
    public E aHB() {
        throw new IllegalStateException("error is absent.");
    }

    @Override
    public Bj<E, D> a(Bj<E, D> bj) {
        return bj;
    }

    @Override
    public <E1> Bj<E1, D> a(Function<? super E, ? extends E1> function) {
        Preconditions.checkNotNull(function);
        return this;
    }

    @Override
    public <D1> Bj<E, D1> b(Function<? super D, ? extends D1> function) {
        Preconditions.checkNotNull(function);
        return new Bm<E, Object>(function.apply(this.att));
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 * n2 + (this.att == null ? 0 : this.att.hashCode());
        return n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        Bm bm = (Bm)object;
        return Objects.equals(this.att, bm.att);
    }

    public String toString() {
        return String.format("Either Valid [%s]", this.att);
    }

    Bm(D d2) {
        this.att = d2;
    }
}

