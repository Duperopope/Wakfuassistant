/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bmP
 */
final class bmp_2
implements Comparator<bmq_1> {
    static final bmp_2 iEz = new bmp_2();

    private bmp_2() {
    }

    public int b(bmq_1 bmq_12, bmq_1 bmq_13) {
        if (bmq_12.dwb() != bmq_13.dwb()) {
            return bmq_12.dwb() - bmq_13.dwb();
        }
        if (!bmq_12.czo().equals(bmq_13.czo())) {
            String string = bmq_12.czo();
            String string2 = bmq_13.czo();
            return BH.i(string, string2);
        }
        String string = bmq_12.dvY();
        String string3 = bmq_13.dvY();
        return BH.i(string, string3);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.b((bmq_1)object, (bmq_1)object2);
    }
}

