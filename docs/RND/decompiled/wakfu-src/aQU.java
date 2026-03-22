/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class aQU
extends aRY {
    public final List<Integer> eIe;

    public aQU(List<Integer> list) {
        this.eIe = list;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void bGy() {
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)361);
        for (int i = 0; i < this.eIe.size(); ++i) {
            int n = this.eIe.get(i);
            ns_02.nX(n);
        }
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

