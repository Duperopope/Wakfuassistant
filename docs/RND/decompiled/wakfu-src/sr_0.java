/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.map.hash.TLongByteHashMap
 *  gnu.trove.map.hash.TLongIntHashMap
 *  gnu.trove.map.hash.TLongShortHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.map.hash.TLongByteHashMap;
import gnu.trove.map.hash.TLongIntHashMap;
import gnu.trove.map.hash.TLongShortHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from SR
 */
public class sr_0 {
    private static final Logger bpV = Logger.getLogger(sr_0.class);
    private static final boolean bpW = false;
    private static final Logger bpX = Logger.getLogger((String)"debug");
    public static final int bpY = -1;
    public static final int bpZ = 128;
    public static int bqa = 1024;
    public static final int bqb = 3;
    public static int bqc = bqa * 3;
    private static final float bqd = 1.4f;
    private static final float[] bqe = new float[]{0.0f, 0.0f, 0.5f, 2.5f, 3.5f};
    private static final float bqf = 0.9f;
    private static final float bqg = 10.0f;
    public static final anp_2 bqh = anp_2.cKu;
    private static final int[][] bqi = new int[][]{{1, 0, 1}, {-1, 0, 4}, {0, 1, 2}, {0, -1, 8}, {1, 1, 3}, {-1, 1, 6}, {-1, -1, 12}, {1, -1, 9}};
    private static final int[][] bqj = new int[][]{{0, 1, 2}, {0, -1, 8}, {1, 0, 1}, {-1, 0, 4}, {1, 1, 3}, {-1, 1, 6}, {-1, -1, 12}, {1, -1, 9}};
    private int bpP;
    private short bqk;
    protected byte bpR;
    protected final TLongArrayList bql = new TLongArrayList();
    protected long bqm;
    private wz_0 bpc;
    private st_0 bqn;
    private final sq_0 bqo = new sq_0();
    protected short bqp;
    protected long[] bqq = new long[128];
    private final ss_0[] bqr;
    private short bqs;
    private final wt_0[] bqt;
    private short bqu;
    private final ss_0[] bqv = new ss_0[bqa];
    private short bqw = (short)-1;
    private short bqx = (short)-1;
    private final TLongIntHashMap bqy = new TLongIntHashMap();
    private final TLongByteHashMap bqz = new TLongByteHashMap();
    private final TLongShortHashMap bqA = new TLongShortHashMap();

    protected sr_0() {
        int n;
        this.bqr = new ss_0[bqa];
        for (n = 0; n < bqa; ++n) {
            this.bqr[n] = new ss_0();
        }
        this.bqt = new wt_0[bqc];
        for (n = 0; n < bqc; ++n) {
            this.bqt[n] = new wt_0();
        }
    }

    public static sr_0 pg(int n) {
        bqa = n;
        bqc = bqa * 3;
        return sr_0.bgd();
    }

    public static sr_0 bgd() {
        sr_0 sr_02 = new sr_0();
        sr_02.aVI();
        return sr_02;
    }

    public void aZp() {
        this.aVH();
    }

    public void aVI() {
    }

    public void aVH() {
        this.bpP = 0;
        this.bqk = 0;
        this.bpR = 0;
        this.bqs = 0;
        this.bqu = 0;
        this.bqw = (short)-1;
        this.bqx = (short)-1;
        this.bqy.clear();
        this.bqz.clear();
        this.bqA.clear();
        this.bql.reset();
        this.bpc = null;
        this.bqp = (short)-1;
        this.bqm = -1L;
        this.bqo.a(0, (byte)-1, -1, true);
        this.bqn = null;
    }

    public final void b(wz_0 wz_02) {
        this.bpc = wz_02;
    }

    public void a(st_0 st_02) {
        this.bqn = st_02;
    }

    public void a(int n, byte by, short s) {
        this.bpP = n;
        this.bqk = s;
        this.bpR = by;
        this.bqo.a(n, by, s, true);
    }

    public void bge() {
        this.bql.reset();
    }

    public void p(int n, int n2, short s) {
        this.bql.add(sr_0.r(n, n2, s));
    }

    public void l(acd_1 acd_12) {
        this.bql.add(sr_0.r(acd_12.getX(), acd_12.getY(), acd_12.bdi()));
    }

    public void q(int n, int n2, short s) {
        this.bqm = sr_0.r(n, n2, s);
    }

