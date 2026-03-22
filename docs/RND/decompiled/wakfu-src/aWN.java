/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongIterator
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.iterator.TLongIterator;
import gnu.trove.set.hash.TLongHashSet;

public final class aWN
extends aUV {
    private static final bsT hvG = new bsT();
    private TLongHashSet hvH;

    public aWN(int n, int n2, int n3, int n4) {
        super(n, n2, n3, n4);
    }

    @Override
    protected long cbk() {
        Object object;
        TLongIterator tLongIterator = this.hvH.iterator();
        StringBuilder stringBuilder = null;
        while (tLongIterator.hasNext()) {
            object = this.iD(tLongIterator.next());
            if (object == null) continue;
            if (stringBuilder == null) {
                stringBuilder = new StringBuilder();
            }
            stringBuilder.append(((exP)object).getName());
            if (!tLongIterator.hasNext()) continue;
            stringBuilder.append(", ");
        }
        if (stringBuilder == null) {
            return 0L;
        }
        object = new StringBuilder(aum_0.cWf().c("fight.waiting.for", new Object[0]));
        ((StringBuilder)object).append((CharSequence)stringBuilder);
        hvG.aq(object);
        return 0L;
    }

    public void a(TLongHashSet tLongHashSet) {
        this.hvH = tLongHashSet;
    }
}

