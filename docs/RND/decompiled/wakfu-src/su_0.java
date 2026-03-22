/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.map.hash.TLongIntHashMap
 *  gnu.trove.procedure.TLongProcedure
 *  gnu.trove.set.hash.TLongHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.map.hash.TLongIntHashMap;
import gnu.trove.procedure.TLongProcedure;
import gnu.trove.set.hash.TLongHashSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from SU
 */
public class su_0 {
    private static final Logger brc = Logger.getLogger(su_0.class);
    private final List<sv_0> brd = new ArrayList<sv_0>();
    private static final wt_0[] bre = new wt_0[32];
    private static final boolean brf = false;
    private static final int brg = 80;
    public static final int brh = -1;
    private static final int bri = 12;
    protected final wt_0[] brj;
    protected final TLongArrayList brk = new TLongArrayList();
    protected final TLongHashSet brl = new TLongHashSet();
    protected final TLongHashSet brm = new TLongHashSet();
    protected final TLongIntHashMap brn = new TLongIntHashMap();
    protected short bka;
    protected short bkb;
    protected int bro;
    protected int brp;
    protected int brq;
    protected int brr;
    protected int brs;
    protected int brt;
    protected ww_0 bru = null;
    protected wy_0 brv;
    private final long brw;
    private final short brx;
    private final sq_0 bry;
    protected boolean brz;
    public static final byte brA = 0;
    public static final byte brB = -1;
    public static final byte brC = -2;
    public static final byte brD = 1;
    protected static final int brE = 0;
    protected static final int brF = 1;
    protected static final int brG = 2;

    public su_0(boolean bl, long l, short s, sq_0 sq_02, wt_0[] wt_0Array) {
        this.brw = l;
        this.brx = s;
        this.brj = wt_0Array;
        this.brz = bl;
        this.bry = sq_02;
    }

    public su_0(long l, short s, sq_0 sq_02, wt_0[] wt_0Array) {
        this(false, l, s, sq_02, wt_0Array);
    }

    public short bdI() {
        return this.bka;
    }

    public short bdJ() {
        return this.bkb;
    }

    public int bgm() {
        return this.bro;
    }

    public int bgn() {
        return this.brp;
    }

    public int bgo() {
        return this.brq;
    }

    public int bgp() {
        return this.brr;
    }

    public int getWidth() {
        return this.brs;
    }

    public int getHeight() {
        return this.brt;
    }

    public final TLongArrayList bgq() {
        return this.brk;
    }

    public final int bgr() {
        return this.brk.size();
    }

    public final long pj(int n) {
        return this.brk.getQuick(n);
    }

    public void a(TLongProcedure tLongProcedure) {
        this.brm.forEach(tLongProcedure);
    }

    private boolean c(int n, int n2, int n3, int n4) {
        long l = (long)(n + 131071) << 34 | (long)(n2 + 131071) << 16;
        if (this.brl.contains(l)) {
            return false;
        }
        byte by = this.a(n3, n4, n, n2, l);
        if (by != 1) {
            this.brl.add(l);
        }
        return by == 0;
    }

