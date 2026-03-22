/*
 * Decompiled with CFR 0.152.
 */
public class aQC
extends aRY {
    private final long eFZ;
    private final boolean eGa;
    private final int eGb;

    public aQC(long l, boolean bl, int n) {
        this.eFZ = l;
        this.eGa = bl;
        this.eGb = n;
    }

    @Override
    public boolean isValid() {
        return this.eFZ > 0L && (!this.eGa || this.eGb > 0);
    }

    @Override
    public void bGy() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)1);
        ns_02.Q((short)92);
        ns_02.cX(this.eFZ);
        ns_02.aN(this.eGa);
        ns_02.nX(this.eGb);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

