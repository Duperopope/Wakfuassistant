/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class deU
extends afk_1 {
    deU(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "hideButton";
    }

    @Override
    public String getDescription() {
        return "D\u00e9pushe la frame du DisplayButton";
    }

    @Override
    @Nullable
    public afe_1[] bBg() {
        return null;
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        if (aue_0.cVJ().c(ctu_1.nKS)) {
            aue_0.cVJ().b(ctu_1.nKS);
        }
    }
}

