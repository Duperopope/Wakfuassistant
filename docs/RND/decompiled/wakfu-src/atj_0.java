/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aTj
 */
public class atj_0
extends aRY {
    private final boolean eQx;

    public atj_0(boolean bl) {
        this.eQx = bl;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void bGy() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)169);
        ns_02.aN(this.eQx);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

