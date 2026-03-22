/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from aoa
 */
public class aoa_1
extends aow_1 {
    public aoa_1(String string, aou_1 ... aou_1Array) {
        super(string, aou_1Array);
    }

    public aoa_1(aou_1 ... aou_1Array) {
        super(aou_1Array);
    }

    @Override
    public final aou_1[] bdl() {
        ArrayList<aou_1> arrayList = new ArrayList<aou_1>();
        for (int i = 0; i < this.bEJ(); ++i) {
            aou_1 aou_12 = this.tl(i);
            arrayList.add(new aou_1(aou_12.bEI()));
        }
        return arrayList.toArray(new aou_1[this.bEJ()]);
    }
}

