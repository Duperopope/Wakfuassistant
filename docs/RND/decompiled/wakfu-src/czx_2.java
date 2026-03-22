/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cZX
 */
public class czx_2
implements czz_2 {
    private static final Logger obH = Logger.getLogger(czx_2.class);

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 19437: {
                this.bGy();
                return false;
            }
        }
        return true;
    }

    public void bGy() {
        bnv_2 bnv_22;
        aue_0 aue_02 = aue_0.cVJ();
        bgt_0 bgt_02 = aue_02.cVK();
        bdj_2 bdj_22 = bgt_02.ddI();
        if (bdj_22.bvE()) {
            aPd.e("bag.forbidden.moving", new Object[0]);
            return;
        }
        if (bgt_02.djT()) {
            return;
        }
        if (bgt_02.dnj()) {
            return;
        }
        if (bsl_0.jfZ.dFs()) {
            return;
        }
        if (!bgt_02.i(false, true)) {
            return;
        }
        if (!bgt_02.dnk()) {
            return;
        }
        bgt_0 bgt_03 = aue_0.cVJ().cVK();
        bzq_2 bzq_22 = bzp_2.eqt().mA(bgt_02.aqZ());
        if (bzq_22 != null && bzq_22.eqw()) {
            aPd.e("action.error.notInBattleground", new Object[0]);
            return;
        }
        if (aue_02.c(ctp_2.eQZ())) {
            aue_02.b(ctp_2.eQZ());
        }
        if ((bnv_22 = bgt_02.dnw()) != null) {
            bdj_22.a(abi_1.dzk);
            cAY.eHc().nP(600066L);
            bgt_02.fY(true);
            this.eZy();
            return;
        }
        if (!this.eZz()) {
            aPd.e("bag.forbiddenAtThisPosition", new Object[0]);
            return;
        }
        if (!this.eZA()) {
            aPd.e("bag.forbiddenInEnnemyTerritory", new Object[0]);
            return;
        }
        if (fyw_0.gqw().to("exchangeDialog")) {
            aue_02.b(cup_1.eRM());
        }
        if (fyw_0.gqw().to("protectorManagementDialog")) {
            aue_02.b(cxf_1.eXs());
        }
        if (fyw_0.gqw().to("weatherInfoDialog")) {
            aue_02.b(cyn_1.eYy());
        }
        if (aue_02.c(cur_1.eRP())) {
            aue_02.b(cur_1.eRP());
        }
        cwd_2.eVe().eVg();
        bdj_22.a(abi_1.dzk);
        bdj_22.bvA();
        this.eZx();
        cAY.eHc().nP(600065L);
        bgt_02.fY(true);
    }

    void eZx() {
        cmV cmV2 = new cmV();
        cmV2.nz(0L);
        aue_0.cVJ().etu().d(cmV2);
    }

    private void eZy() {
        cmX cmX2 = new cmX();
        aue_0.cVJ().etu().d(cmX2);
    }

    private boolean eZz() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bzq_2 bzq_22 = bzp_2.eqt().mA(bgt_02.aqZ());
        return bnu_2.a(bgt_02.eap(), bzq_22);
    }

    private boolean eZA() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bJK bJK2 = bgt_02.dnU();
        if (bJK2 == null) {
            return true;
        }
        foP foP2 = bJK2.doW();
        fjn_0 fjn_02 = bgt_02.ffF();
        return foP2 == null || bre_2.elb().a(fjn_02, foP2.gfT());
    }
}

