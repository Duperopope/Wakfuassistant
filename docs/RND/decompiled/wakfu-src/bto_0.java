/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bto
 */
class bto_0
implements ZJ {
    final /* synthetic */ bdj_2 jli;
    final /* synthetic */ bth_0 jlj;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bto_0(bdj_2 bdj_22, bth_0 bth_02) {
        this.jli = bdj_22;
        this.jlj = bth_02;
    }

    @Override
    public void animationEnded(ZC zC) {
        this.jli.b(this);
        int n = this.jli.dcX().dHK();
        this.jli.a(this.jlj);
        btn_0.a(this.jli, n, this.jlj.dHK());
        this.jlj.x(this.jli);
    }
}

