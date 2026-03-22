/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cQp
 */
public class cqp_1
extends crq_1 {
    public cqo_2 eMe() {
        return new cqo_2();
    }

    @Override
    public boolean isEnabled() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (!this.ad(bgt_02)) {
            this.niu.add(1);
            return false;
        }
        return super.isEnabled() && this.niu.isEmpty();
    }

    @Override
    public /* synthetic */ cpr_1 eLH() {
        return this.eMe();
    }

    @Override
    public /* synthetic */ cpm_1 eLD() {
        return this.eMe();
    }
}

