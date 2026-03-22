/*
 * Decompiled with CFR 0.152.
 */
public class aTE
extends aRY {
    public static final byte eSg = 1;
    public static final byte eSh = 2;
    public static final byte eSi = 3;
    private final byte eSj;
    private final int eSk;

    public aTE(byte by) {
        this.eSj = by;
        this.eSk = -1;
    }

    public aTE(byte by, int n) {
        this.eSj = by;
        this.eSk = n;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void bGy() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)216);
        ns_02.D(this.eSj);
        ns_02.nX(this.eSk);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

