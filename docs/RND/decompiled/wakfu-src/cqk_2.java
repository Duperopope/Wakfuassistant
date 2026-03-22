/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cQk
 */
public class cqk_2
extends cpm_1
implements adm_0 {
    private byv_0 nkO;

    @Override
    public cpm_1 eLD() {
        return new cqk_2();
    }

    @Override
    public boolean bxO() {
        if (!(this.cqO instanceof byv_0)) {
            return false;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bzq_2 bzq_22 = bzp_2.eqt().mA(bgt_02.aqZ());
        if (bzq_22 != null && bzq_22.eqA() == Vf.bxK) {
            return false;
        }
        if (bgt_02.doP()) {
            return false;
        }
        if (bgt_02.dnj()) {
            return false;
        }
        if (bsl_0.jfZ.dFs()) {
            return false;
        }
        return !bgt_02.djT();
    }

    @Override
    public boolean isEnabled() {
        byv_0 byv_02 = (byv_0)this.cqO;
        if (byv_02.bfb() && evm_2.c(aue_0.cVJ().cVO().cWq(), evm_2.osZ)) {
            return false;
        }
        return super.isEnabled() && cqk_2.eMa() && !cqk_2.eMb();
    }

    private static boolean eMa() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.dnw() != null) {
            return true;
        }
        bJK bJK2 = bgt_02.dnU();
        if (bJK2 == null) {
            return true;
        }
        foP foP2 = bJK2.doW();
        if (foP2 == null) {
            return true;
        }
        fjn_0 fjn_02 = bgt_02.ffF();
        return bre_2.elb().a(fjn_02, foP2.gfT());
    }

    private static boolean eMb() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bzq_2 bzq_22 = bzp_2.eqt().mA(bgt_02.aqZ());
        return bzq_22 != null && bzq_22.eqw();
    }

    private void eMc() {
        cmV cmV2 = new cmV();
        cmV2.nz(this.nkO.dOx().Xi());
        aue_0.cVJ().etu().d(cmV2);
    }

    @Override
    public void run() {
        if (!this.bxO()) {
            nii.error((Object)("Tentative de lancement de l'action '" + this.eLz().aXB() + "' alors que isRunnable retourne que l'action est impossible"));
            return;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bgt_02.i(false, false);
        this.nkO = (byv_0)this.cqO;
        acd_1 acd_12 = acf_1.a(bgt_02.eap(), this.nkO.aVK());
        if (acd_12 == null) {
            return;
        }
        if (acd_12.A(bgt_02.eap()) == 0) {
            int n = this.nkO.bcC() - bgt_02.bcC();
            int n2 = this.nkO.bcD() - bgt_02.bcD();
            bgt_02.a(acq_1.bo(n, n2));
            this.eMc();
        } else {
            bgt_02.ddI().b(this);
            bgt_02.c(acd_12, false, true);
        }
    }

    @Override
    public cps_1 eLz() {
        return cps_1.niG;
    }

    @Override
    public void pathEnded(ads_0 ads_02, int n, int n2, short s) {
        ads_02.c(this);
        int n3 = this.nkO.bcC() - ads_02.bcC();
        int n4 = this.nkO.bcD() - ads_02.bcD();
        if (Math.abs(n3) <= 1 && Math.abs(n4) <= 1) {
            ads_02.a(acq_1.bo(n3, n4));
            this.eMc();
        }
    }

    @Override
    protected int eLB() {
        return crc_2.nmV.nnW;
    }

    @Override
    public String getLabel() {
        ahv_2 ahv_22 = new ahv_2().ceu().ih(this.isEnabled() ? nik : nim);
        ahv_22.c(aum_0.cWf().c(this.ely(), new Object[0]));
        ahv_22.cev();
        return ahv_22.ceL();
    }

    @Override
    public String ely() {
        byv_0 byv_02 = (byv_0)this.cqO;
        if (byv_02.bfb()) {
            return "bag.forbiddenLocked";
        }
        if (!cqk_2.eMa()) {
            return "bag.forbiddenInEnnemyTerritory";
        }
        if (cqk_2.eMb()) {
            return "action.error.notInBattleground";
        }
        return "desc.mru.bagEnterOther";
    }
}

