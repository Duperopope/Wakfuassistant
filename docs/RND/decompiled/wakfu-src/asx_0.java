/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aSx
 */
public class asx_0
extends aRY {
    private String aCL;

    public asx_0(String string) {
        this.aCL = string;
    }

    @Override
    public boolean isValid() {
        return !this.aCL.isEmpty();
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
        ns_02.C((byte)3);
        ns_02.Q((short)160);
        ns_02.cT(this.aCL);
        ayf_22.d(ns_02);
    }
}

