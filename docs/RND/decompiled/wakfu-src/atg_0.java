/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import java.util.Optional;

/*
 * Renamed from aTg
 */
public class atg_0
extends aRY {
    private final int eQt;

    public atg_0(int n) {
        this.eQt = n;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        Optional<eKR> optional = bmr_1.iEC.Ep(this.eQt);
        if (optional.isEmpty()) {
            aqh_0.cBI().jI(String.format("Recipe %s doesn't exist", this.eQt));
            return;
        }
        eKR eKR2 = optional.get();
        aqh_0.cBI().jF(String.format("Materials of recipe (%s) : ", this.eQt));
        Map<Integer, Bu<Short, Short>> map = eKR2.fzb();
        map.forEach((n, bu) -> {
            short s = (Short)bu.getFirst();
            bgv_2 bgv_22 = (bgv_2)fgD.fXh().Vd((int)n);
            String string = aum_0.cWf().c("item.rarity." + bgv_22.dwg().name(), new Object[0]);
            aqh_0.cBI().jF(String.format("Id : %s, name : %s, quantity : %s (%s)", n, bgv_22.getName(), s, string));
        });
    }
}

