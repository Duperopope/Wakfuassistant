/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

final class cha
implements aaq_2<crt_0> {
    private static final Logger lTW = Logger.getLogger(cha.class);

    cha() {
    }

    @Override
    public boolean a(crt_0 crt_02) {
        fcN fcN2 = fcN.ga(crt_02.bks());
        if (fcN2 != fcN.rUm) {
            lTW.error((Object)("[H\u00e9ros] Impossible de changer de leader : errorId " + fcN2.aJr()));
            aUm.cUI().cD(true);
            aPd.e("error.cantSwitchHeroLeader" + fcN2.aJr(), new Object[0]);
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            bgt_02.fZ(true);
            fcK.rUe.ar(bgt_02.aZj(), bgt_02.Sn());
            return false;
        }
        lTW.info((Object)("[H\u00e9ros] Nouveau leader local : " + crt_02.aXj()));
        dae_0 dae_02 = new dae_0();
        dae_02.lK(18075);
        dae_02.gj(crt_02.aXj());
        aaw_1.bUq().h(dae_02);
        cxh_2.eWL();
        return false;
    }

    @Override
    public int bkq() {
        return 13291;
    }
}

