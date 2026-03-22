/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRw
 */
public final class crw_1
extends cqf_1 {
    public crw_1 eMF() {
        return new crw_1();
    }

    @Override
    public boolean isEnabled() {
        bco_0 bco_02 = (bco_0)this.cqO;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return bco_02.C(bgt_02) && super.isEnabled();
    }

    @Override
    protected int eLB() {
        return crc_2.nno.nnW;
    }

    @Override
    public String getLabel() {
        String string = super.getLabel();
        bco_0 bco_02 = (bco_0)this.cqO;
        String string2 = bco_02.dQi();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (string2 == null || string2.length() == 0) {
            return string;
        }
        ahv_2 ahv_22 = new ahv_2().c(string);
        bzq_2 bzq_22 = bzp_2.eqt().mA(bco_02.ben());
        fsj_0 fsj_02 = bzq_22 == null ? fsj_0.tcj : bzq_22.lED;
        if (fsj_0.tcj != fsj_02) {
            ahv_22.ceH().c(aum_0.cWf().c("desc.cost", string2));
        }
        if (!evg_1.osQ.a(new eve_2[]{bgt_02})) {
            ahv_22.ceH().ih(nim).c(aum_0.cWf().c("error.playerNotSubscribed", new Object[0]));
        }
        return ahv_22.ceL();
    }

    @Override
    public /* synthetic */ cpm_1 eLD() {
        return this.eMF();
    }
}

