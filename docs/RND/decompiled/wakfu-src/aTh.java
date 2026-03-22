/*
 * Decompiled with CFR 0.152.
 */
public class aTh
extends aRY {
    private final int eQu;

    public aTh(int n) {
        this.eQu = n;
    }

    @Override
    public boolean isValid() {
        return this.eQu >= -1;
    }

    @Override
    public void bGy() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)2);
        ns_02.Q((short)227);
        ns_02.nX(this.eQu);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

