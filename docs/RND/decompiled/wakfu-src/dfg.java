/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dfg
extends afk_1 {
    dfg(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "openMRU";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ohP;
    }

    @Override
    public String getDescription() {
        return "Ouvre un MRU non d?fini sur un ?l?ment interactif du jeu";
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
        afk_0 afk_02 = afh_0.bxU().fR(l);
        if (afk_02 == null) {
            ddU.ohA.warn((Object)("impossible de trouver l'interactiveElement d'id " + l));
            return;
        }
        cwd_2.a(cph_12, afk_02);
        if (cph_12.eLs()) {
            cph_12.dET();
        }
    }
}

