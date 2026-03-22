/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bmz
 */
class bmz_1
implements Comparator<bms_1> {
    static final bmz_1 iCc = new bmz_1();

    private bmz_1() {
    }

    public int a(bms_1 bms_12, bms_1 bms_13) {
        return bms_13.cmL() - bms_12.cmL();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bms_1)object, (bms_1)object2);
    }
}

