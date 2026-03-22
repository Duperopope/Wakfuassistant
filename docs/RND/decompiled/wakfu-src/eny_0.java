/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from eNy
 */
public class eny_0
extends aow_1 {
    public eny_0(String string, enx_0 ... enx_0Array) {
        super(string, (aou_1[])enx_0Array);
    }

    public eny_0(enx_0 ... enx_0Array) {
        super(enx_0Array);
    }

    @Override
    public final aou_1[] bdl() {
        ArrayList<aou_1> arrayList = new ArrayList<aou_1>();
        for (int i = 0; i < this.bEJ(); ++i) {
            aou_1 aou_12 = this.tl(i);
            arrayList.add(new aou_1(aou_12.bEI() + " (base)"));
            arrayList.add(new aou_1(aou_12.bEI() + " (incr)"));
        }
        aou_1[] aou_1Array = new aou_1[arrayList.size()];
        return arrayList.toArray(aou_1Array);
    }
}

