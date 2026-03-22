/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aRL
 */
public class arl_0
extends aRY {
    private final long eLL;
    private final boolean eLM;

    public arl_0() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        this.eLL = bgt_02 != null ? bgt_02.aqZ() : -1L;
        this.eLM = false;
    }

    public arl_0(long l, boolean bl) {
        this.eLL = l;
        this.eLM = bl;
    }

    @Override
    public boolean isValid() {
        return this.eLL >= 0L;
    }

    @Override
    public void bGy() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)424);
        ns_02.cX(this.eLL);
        ns_02.aN(this.eLM);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

