/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aWC
 */
class awc_0
implements ZJ {
    final /* synthetic */ bgy hvs;
    final /* synthetic */ aWB hvt;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    awc_0(aWB aWB2, bgy bgy2) {
        this.hvt = aWB2;
        this.hvs = bgy2;
    }

    @Override
    public void animationEnded(ZC zC) {
        zC.b(this);
        this.hvt.S(this.hvs);
    }
}

