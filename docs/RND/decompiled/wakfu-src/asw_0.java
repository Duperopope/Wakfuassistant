/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aSW
 */
public class asw_0
extends aRY {
    private final short ePT;
    private final String ePU;

    public asw_0(short s, String string) {
        this.ePT = s;
        this.ePU = string;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        if (!aum_0.cWf().e(34, this.ePT)) {
            aqh_0.cBI().jI("Titre inconnu id=" + this.ePT);
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)207);
        ns_02.R(this.ePT);
        ns_02.cT(this.ePU);
        ayf_22.d(ns_02);
    }
}

