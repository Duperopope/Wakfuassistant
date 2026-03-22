/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aWR
 */
public final class awr_0
extends agb_1 {
    private final bsj_0 hvQ;
    private final cqq_0 hvR;

    public awr_0(int n, int n2, int n3, bsj_0 bsj_02, cqq_0 cqq_02, btd_0 btd_02) {
        super(n, n2, n3);
        this.hvQ = bsj_02;
        this.hvR = cqq_02;
    }

    @Override
    protected long cbk() {
        dJP.info((Object)"CREATION DU COMBAT");
        bsM bsM2 = new bsM();
        bsM2.a(this.hvR, this.hvQ);
        this.a(this.hvR);
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bgt_02.dkL();
        bgy bgy2 = (bgy)this.hvQ.qJ(this.hvR.eyq());
        byte by = this.hvQ.aS(bgy2);
        byte by2 = this.hvQ.aS(bgt_02);
        if (eUw.Sy(this.hvR.exZ()).fLf() && by != by2) {
            aPd.g("pvp.aggroChatMessage", bgy2.getName());
        }
        aJP.cig().cij();
        bud.joo.bkZ();
        akj_0.ciY().aPc();
        return 0L;
    }

    private void a(cqq_0 cqq_02) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        this.hvQ.eF(cqq_02.eyo());
        this.hvQ.start();
        fse_1.gFu().f("fight", this.hvQ);
        fse_1.gFu().f("fight.timeline", this.hvQ.dGQ());
        fse_1.gFu().f("isInFightCreationOrPlacement", true);
        bgt_02.i(false, false);
        aue_0.cVJ().b(cxt_2.eXB());
        aue_0.cVJ().b(ctg_1.eQG());
        aue_0.cVJ().b(csk_1.nFj);
        aue_0.cVJ().b(cwe_1.eVh());
        aue_0.cVJ().b(cus_2.eRQ());
        aue_0.cVJ().b(cvm_1.eTF());
        aue_0.cVJ().b(czi_2.eYU());
        if (bgt_02.dkG()) {
            aue_0.cVJ().b(bDr.dQP());
            aue_0.cVJ().b(cus_1.eTb());
        }
        aue_0.cVJ().b(cdt_0.eub());
        try {
            cAY.eHc().n(this.hvQ);
        }
        catch (Exception exception) {
            dJP.error((Object)"Exception levee", (Throwable)exception);
        }
        if (this.hvQ.bN(bgt_02.bcP())) {
            aPd.g("fight.locked.at.creation", new Object[0]);
        }
    }

    @Override
    protected void caV() {
    }
}

