/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongIterator
 */
import gnu.trove.iterator.TLongIterator;

/*
 * Renamed from eTO
 */
public final class eto_0 {
    private eto_0() {
    }

    public static boolean qE(long l) {
        TLongIterator tLongIterator = fcL.rUh.sx(l).iterator();
        while (tLongIterator.hasNext()) {
            if (!Sb.bfy().dW(tLongIterator.next())) continue;
            return true;
        }
        return false;
    }
}

