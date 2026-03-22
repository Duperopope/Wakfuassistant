/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bmN
 */
class bmn_2
implements Comparator<bml_2> {
    bmn_2(bmm_2 bmm_22) {
    }

    public int a(bml_2 bml_22, bml_2 bml_23) {
        String string = bml_22.getName();
        String string2 = bml_23.getName();
        return BH.i(string, string2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bml_2)object, (bml_2)object2);
    }
}