    public void m(acd_1 acd_12) {
        assert (acd_12 != null) : "can't define a null cell as the destination";
        this.bqm = sr_0.r(acd_12.getX(), acd_12.getY(), acd_12.bdi());
    }

    public short bgf() {
        return this.bqp;
    }

    public long[] bgg() {
        return this.bqq;
    }

    public final anp_2 bgh() {
        if (this.bqp == -1) {
            return bqh;
        }
        anp_2 anp_22 = new anp_2(this.bqp);
        for (int i = 0; i < this.bqp; ++i) {
            long l = this.bqq[this.bqp - 1 - i];
            int n = sr_0.dY(l);
            int n2 = sr_0.dZ(l);
            short s = sr_0.ea(l);
            anp_22.a(i, n, n2, s);
        }
        return anp_22;
    }

    public final anp_2 bgi() {
        if (this.bqp == -1) {
            return bqh;
        }
        anp_2 anp_22 = new anp_2(this.bqp);
        for (int i = 0; i < this.bqp; ++i) {
            long l = this.bqq[i];
            int n = sr_0.dY(l);
            int n2 = sr_0.dZ(l);
            short s = sr_0.ea(l);
            anp_22.a(i, n, n2, s);
        }
        return anp_22;
    }

    public int bgj() {
        int n;
        assert (this.bpc != null) : "no TopologyMapInstanceSet defined";
        assert (this.bpP > 0) : "invalid m_moverHeight";
        assert (this.bqk >= 0) : "invalid m_moverJumpCapacity";
        assert (this.bpR >= 0) : "invalid m_moverPhysicalRadius : " + this.bpR;
        assert (this.bqn != null) : "no PathFinderParameters defined";
        assert (this.bqm != -1L) : "stop cell not defined";
        assert (!this.bql.isEmpty()) : "start cells not defined";
        assert (this.bqn.bqN > 0) : "search limit not defined in the path find parameters";
        assert (this.bqn.bqQ || !this.bqn.bqR) : "stopping before the end and asking for the end cell to be removed assumes the last cell of the path will be known";
        this.bqA.clear();
        this.bqs = 0;
        this.bqy.clear();
        this.bqu = 0;
        this.bqw = (short)-1;
        this.bqx = (short)-1;
        ss_0 ss_02 = this.eb(this.bqm);
        if (ss_02 == null) {
            return -1;
        }
        if (!wv_0.a(ss_02.bqD + ss_02.bqE, (int)ss_02.bqD, ss_02.bqC, this.bqt, this.bpP)) {
            return -1;
        }
        int n2 = sr_0.dY(this.bqm);
        int n3 = sr_0.dZ(this.bqm);
        short s = sr_0.ea(this.bqm);
        if (!this.bqn.bqR && this.a(n2, n3, s, n2, n3, s)) {
            return -1;
        }
        if (this.bpR > 0) {
            for (n = -this.bpR; n <= this.bpR; ++n) {
                for (int i = -this.bpR; i <= this.bpR; ++i) {
                    if (!this.a(n2 + n, n3 + i, s, n2 + n, n3 + i, s)) continue;
                    return -1;
                }
            }
        }
        for (n = this.bql.size() - 1; n >= 0; --n) {
            long l = this.bql.get(n);
            if (l == this.bqm) {
                this.bqp = 0;
                return this.bqp;
            }
            ss_0 ss_03 = this.eb(l);
            if (ss_03 == null) {
                bpV.info((Object)("Invalid start cell for pathfind search : doesn't exist. HASHCODE : " + l));
                continue;
            }
            int n4 = sr_0.dY(l);
            int n5 = sr_0.dZ(l);
            short s2 = sr_0.ea(l);
            if (this.bpR > 0 && s != s2) {
                if (!this.bqn.bqU) continue;
                s2 = s;
            }
            if (!wv_0.a(ss_03.bqD + ss_03.bqE, (int)ss_03.bqD, ss_03.bqC, this.bqt, this.bpP)) {
                if (this.bqn.bqU) {
                    if ((s2 = wv_0.a((int)ss_03.bqD, (int)ss_03.bqC, this.bqt, (short)(s2 + this.bqk), this.bpP)) == Short.MIN_VALUE) {
                        continue;
                    }
                } else {
                    bpV.info((Object)("Invalid start cell (" + n4 + ", " + n5 + ", " + s2 + ") for pathfind search : not a suitable position for the mover. "));
                    continue;
                }
            }
            ss_03.bqG = this.a(n4, n5, n2, n3);
            if (this.bqn.bqO > 0 && (float)this.bqn.bqO < ss_03.bqG) continue;
            ss_03.bqF = 0.0f;
            ss_03.bqH = ss_03.bqG;
            ss_03.bqK = true;
            ss_03.bqJ = (byte)-1;
            this.b(ss_03);
        }
        if (this.bqw == -1) {
            return -1;
        }
        n = this.bqn.bqM ? 1 : 0;
        if (this.bpR > 0 && !this.bqn.bqM) {
            this.bqn.bqM = true;
        }
        int n6 = this.bpR == 0 ? this.a(n2, n3, ss_02) : this.a(n2, n3, sr_0.ea(this.bqm), ss_02);
        this.bqn.bqM = n;
        return n6;
    }

