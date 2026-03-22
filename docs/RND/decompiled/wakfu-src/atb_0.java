/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aTb
 */
public class atb_0
extends aRY {
    private final float eQl;

    public atb_0(float f2) {
        this.eQl = f2;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void bGy() {
        if ((double)this.eQl < -1.0 || (double)this.eQl > 1.0) {
            aqh_0.cBI().jI("La valeur d'une jauge de wakfu doit \u00eatre dans [-1.0, 1.0]");
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)351);
        ns_02.br(this.eQl);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

