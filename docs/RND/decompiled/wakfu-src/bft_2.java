/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.Table
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bft
 */
public class bft_2 {
    private static final Logger hTk = Logger.getLogger(bft_2.class);
    public static final short hTl = 0;
    public static final int hTm = 100;
    private static final String hTn = "20";
    private static final String hTo = "21";
    private static final float hTp = 0.0f;
    private static final float hTq = 360.0f;
    private static final float hTr = 10.0f;
    private static final float hTs = 60.0f;
    private static final float hTt = 20.0f;
    private static final float hTu = 90.0f;
    public static final int hTv = 1;
    public static final int hTw = 3;
    private final aah_1<String> hTx = new aah_1();
    private final Table<Integer, Byte, bfr_2> hTy = HashBasedTable.create();
    private static final bft_2 hTz = new bft_2();

    private bft_2() {
    }

    public static bft_2 dgp() {
        return hTz;
    }

    public void di(int n, int n2) {
        this.hTx.b(n, n2 + ".xps");
    }

    @Nullable
    public String BP(int n) {
        return this.hTx.vK(n);
    }

    public void a(bfr_2 bfr_22) {
        this.hTy.put((Object)bfr_22.xT(), (Object)bfr_22.aWO(), (Object)bfr_22);
    }

    public bfu_2 b(int n, byte by, short s) {
        bfr_2 bfr_22 = (bfr_2)this.hTy.get((Object)n, (Object)by);
        if (bfr_22 == null) {
            return null;
        }
        short s2 = bfr_22.dgm().containsKey(s) ? s : (short)0;
        return bfr_22.dgm().get(s2).dgo();
    }

    public int c(int n, byte by) {
        return this.c(n, by, (short)0);
    }

    public int c(int n, byte by, short s) {
        bfu_2 bfu_22 = this.b(n, by, s);
        if (bfu_22 == null || !bfu_22.dgy()) {
            return -1;
        }
        return bfu_22.sC();
    }

    public int d(int n, byte by) {
        return this.d(n, by, (short)0);
    }

    public int d(int n, byte by, short s) {
        bfu_2 bfu_22 = this.b(n, by, s);
        if (bfu_22 == null || !bfu_22.dgz()) {
            return -1;
        }
        return bfu_22.sE();
    }

    public int e(int n, byte by) {
        return this.e(n, by, (short)0);
    }

    public int e(int n, byte by, short s) {
        bfu_2 bfu_22 = this.b(n, by, s);
        if (bfu_22 == null || !bfu_22.dgA()) {
            return -1;
        }
        return bfu_22.sG();
    }

    public int f(int n, byte by, short s) {
        bfu_2 bfu_22 = this.b(n, by, s);
        return bfu_22 != null ? bfu_22.sI() : -1;
    }

    public int g(int n, byte by, short s) {
        bfu_2 bfu_22 = this.b(n, by, s);
        return bfu_22 != null ? bfu_22.sK() : -1;
    }

    public int h(int n, byte by, short s) {
        bfu_2 bfu_22 = this.b(n, by, s);
        return bfu_22 != null ? bfu_22.sM() : -1;
    }

    public int i(int n, byte by, short s) {
        bfu_2 bfu_22 = this.b(n, by, s);
        return bfu_22 != null ? bfu_22.sO() : -1;
    }

    public int j(int n, byte by, short s) {
        bfu_2 bfu_22 = this.b(n, by, s);
        return bfu_22 != null ? bfu_22.sQ() : -1;
    }

    public int k(int n, byte by, short s) {
        bfu_2 bfu_22 = this.b(n, by, s);
        return bfu_22 != null ? bfu_22.sS() : -1;
    }

    public static int dgq() {
        return awx_2.w(GC.b(0.0f, 360.0f), GC.b(10.0f, 60.0f), GC.b(20.0f, 90.0f), 1.0f).bPU();
    }

    public boolean l(int n, byte by, short s) {
        bfu_2 bfu_22 = this.b(n, by, s);
        return bfu_22 != null && bfu_22.dgz();
    }

    public boolean m(int n, byte by, short s) {
        bfu_2 bfu_22 = this.b(n, by, s);
        return bfu_22 != null && bfu_22.dgy();
    }

    public boolean f(int n, byte by) {
        return this.n(n, by, (short)0);
    }

