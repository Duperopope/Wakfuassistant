/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from baG
 */
class bag_0
extends euF {
    final /* synthetic */ baf_0 hzb;
    final /* synthetic */ baf_0 hzc;

    bag_0(baf_0 baf_02, baf_0 baf_03) {
        this.hzc = baf_02;
        this.hzb = baf_03;
    }

    @Override
    public void cZe() {
        baf_0.hyY.info((Object)("Connected to Zaap. Starting " + String.valueOf(euN.class) + " fill"));
        euG.ors.c(new baH(this));
    }

    @Override
    public void kW(String string) {
        baf_0.hyY.warn((Object)("Error during retrieval of " + String.valueOf(euN.class) + " connection(" + string + ")"));
        this.hzc.hza.b(this.hzb);
    }
}

