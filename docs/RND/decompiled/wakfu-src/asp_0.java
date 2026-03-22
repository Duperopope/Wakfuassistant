/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aSp
 */
public class asp_0
extends aRY {
    private final String eNZ;
    private String aCL;

    public asp_0(String string, String string2) {
        this.eNZ = string;
        this.aCL = string2;
    }

    @Override
    public boolean isValid() {
        return this.eNZ != null && !this.eNZ.isEmpty();
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        this.aCL = this.aCL.substring(1, this.aCL.length() - 1);
        if (this.aCL.isEmpty() || this.aCL.contains("ESCAPED_STRING")) {
            aqh_0.cBI().jI("Message is too short");
            return;
        }
        if (this.aCL.length() > 255) {
            aqh_0.cBI().jI("Message is too long.");
            return;
        }
        asp_0.aE(ayf_22);
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)2);
        ns_02.Q((short)175);
        ns_02.cT(this.aCL);
        ns_02.cT(this.eNZ);
        ayf_22.d(ns_02);
    }

    private static void aE(ayf_2 ayf_22) {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)2);
        ns_02.Q((short)316);
        ns_02.D(Byte.parseByte("0"));
        ayf_22.d(ns_02);
    }
}

