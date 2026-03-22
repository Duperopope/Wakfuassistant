/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from eSw
 */
public final class esw_0 {
    protected static final Logger rku;
    private static wt_0[] bkx;
    private static wt_0[] rkv;
    private sq_0 bqo;
    private rh_0 cts;
    private ww_0 bOo;
    private final esu_0 rkw;
    private final acd_1 rkx;
    private final int rky;
    private final qm_0<enk_0> rkz;
    private int rkA;
    private int mxU;
    private boolean rkB;
    private int rkC = 0;

    public esw_0(esu_0 esu_02, acd_1 acd_12, int n, qm_0<enk_0> qm_02) {
        this.rkw = esu_02;
        this.rkx = acd_12;
        this.rky = n;
        this.rkz = qm_02;
        if (this.rkz != null) {
            this.cts = this.rkz.bag();
        }
    }

    private boolean bGb() {
        this.fIf();
        return this.fIh() && this.fIg();
    }

    private void fIf() {
        this.bqo = new sq_0();
        this.bqo.a(this.rkw.bcN(), this.rkw.bcO(), this.rkw.bvy(), true);
    }

    private boolean fIg() {
        int n = this.rkw.bcC();
        int n2 = this.rkw.bcD();
        short s = this.rkw.bcE();
        int n3 = this.bOo.a(n, n2, bkx, 0);
        short s2 = wv_0.a(0, n3, bkx, s);
        if (s2 == Short.MIN_VALUE) {
            rku.error((Object)("Unable to find the cell (" + n + "; " + n2 + ") with z value = " + s));
            return false;
        }
        return true;
    }

    private boolean fIh() {
        int n = this.rkw.bcC();
        int n2 = this.rkw.bcD();
        this.bOo = this.cts.aO(n, n2);
        if (this.bOo == null) {
            rku.error((Object)("The cell (" + n + "; " + n2 + ") is not in the fightMap"));
            return false;
        }
        return true;
    }

    public esv_0 fIi() {
        if (!this.bGb()) {
            rku.error((Object)"Impossible d'initialiser correctement le computer");
            return null;
        }
        int n = this.rkw.bcC();
        int n2 = this.rkw.bcD();
        short s = this.rkw.bcE();
        int n3 = 0;
        abi_1 abi_12 = this.bcB();
        esv_0 esv_02 = new esv_0();
        if (abi_12.dzz == 0 && abi_12.dzA == 0) {
            esv_02.ao(n, n2, s);
            return esv_02;
        }
        this.rkA = this.bOo.a(n, n2, rkv, 0);
        for (int i = 0; i < this.rky; ++i) {
            est_0 est_02 = this.a(n += abi_12.dzz, n2 += abi_12.dzA, s, esv_02);
            this.fIk();
            if (est_02.aHz()) break;
            if (est_02.bpO()) {
                esv_02.mq(true);
                esv_02.l(est_02.fIb());
                break;
            }
            int n4 = est_02.fIa() - s;
            if (n4 < 0) {
                n3 -= n4;
            }
            esv_02.Sn(i + 1);
            esv_02.Sm(n3);
            s = est_02.fIa();
            esv_02.ao(n, n2, s);
            if (this.fE(n, n2)) break;
        }
        return esv_02;
    }

    private est_0 a(int n, int n2, short s, esv_0 esv_02) {
        int n3 = this.rkw.bcO();
        for (int i = -n3; i <= n3; ++i) {
            for (int j = -n3; j <= n3; ++j) {
                est_0 est_02 = this.c(n + i, n2 + j, s, false);
                if (est_02.aHz()) {
                    return est_02;
                }
                if (!est_02.bpO()) continue;
                esv_02.mq(true);
                esv_02.l(est_02.fIb());
                return est_02;
            }
        }
        return this.c(n, n2, s, true);
    }

    private abi_1 bcB() {
        if (!this.rkB) {
            return new acq_1(this.rkw.bcC(), this.rkw.bcD(), this.rkw.bcE(), this.rkx.getX(), this.rkx.getY(), this.rkx.bdi()).bXb();
        }
        return new acq_1(this.rkx.getX(), this.rkx.getY(), this.rkx.bdi(), this.rkw.bcC(), this.rkw.bcD(), this.rkw.bcE()).bXb();
    }

    private est_0 c(int n, int n2, short s, boolean bl) {
        List<QQ> list;
        est_0 est_02 = new est_0();
        est_02.fL(false);
        est_02.mp(false);
        if (!this.fD(n, n2)) {
            rku.error((Object)("The cell (" + n + "; " + n2 + ") is not in the fightMap"));
            est_02.mp(true);
            return est_02;
        }
        if (!this.cts.T(n, n2)) {
            est_02.setStopped(true);
            return est_02;
        }
        int n3 = this.bOo.a(n, n2, rkv, 0);
        if (!this.C(n3, s)) {
            est_02.setStopped(true);
            return est_02;
        }
        est_02.ep(this.fIj());
        if (bl) {
            this.rkA = n3;
        }
        if (this.rkw.bcS() && this.cts.g(n, n2, s)) {
            rj_0 rj_02 = this.cts.X(n, n2);
            if (rj_02 instanceof qu_0 && rj_02 != this.rkw) {
                est_02.l(rj_02);
                est_02.setStopped(true);
            } else if (!(rj_02 instanceof qu_0)) {
                est_02.setStopped(true);
            }
            return est_02;
        }
        if (this.rkw instanceof eSP && !(list = this.rkz.bai().c(n, n2, etm_0.rnz.aHp())).isEmpty()) {
            est_02.setStopped(true);
            return est_02;
        }
        est_02.fL(true);
        return est_02;
    }

    private boolean C(int n, short s) {
        short s2 = wv_0.a(this.mxU, this.rkA, bkx, s);
        if (s2 == Short.MIN_VALUE) {
            return false;
        }
        int n2 = this.bqo.a(s2 + this.mxU, this.mxU, this.rkA, bkx, 0, n, rkv);
        if (n2 <= 0) {
            return false;
        }
        short s3 = esw_0.rkv[this.bqo.bpT[0]].ban;
        return this.rkC <= 0 || s3 - s <= this.rkC;
    }

    private short fIj() {
        return esw_0.rkv[this.bqo.bpT[0]].ban;
    }

    private void fIk() {
        wt_0[] wt_0Array = bkx;
        bkx = rkv;
        rkv = wt_0Array;
        this.mxU = this.bqo.bpT[0];
    }

    private boolean fD(int n, int n2) {
        if (this.bOo.aK(n, n2)) {
            return true;
        }
        this.bOo = this.cts.aO(n, n2);
        return this.bOo != null;
    }

    private boolean fE(int n, int n2) {
        return this.rkx.cF(n, n2);
    }

    public void mr(boolean bl) {
        this.rkB = bl;
    }

    public void So(int n) {
        this.rkC = n;
    }

    static {
        int n;
        rku = Logger.getLogger(esw_0.class);
        bkx = new wt_0[32];
        for (n = 0; n < bkx.length; ++n) {
            esw_0.bkx[n] = new wt_0();
        }
        rkv = new wt_0[32];
        for (n = 0; n < rkv.length; ++n) {
            esw_0.rkv[n] = new wt_0();
        }
    }
}

