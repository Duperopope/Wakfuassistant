/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aRi
 */
public class ari_0
extends aRY {
    private final int eJf;

    public ari_0(int n) {
        this.eJf = n;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void bGy() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)439);
        ns_02.nX(this.eJf);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

