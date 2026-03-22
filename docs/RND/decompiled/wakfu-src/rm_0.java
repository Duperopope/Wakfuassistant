/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.list.array.TLongArrayList;

/*
 * Renamed from Rm
 */
final class rm_0 {
    private final azy_2<TLongArrayList> bkF = new azy_2(2);

    rm_0() {
    }

    TLongArrayList U(byte by) {
        TLongArrayList tLongArrayList = this.bkF.aL(by);
        if (tLongArrayList == null) {
            tLongArrayList = new TLongArrayList();
            this.bkF.a(by, tLongArrayList);
        }
        return tLongArrayList;
    }

    void a(byte by, int n, int n2) {
        TLongArrayList tLongArrayList = this.U(by);
        tLongArrayList.add(GC.s(n, n2));
    }
}

