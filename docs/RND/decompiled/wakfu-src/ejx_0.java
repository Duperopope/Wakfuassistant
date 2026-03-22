/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from eJx
 */
public final class ejx_0 {
    public static final ejx_0 qzT = new ejx_0();
    private static final Logger qzU = Logger.getLogger(ejx_0.class);
    private final TIntObjectHashMap<wd_0> qzV = new TIntObjectHashMap();
    private final TIntObjectHashMap<ejw_0> qzW = new TIntObjectHashMap();

    private ejx_0() {
    }

    public void a(int n, float f2, float f3, ang_2 ang_22, int n2, short s) {
        wd_0 wd_02 = new wd_0(n, f2, f3, ang_22, n2, s);
        this.qzV.put(n, (Object)wd_02);
    }

    public wd_0 Qc(int n) {
        return (wd_0)this.qzV.get(n);
    }

    public void i(int n, int[] nArray) {
        ArrayList<wd_0> arrayList = new ArrayList<wd_0>();
        int n2 = nArray.length;
        for (int i = 0; i < n2; ++i) {
            wd_0 wd_02 = (wd_0)this.qzV.get(nArray[i]);
            if (wd_02 != null) {
                arrayList.add(wd_02);
                continue;
            }
            qzU.error((Object)("Impossible de trouver le bonus correspondant, ID=" + nArray[i]));
        }
        ejw_0 ejw_02 = new ejw_0(n, arrayList.toArray(new wd_0[arrayList.size()]));
        this.qzW.put(n, (Object)ejw_02);
    }

    public ejw_0 Qd(int n) {
        return (ejw_0)this.qzW.get(n);
    }
}

