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
 * Renamed from ddc
 */
class ddc_0
extends afk_1 {
    ddc_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    @Nullable
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("blocking", "Block (or not) the mouse out of the vignette position", aff_2.dJA, false)};
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
        boolean bl = this.xx(0);
        cum_1.nNA.setMouseBlocked(bl);
    }

    @Override
    public String getName() {
        return "setMouseBlocked";
    }
}

