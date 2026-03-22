/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aQD
 */
public class aqd_0
extends aRY {
    private final long eGc;
    private long aDh = Long.MIN_VALUE;
    private final String eGd;

    public aqd_0(long l, long l2, String string) {
        this.eGc = l;
        this.aDh = l2;
        this.eGd = string;
    }

    @Override
    public boolean isValid() {
        return this.eGc > 0L && this.eGd != null && this.aDh > Long.MIN_VALUE;
    }

    @Override
    public void bGy() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)1);
        ns_02.Q((short)59);
        ns_02.cX(this.eGc);
        ns_02.cX(this.aDh);
        ns_02.cT(this.eGd);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

