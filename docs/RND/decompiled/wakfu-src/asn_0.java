/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aSn
 */
public final class asn_0
extends aRY {
    private final long eNP;
    private final int eNQ;
    private final int eNR;
    private final boolean eNS;

    public asn_0(long l, int n, int n2) {
        this(l, n, n2, true);
    }

    public asn_0(long l, int n, int n2, boolean bl) {
        this.eNP = l;
        this.eNQ = n;
        this.eNR = n2;
        this.eNS = bl;
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
        try {
            ns_0 ns_02 = new ns_0();
            ns_02.C((byte)3);
            ns_02.Q((short)378);
            ns_02.cX(this.eNP);
            ns_02.nX(this.eNQ);
            ns_02.nX(this.eNR);
            ns_02.aN(this.eNS);
            ayf_22.d(ns_02);
        }
        catch (Exception exception) {
            aqh_0.cBI().jI("Error trying to play aps : " + String.valueOf(exception));
        }
    }
}

