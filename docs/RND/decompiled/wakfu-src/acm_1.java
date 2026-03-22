/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

/*
 * Renamed from aCm
 */
class acm_1
implements Iterator<acd_1> {
    private final ack_1 dAD;
    private final boolean dAE;
    private final int dAF;
    private final int dAG;
    private int dAH;

    public acm_1(ack_1 ack_12) {
        this.dAD = ack_12;
        this.dAE = ack_12.bWN();
        if (this.dAE) {
            this.dAH = ack_12.bWP().getX();
            this.dAG = ack_12.bWQ().getX();
            this.dAF = ack_12.bWQ().getY();
        } else {
            this.dAH = ack_12.bWP().getY();
            this.dAG = ack_12.bWQ().getY();
            this.dAF = ack_12.bWQ().getX();
        }
    }

    @Override
    public boolean hasNext() {
        return this.dAH <= this.dAG;
    }

    public acd_1 bWS() {
        if (this.dAH > this.dAG) {
            throw new NoSuchElementException();
        }
        if (this.dAE) {
            return new acd_1(this.dAH++, this.dAF);
        }
        return new acd_1(this.dAF, this.dAH++);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public /* synthetic */ Object next() {
        return this.bWS();
    }
}

