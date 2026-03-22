/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ccZ
 */
class ccz_0
implements aaq_2<cyh> {
    ccz_0() {
    }

    @Override
    public boolean a(cyh cyh2) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bkb_0 bkb_02 = bgt_02.dps();
        if (bkb_02.dsm() != 23) {
            ccx_1.lQd.warn((Object)"[GUILD_STORAGE_BOX] Reception d'un message de taille dans un contexte ne correspondant pas");
            return false;
        }
        fam fam2 = cyh2.eFr();
        cvm_1.eTF().a(cyh2.eFq(), fam2, cyh2.efY());
        ccx_1.lQd.info((Object)"[GUILD_STORAGE_BOX]  Taille re\u00e7ue");
        return false;
    }

    @Override
    public int bkq() {
        return 14021;
    }
}

