/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cQi
 */
public class cqi_2
extends cpm_1 {
    @Override
    public cpm_1 eLD() {
        return new cqi_2();
    }

    @Override
    public boolean bxO() {
        if (!(this.cqO instanceof bhJ)) {
            return false;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.dnj()) {
            return false;
        }
        if (bgt_02.a(ezj_0.ptl)) {
            return false;
        }
        bhJ bhJ2 = (bhJ)this.cqO;
        if (bhJ2.a(ezj_0.ptl)) {
            return false;
        }
        return !cpq_1.bU(bhJ2);
    }

    @Override
    public void run() {
        if (!this.bxO()) {
            nii.error((Object)("Tentative de lancement de l'action '" + this.eLz().aXB() + "' alors que isRunnable retourne que l'action est impossible"));
            return;
        }
        bhJ bhJ2 = (bhJ)this.cqO;
        dae_0 dae_02 = new dae_0();
        dae_02.lK(19776);
        dae_02.fa(bhJ2.getName());
        aaw_1.bUq().h(dae_02);
    }

    @Override
    public cps_1 eLz() {
        return cps_1.niT;
    }

    @Override
    public String ely() {
        return "createPrivateChat";
    }

    @Override
    public String getLabel() {
        if (!(this.cqO instanceof bhJ)) {
            return null;
        }
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.ceu().c(aum_0.cWf().c("desc.mru." + this.ely(), ((bhJ)this.cqO).getName())).cev();
        return ahv_22.ceL();
    }

    @Override
    protected int eLB() {
        return crc_2.nmu.nnW;
    }
}

