/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.log4j.Logger;

/*
 * Renamed from bcb
 */
public final class bcb_1 {
    public static final bcb_1 hDb = new bcb_1();
    private static final Logger hDc = Logger.getLogger(bcb_1.class);
    private final TIntObjectHashMap<bcm_2> hDd = new TIntObjectHashMap();
    private final LinkedHashMap<Integer, bcc_1> hDe = new LinkedHashMap();
    private final TIntObjectHashMap<bbu_2> hDf = new TIntObjectHashMap();
    private final TIntObjectHashMap<bcj_1> hDg = new TIntObjectHashMap();
    private final TIntObjectHashMap<bcl_1> hDh = new TIntObjectHashMap();
    private final Map<Integer, Set<Integer>> hDi = new HashMap<Integer, Set<Integer>>();
    private final ArrayList<bcc_1> hDj = new ArrayList();
    private bcd_2 hDk;

    public boolean a(int n, String string, boolean bl) {
        this.hDd.put(n, (Object)new bcm_2(n, string, bl));
        return true;
    }

    public boolean a(int n, int n2, String string, String string2) {
        bcc_1 bcc_12 = this.hDe.get(n2);
        if (bcc_12 == null && n2 != 0) {
            hDc.error((Object)("Categorie parente non enregistr\u00e9e : " + n2));
            return false;
        }
        bcc_1 bcc_13 = new bcc_1(n, bcc_12, string, string2);
        if (bcc_12 != null) {
            bcc_12.a(bcc_13);
        }
        this.hDe.put(n, bcc_13);
        if (bcc_12 == null && !this.hDj.contains(bcc_13)) {
            this.hDj.add(bcc_13);
        }
        return true;
    }

    public boolean a(int n, int n2, boolean bl, boolean bl2, String string, String string2, ang_2 ang_22, int n3, long l, boolean bl3, boolean bl4, boolean bl5, int n4, int n5, boolean bl6, int n6, ux_0 ux_02, ua_0 ua_02, boolean bl7, boolean bl8, int n7, byte by, ang_2 ang_23, int n8, String string3, bbz_2 bbz_22, boolean bl9) {
        bcc_1 bcc_12 = this.hDe.get(n2);
        if (bcc_12 != null && !bcc_12.AQ(4)) {
            while (bcc_12.daD() != null && bcc_12.daD().daD() != null) {
                bcc_12 = bcc_12.daD();
            }
        }
        if (bcc_12 != null) {
            bbu_2 bbu_22 = new bbu_2(n, bcc_12, bl, bl2, string, string2, ang_22, n3, l, bl3, bl4, bl5, n4, n5, bl6, n6, ux_02, ua_02, bl8, n7, by, ang_23, n8, string3, bbz_22, bl9);
            bbu_22.T(bl7);
            this.hDf.put(n, (Object)bbu_22);
            bcc_12.e(bbu_22);
            return true;
        }
        hDc.error((Object)("La cat\u00e9gorie sp\u00e9cifi\u00e9e n'est pas enregistr\u00e9e : " + n2));
        return false;
    }

    public boolean a(int n, int n2, int[] nArray, String string, String string2, boolean bl, ang_2 ang_22, ang_2 ang_23, akr_0[] akr_0Array) {
        bbu_2 bbu_22 = (bbu_2)this.hDf.get(n2);
        if (bbu_22 != null) {
            bcm_2[] bcm_2Array = null;
            if (nArray != null && nArray.length > 0) {
                bcm_2Array = new bcm_2[nArray.length];
                for (int i = 0; i < nArray.length; ++i) {
                    bcm_2Array[i] = (bcm_2)this.hDd.get(nArray[i]);
                    if (bcm_2Array[i] != null) continue;
                    hDc.error((Object)("Une variable sp\u00e9cifi\u00e9e n'est pas enregistr\u00e9e : " + nArray[i]));
                    return false;
                }
            }
            bcj_1 bcj_12 = new bcj_1(n, bbu_22, bcm_2Array, string, string2, bl, akr_0Array);
            bcj_12.a(ang_22);
            bcj_12.b(ang_23);
            this.hDg.put(n, (Object)bcj_12);
            bbu_22.a(bcj_12);
            return true;
        }
        hDc.error((Object)("L'achievement sp\u00e9cifi\u00e9 n'est pas enregistr\u00e9 : " + n2));
        return false;
    }

    public boolean a(int n2, int n3, bby_2 bby_22, int[] nArray, boolean bl) {
        bbu_2 bbu_22 = (bbu_2)this.hDf.get(n3);
        if (bbu_22 == null) {
            hDc.error((Object)("L'achievement sp\u00e9cifi\u00e9 n'est pas enregistr\u00e9 : " + n3));
            return false;
        }
        if (bby_22 == null) {
            hDc.error((Object)("Le type de reward sp\u00e9cifi\u00e9 n'existe pas : " + String.valueOf((Object)bby_22)));
            return false;
        }
        bcl_1 bcl_12 = new bcl_1(n2, bbu_22, bby_22, nArray, bl);
        this.hDh.put(n2, (Object)bcl_12);
        bbu_22.a(bcl_12);
        if (bby_22 == bby_2.hCy) {
            int n4 = nArray[0];
            this.hDi.computeIfAbsent(n4, n -> new HashSet()).add(n3);
        }
        return true;
    }

    public bbu_2 AL(int n) {
        return (bbu_2)this.hDf.get(n);
    }

    public bcd_2 daB() {
        if (this.hDk == null) {
            this.hDk = new bcd_2(0, this.hDd, this.hDf);
        }
        return new bcd_2(this.hDk);
    }

    public bcc_1 AM(int n) {
        return this.hDe.get(n);
    }

    public ArrayList<bcc_1> daC() {
        return this.hDj;
    }

    public bcj_1 AN(int n) {
        return (bcj_1)this.hDg.get(n);
    }

    public PM de(String string) {
        TIntObjectIterator tIntObjectIterator = this.hDd.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            bcm_2 bcm_22 = (bcm_2)tIntObjectIterator.value();
            if (!bcm_22.getName().equals(string)) continue;
            return bcm_22;
        }
        return null;
    }

    public boolean a(TIntObjectProcedure<bbu_2> tIntObjectProcedure) {
        return this.hDf.forEachEntry(tIntObjectProcedure);
    }

    public boolean AO(int n) {
        return this.hDi.containsKey(n);
    }

    public List<bbu_2> AP(int n) {
        Set<Integer> set = this.hDi.get(n);
        if (set == null) {
            return Collections.emptyList();
        }
        ArrayList<bbu_2> arrayList = new ArrayList<bbu_2>(set.size());
        for (int n2 : set) {
            arrayList.add((bbu_2)this.hDf.get(n2));
        }
        return arrayList;
    }
}

