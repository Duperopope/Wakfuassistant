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

class Bl<E, D>
extends Bj<E, D> {
    private final E ats;

    @Override
    public boolean isValid() {
        return false;
    }

    @Override
    public D aHA() {
        throw new IllegalStateException("data is absent.");
    }

    @Override
    public E aHB() {
        return this.ats;
    }

    @Override
    public Bj<E, D> a(Bj<E, D> bj) {
        return this;
    }

    @Override
    public <E1> Bj<E1, D> a(Function<? super E, ? extends E1> function) {
        Preconditions.checkNotNull(function);
        return new Bl<Object, D>(function.apply(this.ats));
    }

    @Override
    public <D1> Bj<E, D1> b(Function<? super D, ? extends D1> function) {
        Preconditions.checkNotNull(function);
        return this;
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 * n2 + (this.ats == null ? 0 : this.ats.hashCode());
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
        Bl bl = (Bl)object;
        return Objects.equals(this.ats, bl.ats);
    }

    public String toString() {
        return String.format("Either Error [%s]", this.ats);
    }

    Bl(E e2) {
        this.ats = Preconditions.checkNotNull(e2);
    }
}

