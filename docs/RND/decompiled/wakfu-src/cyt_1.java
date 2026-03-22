/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cYt
 */
public class cyt_1
implements adi_1 {
    private static final cyt_1 nYu = new cyt_1();
    private final bNC nYv = new cyu_2(this);
    private bkb_2 nYw;

    public static cyt_1 eXX() {
        return nYu;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 18539: {
                aue_0.cVJ().a(cwq_2.eVS());
                return false;
            }
            case 16121: {
                if (!aue_0.cVJ().c(ctj_1.eQS())) {
                    aue_0.cVJ().a(ctj_1.eQS());
                }
                ctj_1.bRk();
                fiq_2.gCw().d(fik_2.a(string -> dae_0.cV((short)16849)).l("question.generateDebugInformation", new Object[0]).vG(ccp_2.mRE.byf()).abQ(1));
                return false;
            }
            case 19471: {
                if (!aue_0.cVJ().c(csh_1.eNW())) {
                    aue_0.cVJ().a(csh_1.eNW());
                } else {
                    aue_0.cVJ().b(csh_1.eNW());
                }
                return false;
            }
            case 19040: {
                if (!aue_0.cVJ().c(csg_1.eNT())) {
                    aue_0.cVJ().a(csg_1.eNT());
                } else {
                    aue_0.cVJ().b(csg_1.eNT());
                }
                return false;
            }
            case 16419: {
                dae_0 dae_02 = (dae_0)aam_22;
                fse_1.gFu().f("battlegroundBarDetail", dae_02.bCu());
                return false;
            }
            case 17294: {
                dae_0 dae_03 = (dae_0)aam_22;
                cso_2 cso_22 = cso_2.eOa();
                cso_22.Mr(dae_03.bCo());
                aue_0.cVJ().a(cso_22);
            }
        }
        return true;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        ccj_2.g("battlegroundBarDialog", 8192L);
        ccj_2.g("systemBarDialog", 8192L);
        if (this.nYw == null) {
            this.nYw = new bkb_2();
            fse_1.gFu().f("pvpInfo", this.nYw);
        }
        this.nYw.deS();
        fse_1.gFu().f("reportBug", auc_0.cVq().b("bugReport.enable", false));
        fse_1.gFu().f("battlegroundBarDetail", false);
        bNB.kDS.a(this.nYv);
        cdv_0.euj().d(this);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        fyw_0.gqw().tl("systemBarDialog");
        this.nYw.ebD();
        cdv_0.euj().e(this);
    }

    public bkb_2 eXY() {
        return this.nYw;
    }
}

