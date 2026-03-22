/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aRG
 */
public class arg_0
extends aqo_0 {
    public static arg_0 eLr = new arg_0();

    private arg_0() {
    }

    @Override
    public List<are_0> cBT() {
        ArrayList<are_0> arrayList = new ArrayList<are_0>();
        evp_2 evp_22 = evp_2.H(aue_0.cVJ().cVO().cWq());
        block0: for (aqy_0 aqy_02 : aqy_0.values()) {
            evp_2[] evp_2Array;
            if (aqy_02.eFR) continue;
            if (evp_22 == evp_2.ovy) {
                arg_0.a(arrayList, aqy_02.eFU, aqy_02.eFV, aqy_02.eFS, aqy_02.eFT);
                continue;
            }
            for (evp_2 evp_23 : evp_2Array = aqy_02.eFS) {
                if (evp_23 != evp_22) continue;
                arg_0.a(arrayList, aqy_02.eFU, aqy_02.eFV, aqy_02.eFS, aqy_02.eFT);
                continue block0;
            }
        }
        arrayList.sort(new aRF());
        return arrayList;
    }
}

