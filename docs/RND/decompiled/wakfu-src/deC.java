/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class deC
extends afk_1 {
    deC(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String getName() {
        return "displaySmiley";
    }

    @Override
    public String getDescription() {
        return "Affiche le smiley sp?cifi? au-dessus d'un mobile";
    }

    @Override
    public final afe_1[] bBg() {
        return ddU.ojc;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public final void ss(int n) {
        if (n < 2) {
            ddU.ohA.warn((Object)"On utilise displaySmiley sans argument !");
            return;
        }
        int n2 = n > 2 ? this.xp(2) : -1;
        csz_1.c(this.xp(0), this.xs(1), n2);
    }
}

