/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cQt
 */
public class cqt_1
extends cpm_1 {
    protected cpm_1 eMf() {
        return new cqt_1();
    }

    @Override
    public cpm_1 eLD() {
        return new cqt_1();
    }

    @Override
    public boolean bxO() {
        if (this.cqO == null) {
            return false;
        }
        if (!(this.cqO instanceof bhJ)) {
            return false;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.dnj()) {
            return false;
        }
        if (bgt_02.djT()) {
            return false;
        }
        return !bsl_0.jfZ.dFs();
    }

    @Override
    public void run() {
        if (!this.bxO()) {
            nii.error((Object)("Tentative de lancement de l'action '" + this.eLz().aXB() + "' alors que isRunnable retourne que l'action est impossible"));
            return;
        }
        bhJ bhJ2 = (bhJ)this.cqO;
        big_2.b(bhJ2, (bip_2)bif_2.dYO());
    }

    @Override
    public cps_1 eLz() {
        return cps_1.niO;
    }

    @Override
    public String ely() {
        return "followCharacterWithCompass";
    }

    @Override
    protected int eLB() {
        return crc_2.nmK.nnW;
    }
}

