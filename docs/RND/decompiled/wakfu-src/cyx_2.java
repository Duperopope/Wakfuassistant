/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cYx
 */
public class cyx_2
implements adi_1 {
    private static final Logger nYz = Logger.getLogger(cyx_2.class);
    private static final cyx_2 nYA = new cyx_2();
    private long huG;
    private bgy hsj;
    private Runnable nYB;
    private fes_2 nQc;
    private boolean nYC;
    private fce_2 kqa;
    private abx_1 nYD;
    private static final String nYE = "endPlacementAndTurn";
    private ahk_1 nYF;

    public static cyx_2 eYd() {
        return nYA;
    }

    private void U(int n, boolean bl) {
        if (this.nYC) {
            return;
        }
        this.nYC = true;
        if (this.nQc == null) {
            return;
        }
        int n2 = 0;
        if (!bl && n != -1) {
            Object object;
            String string = "list#" + n + ".image";
            fbt_1 fbt_12 = (fbt_1)this.nQc.getElementMap().uH(string);
            if (fbt_12 != null) {
                object = fbt_12.getAppearance();
                ((fhv_1)object).a(new fsa_2(awx_2.dnF, awx_2.dnC, (fzc)object, 0, 250, 8, true, abn.cdr));
            }
            n2 = 1300;
            object = new fsb_2(this.nQc.getX(), this.nQc.getY(), fbj_1.getInstance().getWidth(), this.nQc.getY(), this.nQc, n2, 175, abn.cdr);
            ((fsr_2)object).a((fsr_22, fsg_22) -> {
                switch (fsg_22) {
                    case veA: {
                        abg_2.bUP().i(() -> aue_0.cVJ().b(this));
                    }
                }
            });
            this.nQc.a((fsr_2)object);
        } else {
            aue_0.cVJ().b(this);
        }
    }

    void eYe() {
        try {
            if (this.nYF != null) {
                this.nYF.dZ(true);
                this.nYF.br(0.0f, 500.0f);
                this.nYF = null;
            }
            if (aue_0.cVJ().c(this)) {
                aue_0.cVJ().b(this);
            }
        }
        catch (Exception exception) {
            nYz.error((Object)"Exception levee", (Throwable)exception);
        }
    }

    private void b(enk_0 enk_02, boolean bl) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bsj_0 bsj_02 = bgt_02.dkZ();
        if (bsj_02 == null) {
            return;
        }
        if (enk_02 == null) {
            this.U(-1, bl);
        } else {
            this.o(enk_02);
            this.V(enk_02.aZH(), bl);
        }
    }

    private void eYf() {
        this.U(-1, true);
        ckI ckI2 = new ckI();
        ckI2.eY(this.hsj.Sn());
        aue_0.cVJ().etu().d(ckI2);
    }

    public void V(int n, boolean bl) {
        if (this.hsj == null) {
            return;
        }
        bsj_0 bsj_02 = this.hsj.dkZ();
        if (bsj_02 == null) {
            return;
        }
        if (n != -1) {
            int n2;
            enk_0 enk_02 = bsj_02.dGQ().eLo().SK(n);
            btZ[] btZArray = (btZ[])fse_1.gFu().vY("fight.timePointAvailableBonuses");
            for (n2 = 0; n2 < btZArray.length && btZArray[n2].dIy().aZH() != enk_02.aZH(); ++n2) {
            }
            this.U(n2, bl);
        } else {
            this.U(-1, bl);
        }
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 16460: {
                if (!this.hsj.dkQ()) {
                    return false;
                }
                dbp dbp2 = (dbp)aam_22;
                bsz_0 bsz_02 = this.hsj.djV();
                bsz_02.a(dbp2.faJ());
                this.b(dbp2.faJ().dIy(), true);
                cAY.eHc().nP(600124L);
                return false;
            }
            case 16045: {
                this.eYf();
                return false;
            }
        }
        return true;
    }

    public bgy dHq() {
        return this.hsj;
    }

    public void cm(bgy bgy2) {
        this.hsj = bgy2;
        btZ[] btZArray = this.hsj.dkZ().dGQ().kD(this.hsj.Sn());
        fse_1.gFu().f("fight.timePointAvailableBonuses", btZArray);
        fse_1.gFu().f("fight.timePointSelectionChooser", bgy2);
        fse_1.gFu().f("fight.timePointSelectionChooser.isHero", bgy2.dmc());
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    private void o(enk_0 enk_02) {
        ckH ckH2 = new ckH();
        ckH2.eY(this.hsj.Sn());
        ckH2.KX(enk_02.aZH());
        aue_0.cVJ().etu().d(ckH2);
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fse_1.gFu().f("fight.timePointBonusRemainingTime", Float.valueOf(1.0f));
            fse_1.gFu().f("fight.timePointBonusFighterId", this.hsj.djY().Sn());
            this.nYB = new cyz_1(this);
            this.nYC = false;
            long l = 8208L;
            if (this.hsj.dkQ() || this.hsj.aFW() == 5) {
                l |= 0x100L;
            }
            this.nQc = (fes_2)ccj_2.g("timePointBonusSelectionDialog", l);
            this.nQc.setX(fbj_1.getInstance().getWidth());
            this.kqa = (fce_2)this.nQc.getElementMap().uH("progressBar");
            this.kqa.setInitialValue(1.0f);
            fyw_0.gqw().d("wakfu.timePointSelection", chm_1.class);
            abg_2.bUP().a(() -> {
                if (this.nQc == null) {
                    return;
                }
                if (this.nQc.getSize() == null) {
                    return;
                }
                this.nQc.setPosition(fbj_1.getInstance().getWidth(), faa_2.tLP.cg(this.nQc.getHeight(), fbj_1.getInstance().getHeight()));
                this.nQc.a(new fsb_2(this.nQc.getX(), this.nQc.getY(), faa_2.tLO.cf(this.nQc.getWidth(), fbj_1.getInstance().getWidth()), this.nQc.getY(), this.nQc, 0, 150, abn.cdr));
            }, 200L, 1);
            if (this.hsj.dkQ()) {
                cAY.eHc().nP(600123L);
                this.nYF = cAY.eHc().r(600126L, true);
            }
            if (this.huG <= 0L) {
                this.huG = 30000L;
            }
            this.kqa.setTweenDuration(this.huG);
            this.kqa.setValue(0.0f);
            frx_1.eKH();
            abg_2.bUP().a(this.nYB, this.huG, 1);
            Runnable runnable = () -> {
                if (this.hsj == aue_0.cVJ().cVK()) {
                    chm_1.skipEffectChoice();
                }
            };
            this.nYD = new abx_1();
            amc_1 amc_12 = aUm.cUI().fb(nYE);
            this.nYD.a(402, amc_12.bCC(), amc_12.bCD(), runnable);
            aie_0.cfn().bmE().a(this.nYD, true);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.nQc = null;
            fyw_0.gqw().tl("timePointBonusSelectionDialog");
            fyw_0.gqw().tc("wakfu.timePointSelection");
            abg_2.bUP().h(this.nYB);
            fse_1.gFu().f("fight.timePointBonusFighterId", (Object)null);
            if (this.nYF != null) {
                this.nYF.br(0.0f, 500.0f);
                this.nYF.dZ(true);
                this.nYF = null;
            }
            this.kqa = null;
            this.hsj = null;
            this.huG = 0L;
            aie_0.cfn().bmE().a(this.nYD);
        }
    }

    public void oL(long l) {
        this.huG = l;
    }
}

