/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRh
 */
public class crh_1
extends cqf_1 {
    public static final int nlR = 0;
    public static final int nlS = 1;
    public static final int nlT = 2;
    public static final int nlU = 3;
    public static final int nlV = 4;
    private int nll;

    public crh_1 eMy() {
        return new crh_1();
    }

    @Override
    public boolean bxO() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.dkG()) {
            return false;
        }
        return super.bxO();
    }

    @Override
    public boolean isEnabled() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (!evg_1.osQ.a(new eve_2[]{bgt_02})) {
            this.nll = 3;
            return false;
        }
        bbu_0 bbu_02 = (bbu_0)this.cqO;
        fqk_0 fqk_02 = bgt_02.dng();
        if (fqk_02.YV((int)bbu_02.Sn())) {
            this.nll = 1;
            return false;
        }
        if (bgt_02.ffF().gaW()) {
            this.nll = 2;
            return false;
        }
        this.nll = 0;
        return true;
    }

    @Override
    public String getLabel() {
        String string = super.getLabel();
        if (this.isEnabled()) {
            return string;
        }
        ahv_2 ahv_22 = new ahv_2().c(string).ceH();
        ahv_22.ih(nim);
        switch (this.nll) {
            case 3: {
                ahv_22.c(aum_0.cWf().c("error.playerNotSubscribed", new Object[0]));
                break;
            }
            case 1: {
                ahv_22.c(aum_0.cWf().c("desc.mru.phoenixAlreadyBound", new Object[0]));
                break;
            }
            case 2: {
                ahv_22.c(aum_0.cWf().c("phoenix.forbidden.on.enemy.territory", new Object[0]));
                break;
            }
            case 4: {
                ahv_22.c(aum_0.cWf().c("havenWorldForbidden", new Object[0]));
            }
        }
        return ahv_22.ceL();
    }

    @Override
    public /* synthetic */ cpm_1 eLD() {
        return this.eMy();
    }
}

