/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from azz
 */
public class azz_1<E>
extends ArrayList<E> {
    protected static final Logger dvH = Logger.getLogger(azz_1.class);
    private static final int dvI = 10;
    public static final Comparator<Long> dvJ = new aza_1();
    public static final Comparator<Integer> dvK = new azb_1();
    public static final Comparator<Short> dvL = new azc_1();
    public static final Comparator<Byte> dvM = new azd_1();
    public static final Comparator<String> dvN = new aze_1();
    private final azf_2<E> dvO;

    public azz_1(int n, azf_2<E> azf_22) {
        super(n);
        this.dvO = azf_22;
    }

    public azz_1(int n, Comparator<E> comparator) {
        super(n);
        this.dvO = new azg_2<E>(this, comparator);
    }

    public azz_1(azf_2<E> azf_22) {
        this(10, azf_22);
    }

    public azz_1(Comparator<E> comparator) {
        this(10, comparator);
    }

    @Override
    public boolean add(E e2) {
        int n = this.indexOf(e2);
        if (n < 0) {
            super.add(-(n + 1), e2);
        } else {
            super.add(n, e2);
        }
        return true;
    }

    @Override
    @Deprecated
    public void add(int n, E e2) {
        dvH.warn((Object)"Impossible d'inserer un \u00e9l\u00e9ment \u00e0 un index donn\u00e9.");
        this.add(e2);
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        if (collection instanceof azz_1 && this.size() == 0) {
            super.addAll(collection);
        } else {
            for (E e2 : collection) {
                this.add(e2);
            }
        }
        return !collection.isEmpty();
    }

    @Override
    @Deprecated
    public boolean addAll(int n, Collection<? extends E> collection) {
        dvH.warn((Object)"Impossible d'inserer des \u00e9l\u00e9ments \u00e0 un index donn\u00e9.");
        return this.addAll(collection);
    }

    private void i(Collection<? extends E> collection) {
        super.addAll(collection);
    }

    @Override
    public void addFirst(E e2) {
        boolean bl;
        boolean bl2 = bl = this.size() == 0 || this.g(e2, this.get(0)) <= 0;
        if (bl) {
            super.add(0, e2);
        }
    }

    @Override
    public void addLast(E e2) {
        boolean bl;
        int n = this.size();
        boolean bl2 = bl = n == 0 || this.g(this.get(n - 1), e2) <= 0;
        if (bl) {
            super.add(n, e2);
        }
    }

    @Override
    public Object clone() {
        azz_1<E> azz_12 = new azz_1<E>(this.size(), this.dvO);
        azz_12.i(this);
        return azz_12;
    }

    protected final int g(E e2, E e3) {
        return this.dvO.h(e2, e3);
    }

    @Override
    public boolean contains(Object object) {
        return this.indexOf(object) >= 0;
    }

    @Override
    public boolean containsAll(@NotNull Collection<?> collection) {
        Iterator<?> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (this.contains(iterator.next())) continue;
            return false;
        }
        return true;
    }

    @Override
    @Nullable
    public E getFirst() {
        return this.size() == 0 ? null : (E)this.get(0);
    }

    @Override
    @Nullable
    public E getLast() {
        int n = this.size();
        return n == 0 ? null : (E)this.get(--n);
    }

    @Override
    public int indexOf(Object object) {
        Object object2 = object;
        int n = this.U(object2);
        if (n < 0 || this.get(n).equals(object)) {
            return n;
        }
        int n2 = n;
        while (--n2 >= 0 && this.g(this.get(n2), object2) == 0 && !this.get(n2).equals(object)) {
        }
        if (n2 >= 0 && this.g(this.get(n2), object2) == 0 && this.get(n2).equals(object)) {
            return n2;
        }
        int n3 = Math.max(0, n2 + 1);
        n2 = n;
        int n4 = this.size();
        while (++n2 < n4 && this.g(this.get(n2), object2) == 0 && !this.get(n2).equals(object)) {
        }
        return n2 < n4 && this.g(this.get(n2), object2) == 0 && this.get(n2).equals(object) ? n2 : -(n3 + 1);
    }

    public int S(Object object) {
        int n = this.indexOf(object);
        if (n < 0) {
            return -1;
        }
        Object object2 = object;
        int n2 = this.size();
        while (--n >= 0 && this.g(this.get(n), object2) == 0) {
        }
        while (++n < n2 && this.g(this.get(n), object2) == 0 && !this.get(n).equals(object)) {
        }
        return n < n2 && this.g(this.get(n), object2) == 0 && this.get(n).equals(object) ? n : -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        int n = this.indexOf(object);
        if (n < 0) {
            return -1;
        }
        Object object2 = object;
        int n2 = this.size();
        while (++n < n2 && this.g(this.get(n), object2) == 0) {
        }
        while (--n >= 0 && this.g(this.get(n), object2) == 0 && !this.get(n).equals(object)) {
        }
        return n >= 0 && this.g(this.get(n), object2) == 0 && this.get(n).equals(object) ? n : -1;
    }

    public boolean T(E e2) {
        boolean bl;
        int n = super.lastIndexOf(e2);
        boolean bl2 = bl = n >= 0;
        if (bl) {
            int n2;
            for (n2 = n - 1; n2 >= 0 && this.get(n2).equals(e2); --n2) {
            }
            super.removeRange(++n2, ++n);
            int n3 = n - n2;
            if (n3 == 1) {
                super.add(-(this.indexOf(e2) + 1), e2);
            } else {
                ArrayList<E> arrayList = new ArrayList<E>(n3 + 1);
                for (int i = 0; i < n3; ++i) {
                    arrayList.add(i, e2);
                }
                super.addAll(-(this.indexOf(e2) + 1), arrayList);
            }
        }
        return bl;
    }

    @Override
    public boolean remove(Object object) {
        boolean bl;
        int n = this.indexOf(object);
        boolean bl2 = bl = n >= 0;
        if (bl) {
            super.remove(n);
        }
        return bl;
    }

    @Override
    public boolean removeAll(@NotNull Collection<?> collection) {
        int n = this.size();
        for (Object obj : collection) {
            int n2 = this.S(obj);
            if (n2 < 0) continue;
            super.removeRange(n2, this.lastIndexOf(obj) + 1);
        }
        return this.size() < n;
    }

    @Override
    public boolean retainAll(@NotNull Collection<?> collection) {
        int n = this.size();
        int n2 = n - 1;
        while (n2 >= 0) {
            if (collection.contains(this.get(n2))) {
                --n2;
                continue;
            }
            int n3 = n2;
            while (--n2 >= 0 && !collection.contains(this.get(n2))) {
            }
            super.removeRange(n2 + 1, n3 + 1);
        }
        return this.size() < n;
    }

    protected final int U(E e2) {
        return this.dvO.a(this, e2);
    }

    @Override
    @Deprecated
    public E set(int n, E e2) {
        Object e3 = super.remove(n);
        super.add(-(this.indexOf(e2) + 1), e2);
        return e3;
    }
}

