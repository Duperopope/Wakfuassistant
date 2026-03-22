/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dfo
extends afk_1 {
    dfo(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "removeCompass";
    }

    @Override
    public String getDescription() {
        return "Retire la boussole";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ojv;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        bif_2.dYO().dYQ();
    }
}

