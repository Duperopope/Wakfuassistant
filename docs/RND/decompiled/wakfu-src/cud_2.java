/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cUd
 */
public class cud_2
implements adi_1 {
    protected static final Logger nLo = Logger.getLogger(cud_2.class);
    public static final int nLp = 260;
    public static final int nLq = 45;
    private static final cud_2 nLr = new cud_2();
    private alx_2 ikv;

    public static cud_2 eRs() {
        return nLr;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        aam_22.d();
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
        if (!bl) {
            if (!(bTl.lnl.ctn() != -1 || bTj.eno().doD() != null && fse_1.gFu().dp("wakfuEcosystemEnabled"))) {
                return;
            }
            this.ikv = new cue_1(this);
            fyw_0.gqw().a(this.ikv);
            fse_1.gFu().f("wakfuMonsterZoneManager", boc_2.eht());
            fse_1.gFu().f("wakfuResourceZoneManager", bod_1.ehw());
            fse_1.gFu().f("wakfuGlobalZoneManager", boa_2.ehn());
            fse_1.gFu().f("wakfuEcosystemGaugeSize", new fsm_1(260, 30));
            ccj_2.g("ecosystemEquilibriumDialog", 32768L);
            cAY.eHc().nP(600141L);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().b(this.ikv);
            fse_1.gFu().vX("wakfuMonsterZoneManager");
            fse_1.gFu().vX("wakfuResourceZoneManager");
            fyw_0.gqw().tl("ecosystemEquilibriumDialog");
            cAY.eHc().eHr();
        }
    }
}

