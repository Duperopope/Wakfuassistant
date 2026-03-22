/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.iterator.TLongObjectIterator
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.iterator.TLongObjectIterator;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class aJP {
    public static final int ecd = 2;
    private static final Logger ece = Logger.getLogger(aJP.class);
    private static final aJP ecf = new aJP();
    private final aJB ecg = new aJB();
    private final ajr_0 ech = new ajr_0();
    private final ajq_0 eci = new ajq_0();
    private final aJA ecj = new aJA();
    private final ArrayList<ZH> eck = new ArrayList();
    private int ecl;
    private boolean ecm;
    private float ecn;

    private aJP() {
        this.reset();
    }

    public void reset() {
        this.ecl = -1;
        aJL.cia();
    }

    public void cic() {
        this.ech.ev(false);
    }

    public void cid() {
        this.ech.ev(true);
    }

    public void cie() {
        this.ech.ew(false);
    }

    public void cif() {
        this.ech.ew(true);
    }

    public void a(bgy bgy2, int n) {
        bsS bsS2 = bsU.dHk().Ft(n);
        aJK aJK2 = this.yM(bsS2 != null ? bsS2.d() : 0);
        aJK2.a(bsS2, bgy2);
    }

    private aJK yM(int n) {
        if (n == this.ecl) {
            return this.eci;
        }
        return this.ecj;
    }

    public void b(bgy bgy2, int n) {
        bsS bsS2;
        if (aue_0.cVJ().cVK() == bgy2) {
            this.yP(-1);
        }
        aJK aJK2 = this.yM((bsS2 = bsU.dHk().Ft(n)) != null ? bsS2.d() : 0);
        aJK2.b(bsS2, bgy2);
    }

    public void a(bsS bsS2, QQ qQ) {
        aJK aJK2 = this.yM(bsS2 != null ? bsS2.d() : 0);
        aJK2.a(bsS2, qQ);
    }

    public void b(bsS bsS2, QQ qQ) {
        aJK aJK2 = this.yM(bsS2 != null ? bsS2.d() : 0);
        aJK2.b(bsS2, qQ);
    }

    public void c(bsS bsS2, QQ qQ) {
        aJK aJK2 = this.yM(bsS2 != null ? bsS2.d() : 0);
        aJK2.c(bsS2, qQ);
    }

    public boolean yN(int n) {
        bsS bsS2 = bsU.dHk().Ft(n);
        if (bsS2 == null) {
            return this.yM(n).chJ();
        }
        return this.yM(n).chJ();
    }

    public boolean yO(int n) {
        return this.yM(n).chK();
    }

    public void a(bsi_0 bsi_02) {
        aJK aJK2 = this.yM(bsi_02.d());
        aJK2.a(bsi_02);
    }

    public ArrayList<ZH> bv(float f2, float f3) {
        this.eck.clear();
        aJL.u(this.eck);
        for (int i = this.eck.size() - 1; i >= 0; --i) {
            if (this.eck.get(i).aA(f2, f3)) continue;
            this.eck.remove(i);
        }
        return this.eck;
    }

    public static aJP cig() {
        return ecf;
    }

    public int cih() {
        return this.ecl;
    }

    public void yP(int n) {
        this.ecl = n;
    }

    public float cii() {
        return this.ecn;
    }

    public void en(float f2) {
        this.ecn = f2;
    }

    public void eu(boolean bl) {
        this.ecm = bl;
    }

    public void cij() {
        aJL.cia();
        TIntObjectIterator<bsS> tIntObjectIterator = bsU.dHk().dHl();
        while (tIntObjectIterator.hasNext()) {
            try {
                tIntObjectIterator.advance();
                bsS bsS2 = (bsS)tIntObjectIterator.value();
                if (bsS2.dGp() == etw_0.rqW) continue;
                aJK aJK2 = this.yM(bsS2.d());
                aJK2.a(bsS2);
            }
            catch (Exception exception) {
                ece.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    public static void j(bsS bsS2) {
        aJL.j(bsS2);
        TLongObjectIterator<afk_0> tLongObjectIterator = afh_0.bxU().bxY();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            afk_0 afk_02 = (afk_0)tLongObjectIterator.value();
            afk_02.setVisible(afk_02.aVD().isVisible());
        }
    }

    public static void e(bsi_0 bsi_02) {
        aJL.c((bsS)bsi_02);
    }
}

