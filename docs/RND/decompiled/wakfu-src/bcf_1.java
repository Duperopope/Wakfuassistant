/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from bcf
 */
class bcf_1
implements TIntObjectProcedure<bbu_2> {
    final /* synthetic */ bcd_2 hDD;

    bcf_1(bcd_2 bcd_22) {
        this.hDD = bcd_22;
    }

    public boolean a(int n, bbu_2 bbu_22) {
        Object object;
        bbu_2 bbu_23 = new bbu_2(bbu_22);
        this.hDD.hDv.put(n, (Object)bbu_23);
        ArrayList<bcj_1> arrayList = bbu_22.dau();
        int n2 = arrayList.size();
        for (int i = 0; i < n2; ++i) {
            bcj_1 bcj_12 = arrayList.get(i);
            object = bcj_12.daV();
            bcm_2[] bcm_2Array = new bcm_2[object != null ? ((bcm_2[])object).length : 0];
            if (object != null) {
                for (int j = 0; j < ((bcm_2[])object).length; ++j) {
                    bcm_2 bcm_22 = object[j];
                    bcm_2Array[j] = new bcm_2(bcm_22);
                    TIntArrayList tIntArrayList = (TIntArrayList)this.hDD.hDx.get(bcm_22.d());
                    if (tIntArrayList == null) {
                        tIntArrayList = new TIntArrayList();
                        this.hDD.hDx.put(bcm_22.d(), (Object)tIntArrayList);
                    }
                    tIntArrayList.add(bcj_12.d());
                }
            }
            bcj_1 bcj_13 = new bcj_1(bcj_12, bbu_23, (bcm_2[])(object != null ? bcm_2Array : null));
            bcj_13.a(bcj_12.daX());
            bcj_13.b(bcj_12.daY());
            bbu_23.a(bcj_13);
            this.hDD.hDw.put(bcj_13.d(), (Object)bcj_13);
        }
        ArrayList<bcl_1> arrayList2 = bbu_22.aFV();
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int n3 = arrayList2.size();
            for (n2 = 0; n2 < n3; ++n2) {
                object = arrayList2.get(n2);
                bbu_23.a((bcl_1)object);
            }
        }
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (bbu_2)object);
    }
}

