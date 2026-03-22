/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dfv
extends afk_1 {
    dfv(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "removeMRU";
    }

    @Override
    public String getDescription() {
        return "Enl\u00e8ve un MRU d'action sp\u00e9cifi\u00e9e au personnage sp\u00e9cifi\u00e9";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ohT;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        int n2 = this.xp(1);
        bgy bgy2 = bgg_0.dlO().ju(l);
        if (bgy2 != null) {
            bgy2.CJ(n2);
        }
    }
}