    public boolean b(acd_1 acd_12, acd_1 acd_13) {
        if (acd_12.A(acd_13) != 1) {
            bpV.error((Object)("Unable to checkMovementOnNextCell if cells are not adjacent :" + String.valueOf(acd_12) + ", " + String.valueOf(acd_13)));
            return false;
        }
        int n = acd_12.getX();
        int n2 = acd_12.getY();
        short s = acd_12.bdi();
        int n3 = acd_13.getX();
        int n4 = acd_13.getY();
        short s2 = acd_13.bdi();
        if (this.bpR == 0) {
            int n5;
            int n6;
            if (this.a(n3, n4, s2, n, n2, s)) {
                return false;
            }
            int n7 = this.aj(n, n2);
            if (n7 == 0) {
                return false;
            }
            int n8 = sr_0.ph(n7);
            short s3 = wv_0.a(n8, n6 = sr_0.pi(n7), this.bqt, acd_12.bdi());
            if (s3 == Short.MIN_VALUE) {
                return false;
            }
            int n9 = this.aj(n3, n4);
            if (n9 == 0) {
                return false;
            }
            int n10 = sr_0.ph(n9);
            short s4 = wv_0.a(n10, n5 = sr_0.pi(n9), this.bqt, acd_13.bdi());
            if (s4 == Short.MIN_VALUE) {
                return false;
            }
            return this.bqo.a(n8 + s3, n8, n6, this.bqt, n10 + s4, n10, n5, this.bqt);
        }
        for (int i = -this.bpR; i <= this.bpR; ++i) {
            for (int j = -this.bpR; j <= this.bpR; ++j) {
                if (!this.bpc.aK(n3 + i, n4 + j)) {
                    return false;
                }
                if (this.a(n3 + i, n4 + j, s2, n + i, n2 + j, s)) {
                    return false;
                }
                boolean bl = this.a(n + i, n2 + j, acd_13.bdi(), n3 + i, n4 + j);
                if (bl) continue;
                return false;
            }
        }
        return true;
    }

