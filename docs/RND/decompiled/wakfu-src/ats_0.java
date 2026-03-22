/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aTs
 */
public class ats_0
extends aRY {
    private final short eRP;

    public ats_0(short s) {
        this.eRP = s;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void bGy() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)47);
        ns_02.R(this.eRP);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

