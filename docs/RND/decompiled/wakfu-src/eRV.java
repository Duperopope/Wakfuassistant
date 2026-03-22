/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Longs
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import com.google.common.primitives.Longs;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.Comparator;

class eRV
implements Comparator<Long> {
    private final TLongObjectHashMap<QD> rjc;

    eRV(TLongObjectHashMap<QD> tLongObjectHashMap) {
        this.rjc = tLongObjectHashMap;
    }

    public int a(Long l, Long l2) {
        int n;
        QD qD;
        int n2;
        QD qD2 = (QD)this.rjc.get(l.longValue());
        int n3 = qD2 == null ? Integer.MIN_VALUE : qD2.aZP();
        int n4 = -Longs.compare((long)n3, (long)(n2 = (qD = (QD)this.rjc.get(l2.longValue())) == null ? Integer.MIN_VALUE : qD.aZP()));
        if (n4 != 0) {
            return n4;
        }
        int n5 = qD2 == null ? 0 : qD2.aZH();
        n4 = Longs.compare((long)n5, (long)(n = qD == null ? 0 : qD.aZH()));
        if (n4 != 0) {
            return n4;
        }
        return Longs.compare((long)l, (long)l2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Long)object, (Long)object2);
    }
}

