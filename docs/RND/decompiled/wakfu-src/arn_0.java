/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aRN
 */
public class arn_0
extends aRY {
    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void bGy() {
        arn_0.cDk();
    }

    private static void cDk() {
        fik_2 fik_22 = fik_2.a(string -> {
            ayf_2 ayf_22 = aue_0.cVJ().etu();
            if (ayf_22 != null) {
                ns_0 ns_02 = new ns_0();
                ns_02.C((byte)3);
                ns_02.Q((short)294);
                ayf_22.d(ns_02);
            } else {
                aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            }
        }).vE("This will kick EVERYONE BUT YOU on this server. Are you sure that's what you want to do? Did you properly serverlock before ?").vG(ccp_2.mRF.byf());
        fiq_2.gCw().d(fik_22);
    }
}

