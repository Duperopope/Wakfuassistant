/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aRO
 */
public class aro_0
extends aRY {
    private final String eMb;
    private final String eMc;

    public aro_0(String string) {
        this(string, "");
    }

    public aro_0(String string, String string2) {
        this.eMb = string;
        this.eMc = string2;
    }

    @Override
    public boolean isValid() {
        return this.eMb != null;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ns_0 ns_02 = new ns_0();
            ns_02.C((byte)2);
            ns_02.Q((short)442);
            ns_02.cT(this.eMb);
            ns_02.cT(this.eMc);
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

