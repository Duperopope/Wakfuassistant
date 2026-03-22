/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aSI
 */
public class asi_0
extends aRY {
    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void bGy() {
        byte[] byArray;
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        for (byte by : byArray = new byte[]{1, 2, 3}) {
            ns_0 ns_02 = new ns_0();
            ns_02.C(by);
            ns_02.Q((short)365);
            ayf_22.d(ns_02);
        }
    }
}

