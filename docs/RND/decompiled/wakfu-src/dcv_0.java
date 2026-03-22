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
 * Renamed from dcV
 */
class dcv_0
extends afk_1 {
    dcv_0(LuaState luaState) {
        super(luaState);
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
        if (n != 0) {
            throw new LuaException("Invalid parameter count");
        }
        cum_1.nNA.reset();
    }

    @Override
    public String getName() {
        return "reset";
    }
}

