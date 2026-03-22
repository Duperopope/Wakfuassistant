/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from azB
 */
class azb_1
implements Comparator<Integer> {
    azb_1() {
    }

    public int a(Integer n, Integer n2) {
        return n.compareTo(n2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Integer)object, (Integer)object2);
    }
}

