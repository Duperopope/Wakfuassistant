/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ccY
 */
class ccy_0
implements aaq_2<cyg> {
    ccy_0() {
    }

    @Override
    public boolean a(cyg cyg2) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bkb_0 bkb_02 = bgt_02.dps();
        if (bkb_02 == null || bkb_02.dsm() != 23) {
            ccx_1.lQd.warn((Object)"[GUILD_STORAGE_BOX] Reception d'un message de contenu dans un contexte ne correspondant pas");
            return false;
        }
        ks_0 ks_02 = cyg2.eFp();
        fil_1.gBx().cancel();
        cvm_1.eTF().eTH();
        ks_02.abl().forEach(kc2 -> {
            fai fai2 = bkf_1.e(kc2);
            cvm_1.eTF().b(fai2);
        });
        cvm_1.eTF().f(ks_02.abp());
        ccx_1.lQd.info((Object)"[GUILD_STORAGE_BOX] Content received");
        return false;
    }

    @Override
    public int bkq() {
        return 14273;
    }
}

