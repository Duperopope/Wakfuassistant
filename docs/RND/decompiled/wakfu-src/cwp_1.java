/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from cWP
 */
class cwp_1
implements Comparator<bst_2> {
    cwp_1(cwo_2 cwo_22) {
    }

    public int a(bst_2 bst_22, bst_2 bst_23) {
        String string = bst_22.eaw();
        String string2 = bst_23.eaw();
        if (string == null || string2 == null) {
            return 0;
        }
        return string.compareTo(string2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bst_2)object, (bst_2)object2);
    }
}

