/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aSD
 */
public class asd_0
extends aRY {
    private final short eON;
    private final long eOO;

    public asd_0(short s, long l) {
        this.eON = s;
        this.eOO = l;
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
        if (!aum_0.cWf().e(34, this.eON)) {
            aqh_0.cBI().jI(String.format("Titre avec l'id %s iconnu", this.eON));
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)231);
        ns_02.R(this.eON);
        ns_02.cX(this.eOO);
        ayf_22.d(ns_02);
    }
}

