/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bmC
 */
class bmc_2
implements Comparator<bms_1> {
    static final bmc_2 iCf = new bmc_2();

    private bmc_2() {
    }

    public int a(bms_1 bms_12, bms_1 bms_13) {
        if (bms_13.dwn()) {
            return bms_12.dwn() ? 0 : -1;
        }
        if (bms_12.dwn()) {
            return 1;
        }
        if (bms_12.dwp() == bms_13.dwp()) {
            return bms_12.getName().compareTo(bms_13.getName());
        }
        return bms_13.dwp() ? -1 : 1;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bms_1)object, (bms_1)object2);
    }
}

