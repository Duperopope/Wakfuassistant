/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.list.array.TLongArrayList;

/*
 * Renamed from czy
 */
public final class czy_0
implements aaq_2<coj_0> {
    @Override
    public boolean a(coj_0 coj_02) {
        String string;
        TLongArrayList tLongArrayList = coj_02.ewz();
        if (tLongArrayList.isEmpty()) {
            string = aum_0.cWf().c("chat.notify.questSharedWithNobody", new Object[0]);
        } else {
            ahv_2 ahv_22 = new ahv_2();
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            eyp_1 eyp_12 = bgt_02.dnQ().dKL();
            int n = tLongArrayList.size();
            for (int i = 0; i < n; ++i) {
                if (i != 0) {
                    ahv_22.c(", ");
                }
                exz_1 exz_12 = eyp_12.rw(tLongArrayList.get(i));
                ahv_22.c(exz_12.getName());
            }
            string = aum_0.cWf().c("chat.notify.questSharedWith", ahv_22.ceL());
        }
        aPh.czg().iZ(string);
        return false;
    }

    @Override
    public int bkq() {
        return 13420;
    }
}

