/*
 * Decompiled with CFR 0.152.
 */
public final class aRs
extends aRY {
    private final short eJR;

    public aRs(short s) {
        this.eJR = s;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9!");
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q(this.eJR);
        ayf_22.d(ns_02);
    }
}

