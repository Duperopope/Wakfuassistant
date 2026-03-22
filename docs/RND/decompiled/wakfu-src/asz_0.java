/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aSz
 */
public class asz_0
extends aRY {
    private boolean eOK;

    public asz_0() {
        this(false);
    }

    public asz_0(boolean bl) {
        this.eOK = bl;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void bGy() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)176);
        ns_02.aN(this.eOK);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

