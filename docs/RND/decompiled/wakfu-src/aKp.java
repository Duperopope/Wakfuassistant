/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.log4j.Logger;

public class aKp {
    private static final Logger eea = Logger.getLogger(aKp.class);
    private final aKm[][] eeb;
    private final rh_0 eec;
    private final TIntArrayList eed = new TIntArrayList();
    private int eee = Integer.MAX_VALUE;
    private int eef = Integer.MIN_VALUE;

    public aKp(rh_0 rh_02) {
        this.eec = rh_02;
        this.eeb = new aKm[rh_02.getWidth()][rh_02.getHeight()];
        this.b(rh_02);
        this.ciJ();
    }

    private void ciJ() {
        this.eed.clear();
        int n = this.eec.getWidth();
        int n2 = this.eec.getHeight();
        int n3 = this.eec.bgm();
        int n4 = this.eec.bgn();
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n2; ++j) {
                for (aKl aKl2 : this.eeb[i][j].edP) {
                    if (!this.eed.contains(aKl2.edJ)) {
                        this.eed.add(aKl2.edJ);
                    }
                    if (aKl2.ciG()) continue;
                    this.da(i + n3, j + n4);
                }
            }
        }
        this.eed.sort();
    }

    private void da(int n, int n2) {
        short s = this.eec.Z(n, n2);
        if (s == Short.MIN_VALUE) {
            return;
        }
        if (s > this.eef) {
            this.eef = s;
        }
        if (s < this.eee) {
            this.eee = s;
        }
    }

    private void b(rh_0 rh_02) {
        int n;
        int n2;
        int n3 = rh_02.getWidth();
        int n4 = rh_02.getHeight();
        int n5 = rh_02.bgm();
        int n6 = rh_02.bgn();
        short s = rh_02.bdI();
        short s2 = rh_02.bdJ();
        boolean[][] blArray = this.c(rh_02);
        for (int i = 0; i < n3; ++i) {
            for (n2 = 0; n2 < n4; ++n2) {
                if (blArray[i][n2]) {
                    n = rh_02.T(i + n5, n2 + n6) ? 1 : 0;
                    this.eeb[i][n2] = aKm.a(n != 0, i + n5, n2 + n6, (int)s, s2);
                    continue;
                }
                this.eeb[i][n2] = aKm.edQ;
            }
        }
        HashMap<Integer, Set<Integer>> hashMap = new HashMap<Integer, Set<Integer>>();
        n2 = 0;
        for (n = 0; n < n3; ++n) {
            for (int i = 0; i < n4; ++i) {
                n2 += this.a(n, i, s, s2, n4, n3, hashMap);
            }
        }
        while (n2 > 0) {
            n2 = 0;
            Set set = hashMap.entrySet();
            hashMap.clear();
            for (Map.Entry entry : set) {
                int n7 = (Integer)entry.getKey();
                Iterator iterator = ((Set)entry.getValue()).iterator();
                while (iterator.hasNext()) {
                    int n8 = (Integer)iterator.next();
                    n2 += this.a(n7, n8, s, s2, n4, n3, hashMap);
                }
            }
        }
    }

    private int a(int n, int n2, int n3, int n4, int n5, int n6, Map<Integer, Set<Integer>> map) {
        int n7 = aKm.a(n, n2, n3, n4, this.eeb);
        if (n7 == 0) {
            return 0;
        }
        if (n > 0) {
            map.putIfAbsent(n - 1, new HashSet());
            if (n2 > 0) {
                map.get(n - 1).add(n2 - 1);
            }
            if (n2 < n5 - 1) {
                map.get(n - 1).add(n2 + 1);
            }
        }
        map.putIfAbsent(n, new HashSet());
        if (n2 > 0) {
            map.get(n).add(n2 - 1);
        }
        if (n2 < n5 - 1) {
            map.get(n).add(n2 + 1);
        }
        if (n < n6 - 1) {
            map.putIfAbsent(n + 1, new HashSet());
            if (n2 > 0) {
                map.get(n + 1).add(n2 - 1);
            }
            if (n2 < n5 - 1) {
                map.get(n + 1).add(n2 + 1);
            }
        }
        return n7;
    }

    private boolean[][] c(rh_0 rh_02) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5 = rh_02.getWidth();
        int n6 = rh_02.getHeight();
        int n7 = rh_02.bgm();
        int n8 = rh_02.bgn();
        boolean[][] blArray = new boolean[rh_02.getWidth()][rh_02.getHeight()];
        for (n4 = 0; n4 < n5; ++n4) {
            n3 = -1;
            n2 = n6;
            for (n = 0; n < n6; ++n) {
                if (!rh_02.T(n4 + n7, n + n8)) continue;
                n3 = n;
                break;
            }
            for (n = n6 - 1; n >= n3; --n) {
                if (!rh_02.T(n4 + n7, n + n8)) continue;
                n2 = n;
                break;
            }
            n2 = Math.min(n6 - 1, n2);
            for (n = Math.max(0, n3); n <= n2; ++n) {
                blArray[n4][n] = true;
            }
            if (n3 == -1) continue;
            for (n = n3; n <= n2; ++n) {
                blArray[n4][n] = true;
            }
        }
        for (n4 = 0; n4 < n6; ++n4) {
            n3 = -1;
            n2 = n5;
            for (n = 0; n < n5; ++n) {
                if (!rh_02.T(n + n7, n4 + n8)) continue;
                n3 = n;
                break;
            }
            for (n = n5 - 1; n >= Math.max(0, n3); --n) {
                if (!rh_02.T(n + n7, n4 + n8)) continue;
                n2 = n;
                break;
            }
            n2 = Math.min(n5 - 1, n2);
            if (n3 == -1) continue;
            assert (n2 != n5);
            for (n = n3; n <= n2; ++n) {
                blArray[n][n4] = true;
            }
        }
        return blArray;
    }

    public aKn W(int n, int n2, int n3) {
        bKV bKV2;
        int n4;
        if (!this.eec.aK(n, n2)) {
            return null;
        }
        int n5 = n - this.eec.bgm();
        aKl aKl2 = this.eeb[n5][n4 = n2 - this.eec.bgn()].yQ(n3);
        if (aKl2 == null) {
            return null;
        }
        if (aKl2.edI > this.eef) {
            return null;
        }
        if (aKl2.edJ < this.eee) {
            return null;
        }
        int n6 = this.a(aKl2, n5, n4 + 1);
        int n7 = this.a(aKl2, n5 + 1, n4);
        int n8 = aKl2.ciF();
        if (aKl2.ciG() && (bKV2 = bLe.ecw().dQ(n, n2)) != null) {
            n8 += Math.min(bKV2.bpv(), 4);
        }
        return new aKn(aKl2.edL, n8, n8 - n6, n8 - n7, n, n2, aKl2.edM);
    }

    public wt_0 i(int n, int n2, short s) {
        return this.eec.i(n, n2, s);
    }

    public int ciK() {
        return this.eec.bdI();
    }

    public aKm db(int n, int n2) {
        if (!this.eec.aK(n, n2)) {
            return null;
        }
        return this.eeb[n - this.eec.bgm()][n2 - this.eec.bgn()];
    }

    public boolean aK(int n, int n2) {
        return this.eec.aK(n + this.eec.bgm(), n2 + this.eec.bgn());
    }

    private int a(aKl aKl2, int n, int n2) {
        if (!this.aK(n, n2)) {
            return this.eee;
        }
        short s = this.eec.Z(n + this.eec.bgm(), n2 + this.eec.bgn());
        if (s != Short.MIN_VALUE) {
            return s;
        }
        aKm aKm2 = this.eeb[n][n2];
        aKl aKl3 = aKm2.yR(aKl2.edJ);
        if (aKl3 == null) {
            return aKm2.edP.isEmpty() ? (int)this.eec.bdI() : aKl2.ciF();
        }
        return Math.max(aKl2.edI, aKl3.ciF());
    }

    public float eo(float f2) {
        int n = this.eed.indexOf((int)f2);
        return (float)n / (float)this.eed.size();
    }
}

