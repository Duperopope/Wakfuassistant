/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bgD
 */
class bgd_0
implements bgh_0 {
    final /* synthetic */ long icH;
    final /* synthetic */ ezw icI;
    final /* synthetic */ bgg_0 icJ;
    final /* synthetic */ bgy icK;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bgd_0(bgy bgy2, long l, ezw ezw2, bgg_0 bgg_02) {
        this.icK = bgy2;
        this.icH = l;
        this.icI = ezw2;
        this.icJ = bgg_02;
    }

    @Override
    public void ap(bgy bgy2) {
        if (bgy2.Sn() != this.icH) {
            return;
        }
        this.icI.a(this.icK, bgy2);
        this.icK.ao(bgy2);
        this.icJ.b(this);
    }
}

