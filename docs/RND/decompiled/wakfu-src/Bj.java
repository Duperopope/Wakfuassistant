/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Iterables
 */
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import java.util.Optional;
import java.util.function.Consumer;

public abstract class Bj<E, D> {
    public static <E, D> Bj<E, D> c(E e2) {
        return new Bl(e2);
    }

    public static <E, D> Bj<E, D> d(D d2) {
        return new Bm(d2);
    }

    public static <E, D> Iterable<E> aG(Iterable<Bj<E, D>> iterable) {
        return Iterables.transform((Iterable)Iterables.filter(iterable, (Predicate)Predicates.instanceOf(Bl.class)), (Function)new bk_0());
    }

    public abstract <E1> Bj<E1, D> a(Function<? super E, ? extends E1> var1);

    public abstract <D1> Bj<E, D1> b(Function<? super D, ? extends D1> var1);

    public abstract Bj<E, D> a(Bj<E, D> var1);

    public abstract boolean isValid();

    public boolean aHz() {
        return !this.isValid();
    }

    public abstract D aHA();

    public abstract E aHB();

    public Bj<E, D> b(Consumer<D> consumer) {
        if (this.isValid()) {
            consumer.accept(this.aHA());
        }
        return this;
    }

    public Bj<E, D> c(Consumer<E> consumer) {
        if (this.aHz()) {
            consumer.accept(this.aHB());
        }
        return this;
    }

    public <R> R a(Function<E, ? extends R> function, Function<D, ? extends R> function2) {
        if (this.aHz()) {
            return (R)function.apply(this.aHB());
        }
        return (R)function2.apply(this.aHA());
    }

    public Optional<D> aHC() {
        return (Optional)this.a(object -> Optional.empty(), Optional::ofNullable);
    }
}

