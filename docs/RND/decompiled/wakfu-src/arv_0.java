/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aRv
 */
public class arv_0
extends aRY {
    private final String eJS;
    private final int eJT;
    private final short eJU;
    private final fhc_0 eJV;

    public arv_0(String string, int n, short s) {
        this.eJS = string;
        this.eJT = n;
        this.eJU = s;
        this.eJV = fgD.fXh().Vd(this.eJT);
    }

    @Override
    public boolean isValid() {
        return this.eJT > 0 && this.eJU >= 1;
    }

    @Override
    public void bGy() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)273);
        ns_02.cT(this.eJS);
        ns_02.nX(this.eJT);
        ns_02.R(this.eJU);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

