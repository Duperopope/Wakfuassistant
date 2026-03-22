/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import org.apache.log4j.Logger;

/*
 * Renamed from czL
 */
public final class czl_0
implements aaq_2<crY> {
    private static final Logger mnn = Logger.getLogger(czl_0.class);

    @Override
    public boolean a(crY crY2) {
        TLongObjectIterator tLongObjectIterator = crY2.chB().iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            long l = tLongObjectIterator.key();
            byte[] byArray = (byte[])tLongObjectIterator.value();
            mnn.trace((Object)("[INTERACTIVE_ELEMENT_SPAWN_MESSAGE] Element id=" + l + ", data.length=" + byArray.length + " byte(s)"));
            bCA bCA2 = bCA.b(l, byArray);
            if (bCA2 == null) continue;
            bzj_2.eqi().k(bCA2);
        }
        return false;
    }

    @Override
    public int bkq() {
        return 12865;
    }
}

