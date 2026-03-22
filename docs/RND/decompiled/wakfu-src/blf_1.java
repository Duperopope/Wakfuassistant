/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from blF
 */
class blf_1
implements alx_2 {
    final /* synthetic */ blx_0 ivs;
    final /* synthetic */ boolean ivt;
    final /* synthetic */ bly_0 ivu;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    blf_1(bly_0 bly_02, blx_0 blx_02, boolean bl) {
        this.ivu = bly_02;
        this.ivs = blx_02;
        this.ivt = bl;
    }

    @Override
    public void dialogUnloaded(String string) {
        if ("companionsManagementDialog".equals(string)) {
            this.ivu.a(this.ivs, this.ivt);
            fyw_0.gqw().b(this);
        }
    }
}

