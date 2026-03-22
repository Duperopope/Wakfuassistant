/*
 * Decompiled with CFR 0.152.
 */
public class aQw
extends aRY {
    private final long eCO;
    private final int eCP;
    private final int eCQ;

    public aQw(long l, int n, int n2) {
        this.eCO = l;
        this.eCP = n;
        this.eCQ = n2;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void bGy() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)360);
        ns_02.cX(this.eCO);
        ns_02.nX(this.eCP);
        ns_02.nX(this.eCQ);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

