/*
 * Decompiled with CFR 0.152.
 */
public class aRB
extends aRY {
    private final long eKS;
    private final String eKT;

    public aRB(long l) {
        this.eKS = l;
        this.eKT = null;
    }

    public aRB(String string) {
        this.eKT = string;
        this.eKS = 0L;
    }

    @Override
    public boolean isValid() {
        return this.eKS > 0L || this.eKT != null;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        ns_0 ns_02 = new ns_0();
        if (this.eKT == null && this.eKS > 0L) {
            ns_02.C((byte)3);
            ns_02.Q((short)312);
            ns_02.cX(this.eKS);
        } else if (this.eKT != null) {
            ns_02.C((byte)2);
            ns_02.Q((short)145);
            ns_02.R((short)312);
            ns_02.cT(this.eKT);
        }
        ayf_22.d(ns_02);
    }
}

