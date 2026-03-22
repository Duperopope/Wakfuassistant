/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cQH
 */
public class cqh_2
extends cpm_1 {
    private String nlt;

    @Override
    public cps_1 eLz() {
        return cps_1.njR;
    }

    @Override
    public void run() {
        bhJ bhJ2 = (bhJ)this.cqO;
        dbx dbx2 = new dbx();
        dbx2.setName(bhJ2.getName());
        aaw_1.bUq().h(dbx2);
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
        if (!(this.cqO instanceof bhJ)) {
            return false;
        }
        bhJ bhJ2 = (bhJ)this.cqO;
        return bvk.dJZ().ai(bhJ2);
    }

    @Override
    public String ely() {
        return "inviteToJoinGuild";
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
        return new cqh_2();
    }

    @Override
    protected int eLB() {
        return crc_2.nnq.nnW;
    }
}

