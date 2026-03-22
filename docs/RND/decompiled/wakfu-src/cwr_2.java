/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from cWR
 */
class cwr_2
implements Comparator<bst_2> {
    cwr_2(cwo_2 cwo_22) {
    }

    public int a(bst_2 bst_22, bst_2 bst_23) {
        return (int)(bst_22.emP() * 100.0f - bst_23.emP() * 100.0f);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bst_2)object, (bst_2)object2);
    }
}

