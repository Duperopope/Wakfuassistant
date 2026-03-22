/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cQG
 */
public class cqg_1
extends cpm_1 {
    private String nlt;

    @Override
    public cps_1 eLz() {
        return cps_1.niP;
    }

    @Override
    public void run() {
        bhJ bhJ2 = (bhJ)this.cqO;
        aue_0.cVJ().cVK().dnQ().mz(bhJ2.getName());
    }

    @Override
    public boolean isEnabled() {
        if (!super.isEnabled()) {
            return false;
        }
        if (!(this.cqO instanceof bhJ)) {
            return false;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return bgt_02 != null;
    }

    @Override
    public boolean bxO() {
        eyp_1 eyp_12;
        if (!(this.cqO instanceof bhJ)) {
            return false;
        }
        bhJ bhJ2 = (bhJ)this.cqO;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.a(ezj_0.ptk)) {
            return false;
        }
        if (bhJ2.a(ezj_0.ptk)) {
            return false;
        }
        if (bhJ2.djT()) {
            return false;
        }
        if (bgt_02.dnQ().dfG() && (eyp_12 = bgt_02.dnQ().dKL()).fa(bhJ2.Sn())) {
            return false;
        }
        return !cpq_1.bU(bhJ2);
    }

    @Override
    public String ely() {
        return "invitToJoinGroup";
    }

    @Override
    public String getLabel() {
        ahv_2 ahv_22 = new ahv_2();
        if (!(this.cqO instanceof bhJ)) {
            return null;
        }
        ahv_22.ceu().ih(nik);
        ahv_22.c(aum_0.cWf().c("desc.mru." + this.ely(), ((exP)this.cqO).getName())).cev();
        if (!this.isEnabled()) {
            ahv_22.ceH().ih(this.isEnabled() ? nik : nim);
            ahv_22.c(aum_0.cWf().c(this.nlt, new Object[0]));
        }
        return ahv_22.ceL();
    }

    @Override
    public cpm_1 eLD() {
        return new cqg_1();
    }

    @Override
    protected int eLB() {
        return crc_2.nmF.nnW;
    }
}

