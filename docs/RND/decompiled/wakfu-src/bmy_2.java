/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bmy
 */
class bmy_2
implements Comparator<bms_1> {
    static final bmy_2 iCb = new bmy_2();

    private bmy_2() {
    }

    public int a(bms_1 bms_12, bms_1 bms_13) {
        if (bms_13.dwn() == bms_12.dwn()) {
            return 0;
        }
        return bms_13.dwn() ? -1 : 1;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bms_1)object, (bms_1)object2);
    }
}

