/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cQB
 */
public class cqb_2
extends cqw_1 {
    public static final int nlj = 0;
    public static final int nlk = 1;
    private int nll;

    public cqb_2(String string, int n) {
        this.p = string;
        this.ciZ = n;
    }

    public cqb_2() {
    }

    @Override
    public cqw_1 eLN() {
        return new cqb_2(this.p, this.ciZ);
    }

    @Override
    public boolean isEnabled() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (!evg_1.osP.a(new eve_2[]{bgt_02})) {
            this.nll = 1;
            return false;
        }
        return this.cHn;
    }

    @Override
    public String getLabel() {
        ahv_2 ahv_22 = new ahv_2().ceu().ih(this.isEnabled() ? nik : nim);
        ahv_22.c(aum_0.cWf().c(this.p, new Object[0])).cev();
        if (!this.isEnabled()) {
            switch (this.nll) {
                case 1: {
                    ahv_22.ceH().ih(nim).c(aum_0.cWf().c("error.playerNotSubscribed", new Object[0]));
                }
            }
        }
        return ahv_22.ceL();
    }

    @Override
    public void run() {
        super.run();
        csh_2 csh_22 = csh_2.eOr();
        csh_22.a((bad_2)this.cqO);
        cdb.lQg.a(new bkv_1(csh_22));
    }

    @Override
    public /* synthetic */ cpm_1 eLD() {
        return this.eLN();
    }
}

