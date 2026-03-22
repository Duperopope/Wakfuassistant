/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRt
 */
public final class crt_1
extends cqf_1 {
    public crt_1 eME() {
        return new crt_1();
    }

    @Override
    public boolean isEnabled() {
        bco_0 bco_02 = (bco_0)this.cqO;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return bco_02.C(bgt_02) && super.isEnabled();
    }

    @Override
    public String getLabel() {
        bco_0 bco_02;
        Object Provider2;
        fry fry2;
        String string = super.getLabel();
        bco_0 bco_03 = (bco_0)this.cqO;
        String string2 = bco_03.dQi();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (string2 == null || string2.isEmpty()) {
            return string;
        }
        ahv_2 ahv_22 = new ahv_2().c(string);
        fsj_0 fsj_02 = bzp_2.eqt().mA((long)bco_03.ben()).lED;
        if (fsj_02 != fsj_0.tcj) {
            ahv_22.ceH().c(aum_0.cWf().c("desc.cost", string2));
        }
        if ((fry2 = ((frd_0)(Provider2 = frz.a((bco_02 = (bco_0)this.cqO).dQh()))).a(bgt_02, bco_02, -1L)) == fry.sYE) {
            ahv_22.ceH().ih(nim).c(aum_0.cWf().c("error.playerNotSubscribed", new Object[0]));
        }
        if (fry2 == fry.sYJ) {
            ahv_22.ceH().ih(nim).c(aum_0.cWf().c("chat.travel.disabledByPact", new Object[0]));
        }
        return ahv_22.ceL();
    }

    @Override
    public /* synthetic */ cpm_1 eLD() {
        return this.eME();
    }
}

