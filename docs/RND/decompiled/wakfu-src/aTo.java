/*
 * Decompiled with CFR 0.152.
 */
public class aTo
extends aRY {
    private final String eRh;
    private final String eRi;
    private static final String eRj = "*";

    public aTo(String string) {
        this(eRj, string);
    }

    public aTo(String string, String string2) {
        this.eRh = string;
        this.eRi = string2;
    }

    @Override
    public boolean isValid() {
        return this.eRi != null && this.eRh != null;
    }

    @Override
    public void bGy() {
        this.cCw();
    }

    private void cCw() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)2);
        ns_02.Q((short)455);
        ns_02.cT(this.eRh);
        ns_02.cT(this.eRi);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

