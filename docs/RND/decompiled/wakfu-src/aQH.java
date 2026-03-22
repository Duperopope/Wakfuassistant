/*
 * Decompiled with CFR 0.152.
 */
public class aQH
extends aRY {
    private final Short eGv;
    private final byte eGw;
    private final int eGx;

    public aQH() {
        this((short)-1);
    }

    public aQH(Short s) {
        this.eGv = s;
        this.eGw = (byte)-1;
        this.eGx = -1;
    }

    public aQH(Short s, byte by) {
        this.eGw = by;
        this.eGv = s;
        this.eGx = -1;
    }

    public aQH(Short s, int n) {
        this.eGv = s;
        this.eGx = n;
        this.eGw = (byte)-1;
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
        ns_02.Q((short)131);
        ns_02.R(this.eGv);
        ns_02.D(this.eGw);
        ns_02.nX(this.eGx);
        ayf_22.d(ns_02);
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        fse_1.gFu().a((aef_2)bgt_02, bgt_02.bxk());
    }
}

