/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.set.hash.TLongHashSet;

public final class eJX {
    public static final eJX qAX = new eJX();
    private final TLongHashSet qAY = new TLongHashSet();

    private eJX() {
    }

    public void pW(long l) {
        if (this.qAY.contains(l)) {
            this.qAY.remove(l);
        } else {
            this.qAY.add(l);
        }
    }

    public boolean pX(long l) {
        return this.qAY.contains(l);
    }
}

