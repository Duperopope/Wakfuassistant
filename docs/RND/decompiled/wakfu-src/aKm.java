/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.apache.log4j.Logger;

public class aKm {
    private static final wt_0[] edN = wt_0.blX();
    private static final Logger edO = Logger.getLogger(aKm.class);
    final List<aKl> edP = new ArrayList<aKl>(2);
    public static final aKm edQ = new aKm();

    private aKm() {
    }

    aKl yQ(int n) {
        for (int i = this.edP.size() - 1; i >= 0; --i) {
            if (this.edP.get((int)i).edJ != n) continue;
            return this.edP.get(i);
        }
        return null;
    }

    public aKl yR(int n) {
        aKl aKl2 = null;
        for (aKl aKl3 : this.edP) {
            if (aKl3.edJ > n || aKl2 != null && aKl3.edJ <= aKl2.edJ) continue;
            aKl2 = aKl3;
        }
        return aKl2;
    }

    static aKm a(boolean bl, int n, int n2, int n3, int n4) {
        wy_0 wy_02 = wa_0.aQ(n, n2);
        if (wy_02 == null) {
            return edQ;
        }
        int n5 = wy_02.bmp().a(n, n2, edN, 0);
        if (n5 == 0) {
            return edQ;
        }
        aKm aKm2 = new aKm();
        for (int i = 0; i < n5; ++i) {
            boolean bl2;
            short s = aKm.edN[i].ban;
            int n6 = s - aKm.edN[i].aXR;
            if (s < n3 || n6 > n4) continue;
            if (n6 < n3) {
                n6 = n3;
            }
            boolean bl3 = bl2 = bl && !wy_02.u(n, n2, s);
            if (s > n4) {
                bl2 = false;
            }
            if (aKm.edN[i].bNP == -1) {
                bl2 = false;
            }
            aKm2.edP.add(new aKl(n6, s, bl2, aKm.edN[i].bNr, 0));
        }
        return aKm2;
    }

    public static Optional<Integer> a(aKm aKm2) {
        return aKm2.edP.stream().filter(aKl2 -> !aKl2.ciG()).map(aKl2 -> aKl2.edJ).max(Integer::compareTo);
    }

    public static Optional<Integer> b(aKm aKm2) {
        return aKm2.edP.stream().filter(aKl::ciG).map(aKl2 -> aKl2.edJ).max(Integer::compareTo);
    }

    public static List<aKm> a(aKm[][] aKmArray, int n, int n2) {
        ArrayList<aKm> arrayList = new ArrayList<aKm>();
        if (n > 0) {
            arrayList.add(aKmArray[n - 1][n2]);
            if (n2 > 0) {
                arrayList.add(aKmArray[n - 1][n2 - 1]);
            }
            if (n2 < aKmArray[n].length - 1) {
                arrayList.add(aKmArray[n - 1][n2 + 1]);
            }
        }
        if (n2 > 0) {
            arrayList.add(aKmArray[n][n2 - 1]);
        }
        if (n < aKmArray.length - 1) {
            arrayList.add(aKmArray[n + 1][n2]);
            if (n2 > 0) {
                arrayList.add(aKmArray[n + 1][n2 - 1]);
            }
            if (n2 < aKmArray[n].length - 1) {
                arrayList.add(aKmArray[n + 1][n2 + 1]);
            }
        }
        if (n2 < aKmArray[n].length - 1) {
            arrayList.add(aKmArray[n][n2 + 1]);
        }
        return arrayList;
    }

    public static int a(int n, int n2, int n3, int n4, aKm[][] aKmArray) {
        int n5;
        aKm aKm2 = aKmArray[n][n2];
        HashMap<aKl, aKl> hashMap = new HashMap<aKl, aKl>();
        List<aKm> list = aKm.a(aKmArray, n, n2);
        for (aKl object : aKm2.edP) {
            int n6;
            if (!object.ciG()) continue;
            n5 = 0;
            int n7 = n3;
            int n8 = n3;
            for (aKm aKm3 : list) {
                Optional<Integer> optional = aKm.a(aKm3);
                n7 = Math.max(optional.orElse(n3), n7);
                n5 = optional.isPresent() ? 1 : 0;
                if (n5 != 0) continue;
                n8 = Math.max(aKm.b(aKm3).orElse(n8), n8);
            }
            if (n5 == 0) {
                if (n8 > n4) {
                    n8 = n4;
                }
                n6 = Math.min(object.edJ, n8);
            } else {
                if (n7 > n4) {
                    n7 = n4;
                }
                n6 = Math.min(object.edJ, n7 + 4);
            }
            if (n6 == object.edJ || object.edI > n6) continue;
            aKl aKl2 = aKl.a(object, n6 - object.edJ);
            hashMap.put(object, aKl2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            n5 = aKm2.edP.indexOf(entry.getKey());
            if (n5 == -1) {
                edO.warn((Object)"Missing Block in size uniformization");
                continue;
            }
            aKm2.edP.set(n5, (aKl)entry.getValue());
        }
        return hashMap.size();
    }
}

