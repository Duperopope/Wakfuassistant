/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aWg
 */
class awg_0
implements ZJ {
    final /* synthetic */ bgy hun;
    final /* synthetic */ bdj_2 huo;
    final /* synthetic */ awf_0 hup;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    awg_0(awf_0 awf_02, bgy bgy2, bdj_2 bdj_22) {
        this.hup = awf_02;
        this.hun = bgy2;
        this.huo = bdj_22;
    }

    @Override
    public void animationEnded(ZC zC) {
        zC.b(this);
        this.hup.a(this.hun, this.huo);
    }
}

