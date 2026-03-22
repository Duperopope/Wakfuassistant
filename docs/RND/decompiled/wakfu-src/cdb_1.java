/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cDB
 */
class cdb_1
implements alw_2 {
    final /* synthetic */ bgl_0 mTC;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cdb_1(bgl_0 bgl_02) {
        this.mTC = bgl_02;
    }

    @Override
    public void eX(String string) {
        if (!"heroBuildDialog".equals(string)) {
            return;
        }
        fse_1.gFu().b("characterSheet", this.mTC, "heroBuildDialog");
        dae_0 dae_02 = new dae_0(16143);
        dae_02.gj(this.mTC.Sn());
        aaw_1.bUq().h(dae_02);
        fyw_0.gqw().b(this);
    }
}

