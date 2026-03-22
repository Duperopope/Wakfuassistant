/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cQz
 */
public class cqz_1
extends cqf_1 {
    public cqz_1 eMl() {
        return new cqz_1();
    }

    @Override
    public boolean isEnabled() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return !bgt_02.dpO();
    }

    @Override
    public String getLabel() {
        String string = super.getLabel();
        ahv_2 ahv_22 = new ahv_2().c(string);
        if (aue_0.cVJ().cVK().dpO()) {
            ahv_22.ceH().ceC().ih(nim).c(aum_0.cWf().c("error.guild.alreadyInGuild", new Object[0])).ceD();
        }
        return ahv_22.ceL();
    }

    @Override
    public /* synthetic */ cpm_1 eLD() {
        return this.eMl();
    }
}

