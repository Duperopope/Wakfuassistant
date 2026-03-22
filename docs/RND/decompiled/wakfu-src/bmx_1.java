/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bmx
 */
class bmx_1
implements Comparator<bms_1> {
    static final bmx_1 iCa = new bmx_1();

    private bmx_1() {
    }

    public int a(bms_1 bms_12, bms_1 bms_13) {
        return bms_12.dwk() - bms_13.dwk();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bms_1)object, (bms_1)object2);
    }
}

