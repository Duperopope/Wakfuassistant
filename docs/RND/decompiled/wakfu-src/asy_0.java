/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aSy
 */
public class asy_0
extends aRY {
    private final String eOJ;
    private String aCL;

    public asy_0(String string, String string2) {
        this.eOJ = string;
        this.aCL = string2;
    }

    @Override
    public boolean isValid() {
        return !this.eOJ.isEmpty() && !this.aCL.isEmpty();
    }

    @Override
    public void bGy() {
        if (this.aCL.isEmpty() || this.aCL.contains("missing ESCAPED_STRING")) {
            aqh_0.cBI().jI("Message is too short.");
            return;
        }
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        if (this.aCL.indexOf(34) == 0) {
            this.aCL = this.aCL.substring(1);
        }
        if (this.aCL.indexOf(34) == this.aCL.length() - 1) {
            this.aCL = this.aCL.substring(0, this.aCL.length() - 1);
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)2);
        ns_02.Q((short)298);
        ns_02.cT(this.eOJ);
        ns_02.cT(this.aCL);
        ayf_22.d(ns_02);
    }
}

