/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bhy
 */
class bhy_0
implements Comparator<cqs_2> {
    bhy_0() {
    }

    public int a(cqs_2 cqs_22, cqs_2 cqs_23) {
        String string = aum_0.cWf().c("desc.mru." + cqs_22.ely(), new Object[0]);
        String string2 = aum_0.cWf().c("desc.mru." + cqs_23.ely(), new Object[0]);
        return string.compareTo(string2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((cqs_2)object, (cqs_2)object2);
    }
}

