/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

/*
 * Renamed from azH
 */
public class azh_1<E>
implements Iterator<E> {
    private final E[] dvQ;
    private final int dvR;
    private final boolean dvS;
    private int dvT = -1;

    public azh_1(E[] EArray, boolean bl) {
        this.dvQ = EArray;
        this.dvR = EArray.length;
        this.dvS = bl;
        this.bTF();
    }

    @Override
    public boolean hasNext() {
        return this.dvT < this.dvR;
    }

    @Override
    public E next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException("Array end reached. Array Size : " + this.dvR);
        }
        E e2 = this.dvQ[this.dvT];
        this.bTF();
        return e2;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    private void bTF() {
        if (this.dvS) {
            ++this.dvT;
        } else {
            ++this.dvT;
            while (this.dvT < this.dvR && this.dvQ[this.dvT] == null) {
                ++this.dvT;
            }
        }
    }
}