    public void a(int n, int n2, short s, int n3, sw_0 sw_02, wy_0 wy_02) {
        long l;
        ww_0 ww_02;
        sw_02.e(n, n2, s);
        this.bka = this.bkb = s;
        this.brk.ensureCapacity(n3 + 80);
        this.brl.ensureCapacity(n3 + 80);
        this.bru = ww_02 = wy_02.bmp();
        this.brv = wy_02;
        short s2 = wt_0.a(this.brj, ww_02, n, n2, s);
        assert (s2 != -1) : "Unable to find a valid z position for the cell (" + n + "; " + n2 + "; " + s + ")";
        if (s2 < 0 || this.brj[s2].bNP == -1) {
            brc.error((Object)("On essaye de cr\u00e9er une bulle sur une position non valide (" + n + "; " + n2 + "; " + s + ")"));
            return;
        }
        short s3 = s2;
        this.brk.add(su_0.t(n, n2, s2));
        this.brl.add(su_0.al(n, n2));
        this.bro = n;
        this.brq = n;
        this.brp = n2;
        this.brr = n2;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 1;
        while (true) {
            l = this.brk.getQuick(n4);
            int n8 = (int)(l >>> 34) - 131071;
            int n9 = (int)(l >>> 16 & 0x3FFFFL) - 131071;
            s2 = (short)(l & 0xFFFFL);
            if (!this.bru.aK(n8, n9)) {
                wy_02 = wa_0.a(this.brw, n8, n9, this.brx);
                this.bru = wy_02.bmp();
                this.brv = wy_02;
            }
            ww_02 = this.bru;
            int n10 = ww_02.a(n8, n9, this.brj, 0);
            wt_0 wt_02 = this.brj[s2];
            int n11 = wt_02.bap;
            int n12 = wt_02.baq;
            int n13 = n11 - 1;
            if (n7 < n3 && sw_02.Q(n13, n12) && this.c(n13, n12, s2, n10)) {
                if (n13 < this.bro) {
                    this.bro = n13;
                }
                ++n7;
            }
            n13 = n12 - 1;
            if (n7 < n3 && sw_02.Q(n11, n13) && this.c(n11, n13, s2, n10)) {
                if (n13 < this.brp) {
                    this.brp = n13;
                }
                ++n7;
            }
            n13 = n11 + 1;
            if (n7 < n3 && sw_02.Q(n13, n12) && this.c(n13, n12, s2, n10)) {
                if (n13 > this.brq) {
                    this.brq = n13;
                }
                ++n7;
            }
            n13 = n12 + 1;
            if (n7 < n3 && sw_02.Q(n11, n13) && this.c(n11, n13, s2, n10)) {
                if (n13 > this.brr) {
                    this.brr = n13;
                }
                ++n7;
            }
            if (n7 >= n3) break;
            if (++n4 < n7) continue;
            if (n6 >= n7) break;
            sw_02.bdt();
            int n14 = n4;
            n4 = n5;
            n5 = n6;
            n6 = n14;
        }
        if (!sw_02.Q(n, n2)) {
            l = su_0.t(n, n2, s2);
            this.brn.put(l, (int)s3);
        }
        int n15 = this.brz ? this.bgs() : -1;
        this.brs = this.brq - this.bro + 1;
        this.brt = this.brr - this.brp + 1;
        this.pk(n15);
    }

    private int bgs() {
        int n = this.brk.size();
        TLongHashSet tLongHashSet = this.brl;
        TLongIntHashMap tLongIntHashMap = this.brn;
        for (int i = 0; i < n; ++i) {
            Object object;
            long l = this.brk.getQuick(i);
            int n2 = (int)(l >>> 34) - 131071;
            int n3 = (int)(l >>> 16 & 0x3FFFFL) - 131071;
            byte by = 0;
            long l2 = (long)(n2 - 1 + 131071) << 34 | (long)(n3 + 131071) << 16;
            if (!tLongHashSet.contains(l2)) {
                tLongHashSet.add(l2);
                by = (byte)(by | 1);
            } else if (tLongIntHashMap.contains(l2)) {
                if (n2 - 1 < this.bro) {
                    this.bro = n2 - 1;
                }
                this.h(l2, tLongIntHashMap.get(l2));
            } else if (n2 - 1 < this.bro) {
                this.brm.remove(l2);
            }
            long l3 = (long)(n2 + 1 + 131071) << 34 | (long)(n3 + 131071) << 16;
            if (!tLongHashSet.contains(l3)) {
                tLongHashSet.add(l3);
                by = (byte)(by | 2);
            } else if (tLongIntHashMap.contains(l3)) {
                if (n2 + 1 > this.brq) {
                    this.brq = n2 + 1;
                }
                this.h(l3, tLongIntHashMap.get(l3));
            } else if (n2 + 1 > this.brq) {
                this.brm.remove(l3);
            }
            long l4 = (long)(n2 + 131071) << 34 | (long)(n3 - 1 + 131071) << 16;
            if (!tLongHashSet.contains(l4)) {
                tLongHashSet.add(l4);
                by = (byte)(by | 4);
            } else if (tLongIntHashMap.contains(l4)) {
                if (n3 - 1 < this.brp) {
                    this.brp = n3 - 1;
                }
                this.h(l4, tLongIntHashMap.get(l4));
            } else if (n3 - 1 < this.brp) {
                this.brm.remove(l4);
            }
            long l5 = (long)(n2 + 131071) << 34 | (long)(n3 + 1 + 131071) << 16;
            if (!tLongHashSet.contains(l5)) {
                tLongHashSet.add(l5);
                by = (byte)(by | 8);
            } else if (tLongIntHashMap.contains(l5)) {
                if (n3 + 1 > this.brr) {
                    this.brr = n3 + 1;
                }
                this.h(l5, tLongIntHashMap.get(l5));
            } else if (n3 + 1 > this.brr) {
                this.brm.remove(l5);
            }
            if (by == 0) continue;
            short s = (short)(l & 0xFFFFL);
            if (!this.bru.aK(n2, n3)) {
                object = wa_0.a(this.brw, n2, n3, this.brx);
                this.bru = ((wy_0)object).bmp();
                this.brv = object;
            }
            object = this.bru;
            int n4 = ((ww_0)object).a(n2, n3, this.brj, 0);
            if ((by & 1) == 1) {
                if (this.a(s, n4, n2 - 1, n3, l2) == 0) {
                    if (n2 - 1 < this.bro) {
                        this.bro = n2 - 1;
                    }
                } else {
                    this.brm.remove(l2);
                }
            }
            if ((by & 2) == 2) {
                if (this.a(s, n4, n2 + 1, n3, l3) == 0) {
                    if (n2 + 1 > this.brq) {
                        this.brq = n2 + 1;
                    }
                } else {
                    this.brm.remove(l3);
                }
            }
            if ((by & 4) == 4) {
                if (this.a(s, n4, n2, n3 - 1, l4) == 0) {
                    if (n3 - 1 < this.brp) {
                        this.brp = n3 - 1;
                    }
                } else {
                    this.brm.remove(l4);
                }
            }
            if ((by & 8) != 8) continue;
            if (this.a(s, n4, n2, n3 + 1, l5) == 0) {
                if (n3 + 1 <= this.brr) continue;
                this.brr = n3 + 1;
                continue;
            }
            this.brm.remove(l5);
        }
        return n;
    }

