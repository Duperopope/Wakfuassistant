/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from cWQ
 */
class cwq_1
implements Comparator<bst_2> {
    cwq_1(cwo_2 cwo_22) {
    }

    public int a(bst_2 bst_22, bst_2 bst_23) {
        return bst_22.emM() - bst_23.emM();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bst_2)object, (bst_2)object2);
    }
}

