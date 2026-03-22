/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class WX {
    private static final Logger bQt = Logger.getLogger(WX.class);
    private static TIntArrayList bQu = new TIntArrayList(25);
    private static TIntArrayList bQv = new TIntArrayList(25);
    private static TIntArrayList bQw = new TIntArrayList(25);
    private static int bQx = Integer.MIN_VALUE;
    private static int bQy = Integer.MIN_VALUE;
    private static int bQz = Integer.MIN_VALUE;
    private static long brw = -32768L;
    private static final boolean bQA = true;
    private static final adk bQB = adk.buy();
    private static final aaa_0 bQC = aaa_0.brC();
    private static final acj_0 bQD = acj_0.btR();
    private static final ArrayList<Runnable> bQE = new ArrayList();
    private static WW bQF;

    public static void a(aaj_0 aaj_02, int n, int n2, short s) {
        aag_0 aag_02 = aaj_02.bqL();
        afW afW2 = aag_02.byR();
        WX.m(n, n2, 2);
        afW2.e(n, n2, s);
        aag_02.byQ();
        aaj_02.bqZ();
        bQC.a(aag_02.byJ());
    }

    public static void m(int n, int n2, int n3) {
        short s;
        short s2;
        int n4;
        int n5;
        assert (brw != -32768L) : "Il faut d'abord appeler setWorldId";
        int n6 = vz_0.qd(n);
        int n7 = vz_0.qe(n2);
        int n8 = n3 * 2 + 1;
        if (n6 == bQx && n7 == bQy && bQz >= n8) {
            return;
        }
        bQx = n6;
        bQy = n7;
        bQz = n8;
        n6 -= n3;
        n7 -= n3;
        TIntArrayList tIntArrayList = bQu;
        bQu = bQw;
        bQv = tIntArrayList;
        bQv.clear();
        for (n5 = 0; n5 < n8; ++n5) {
            for (n4 = 0; n4 < n8; ++n4) {
                s2 = (short)(n6 + n5);
                s = (short)(n7 + n4);
                int n9 = GC.d(s2, s);
                if (!bQF.m(s2, s)) continue;
                bQv.add(n9);
                if (bQu.contains(n9)) continue;
                bQF.n(s2, s);
            }
        }
        for (n5 = 0; n5 < bQu.size(); ++n5) {
            n4 = bQu.getQuick(n5);
            if (bQv.contains(n4)) continue;
            s2 = GC.mS(n4);
            s = GC.mT(n4);
            WX.o(s2, s);
        }
        tIntArrayList = bQw;
        bQw = bQv;
        bQv = tIntArrayList;
    }

    private static void o(short s, short s2) {
        bQB.v(s, s2);
        bQD.s(s, s2);
        wa_0.k(s, s2);
    }

    public static void p(short s, short s2) {
        int n = GC.d(s, s2);
        aeb_2.a(bQw, n);
        WX.o(s, s2);
        bQx = Integer.MIN_VALUE;
        bQy = Integer.MIN_VALUE;
        bQz = Integer.MIN_VALUE;
    }

    public static void a(long l, WW wW) {
        if (brw == l) {
            return;
        }
        WX.clear();
        bQF = wW;
        wW.a(bQB, bQC, bQD);
        brw = l;
        int n = bQE.size();
        for (int i = 0; i < n; ++i) {
            bQE.get(i).run();
        }
        bQE.clear();
        bQF.fz(l);
        wa_0.fy(l);
        bQB.fy(l);
        bQC.fG(l);
        bQD.fy(l);
        bQF.fA(l);
    }

    public static long bhh() {
        return brw;
    }

    public static void fy(long l) {
        WX.a(l, WV.bnj());
    }

    public static void clear() {
        bQx = Integer.MIN_VALUE;
        bQy = Integer.MIN_VALUE;
        bQz = Integer.MIN_VALUE;
        brw = -32768L;
        bQu.clear();
        bQv.clear();
        bQw.clear();
        bQB.buz();
        bQB.reset();
        bQD.clean();
        wa_0.reset();
        bQB.reset();
        bQD.clean();
        bQC.clear();
        bQF.clear();
    }

    public static wb_0 ap(short s) {
        return WV.bnj().qx(s);
    }

    public static void q(@NotNull String string, @NotNull String string2) {
        WV.bnj().q(string, string2);
    }

    public static boolean q(short s, short s2) {
        return bQF.m(s, s2);
    }

    static {
        WV.bnj().a(bQB, bQC, bQD);
        bQF = WV.bnj();
    }
}