    private int a(int n, int n2, ss_0 ss_02) {
        ss_0 ss_03;
        int n3 = 0;
        while ((ss_03 = this.bgl()) != null) {
            if (this.bqn.bqN < ++n3) {
                return -1;
            }
            if (ss_03 == ss_02) {
                return this.c(ss_03);
            }
            wt_0 wt_02 = this.bqt[ss_03.bqD + ss_03.bqE];
            int[][] nArray = this.a(wt_02, n, n2);
            int n4 = 0;
            byte by = this.bgk();
            for (byte by2 = 0; by2 < by; by2 = (byte)(by2 + 1)) {
                wy_0 wy_02;
                int n5;
                boolean bl = by2 > 3;
                int[] nArray2 = nArray[by2];
                if (bl && (n4 & nArray2[2]) != nArray2[2]) continue;
                int n6 = wt_02.bap + nArray2[0];
                int n7 = wt_02.baq + nArray2[1];
                short s = wt_02.ban;
                if (this.bqn.bqR && !this.bqn.bqS && n6 == n && n7 == n2) {
                    return this.c(ss_03);
                }
                int n8 = this.aj(n6, n7);
                if (n8 == 0) continue;
                int n9 = sr_0.ph(n8);
                int n10 = sr_0.pi(n8);
                if (this.a(n6, n7, s, wt_02.bap, wt_02.baq, wt_02.ban) && (!this.bqn.bqR || n6 != n || n7 != n2) || (n5 = this.bqo.a(ss_03.bqD + ss_03.bqE, ss_03.bqD, ss_03.bqC, this.bqt, n9, n10, this.bqt)) == 0 || (wy_02 = this.bpc.aP(n6, n7)) == null) continue;
                for (int i = 0; i < n5; ++i) {
                    wt_0 wt_03 = this.bqt[this.bqo.bpT[i]];
                    assert (wt_03.bap == n6 && wt_03.baq == n7) : "Pathchecker.getValidIndexes returned a CellPathData not corresponding to the given bounds";
                    if (wy_02.u(n6, n7, wt_03.ban) && (!this.bqn.bqR || n6 != n || n7 != n2)) continue;
                    ss_0 ss_04 = this.s(n6, n7, wt_03.ban);
                    if (ss_04 == null) {
                        System.out.println("Node inexistant ou trop de nodes. nodes testes : " + n3 + "/" + this.bqn.bqN);
                        continue;
                    }
                    if (ss_04 == ss_03.bqI || !this.bqn.bqX && wt_03.bmd() || wt_03.bmg() && (!this.bqn.bqY || !wt_02.bmj()) || this.bqn.bqY && wt_02.bmg() && !wt_03.bmj() || !this.bqn.bra && wt_02.bmi() || !this.bqn.bqZ && wt_02.bmh() && wt_03.bmh() || !this.a(wt_02, wt_03, bl)) continue;
                    if (this.bqn.bqR && ss_04 == ss_02) {
                        return this.c(ss_03);
                    }
                    if (bl) {
                        if (!this.a(ss_04, n6, wt_02.baq) || !this.a(ss_04, wt_02.bap, n7)) {
                            continue;
                        }
                    } else {
                        n4 = (byte)(n4 | nArray[by2][2]);
                    }
                    float f2 = ss_03.bqF + this.a(ss_03, wt_02, ss_04, wt_03, by2);
                    byte by3 = (byte)(ss_03.bqL + 1);
                    if (ss_04.bqF < f2 || ss_04.bqF == f2 && ss_04.bqJ < by2 || this.bqn.bqO > 0 && by3 > this.bqn.bqO) continue;
                    ss_04.bqF = f2;
                    if (ss_04.bqG == 0.0f) {
                        ss_04.bqG = this.b(n6, n7, n, n2);
                    }
                    ss_04.bqH = ss_04.bqF + ss_04.bqG;
                    ss_04.bqI = ss_03;
                    ss_04.bqJ = by2;
                    ss_04.bqL = by3;
                    if (ss_04.bqK) {
                        this.a(ss_04);
                    }
                    this.b(ss_04);
                    ss_04.bqK = true;
                }
            }
            ss_03.bqK = false;
        }
        return -1;
    }

    private boolean a(wt_0 wt_02, wt_0 wt_03, boolean bl) {
        if (this.bqn.brb) {
            boolean bl2;
            boolean bl3 = bl2 = wt_02.bml() || wt_02.bmk() && !bl;
            if (wt_03.bml() && !bl2) {
                return false;
            }
        } else if (wt_03.bml()) {
            return false;
        }
        if (wt_02.bml() && wt_03.bmk() && bl) {
            return false;
        }
        return !wt_02.bml() || wt_03.bmk() || wt_03.bml();
    }

    private boolean a(ss_0 ss_02, int n, int n2) {
        int n3;
        int n4 = this.aj(n, n2);
        if (n4 == 0) {
            return false;
        }
        int n5 = sr_0.ph(n4);
        int n6 = this.bqo.a(ss_02.bqD + ss_02.bqE, ss_02.bqD, ss_02.bqC, this.bqt, n5, n3 = sr_0.pi(n4), this.bqt);
        return n6 != 0;
    }

    private int[][] a(wt_0 wt_02, int n, int n2) {
        if (this.bqn.bqW) {
            int n3;
            int n4 = Math.abs(n - wt_02.bap);
            if (n4 >= (n3 = Math.abs(n2 - wt_02.baq))) {
                return bqi;
            }
            return bqj;
        }
        return bqi;
    }

