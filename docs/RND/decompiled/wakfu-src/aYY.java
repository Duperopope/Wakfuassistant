/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class aYY
implements afl {
    static final Logger hyd = Logger.getLogger(aYY.class);
    private static final aYY hye = new aYY();
    private static final int hyf = 186;

    public static aYY cYw() {
        return hye;
    }

    private aYY() {
    }

    public void a(WL wL) {
        aYY.cYJ();
        aYY.cYI();
        aYY.cYH();
        aYY.cYF();
        aYY.cYG();
        aYY.cYE();
        aYY.cYD();
        aYY.cYC();
        aYY.cYB();
        aYY.cYA();
        aYY.cYL();
        this.cYz();
        aYY.cYy();
        aYY.cYx();
        aYY.cYM();
        aYY.cYN();
        aYY.cYO();
        aYY.cYP();
        aYY.cYQ();
        aYY.cYR();
        aYY.cYS();
        aYY.cYT();
        aYY.cYK();
        baq.cZh();
        wL.b(this);
    }

    private static void cYx() {
        aqb_1.bGD().a(new aMg(), new ayz_0());
    }

    private static void cYy() {
        aqb_1.bGD().a(new amq_0(), new azf_0());
    }

    private void cYz() {
        aqb_1.bGD().a(new anm_0(), new aZg(this));
    }

    private static void cYA() {
        aqb_1.bGD().a(new aol_0(), new azh_0());
    }

    private static void cYB() {
        aqb_1.bGD().a(new aLL(), new azi_0());
    }

    private static void cYC() {
        aqb_1.bGD().a(new anj_0(), new azj_0());
    }

    private static void cYD() {
        aqb_1.bGD().a(new aLT(), new aZk());
    }

    private static void cYE() {
        aqb_1.bGD().a(new aLn(), new aZl());
    }

    private static void cYF() {
        aqb_1.bGD().a(new als_0(), new azm_0());
    }

    private static void cYG() {
        aqb_1.bGD().a(new alg_0(), new aza_0());
    }

    private static void cYH() {
        aqb_1.bGD().a(new aOK(), new aZb());
    }

    private static void cYI() {
        aqb_1.bGD().a(new amp_0(), new aZc());
    }

    private static void cYJ() {
        aqb_1.bGD().a(new alr_0(), new azd_0());
    }

    private static void cYK() {
        aqb_1.bGD().a(new alf_0(), alf_02 -> {
            int n = alf_02.d();
            int n2 = alf_02.ckr();
            int n3 = alf_02.cks();
            aLD aLD2 = alf_02.ckt();
            fda_0.rWI.a(new fdg(n, n3, n2, aYY.b(aLD2), aYY.a(aLD2)));
        });
    }

    private static void cYL() {
        aqb_1.bGD().a(new aoj_0(), new aZe());
    }

    private static void cYM() {
        aqb_1.bGD().a(new aOp(), aOp2 -> {
            aLD aLD2 = aOp2.ckt();
            fdb_0 fdb_02 = new fdb_0(aOp2.d(), aOp2.ckr(), aYY.b(aLD2), aYY.a(aLD2));
            fda_0.rWI.a(fdb_02);
        });
    }

    private static void cYN() {
        aqb_1.bGD().a(new aMb(), aMb2 -> {
            int n = aMb2.d();
            fda_0.rWI.a(new fdq(n, 186, aMb2.IO(), eIx.qwB, 0));
        });
    }

    private static void cYO() {
        aqb_1.bGD().a(new aou_0(), aou_02 -> {
            int n = aou_02.d();
            fda_0.rWI.a(new fdC(n, 186, aou_02.cuV(), eIx.qwB, 0));
        });
    }

    private static void cYP() {
        fdv fdv2 = new fdv(1, 186, eIx.qwB, 0);
        fda_0.rWI.a(fdv2);
    }

    private static void cYQ() {
        aqb_1.bGD().a(new amf_0(), amf_02 -> {
            int n = amf_02.d();
            String string = amf_02.getAnimName();
            byte by = amf_02.aWO();
            fda_0.rWI.a(new fdr(n, 186, eIx.qwB, 0, string, by));
        });
    }

    private static void cYR() {
        aqb_1.bGD().a(new alx_0(), alx_02 -> {
            int n = alx_02.d();
            byte by = alx_02.clJ();
            int[] nArray = alx_02.clK();
            fda_0.rWI.a(new fdk_0(n, 186, eIx.qwB, 0, by, nArray));
        });
    }

    private static void cYS() {
        aqb_1.bGD().a(new aNe(), aNe2 -> {
            int n = aNe2.d();
            byte by = aNe2.cqg();
            fda_0.rWI.a(new fdw_0(n, 186, eIx.qwB, 0, by));
        });
    }

    private static void cYT() {
        aqb_1.bGD().a(new aly_0(), aly_02 -> {
            ang_2 ang_22;
            try {
                ang_22 = ehu_0.rY(aly_02.aGr());
            }
            catch (Exception exception) {
                hyd.error((Object)("Impossible de compiler le crit\u00e8re de la porte " + aly_02.d()), (Throwable)exception);
                return;
            }
            fda_0.rWI.a(new fdp(aly_02.d(), aly_02.clf(), aly_02.cmN(), aly_02.cmO(), aly_02.cmP(), ang_22, eIx.qwB, 0));
        });
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.ie.params", new Object[0]);
    }

    public static int a(aLD aLD2) {
        if (aLD2 == null) {
            return 0;
        }
        return aLD2.clU();
    }

    public static eIx b(aLD aLD2) {
        if (aLD2 == null) {
            return eIx.qwB;
        }
        return eIx.eQ(aLD2.clT());
    }
}

