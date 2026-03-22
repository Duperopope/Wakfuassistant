/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.custom_hash.TObjectIntCustomHashMap
 *  gnu.trove.map.hash.TObjectIntHashMap
 */
import gnu.trove.map.custom_hash.TObjectIntCustomHashMap;
import gnu.trove.map.hash.TObjectIntHashMap;
import java.util.ArrayList;

/*
 * Renamed from BV
 */
class bv_0 {
    final TObjectIntCustomHashMap<float[]> awh = new TObjectIntCustomHashMap(br_0.avQ, 10000);
    final TObjectIntCustomHashMap<float[]> awi = new TObjectIntCustomHashMap(br_0.avQ, 10000);
    final TObjectIntCustomHashMap<float[]> awj = new TObjectIntCustomHashMap(br_0.avQ, 10000);
    final TObjectIntHashMap<eh_2> awk = new TObjectIntHashMap(1000);
    final ArrayList<float[]> awl = new ArrayList(10000);
    final ArrayList<float[]> awm = new ArrayList(10000);
    final ArrayList<float[]> awn = new ArrayList(10000);
    final ArrayList<eh_2> awo = new ArrayList(1000);

    bv_0() {
    }

    public final int a(eh_2 eh_22) {
        int n = this.awk.get((Object)eh_22);
        if (n == 0) {
            this.awo.add(eh_22);
            n = this.awo.size();
            this.awk.put((Object)eh_22, n);
        }
        return n - 1;
    }

    public final int g(float ... fArray) {
        int n = this.awh.get((Object)fArray);
        if (n == 0) {
            this.awl.add(fArray);
            n = this.awl.size();
            this.awh.put((Object)fArray, n);
        }
        return n - 1;
    }

    public final int h(float ... fArray) {
        int n = this.awi.get((Object)fArray);
        if (n == 0) {
            this.awm.add(fArray);
            n = this.awm.size();
            this.awi.put((Object)fArray, n);
        }
        return n - 1;
    }

    public final int i(float ... fArray) {
        int n = this.awj.get((Object)fArray);
        if (n == 0) {
            this.awn.add(fArray);
            n = this.awn.size();
            this.awj.put((Object)fArray, n);
        }
        return n - 1;
    }

    public final void aIb() {
        this.awh.clear();
        this.awi.clear();
        this.awj.clear();
        this.awk.clear();
        this.awl.clear();
        this.awm.clear();
        this.awn.clear();
        this.awo.clear();
    }
}

