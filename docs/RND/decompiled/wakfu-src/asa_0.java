/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aSA
 */
public final class asa_0
extends aRY {
    private final int eOL;

    public asa_0(int n) {
        this.eOL = n;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void bGy() {
        clt_0 clt_02 = new clt_0(this.eOL, aue_0.cVJ().cVK().Sn());
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(clt_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

