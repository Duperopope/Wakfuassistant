/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from blG
 */
class blg_1
implements ZJ {
    final /* synthetic */ alx_2 ivv;
    final /* synthetic */ blx_0 ivw;
    final /* synthetic */ boolean ivx;
    final /* synthetic */ ZG ivy;
    final /* synthetic */ bly_0 ivz;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    blg_1(bly_0 bly_02, alx_2 alx_22, blx_0 blx_02, boolean bl, ZG zG) {
        this.ivz = bly_02;
        this.ivv = alx_22;
        this.ivw = blx_02;
        this.ivx = bl;
        this.ivy = zG;
    }

    @Override
    public void animationEnded(ZC zC) {
        fyw_0.gqw().b(this.ivv);
        this.ivz.a(this.ivw, this.ivx);
        this.ivy.b(this);
    }
}

