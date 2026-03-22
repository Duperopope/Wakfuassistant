/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from fbX
 */
class fbx_0
implements Comparator<fcb_0> {
    fbx_0() {
    }

    public int a(fcb_0 fcb_02, fcb_0 fcb_03) {
        acc_1 acc_12 = fsu.aad(fcb_02.fRN());
        acc_1 acc_13 = fsu.aad(fcb_03.fRN());
        if (acc_12.bWx() == 0) {
            return 1;
        }
        if (acc_13.bWx() == 0) {
            return -1;
        }
        if (acc_12.bWy() == acc_13.bWy()) {
            return acc_12.bWx() - acc_13.bWx();
        }
        return acc_12.bWy() - acc_13.bWy();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((fcb_0)object, (fcb_0)object2);
    }
}

