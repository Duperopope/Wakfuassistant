/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bst
 */
class bst_0
implements Comparator<bsu_0> {
    bst_0() {
    }

    public int a(bsu_0 bsu_02, bsu_0 bsu_03) {
        return bsu_02.dFY() - bsu_03.dFY();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bsu_0)object, (bsu_0)object2);
    }
}

