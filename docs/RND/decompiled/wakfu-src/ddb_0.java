/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaException
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaException;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ddb
 */
class ddb_0
extends afk_1 {
    ddb_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    @Nullable
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("duration", "Duration of departure animation in milliseconds", aff_2.dJy, false)};
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        if (n != 1) {
            throw new LuaException("Invalid parameter count");
        }
        int n2 = this.xp(0);
        cum_1.nNA.setFadeOutDuration(n2);
    }

    @Override
    public String getName() {
        return "setFadeOutDuration";
    }
}

