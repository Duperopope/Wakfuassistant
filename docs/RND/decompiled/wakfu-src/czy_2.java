/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cZY
 */
public class czy_2
implements czz_2 {
    @Override
    public boolean b(aam_2 aam_22) {
        if (aam_22.d() != 17589) {
            return true;
        }
        if (ewo_0.oBF.k(ewr_0.oDH)) {
            aue_0.cVJ().etu().d(new cnj_0((fpu_0)((Object)((dae_0)aam_22).bCv())));
            fyw_0.gqw().tl("pvpActivationDialog");
            cAY.eHc().nP(600207L);
        } else {
            aPd.e("pvp.pact.disabled", new Object[0]);
            fyw_0.gqw().tl("pvpActivationDialog");
            cAY.eHc().nP(600125L);
        }
        return false;
    }
}

