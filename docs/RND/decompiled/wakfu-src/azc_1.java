/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from azC
 */
class azc_1
implements Comparator<Short> {
    azc_1() {
    }

    public int a(Short s, Short s2) {
        return s.compareTo(s2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Short)object, (Short)object2);
    }
}

