/*
 * Decompiled with CFR 0.152.
 */
public class aQY
extends aRY {
    private final short eIz;

    public aQY(short s) {
        this.eIz = s;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        long l = aqw_0.cCv();
        try {
            bEq bEq2 = bEr.dSi().bW(this.eIz);
            if (bEq2 == null) {
                aqh_0.cBI().jI("L'id " + this.eIz + " ne correspond \u00e0 aucun set.");
            } else {
                for (bgv_2 bgv_22 : bEq2) {
                    boolean bl = true;
                    ffV ffV2 = new ffV(-1L);
                    ffV2.l(bgv_22);
                    ffV2.ak((short)1);
                    ns_0 ns_02 = new ns_0();
                    ns_02.C((byte)3);
                    ns_02.Q((short)20);
                    ns_02.cX(l);
                    ns_02.nX(bgv_22.d());
                    ns_02.R((short)1);
                    ns_02.aN(false);
                    ayf_22.d(ns_02);
                }
                fse_1.gFu().a((aef_2)aue_0.cVJ().cVK(), "bags");
            }
        }
        catch (Exception exception) {
            aqh_0.cBI().jI("Probl\u00e8me pour l'ajout d'un set dans le sac courant : " + String.valueOf(exception));
        }
    }
}

