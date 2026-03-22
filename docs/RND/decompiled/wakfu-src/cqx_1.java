/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cQx
 */
public class cqx_1
extends cqw_1 {
    public cqx_1 eMj() {
        return new cqx_1();
    }

    @Override
    public boolean isEnabled() {
        return cpq_1.eLG();
    }

    @Override
    public boolean bxO() {
        if (!super.bxO()) {
            return false;
        }
        return aue_0.cVJ().cVK().dpO();
    }

    @Override
    public String getLabel() {
        String string = super.getLabel();
        ahv_2 ahv_22 = new ahv_2().c(string);
        if (!cpq_1.eLG()) {
            ahv_22.ceH().ceC().ih(nim).c(aum_0.cWf().c("guild.error.not.leader", new Object[0])).ceD();
        }
        return ahv_22.ceL();
    }

    @Override
    public /* synthetic */ cqw_1 eLN() {
        return this.eMj();
    }

    @Override
    public /* synthetic */ cpm_1 eLD() {
        return this.eMj();
    }
}

