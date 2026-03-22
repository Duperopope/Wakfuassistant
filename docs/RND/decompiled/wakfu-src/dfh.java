/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dfh
extends afk_1 {
    dfh(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "openMRUWithAction";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ohO;
    }

    @Override
    public String getDescription() {
        return "Ouvre une MRU qui lance un script sur un ?l?ment interactif du jeu";
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        cph_1 cph_12 = new cph_1();
        long l = this.xs(0);
        int n2 = this.xp(1);
        int n3 = this.xp(2);
        afk_0 afk_02 = afh_0.bxU().fR(l);
        if (afk_02 == null) {
            ddU.ohA.warn((Object)("impossible de trouver l'interactiveElement d'id " + l));
            return;
        }
        crn_1 crn_12 = (crn_1)cps_1.njc.eLJ().eLD();
        crn_12.CV(n3);
        crn_12.lT(n2);
        cpm_1[] cpm_1Array = new cpm_1[]{crn_12};
        cph_12.a(cpm_1Array, (ZH)afk_02);
        if (cph_12.eLs()) {
            cph_12.dET();
        }
    }
}