    protected void pk(int n) {
    }

    protected final byte a(int n, int n2, int n3, int n4, long l) {
        if (!this.bru.aK(n3, n4)) {
            wy_0 wy_02 = wa_0.a(this.brw, n3, n4, this.brx);
            if (wy_02 == null) {
                return -1;
            }
            this.brv = wy_02;
            this.bru = wy_02.bmp();
        }
        switch (this.ak(n3, n4)) {
            case 0: {
                break;
            }
            case 2: {
                this.brm.add(l);
                return -1;
            }
            case 1: {
                return -2;
            }
            default: {
                brc.error((Object)("BlockingState inconnu : " + this.ak(n3, n4)));
            }
        }
        int n5 = this.bru.a(n3, n4, bre, 0);
        if (n5 == 0) {
            return -2;
        }
        if (this.pl(n5)) {
            return -2;
        }
        int n6 = this.bry.a(n, 0, n2, this.brj, 0, n5, bre);
        if (n6 <= 0) {
            return 1;
        }
        short s = (short)this.bry.bpT[0];
        if (!this.a(bre[s])) {
            return -2;
        }
        this.h(l, s);
        return 0;
    }

    private boolean pl(int n) {
        for (int i = 0; i < n; ++i) {
            if (su_0.bre[i].bNP == -1) continue;
            return false;
        }
        return true;
    }

    protected boolean a(wt_0 wt_02) {
        return true;
    }

    private void h(long l, int n) {
        this.brk.add(l | (long)n);
        short s = su_0.bre[n].ban;
        if (s < this.bka) {
            this.bka = s;
        } else if (s > this.bkb) {
            this.bkb = s;
        }
        this.b(bre[n]);
    }

    private void b(wt_0 wt_02) {
        for (sv_0 sv_02 : this.brd) {
            try {
                sv_02.c(wt_02);
            }
            catch (Exception exception) {
                brc.error((Object)"Exception raised", (Throwable)exception);
            }
        }
    }

    protected int ak(int n, int n2) {
        return this.brv.aM(n, n2) ? 1 : 0;
    }

    public static long t(int n, int n2, short s) {
        return (long)(n + 131071) << 34 | (long)(n2 + 131071) << 16 | (long)s;
    }

    protected static long al(int n, int n2) {
        return (long)(n + 131071) << 34 | (long)(n2 + 131071) << 16;
    }

    public static int ec(long l) {
        return (int)(l >>> 34) - 131071;
    }

    public static int ed(long l) {
        return (int)(l >>> 16 & 0x3FFFFL) - 131071;
    }

    public void clear() {
        this.brk.reset();
        this.brl.clear();
        this.brn.clear();
    }

    public boolean a(sv_0 sv_02) {
        return !this.brd.contains(sv_02) && this.brd.add(sv_02);
    }

    public boolean b(sv_0 sv_02) {
        return this.brd.remove(sv_02);
    }

    public String toString() {
        return "boundingBox={(" + this.bro + ", " + this.brp + ") => (" + this.brq + ", " + this.brr + ")}, numCells=" + this.bgr() + ", width=" + this.brs + ", height=" + this.brt;
    }

    static {
        for (int i = 0; i < bre.length; ++i) {
            su_0.bre[i] = new wt_0();
        }
    }
}