    public boolean n(int n, byte by, short s) {
        bfu_2 bfu_22 = this.b(n, by, s);
        return bfu_22 != null && bfu_22.dgA();
    }

    public String a(int n, byte by, short s, byte by2) {
        bfr_2 bfr_22 = (bfr_2)this.hTy.get((Object)n, (Object)by);
        if (bfr_22 == null) {
            return null;
        }
        int n2 = bfr_22.dgl() - 1;
        int n3 = GC.a((int)by2, 0, n2);
        bfs_2 bfs_22 = bfr_22.dgm().get(s);
        return bft_2.a(hTn, n, bfs_22.dgn(), n3 + 1);
    }

    public String o(int n, byte by, short s) {
        bfr_2 bfr_22 = (bfr_2)this.hTy.get((Object)n, (Object)by);
        if (bfr_22 == null) {
            return null;
        }
        short s2 = (short)(bfr_22.dgk() - 1);
        short s3 = GC.a(s, (short)0, s2);
        bfs_2 bfs_22 = bfr_22.dgm().get(s3);
        return bft_2.a(hTo, n, bfs_22.dgn(), s3 + 100);
    }

    public int a(short s, byte by) {
        bfr_2 bfr_22 = (bfr_2)this.hTy.get((Object)s, (Object)by);
        if (bfr_22 == null) {
            return 1;
        }
        return bfr_22.dgk();
    }

    public int b(short s, byte by) {
        bfr_2 bfr_22 = (bfr_2)this.hTy.get((Object)s, (Object)by);
        if (bfr_22 == null) {
            return 3;
        }
        return bfr_22.dgl();
    }

    public short b(short s, byte by, short s2) {
        bfr_2 bfr_22 = (bfr_2)this.hTy.get((Object)s, (Object)by);
        if (bfr_22 == null) {
            return Short.parseShort(String.valueOf(s) + by);
        }
        bfs_2 bfs_22 = bfr_22.dgm().get(s2);
        if (bfs_22 == null) {
            return Short.parseShort(String.valueOf(s) + by);
        }
        return Short.parseShort(String.valueOf(s) + bfs_22.dgn());
    }

    public byte c(short s, byte by, short s2) {
        bfr_2 bfr_22 = (bfr_2)this.hTy.get((Object)s, (Object)by);
        if (bfr_22 == null) {
            return by;
        }
        bfs_2 bfs_22 = bfr_22.dgm().get(s2);
        return bfs_22.dgn();
    }

    private static String a(String string, int n, byte by, int n2) {
        return String.format("%s%02d%d%04d", string, n, by, n2);
    }

    public static String a(short s, byte by, short s2, byte by2) {
        return String.format("%02d%d%d%04d", s, by, s2, by2);
    }

    public static String d(short s, byte by, short s2) {
        return String.format("%02d%d%d", s, by, s2);
    }

    public String g(int n, byte by) {
        String string = String.format("breed.skinDescription.%d%d", n, by);
        return aum_0.cWf().cO(string) ? aum_0.cWf().c(string, new Object[0]) : aum_0.cWf().c("characterCreation.skin", new Object[0]);
    }

    public String h(int n, byte by) {
        String string = String.format("breed.hairDescription.%d%d", n, by);
        return aum_0.cWf().cO(string) ? aum_0.cWf().c(string, new Object[0]) : aum_0.cWf().c("characterCreation.hair", new Object[0]);
    }

    public String dgr() {
        return aum_0.cWf().c("characterCreation.pupil", new Object[0]);
    }

    public String dgs() {
        return aum_0.cWf().c("characterCreation.CostumeColor1", new Object[0]);
    }

    public String dgt() {
        return aum_0.cWf().c("characterCreation.CostumeColor2", new Object[0]);
    }

    public String dgu() {
        return aum_0.cWf().c("characterCreation.CostumeColor3", new Object[0]);
    }

    public String dgv() {
        return aum_0.cWf().c("characterCreation.CostumeColor4", new Object[0]);
    }

    public String dgw() {
        return aum_0.cWf().c("characterCreation.CostumeColor5", new Object[0]);
    }

    public String dgx() {
        return aum_0.cWf().c("characterCreation.CostumeColor6", new Object[0]);
    }
}

