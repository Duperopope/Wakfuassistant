/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/*
 * Renamed from azK
 */
public class azk_1<E>
implements Iterator<E> {
    private final List<E> dvX;
    private final E[] dvY;
    private int cxt;
    private boolean dvZ;

    public azk_1(List<E> list) {
        this.dvX = list;
        this.dvY = list.toArray();
        for (int i = this.dvY.length - 1; 0 < i; --i) {
            azk_1.a(this.dvY, i, azk_1.a(this.dvY, GC.mR(i + 1), this.dvY[i]));
        }
        this.cxt = this.dvY.length;
        this.dvZ = true;
    }

    private static <E> E a(E[] EArray, int n, E e2) {
        E e3 = EArray[n];
        EArray[n] = e2;
        return e3;
    }

    @Override
    public boolean hasNext() {
        return 0 < this.cxt;
    }

    @Override
    public E next() {
        boolean bl = this.dvZ = this.cxt == 0;
        if (this.dvZ) {
            throw new NoSuchElementException();
        }
        return this.dvY[--this.cxt];
    }

    @Override
    public void remove() {
        if (this.dvZ) {
            throw new IllegalStateException();
        }
        this.dvZ = true;
        this.dvX.remove(this.dvY[this.cxt]);
    }
}

