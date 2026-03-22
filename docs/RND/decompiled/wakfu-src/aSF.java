/*
 * Decompiled with CFR 0.152.
 */
public final class aSF
extends aRY {
    public static final int eOQ = 1;
    public static final int eOR = 2;
    private final long eOS;
    private final int eOT;

    public aSF(int n, long l) {
        this.eOT = n;
        this.eOS = l;
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
        ns_02.C((byte)2);
        ns_02.Q(this.eOT == 1 ? (short)209 : 371);
        ns_02.cX(this.eOS);
        ayf_22.d(ns_02);
    }
}

