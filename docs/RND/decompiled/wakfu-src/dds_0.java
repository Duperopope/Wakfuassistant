/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.WeakHashMap;

/*
 * Renamed from dds
 */
final class dds_0 {
    private static final dds_0 ogJ = new dds_0();
    private final TIntObjectHashMap<ddr_0> ogK = new TIntObjectHashMap();
    private final TIntObjectHashMap<ddr_0> ogL = new TIntObjectHashMap();
    private final TIntObjectHashMap<chj_2> ogM = new TIntObjectHashMap();
    private final WeakHashMap<Integer, fem_1> ogN = new WeakHashMap();

    private dds_0() {
    }

    public static dds_0 fcD() {
        return ogJ;
    }

    public ddr_0 NR(int n) {
        return (ddr_0)this.ogL.get(n);
    }

    public void a(int n, ddr_0 ddr_02) {
        this.ogL.put(n, (Object)ddr_02);
    }

    public void NS(int n) {
        this.ogL.remove(n);
    }

    public void b(int n, ddr_0 ddr_02) {
        this.ogK.put(n, (Object)ddr_02);
    }

    public void NT(int n) {
        this.ogK.remove(n);
    }

    public ddr_0 NU(int n) {
        return (ddr_0)this.ogK.get(n);
    }

    public void a(int n, chj_2 chj_22) {
        this.ogM.put(n, (Object)chj_22);
    }

    public chj_2 NV(int n) {
        return (chj_2)this.ogM.get(n);
    }

    public chj_2 NW(int n) {
        return (chj_2)this.ogM.remove(n);
    }

    public void clear() {
        this.ogM.clear();
        this.ogK.clear();
        this.ogL.clear();
    }

    public void a(fem_1 fem_12) {
        this.ogN.put(fem_12.getAdviserId(), fem_12);
    }

    public fem_1 NX(int n) {
        return this.ogN.get(n);
    }

    public void NY(int n) {
        this.ogN.remove(n);
    }

    public Collection<fem_1> b(ZG zG) {
        ArrayList<fem_1> arrayList = new ArrayList<fem_1>();
        for (fem_1 fem_12 : this.ogN.values()) {
            if (fem_12.getTarget() != zG) continue;
            arrayList.add(fem_12);
        }
        return arrayList;
    }
}

