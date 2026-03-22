/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Consumer;

/*
 * Renamed from bEV
 */
public final class bev_0 {
    private static final Comparator<Integer> jSx = Comparator.comparing(n -> aum_0.cWf().b(15, (long)n.intValue(), new Object[0]));
    private static final bev_0 jSy = new bev_0();
    private final Map<Integer, fhp_0> jSz = new TreeMap<Integer, fhp_0>(jSx);
    private final Collection<Integer> jSA = new TreeSet<Integer>(jSx);
    private final Collection<Integer> jSB = new TreeSet<Integer>(jSx);

    public static bev_0 dSZ() {
        return jSy;
    }

    private bev_0() {
    }

    public boolean GA(int n) {
        return this.jSz.containsKey(n) || this.jSA.contains(n) || this.jSB.contains(n);
    }

    public void a(int n, fhp_0 fhp_02) {
        if (fhp_02.dCF() == fhr_0.sqz) {
            this.jSz.put(n, fhp_02);
        } else if (fhp_02.dCF() == fhr_0.sqy) {
            this.jSA.add(n);
        } else if (fhp_02.dCF() == fhr_0.sqx) {
            this.jSB.add(n);
        }
    }

    public Collection<Integer> dTa() {
        return Collections.unmodifiableCollection(this.jSA);
    }

    public Collection<Integer> dTb() {
        return Collections.unmodifiableCollection(this.jSB);
    }

    public void m(Consumer<Integer> consumer) {
        this.jSz.keySet().forEach(consumer);
        this.jSA.forEach(consumer);
        this.jSB.forEach(consumer);
    }

    public void a(fjd[] fjdArray, boolean bl, Consumer<Map.Entry<Integer, fhp_0>> consumer) {
        rd_0[] rd_0Array = bev_0.a(fjdArray);
        for (Map.Entry<Integer, fhp_0> entry : this.jSz.entrySet()) {
            if (!bev_0.a(entry.getValue().fZe(), rd_0Array, bl)) continue;
            consumer.accept(entry);
        }
    }

    private static rd_0[] a(fjd[] fjdArray) {
        rd_0[] rd_0Array = new rd_0[fjdArray.length];
        block4: for (int i = 0; i < rd_0Array.length; ++i) {
            switch (fjdArray[i]) {
                case swG: 
                case swH: {
                    rd_0Array[i] = rd_0.bjE;
                    continue block4;
                }
                case swB: 
                case swC: 
                case swD: 
                case swE: 
                case swF: {
                    rd_0Array[i] = fjdArray[i].gaH();
                    continue block4;
                }
            }
        }
        return rd_0Array;
    }

    private static boolean a(rd_0[] rd_0Array, rd_0[] rd_0Array2, boolean bl) {
        if (bl) {
            for (int i = 0; i <= rd_0Array2.length - rd_0Array.length; ++i) {
                if (!bev_0.a(rd_0Array, rd_0Array2, i)) continue;
                return true;
            }
            return false;
        }
        return bev_0.a(rd_0Array, rd_0Array2);
    }

    private static boolean a(rd_0[] rd_0Array, rd_0[] rd_0Array2, int n) {
        for (int i = 0; i < rd_0Array.length; ++i) {
            if (rd_0Array2[n + i] == rd_0.bjE && rd_0Array[i] != rd_0.bjA || rd_0Array[i] == rd_0Array2[n + i]) continue;
            return false;
        }
        return true;
    }

    private static boolean a(rd_0[] rd_0Array, rd_0[] rd_0Array2) {
        byte by;
        int[] nArray = bev_0.b(rd_0Array);
        int[] nArray2 = bev_0.b(rd_0Array2);
        if (nArray2[by = rd_0.bjE.aJr()] < nArray[by]) {
            return false;
        }
        byte by2 = by;
        nArray2[by2] = nArray2[by2] - nArray[by];
        int n = 0;
        for (rd_0 rd_02 : rd_0.bjG) {
            n += Math.max(0, nArray[rd_02.aJr()] - nArray2[rd_02.aJr()]);
        }
        return n <= nArray2[by];
    }

    private static int[] b(rd_0[] rd_0Array) {
        int[] nArray = new int[rd_0.bjI];
        for (rd_0 rd_02 : rd_0Array) {
            byte by = rd_02.aJr();
            nArray[by] = nArray[by] + 1;
        }
        return nArray;
    }
}

