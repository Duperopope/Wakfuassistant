/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;

/*
 * Renamed from baD
 */
class bad_0
implements aqg_1<aor_0> {
    bad_0(bac_0 bac_02) {
    }

    public void a(aor_0 aor_02) {
        int n = aor_02.d();
        aOS[] aOSArray = aor_02.cyu();
        TIntArrayList tIntArrayList = new TIntArrayList();
        for (aOS aOS2 : aOSArray) {
            tIntArrayList.add(aOS2.aGz());
        }
        boh_2.kJT.d(n, tIntArrayList.toArray());
    }

    @Override
    public /* synthetic */ void load(aqz_2 aqz_22) {
        this.a((aor_0)aqz_22);
    }
}