    private int a(int n, int n2, short s, ss_0 ss_02) {
        ss_0 ss_03;
        this.bqz.clear();
        int n3 = 0;
        while ((ss_03 = this.bgl()) != null) {
            if (this.bqn.bqN < ++n3) {
                return -1;
            }
            if (ss_03 == ss_02) {
                return this.c(ss_03);
            }
            wt_0 wt_02 = this.bqt[ss_03.bqD + ss_03.bqE];
            int[][] nArray = this.a(wt_02, n, n2);
            byte by = this.bgk();
            block1: for (byte by2 = 0; by2 < by; by2 = (byte)(by2 + 1)) {
                byte by3;
                int[] nArray2 = nArray[by2];
                int n4 = wt_02.bap + nArray2[0];
                int n5 = wt_02.baq + nArray2[1];
                short s2 = wt_02.ban;
                if (this.bqn.bqR && !this.bqn.bqS && n4 == n && n5 == n2) {
                    return this.c(ss_03);
                }
                for (int i = -this.bpR; i <= this.bpR; ++i) {
                    for (int j = -this.bpR; j <= this.bpR; ++j) {
                        if (!this.bpc.aK(n4 + i, n5 + j) || this.a(n4 + i, n5 + j, s2, n4 + i, n5 + j, s2) && (!this.bqn.bqR || n4 + i != n || n5 + j != n2) || (by3 = (byte)(this.a(wt_02.bap + i, wt_02.baq + j, s, n4 + i, n5 + j) ? 1 : 0)) == 0) continue block1;
                    }
                }
                ss_0 ss_04 = this.s(n4, n5, s);
                if (ss_04 == null) {
                    System.out.println("Node inexistant ou trop de nodes. nodes testes : " + n3 + "/" + this.bqn.bqN);
                    continue;
                }
                if (ss_04 == ss_03.bqI) continue;
                if (this.bqn.bqR && ss_04 == ss_02) {
                    return this.c(ss_03);
                }
                float f2 = ss_03.bqF + this.a(ss_03, wt_02, ss_04, this.bqt[ss_03.bqD + ss_03.bqE], by2);
                by3 = (byte)(ss_03.bqL + 1);
                if (ss_04.bqF <= f2 || this.bqn.bqO > 0 && by3 > this.bqn.bqO) continue;
                ss_04.bqF = f2;
                if (ss_04.bqG == 0.0f) {
                    ss_04.bqG = this.b(n4, n5, n, n2);
                }
                ss_04.bqH = ss_04.bqF + ss_04.bqG;
                ss_04.bqI = ss_03;
                ss_04.bqJ = by2;
                ss_04.bqL = by3;
                if (ss_04.bqK) {
                    this.a(ss_04);
                }
                this.b(ss_04);
                ss_04.bqK = true;
            }
            ss_03.bqK = false;
        }
        return -1;
    }

    private boolean a(int n, int n2, short s, int n3, int n4) {
        int n5;
        int n6 = this.aj(n, n2);
        if (n6 == 0) {
            return false;
        }
        int n7 = sr_0.ph(n6);
        short s2 = wv_0.a(n7, n5 = sr_0.pi(n6), this.bqt, s);
        if (s2 == Short.MIN_VALUE) {
            return false;
        }
        int n8 = this.aj(n3, n4);
        if (n8 == 0) {
            return false;
        }
        int n9 = sr_0.ph(n8);
        long l = this.ag(n7, n9);
        byte by = this.bqz.get(l);
        if (by != 0) {
            return by > 0;
        }
        int n10 = sr_0.pi(n8);
        int n11 = this.bqo.a(n7 + s2, n7, n5, this.bqt, n9, n10, this.bqt);
        if (n11 == 0) {
            this.bqz.put(l, (byte)-1);
            return false;
        }
        for (int i = 0; i < n11; ++i) {
            wt_0 wt_02 = this.bqt[this.bqo.bpT[i]];
            if (wt_02.ban != s) continue;
            this.bqz.put(l, (byte)1);
            return true;
        }
        this.bqz.put(l, (byte)-1);
        return false;
    }

    private long ag(int n, int n2) {
        if (n < n2) {
            return (long)n << 32 & 0xFFFFFFFF00000000L | (long)n2 & 0xFFFFFFFFL;
        }
        return (long)n2 << 32 & 0xFFFFFFFF00000000L | (long)n & 0xFFFFFFFFL;
    }

    private byte bgk() {
        return this.bqn.bqM ? (byte)4 : 8;
    }

