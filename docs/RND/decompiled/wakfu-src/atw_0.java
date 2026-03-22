/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aTw
 */
public class atw_0
extends aRY {
    private final String eRR;
    private int dII;
    private final short eRS;

    public atw_0(String string, int n, String string2) {
        this.eRR = string;
        this.dII = n;
        this.eRS = (short)("IG".equals(string2) ? 228 : 427);
    }

    public atw_0(String string) {
        this.eRR = string;
        this.eRS = (short)489;
    }

    @Override
    public boolean isValid() {
        return !this.eRR.isEmpty() && (this.dII > 0 ? this.eRS == 427 || this.eRS == 228 : this.eRS == 489);
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)2);
        ns_02.Q((short)145);
        ns_02.R(this.eRS);
        ns_02.cT(this.eRR);
        if (this.dII > 0) {
            ns_02.nX(this.dII);
        }
        ayf_22.d(ns_02);
    }
}

