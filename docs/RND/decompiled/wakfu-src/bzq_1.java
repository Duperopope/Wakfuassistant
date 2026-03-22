/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from bZq
 */
public class bzq_1
implements Runnable {
    public static final bzq_1 lCJ = new bzq_1();
    protected static final Logger lCK = Logger.getLogger(bzq_1.class);
    public static final int lCL = 5000;
    private fsc lCM = fsc.tbe;
    private bzo_1 lCN;
    private final bzb_2 lCO = new bzb_2(0.0f);
    private final bzb_2 lCP = new bzb_2(bzv_1.lDf.epX());
    private final bzu_1 lCQ = new bzu_1();
    private boolean lCR;
    private final HashMap<fsc, bzo_1> lCS = new HashMap();
    private bzs_1 lCT;
    private boolean aJj = true;
    private final ArrayList<bzo_1> lCU = new ArrayList();

    private bzq_1() {
    }

    public void iM(boolean bl) {
        this.lCR = bl;
    }

    private long bsV() {
        return System.currentTimeMillis();
    }

    public void epT() {
        bzg_1 bzg_12 = new bzg_1();
        bzj_1 bzj_12 = new bzj_1();
        bzl_1 bzl_12 = new bzl_1();
        bzc_1 bzc_12 = new bzc_1();
        this.a(fsc.tbf, bzg_12);
        this.a(fsc.tbg, bzg_12);
        this.a(fsc.tbi, bzl_12);
        this.a(fsc.tbl, bzl_12);
        this.a(fsc.tbk, bzc_12);
        this.a(fsc.tbh, bzj_12);
        this.a(fsc.tbj, bzj_12);
        this.lCU.add(this.lCQ);
    }

    public void eO(float f2) {
        assert (f2 >= 0.0f && f2 <= 1.0f);
        for (bzo_1 bzo_12 : this.lCU) {
            if (!(bzo_12 instanceof bzg_1)) continue;
            ((bzg_1)bzo_12).eN(f2);
        }
    }

    private void a(fsc fsc2, bzo_1 bzo_12) {
        this.lCS.put(fsc2, bzo_12);
        if (!this.lCU.contains(bzo_12)) {
            this.lCU.add(bzo_12);
        }
    }

    public void start() {
        abg_2.bUP().a((Runnable)this, 50L);
    }

    public void az(boolean bl) {
        if (!bl) {
            this.aJj = false;
            return;
        }
        if (!this.aJj) {
            this.aJj = true;
            for (bzo_1 bzo_12 : this.lCU) {
                if (bzo_12 == null) continue;
                bzo_12.bK(0.0f);
            }
        }
    }

    public void epU() {
        if (this.lCN != null) {
            this.c(this.lCM);
        }
        for (bzo_1 bzo_12 : this.lCU) {
            if (bzo_12 == null) continue;
            bzo_12.bK(0.0f);
            bzo_12.bhk();
        }
        this.lCM = null;
        this.lCN = null;
    }

    public void iN(boolean bl) {
        for (bzo_1 bzo_12 : this.lCU) {
            if (bzo_12 == null) continue;
            bzo_12.setVisible(bl);
        }
    }

    private cCw a(fsc fsc2) {
        if (fsc2 == null) {
            return null;
        }
        switch (fsc2) {
            case tbg: 
            case tbi: 
            case tbl: {
                return cCw.mzY;
            }
            case tbh: 
            case tbj: {
                return cCw.mAa;
            }
        }
        return null;
    }

    public void epV() {
        this.b(this.lCM);
    }

    private void b(fsc fsc2) {
        if (fsc2 == null) {
            return;
        }
        switch (fsc2) {
            case tbe: 
            case tbf: 
            case tbk: {
                break;
            }
            case tbg: 
            case tbi: 
            case tbl: {
                cAY.eHc().a(new cCx(cCw.mzY));
                break;
            }
            case tbh: 
            case tbj: {
                cAY.eHc().a(new cCx(cCw.mAa));
            }
        }
    }

    private void c(fsc fsc2) {
        if (fsc2 == null) {
            return;
        }
        switch (fsc2) {
            case tbe: 
            case tbf: 
            case tbk: {
                break;
            }
            case tbg: 
            case tbi: 
            case tbl: {
                cAY.eHc().a(new cCx(cCw.mzZ));
                break;
            }
            case tbh: 
            case tbj: {
                cAY.eHc().a(new cCx(cCw.mAb));
            }
        }
    }

    public void a(fsc fsc2, int n) {
        if (this.lCR) {
            return;
        }
        if (fsc2 == this.lCM) {
            return;
        }
        long l = this.bsV();
        bzo_1 bzo_12 = this.lCS.get((Object)fsc2);
        if (bzo_12 != this.lCN) {
            if (this.lCN != null) {
                this.lCN.a(0.0f, n, l);
            }
            this.lCN = bzo_12;
        }
        if (this.a(fsc2) != this.a(this.lCM)) {
            this.c(this.lCM);
            this.b(fsc2);
        }
        this.lCM = fsc2;
        if (this.lCN != null) {
            switch (this.lCM) {
                case tbf: 
                case tbk: {
                    this.lCN.a(0.33f, n, l);
                    break;
                }
                case tbg: 
                case tbh: {
                    this.lCN.a(0.66f, n, l);
                    break;
                }
                case tbi: 
                case tbj: {
                    this.lCN.a(1.0f, n, l);
                    break;
                }
                case tbe: {
                    this.lCN.a(1.0f, n, l);
                    break;
                }
                case tbl: {
                    this.lCN.a(1.0f, n, l);
                }
            }
        }
    }

    public void d(fsc fsc2) {
        this.a(fsc2, 5000);
    }

    public void eP(float f2) {
        this.d(f2, 5000);
    }

    private void d(float f2, int n) {
        this.lCO.a(f2, n, this.bsV());
    }

    public void a(bzv_1 bzv_12) {
        this.a(bzv_12, 5000);
    }

    private void a(bzv_1 bzv_12, int n) {
        this.lCP.a(bzv_12.epX(), n, this.bsV());
    }

    @Override
    public void run() {
        if (this.lCM == null) {
            return;
        }
        try {
            aam_0 aam_02 = aie_0.cfn().bmC();
            if (!this.aJj) {
                for (int i = 0; i < this.lCU.size(); ++i) {
                    bzo_1 bzo_12 = this.lCU.get(i);
                    if (bzo_12 == null) continue;
                    bzo_12.b(aam_02, 0.0f, 0.0f);
                }
                return;
            }
            long l = this.bsV();
            if (this.lCT == null) {
                this.a(l, aam_02);
            } else {
                this.lCT.a(l, this.lCO, this.lCP, this.lCQ, this.lCS);
            }
            float f2 = this.lCP.epJ();
            f2 += Math.abs(f2) * abr_1.a(0.0f, l, 1.0f, 5, abx_2.dAo);
            float f3 = this.lCO.epJ();
            f3 += Math.abs(f3) * abr_1.a(1.0f, l, 1.0f, 5, abx_2.dAo);
            for (int i = 0; i < this.lCU.size(); ++i) {
                bzo_1 bzo_13 = this.lCU.get(i);
                if (bzo_13 == null) continue;
                if (bzo_13.bnY() > 0.0f && !bzo_13.bhl()) {
                    bzo_13.i(aam_02);
                }
                bzo_13.b(aam_02, f2, f3);
            }
        }
        catch (Exception exception) {
            lCK.error((Object)"Exception ", (Throwable)exception);
        }
    }

    private void a(long l, afV afV2) {
        this.lCO.hD(l);
        this.lCP.hD(l);
        if (this.lCO.epJ() > 0.0f && !this.lCQ.bhl()) {
            this.lCQ.i(afV2);
        }
        for (int i = 0; i < this.lCU.size(); ++i) {
            bzo_1 bzo_12 = this.lCU.get(i);
            if (bzo_12 == null) continue;
            bzo_12.mv(l);
        }
    }

    public void a(bzs_1 bzs_12) {
        this.lCT = bzs_12;
    }

    public static void a(agf agf2, axb_2 axb_22) {
        bzq_1.a(agf2, axb_22, 200, 1000, -2.5f, -0.5f);
    }

    public static void a(agf agf2, axb_2 axb_22, int n, int n2, float f2, float f3) {
        int n3 = GC.q(1, 3);
        int n4 = 0;
        int n5 = 0;
        for (int i = 0; i < n3; ++i) {
            int n6 = bzq_1.d(n4, axb_22);
            n5 = n4 + n6;
            n4 += GC.q(n, n2);
        }
        n5 = Math.max(800, n5);
        aba_0 aba_02 = new aba_0();
        aba_02.b(agf2);
        aba_02.bX(true);
        aba_02.aF(70.0f, GC.b(f2, f3));
        aba_02.a(new acc(100, 100, n5 / 2, n5 / 2));
        ast_1.bJG().a(aba_02);
        cAY.eHc().a(new cCx(cCw.mAc));
    }

    private static int d(int n, axb_2 axb_22) {
        abd_0 abd_02 = new abd_0();
        abd_02.eh("snow.tga");
        abd_02.a(auw_2.dfL, auw_2.dfI);
        abd_02.c(axb_22.aIU(), axb_22.aIV(), axb_22.aIW(), axb_22.aIX());
        float f2 = GC.b(0.7f, 1.0f) + 2.0f;
        float f3 = GC.b(-2.0f, 2.0f);
        float f4 = GC.b(0.0f, 1.0f) + f2 * 0.5f;
        abd_02.aw(f3, f4);
        abd_02.aG(f2, f2);
        int n2 = GC.q(0, 200) + 100;
        abd_02.a(new acc(n, 25, n2, 75));
        ast_1.bJG().a(abd_02);
        return n2;
    }
}

