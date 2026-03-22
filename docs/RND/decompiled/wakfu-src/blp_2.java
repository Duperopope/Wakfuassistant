/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bLP
 */
class blp_2
implements Comparator<bmx_0> {
    blp_2() {
    }

    public int a(bmx_0 bmx_02, bmx_0 bmx_03) {
        byte by;
        eNd eNd2 = bmx_02.dTh();
        eNd eNd3 = bmx_03.dTh();
        byte by2 = eNd2.aJr();
        if (by2 != (by = eNd3.aJr())) {
            return by2 < by ? -1 : 1;
        }
        return bmx_02.cmL() < bmx_03.cmL() ? -1 : 1;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bmx_0)object, (bmx_0)object2);
    }
}

