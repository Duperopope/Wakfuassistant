/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cQZ
 */
public class cqz_2
extends cpm_1 {
    private String nlt;

    @Override
    public cps_1 eLz() {
        return cps_1.njn;
    }

    @Override
    public void run() {
        bhJ bhJ2 = (bhJ)this.cqO;
        cwj_1.nTI.eWl().oe(bhJ2.getName());
        if (!aue_0.cVJ().c(cwj_1.nTI)) {
            aue_0.cVJ().a(cwj_1.nTI);
        }
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
        if (bgt_02 == null) {
            return false;
        }
        return !evm_2.c(aue_0.cVJ().cVO().cWq(), evm_2.osZ);
    }

    @Override
    public boolean bxO() {
        if (!(this.cqO instanceof bhJ)) {
            return false;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return false;
        }
        return !evm_2.c(aue_0.cVJ().cVO().cWq(), evm_2.osZ);
    }

    @Override
    public String ely() {
        return "openModerationPanel";
    }

    @Override
    public String getLabel() {
        ahv_2 ahv_22 = new ahv_2();
        if (!(this.cqO instanceof bhJ)) {
            return null;
        }
        ahv_22.ceu().ih(nik);
        ahv_22.c(aum_0.cWf().c("desc.mru." + this.ely(), ((bhJ)this.cqO).getName())).cev();
        if (!this.isEnabled()) {
            ahv_22.ceH().ih(this.isEnabled() ? nik : nim);
            ahv_22.c(aum_0.cWf().c(this.nlt, new Object[0]));
        }
        return ahv_22.ceL();
    }

    @Override
    public cpm_1 eLD() {
        return new cqz_2();
    }

    @Override
    protected int eLB() {
        return crc_2.nmD.nnW;
    }
}

