/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aSJ
 */
public class asj_0
extends aRY {
    private final int ePb;
    private final int ePc;

    public asj_0(int n, int n2) {
        this.ePb = n;
        this.ePc = n2;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void bGy() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)232);
        ns_02.nX(this.ePb);
        ns_02.nX(this.ePc);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

