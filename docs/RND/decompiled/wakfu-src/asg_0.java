/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aSG
 */
public class asg_0
extends aRY {
    private final String eOU;

    public asg_0(String string) {
        this.eOU = string;
    }

    @Override
    public boolean isValid() {
        return !this.eOU.isEmpty();
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)90);
        ns_02.cT(this.eOU);
        ayf_22.d(ns_02);
    }
}

