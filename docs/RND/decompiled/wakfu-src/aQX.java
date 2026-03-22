/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import java.util.Optional;

public class aQX
extends aRY {
    private final int eIx;
    private final short eIy;

    public aQX(int n, short s) {
        this.eIx = n;
        this.eIy = s;
    }

    @Override
    public boolean isValid() {
        return this.eIy > 0;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        Optional<eKR> optional = bmr_1.iEC.Ep(this.eIx);
        if (optional.isEmpty()) {
            aqh_0.cBI().jI("La recette n'existe pas");
            return;
        }
        long l = aqw_0.cCv();
        eKR eKR2 = optional.get();
        Map<Integer, Bu<Short, Short>> map = eKR2.fzb();
        map.forEach((n, bu) -> {
            short s = (Short)bu.getFirst();
            long l2 = s * this.eIy;
            double d2 = Math.ceil((float)l2 / 32767.0f);
            long l3 = l2;
            int n2 = 0;
            while ((double)n2 < d2) {
                short s2 = l3 > 32767L ? (short)Short.MAX_VALUE : (short)l3;
                ns_0 ns_02 = new ns_0();
                ns_02.C((byte)3);
                ns_02.Q((short)20);
                ns_02.cX(l);
                ns_02.nX((int)n);
                ns_02.R(s2);
                ns_02.aN(true);
                ayf_22.d(ns_02);
                l3 -= (long)s2;
                ++n2;
            }
        });
    }
}

