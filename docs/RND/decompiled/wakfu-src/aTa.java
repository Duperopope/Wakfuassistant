/*
 * Decompiled with CFR 0.152.
 */
public class aTa
extends aRY {
    private final int eQj;
    private final short eQk;

    public aTa(int n, short s) {
        this.eQj = n;
        this.eQk = s;
    }

    @Override
    public boolean isValid() {
        return this.eQk >= 0 && this.eQk <= 100;
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
        ns_02.Q((short)324);
        ns_02.nX(this.eQj);
        ns_02.R(this.eQk);
        ayf_22.d(ns_02);
        fse_1.gFu().a((aef_2)aue_0.cVJ().cVK(), aue_0.cVJ().cVK().bxk());
    }
}

