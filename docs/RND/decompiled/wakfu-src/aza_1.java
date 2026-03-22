/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from azA
 */
class aza_1
implements Comparator<Long> {
    aza_1() {
    }

    public int a(Long l, Long l2) {
        return l.compareTo(l2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Long)object, (Long)object2);
    }
}

