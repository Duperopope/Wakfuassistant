/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aQx
 */
public class aqx_0
extends aRY {
    private final long eCR;

    public aqx_0(long l) {
        this.eCR = l;
    }

    @Override
    public boolean isValid() {
        return this.eCR > 0L;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)26);
        ns_02.cX(this.eCR);
        ayf_22.d(ns_02);
    }
}

