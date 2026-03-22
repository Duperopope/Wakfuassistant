/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cPV
 */
public class cpv_1
extends cqw_1 {
    public cpv_1(String string, int n) {
        this.p = string;
        this.ciZ = n;
    }

    public cpv_1() {
    }

    @Override
    public cqw_1 eLN() {
        return new cpv_1(this.p, this.ciZ);
    }

    @Override
    public boolean isEnabled() {
        return this.cHn;
    }

    @Override
    public String getLabel() {
        ahv_2 ahv_22 = new ahv_2().ceu().ih(this.isEnabled() ? nik : nim);
        ahv_22.c(aum_0.cWf().c(this.p, new Object[0])).cev();
        return ahv_22.ceL();
    }

    @Override
    public /* synthetic */ cpm_1 eLD() {
        return this.eLN();
    }
}

