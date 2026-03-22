/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

/*
 * Renamed from eyX
 */
class eyx_0
implements Iterator<azx_1<Integer, Short>> {
    private int poB = -1;
    final /* synthetic */ eyw_0 poC;

    eyx_0(eyw_0 eyw_02) {
        this.poC = eyw_02;
    }

    @Override
    public boolean hasNext() {
        return this.poB < this.poC.poy.size() - 1;
    }

    public azx_1<Integer, Short> flW() {
        ++this.poB;
        return new azx_1<Integer, Short>(this.poC.poy.getQuick(this.poB), this.poC.poz.getQuick(this.poB));
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public /* synthetic */ Object next() {
        return this.flW();
    }
}

