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
 * Renamed from dcW
 */
class dcw_0
extends afk_1 {
    dcw_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    @Nullable
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("alpha", "Alpha value between [0; 1]", aff_2.dJz, false)};
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
        float f2 = this.xr(0);
        cum_1.nNA.setAlpha(f2);
    }

    @Override
    public String getName() {
        return "setAlpha";
    }
}

