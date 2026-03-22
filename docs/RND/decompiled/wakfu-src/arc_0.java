/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aRc
 */
public class arc_0
extends aRY {
    private final int eIE;
    private final int eIF;

    public arc_0(int n) {
        this.eIE = n;
        this.eIF = 1;
    }

    public arc_0(int n, int n2) {
        this.eIE = n;
        this.eIF = n2;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void bGy() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)281);
        ns_02.nX(this.eIE);
        ns_02.nX(this.eIF);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

