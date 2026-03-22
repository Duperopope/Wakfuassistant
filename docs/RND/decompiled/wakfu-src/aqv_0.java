/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aQv
 */
public class aqv_0
extends aRY {
    private final int eCM;
    private final short eCN;

    public aqv_0(int n, short s) {
        this.eCM = n;
        this.eCN = s;
    }

    @Override
    public boolean isValid() {
        return this.eCN > 0;
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
        ns_02.Q((short)158);
        ns_02.nX(this.eCM);
        ns_02.R(this.eCN);
        ayf_22.d(ns_02);
        aue_0.cVJ().cVK().dpH().eej();
    }
}