    protected boolean a(int n, int n2, short s, int n3, int n4, short s2) {
        if (this.bpc.g(n, n2, s)) {
            return true;
        }
        if (wa_0.g(n, n2, s)) {
            if (!wa_0.h(n3, n4, s2)) {
                return true;
            }
            if (n3 != n && n4 != n2) {
                return true;
            }
        }
        if (wa_0.g(n3, n4, s2) && n3 != n && n4 != n2) {
            return true;
        }
        int n5 = sr_0.dY(this.bqm);
        int n6 = sr_0.dZ(this.bqm);
        short s3 = sr_0.ea(this.bqm);
        return wa_0.g(n, n2, s) && n == n5 && n2 == n6 && s == s3;
    }

    protected float a(ss_0 ss_02, wt_0 wt_02, ss_0 ss_03, wt_0 wt_03, byte by) {
        int n;
        float f2 = by >= 4 ? 1.4f : 1.0f;
        if (this.bqn.bqV) {
            n = Math.abs(wt_02.ban - wt_03.ban);
            f2 = n >= bqe.length ? (f2 += bqe[bqe.length - 1]) : (f2 += bqe[n]);
        }
        int n2 = n = ss_02.bqJ != -1 && ss_02.bqJ != by ? 1 : 0;
        if (n != 0) {
            if (!this.bqn.bqM) {
                f2 += 0.9f;
            } else if (this.bqn.bqT) {
                f2 += 10.0f;
            }
        }
        return f2;
    }

    private float a(int n, int n2, int n3, int n4) {
        int n5 = Math.abs(n - n3);
        int n6 = Math.abs(n2 - n4);
        if (this.bqn.bqM) {
            return n5 + n6;
        }
        if (n5 < n6) {
            return (float)n5 * 1.4f + (float)Math.abs(n5 - n6);
        }
        return (float)n6 * 1.4f + (float)Math.abs(n5 - n6);
    }

    private float b(int n, int n2, int n3, int n4) {
        int n5 = Math.abs(n - n3);
        int n6 = Math.abs(n2 - n4);
        if (this.bqn.bqM) {
            if (n5 == 0 && n6 == 0) {
                return 0.0f;
            }
            float f2 = aco_1.bm(n5, n6) * 0.01f;
            return (float)(n5 + n6) + f2;
        }
        if (n5 < n6) {
            return (float)n5 * 1.4f + (float)Math.abs(n5 - n6);
        }
        return (float)n6 * 1.4f + (float)Math.abs(n5 - n6);
    }

    private static int ah(int n, int n2) {
        return (n & 0xFFFF) << 16 | n2 & 0xFFFF;
    }

    private static int ph(int n) {
        return n >>> 16 & 0xFFFF;
    }

    private static int pi(int n) {
        return n & 0xFFFF;
    }

    protected static long ai(int n, int n2) {
        return (long)(n + 131071 & 0x3FFFF) << 18 | (long)(n2 + 131071 & 0x3FFFF);
    }

    private static long r(int n, int n2, short s) {
        return (long)(n + 131071 & 0x3FFFF) << 34 | (long)(n2 + 131071 & 0x3FFFF) << 16 | (long)(s + Short.MAX_VALUE & 0xFFFF);
    }

    public static int dY(long l) {
        return (int)((l >>> 34 & 0x3FFFFL) - 131071L);
    }

    public static int dZ(long l) {
        return (int)((l >>> 16 & 0x3FFFFL) - 131071L);
    }

    public static short ea(long l) {
        return (short)((l & 0xFFFFL) - 32767L);
    }

    private ss_0 bgl() {
        if (this.bqw < 0) {
            return null;
        }
        ss_0 ss_02 = this.bqv[this.bqw];
        this.bqw = (short)(this.bqw + 1);
        if (this.bqw > this.bqx) {
            this.bqx = (short)-1;
            this.bqw = (short)-1;
        }
        return ss_02;
    }

