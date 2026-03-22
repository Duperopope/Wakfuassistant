/*
 * Decompiled with CFR 0.152.
 */
class aZH
implements aqg_1<aNA> {
    final /* synthetic */ eyw hyq;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    aZH(azg_0 azg_02, eyw eyw2) {
        this.hyq = eyw2;
    }

    public void a(aNA aNA2) {
        int n = aNA2.csE();
        int n2 = aNA2.csF();
        eyv eyv2 = this.hyq.OW(n);
        eyv2.OU(n2);
        eyv eyv3 = this.hyq.OW(n2);
        eyv3.OU(n);
    }

    @Override
    public /* synthetic */ void load(aqz_2 aqz_22) {
        this.a((aNA)aqz_22);
    }
}

