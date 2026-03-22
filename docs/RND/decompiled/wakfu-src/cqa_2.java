/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cQA
 */
public class cqa_2
extends cqf_1 {
    public cqa_2 eMm() {
        return new cqa_2();
    }

    @Override
    public boolean isEnabled() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (!bgt_02.dpO()) {
            return false;
        }
        if (cqa_2.eMn()) {
            return false;
        }
        return super.isEnabled();
    }

    private static boolean eMn() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (!bgt_02.dpO()) {
            return true;
        }
        return bgt_02.dkG() && !bgt_02.dkH();
    }

    @Override
    public String getLabel() {
        String string = super.getLabel();
        ahv_2 ahv_22 = new ahv_2().c(string);
        if (!aue_0.cVJ().cVK().dpO()) {
            ahv_22.ceH().ceC().ih(nim).c(aum_0.cWf().c("group.error.not_in_guild", new Object[0])).ceD();
        }
        return ahv_22.ceL();
    }

    @Override
    public /* synthetic */ cpm_1 eLD() {
        return this.eMm();
    }
}