    private void a(ss_0 ss_02) {
        if (ss_02 == null) {
            return;
        }
        if (this.bqw == -1) {
            return;
        }
        int n = this.bqw;
        int n2 = this.bqx;
        if (this.bqv[n] == ss_02) {
            this.bqw = (short)(this.bqw + 1);
            if (this.bqw > this.bqx) {
                this.bqx = (short)-1;
                this.bqw = (short)-1;
            }
            return;
        }
        if (this.bqv[n2] == ss_02) {
            this.bqx = (short)(this.bqx - 1);
            if (this.bqx < this.bqw) {
                this.bqx = (short)-1;
                this.bqw = (short)-1;
            }
            return;
        }
        while (n < n2) {
            int n3 = (n + n2) / 2;
            if (this.bqv[n3] == ss_02) {
                System.arraycopy(this.bqv, n3 + 1, this.bqv, n3, this.bqx - n3);
                this.bqx = (short)(this.bqx - 1);
                return;
            }
            if (ss_02.bqH >= this.bqv[n3].bqH) {
                n = n3 + 1;
                continue;
            }
            n2 = n3 - 1;
        }
    }

    private void b(ss_0 ss_02) {
        assert (ss_02 != null) : "'can't insert a null PathFinderNode";
        if (this.bqw == -1) {
            this.bqv[0] = ss_02;
            this.bqx = 0;
            this.bqw = 0;
            return;
        }
        for (int i = this.bqw; i <= this.bqx; ++i) {
            if (!(ss_02.bqH < this.bqv[i].bqH)) continue;
            if (this.bqw > 0) {
                if (i == this.bqw) {
                    this.bqw = (short)(this.bqw - 1);
                    this.bqv[this.bqw] = ss_02;
                    return;
                }
                System.arraycopy(this.bqv, this.bqw, this.bqv, this.bqw - 1, i - this.bqw);
                this.bqw = (short)(this.bqw - 1);
                this.bqv[i - 1] = ss_02;
                return;
            }
            System.arraycopy(this.bqv, i, this.bqv, i + 1, this.bqx - i + 1);
            this.bqv[i] = ss_02;
            this.bqx = (short)(this.bqx + 1);
            return;
        }
        this.bqx = (short)(this.bqx + 1);
        this.bqv[this.bqx] = ss_02;
    }

    private ss_0 eb(long l) {
        return this.s(sr_0.dY(l), sr_0.dZ(l), sr_0.ea(l));
    }

    private ss_0 s(int n, int n2, short s) {
        long l = sr_0.r(n, n2, s);
        short s2 = this.bqA.get(l);
        if (s2 != 0) {
            return this.bqr[s2];
        }
        if (this.bqs >= bqa - 1) {
            bpV.error((Object)"No more free nodes. Ceel can't be added to open nodes. Think about increasing PathFinder.MAX_NODES");
            return null;
        }
        int n3 = this.aj(n, n2);
        if (n3 == 0) {
            return null;
        }
        int n4 = sr_0.ph(n3);
        int n5 = sr_0.pi(n3);
        for (int i = n4; i < n4 + n5; ++i) {
            if (this.bqt[i].ban != s) continue;
            ss_0 ss_02 = this.bqr[this.bqs + 1];
            ss_02.bqD = (short)n4;
            ss_02.bqE = (byte)(i - n4);
            ss_02.bqC = (byte)n5;
            ss_02.bqI = null;
            ss_02.bqL = 0;
            ss_02.bqK = false;
            ss_02.bqH = 0.0f;
            ss_02.bqF = Float.MAX_VALUE;
            ss_02.bqG = 0.0f;
            this.bqs = (short)(this.bqs + 1);
            this.bqA.put(l, this.bqs);
            return ss_02;
        }
        return null;
    }

    private int aj(int n, int n2) {
        long l = sr_0.ai(n, n2);
        int n3 = this.bqy.get(l);
        if (n3 != 0) {
            return n3;
        }
        ww_0 ww_02 = this.bpc.aO(n, n2);
        if (ww_02 == null) {
            return 0;
        }
        if (!ww_02.aK(n, n2)) {
            bpV.error((Object)"Map pas pr\u00e9sente pour ces coordonn\u00e9es... Probl\u00e8me de topologyMapInstanceSet mal charg\u00e9/initialis\u00e9 ?");
            return 0;
        }
        int n4 = ww_02.a(n, n2, this.bqt, (int)this.bqu);
        assert (n4 != 0) : "no data for a specific cell " + n + "," + n2 + "@?";
        n3 = sr_0.ah(this.bqu, n4);
        this.bqy.put(l, n3);
        this.bqu = (short)(this.bqu + n4);
        return n3;
    }

