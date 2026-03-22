/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bQG
implements afl {
    private static final Logger kWh = Logger.getLogger(bQG.class);
    public static final bQG kWi = new bQG();

    public void a(WL wL) {
        try {
            this.ejJ();
            this.ejI();
            this.ejK();
            this.ejL();
            this.ejN();
            this.ejM();
            fbo_0.fSh();
            bQD.ejE().ejF();
        }
        catch (Exception exception) {
            kWh.error((Object)"Exception levee", (Throwable)exception);
        }
        finally {
            wL.b(this);
        }
    }

    @Override
    public String getName() {
        return null;
    }

    private void ejI() {
        aqb_1.bGD().a(new ama_0(), (T ama_02) -> {
            Object object;
            amb_0[] amb_0Array;
            fbn_0 fbn_02 = new fbn_0((short)ama_02.d(), ama_02.coj(), ama_02.cmP(), ama_02.com(), ama_02.col(), ama_02.conn(), ama_02.cok(), ama_02.ckf());
            fbw_0.rSQ.j(fbn_02);
            for (amb_0 amb_04 : amb_0Array = ama_02.coo()) {
                object = new fbv_0(amb_04.cor(), new acd_1(amb_04.cos(), amb_04.cot(), amb_04.cou()));
                fbn_02.b((fbv_0)object);
            }
            this.a((ama_0)ama_02, fbn_02);
            for (int n : ama_02.cjX()) {
                object = bat_2.cZD().Ay(n);
                if (object != null) {
                    fbn_02.v((enk_0)object);
                    continue;
                }
                kWh.error((Object)("Probl\u00e8me de chargmeent de Building " + ama_02.d()));
            }
            for (amd_0 amd_02 : ama_02.coq()) {
                fbn_02.TY(amd_02.cmh());
            }
        });
    }

    private void ejJ() {
        aqb_1.bGD().a(new amg_0(), (T amg_02) -> {
            fbm_0 fbm_02 = new fbm_0((short)amg_02.d(), amg_02.coj(), amg_02.cmP(), amg_02.conn(), amg_02.cok());
            fbw_0.rSQ.j(fbm_02);
        });
    }

    private void a(ama_0 ama_02, fbn_0 fbn_02) {
        amc_0[] amc_0Array = ama_02.cop();
        if (amc_0Array.length != 0) {
            aae_1 aae_12 = new aae_1();
            for (amc_0 amc_02 : amc_0Array) {
                aae_12.cA(amc_02.azv(), amc_02.conn());
            }
            fbn_02.a(aae_12);
        }
    }

    private void ejK() {
        aqb_1.bGD().a(new ami_0(), (T ami_02) -> {
            aMJ[] aMJArray;
            bQA bQA2 = new bQA(ami_02.coF());
            bQB.kVP.a(bQA2);
            for (aMJ aMJ2 : aMJArray = ami_02.coG()) {
                acd_1 acd_12 = new acd_1(aMJ2.cos(), aMJ2.cot(), aMJ2.cou());
                bQA2.a(new bQC(aMJ2.aVt(), aMJ2.getAnimName(), aMJ2.coH(), aMJ2.bsr(), aMJ2.bcN(), acd_12, abi_1.wG(aMJ2.coI())));
            }
        });
    }

    private void ejL() {
        aqb_1.bGD().a(new aME(), (T aME2) -> {
            fby_0 fby_02 = new fby_0((short)aME2.d(), aME2.cjd(), aME2.aYs(), aME2.cov(), aME2.cow(), aME2.cox());
            bQF.kWe.dT(aME2.d(), aME2.coz());
            for (aMF aMF2 : aME2.coA()) {
                fby_02.fJ(aMF2.coB(), aMF2.oP());
            }
            fbw_0.rSQ.g(fby_02);
        });
    }

    private void ejM() {
        aqb_1.bGD().a(new amk_0(), (T amk_02) -> {
            fcb_0 fcb_02 = new fcb_0((short)amk_02.d(), (short)amk_02.coJ(), amk_02.cmP(), amk_02.cjd(), -1);
            fbw_0.rSQ.c(fcb_02);
            bQF.kWe.dU(amk_02.cjd(), amk_02.getSoundId());
        });
    }

    private void ejN() {
        aqb_1.bGD().a(new aMH(), (T aMH2) -> {
            fbu_0 fbu_02 = new fbu_0(aMH2.coj(), (short)aMH2.coC(), (short)aMH2.coD(), aMH2.coE(), aMH2.aGu());
            fbw_0.rSQ.b(fbu_02);
        });
    }
}

