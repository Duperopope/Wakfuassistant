/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from aCw
 */
class acw_1
implements Comparator<acs_1> {
    acw_1() {
    }

    public int b(acs_1 acs_12, acs_1 acs_13) {
        if (acs_12.bXl() < acs_13.bXl()) {
            return -1;
        }
        return acs_12.bXl() == acs_13.bXl() ? 0 : 1;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.b((acs_1)object, (acs_1)object2);
    }
}

