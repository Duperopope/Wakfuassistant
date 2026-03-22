/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * Renamed from cas
 */
public class cas_2 {
    public static final cas_2 lGp = new cas_2();
    public static final int lGq = 0x7FFFFFFE;
    private static final ArrayList<cau_2> lGr = new ArrayList();
    private static final TIntObjectHashMap<aeI> lGs = new TIntObjectHashMap();

    private static byte Ke(int n) {
        int n2 = Wa.qf(n);
        int n3 = n - n2 * 18;
        return (byte)n3;
    }

    private static byte Kf(int n) {
        int n2 = Wa.qg(n);
        int n3 = n - n2 * 18;
        return (byte)n3;
    }

    public void aPg() {
        lGs.forEachValue((TObjectProcedure)new cat_2(this));
    }

    public void i(adh adh2) {
        adG[] adGArray = adh2.but();
        ArrayList<adG> arrayList = new ArrayList<adG>();
        if (adGArray != null) {
            arrayList.addAll(Arrays.asList(adGArray));
        }
        int n = lGr.size();
        for (int i = 0; i < n; ++i) {
            cau_2 cau_22 = lGr.get(i);
            if (!adh2.bs(cau_22.lGt, cau_22.lGu)) continue;
            adG adG2 = new adG(cas_2.Ke(cau_22.lGt), cas_2.Kf(cau_22.lGu), 0, cau_22.lGv);
            arrayList.add(adG2);
        }
        adh2.a(arrayList.toArray(new adG[arrayList.size()]));
    }

    static {
        lGs.put(0x7FFFFFFE, (Object)new aeI(0x7FFFFFFE, 70500023L, 0.05f, true, true, 10, 25, 1.0f, 0, 0));
        lGr.add(new cau_2(0x7FFFFFFE, 0, -48));
    }
}

