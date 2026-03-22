/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from azD
 */
class azd_1
implements Comparator<Byte> {
    azd_1() {
    }

    public int a(Byte by, Byte by2) {
        return by.compareTo(by2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Byte)object, (Byte)object2);
    }
}

