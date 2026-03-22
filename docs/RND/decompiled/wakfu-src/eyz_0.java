/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from eyZ
 */
class eyz_0
implements Comparator<eyw_0> {
    eyz_0() {
    }

    public int a(eyw_0 eyw_02, eyw_0 eyw_03) {
        long l = eyw_03.aay() - eyw_02.aay();
        if (l > 0L) {
            return 1;
        }
        if (l < 0L) {
            return -1;
        }
        return 0;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((eyw_0)object, (eyw_0)object2);
    }
}

