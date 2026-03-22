/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cda
 */
class cda_0
implements aaq_2<cyi> {
    cda_0() {
    }

    @Override
    public boolean a(cyi cyi2) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bkb_0 bkb_02 = bgt_02.dps();
        if (bkb_02 == null || bkb_02.dsm() != 23) {
            ccx_1.lQd.warn((Object)"[GUILD_STORAGE_BOX] Reception d'un message de contenu dans un contexte ne correspondant pas");
            return false;
        }
        long l = cyi2.efY();
        kg_0 kg_02 = cyi2.abp();
        cvm_1.eTF().oq(l);
        cvm_1.eTF().f(kg_02);
        ccx_1.lQd.info((Object)"[GUILD_STORAGE_BOX]  Contenu re\u00e7u");
        return false;
    }

    @Override
    public int bkq() {
        return 15608;
    }
}