    private int c(ss_0 ss_02) {
        assert (ss_02 != null) : "can't compute a path with a null end node";
        this.bqp = 0;
        ss_0 ss_03 = ss_02;
        if (!this.bqn.bqQ && ss_03.bqI != null) {
            ss_03 = ss_03.bqI;
        }
        if (!this.bqn.bqP) {
            while (ss_03.bqI != null && this.bqp < 128) {
                wt_0 wt_02 = this.bqt[ss_03.bqD + ss_03.bqE];
                short s = this.bqp;
                this.bqp = (short)(s + 1);
                this.bqq[s] = sr_0.r(wt_02.bap, wt_02.baq, wt_02.ban);
                ss_03 = ss_03.bqI;
            }
            if (ss_03.bqI == null) {
                return this.bqp;
            }
        } else {
            while (ss_03 != null && this.bqp < 128) {
                wt_0 wt_03 = this.bqt[ss_03.bqD + ss_03.bqE];
                short s = this.bqp;
                this.bqp = (short)(s + 1);
                this.bqq[s] = sr_0.r(wt_03.bap, wt_03.baq, wt_03.ban);
                ss_03 = ss_03.bqI;
            }
            if (ss_03 == null) {
                return this.bqp;
            }
        }
        return -1;
    }

    public boolean c(acd_1 acd_12, acd_1 acd_13) {
        return this.a(acd_12, acd_13, false);
    }

    public boolean a(acd_1 acd_12, acd_1 acd_13, boolean bl) {
        int n;
        int n2;
        int n3;
        int n4;
        if (acd_12 == null || acd_13 == null) {
            bpV.error((Object)("IMpossible de savoir si un chemin en ligne droite existe: " + String.valueOf(acd_12) + "/" + String.valueOf(acd_13)));
            return false;
        }
        if (acd_13.equals(acd_12)) {
            return true;
        }
        if (acd_12.getX() != acd_13.getX() && acd_12.getY() != acd_13.getY()) {
            bpV.info((Object)"Cellules non align\u00e9es : impossible d'avoir un chemin en ligne droite");
            return false;
        }
        int n5 = acd_12.getX();
        int n6 = acd_13.getX();
        int n7 = acd_12.getY();
        int n8 = acd_13.getY();
        if (n5 == n6) {
            n4 = 0;
            n3 = n8 > n7 ? 1 : -1;
            n2 = Math.abs(n8 - n7);
        } else {
            n4 = n6 > n5 ? 1 : -1;
            n3 = 0;
            n2 = Math.abs(n6 - n5);
        }
        int n9 = n5;
        int n10 = n7;
        int n11 = this.aj(n9, n10);
        if (n11 == 0) {
            bpV.info((Object)("IMpossible de r\u00e9cup\u00e9rer les informations de la cellule " + n9 + ", " + n10));
            return false;
        }
        int n12 = sr_0.ph(n11);
        int n13 = wv_0.a(n12, n = sr_0.pi(n11), this.bqt, acd_12.bdi());
        if (n13 == Short.MIN_VALUE) {
            bpV.error((Object)("Position en z non valide pour cette cellule : " + String.valueOf(acd_12)));
            return false;
        }
        try {
            for (int i = 0; i < n2; ++i) {
                int n14;
                int n15 = n9 + n4;
                int n16 = n10 + n3;
                int n17 = this.aj(n15, n16);
                if (n17 == 0) {
                    bpV.debug((Object)("Une cellule du mouvement en ligne droite n'existe pas : " + n15 + ", " + n16));
                    return false;
                }
                int n18 = sr_0.ph(n17);
                int n19 = this.bqo.a(n13 + n12, n12, n, this.bqt, n18, n14 = sr_0.pi(n17), this.bqt);
                if (n19 == 0) {
                    bpV.debug((Object)("Cellule " + n15 + ", " + n16 + " emp\u00eache le mouvement"));
                    return false;
                }
                if (bl && this.bpc instanceof rh_0 && ((rh_0)this.bpc).ab(n9, n10)) {
                    return false;
                }
                n9 = n15;
                n10 = n16;
                n12 = n18;
                n = n14;
                n13 = this.bqo.bpT[0] - n12;
            }
        }
        catch (Throwable throwable) {
            bpV.error((Object)"Exception pendant le check pour savoir s'il y a un chemin en ligne droite : ", throwable);
            return false;
        }
        return true;
    }
}

