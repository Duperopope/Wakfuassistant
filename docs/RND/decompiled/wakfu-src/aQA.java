/*
 * Decompiled with CFR 0.152.
 */
public final class aQA
extends aRY {
    private final int eFX;

    public aQA(int n) {
        this.eFX = n;
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
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)237);
        ns_02.nX(this.eFX);
        ayf_22.d(ns_02);
    }
}

