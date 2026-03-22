/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bmW
 */
class bmw_2
implements Comparator<bmj_2> {
    bmw_2(bmv_1 bmv_12) {
    }

    public int a(bmj_2 bmj_22, bmj_2 bmj_23) {
        return bmj_22.aHb() - bmj_23.aHb();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bmj_2)object, (bmj_2)object2);
    }
}

