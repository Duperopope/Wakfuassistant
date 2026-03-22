/*
 * Decompiled with CFR 0.152.
 */
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

class ftK
implements Iterator<ftH> {
    private final long[] tgt;
    private int Yk;
    final /* synthetic */ ftJ tgu;

    ftK(ftJ ftJ2) {
        this.tgu = ftJ2;
        this.tgt = this.tgu.tgs.keys();
        this.Yk = 0;
    }

    @Override
    public boolean hasNext() {
        return this.Yk < this.tgt.length;
    }

    public ftH gmu() {
        ftH ftH2;
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        if ((ftH2 = (ftH)this.tgu.tgs.get(this.tgt[this.Yk++])) == null) {
            throw new ConcurrentModificationException();
        }
        return ftH2;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public /* synthetic */ Object next() {
        return this.gmu();
    }
}

