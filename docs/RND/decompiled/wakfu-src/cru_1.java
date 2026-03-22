/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRu
 */
public class cru_1
extends cpm_1 {
    private bnv_2 nmk;
    private byte mbL;

    public cru_1(bnv_2 bnv_22, byte by) {
        this.nmk = bnv_22;
        this.mbL = by;
    }

    @Override
    public cpm_1 eLD() {
        return new cru_1(this.nmk, this.mbL);
    }

    public cru_1() {
    }

    @Override
    public boolean bxO() {
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
        nii.error((Object)"MRUUpgradeDimmensionalBagRoomAction.run()");
    }

    @Override
    public cps_1 eLz() {
        return cps_1.niH;
    }

    @Override
    public String ely() {
        return "bagUpgrade";
    }

    @Override
    protected int eLB() {
        return crc_2.nmR.nnW;
    }
}

