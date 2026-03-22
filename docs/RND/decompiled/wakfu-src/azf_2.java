/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from azF
 */
abstract class azf_2<T> {
    final Comparator<T> dvP;

    azf_2(Comparator<T> comparator) {
        this.dvP = comparator;
    }

    public final int h(T t, T t2) {
        return this.dvP.compare(t, t2);
    }

    public abstract int a(azz_1<T> var1, T var2);
}

