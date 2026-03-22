/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from eWe
 */
class ewe_2
implements Comparator<Object> {
    ewe_2() {
    }

    @Override
    public int compare(Object object, Object object2) {
        int n = ((eum_0)object).ffX();
        int n2 = ((eum_0)object2).ffX();
        return Integer.compare(n2, n);
    }
}

