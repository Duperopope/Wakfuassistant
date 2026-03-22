/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class bMV {
    private bMV() {
    }

    public static void a(frd frd2, fqP<bmx_0> fqP2, blh_2 blh_22) {
        if (blh_22 == null) {
            return;
        }
        if (fqP2 == null) {
            return;
        }
        if (frd2 == null) {
            return;
        }
        blg_2 blg_22 = blh_22.ck((byte)0);
        blg_2 blg_23 = blh_22.ck((byte)1);
        blg_22.clean();
        blg_23.clean();
        if (!frd2.al(aue_0.cVJ().cVK())) {
            return;
        }
        ArrayList<Integer> arrayList = frd2.eEu();
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            bmx_0 bmx_02;
            int n2 = arrayList.get(i);
            if (n2 == 0 || (bmx_02 = (bmx_0)fqP2.pc(n2)) == null) continue;
            if (i < 6) {
                blg_22.a(blb_2.a(fqu_0.sTq, bmx_02.LV(), bmx_02.avr(), bmx_02.aVt()), (short)i);
                continue;
            }
            blg_23.a(blb_2.a(fqu_0.sTq, bmx_02.LV(), bmx_02.avr(), bmx_02.aVt()), (short)(i % 6));
        }
        blg_22.ecY();
        blg_23.ecY();
    }
}

