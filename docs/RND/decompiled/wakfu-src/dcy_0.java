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
 * Renamed from dcY
 */
class dcy_0
extends afk_1 {
    dcy_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    @Nullable
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("red", "Red value between [0; 1]", aff_2.dJz, false), new afe_1("green", "Green value between [0; 1]", aff_2.dJz, false), new afe_1("blue", "Blue value between [0; 1]", aff_2.dJz, false)};
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        if (n != 3) {
            throw new LuaException("Invalid parameter count");
        }
        float f2 = this.xr(0);
        float f3 = this.xr(1);
        float f4 = this.xr(2);
        cum_1.nNA.setColor(f2, f3, f4);
    }

    @Override
    public String getName() {
        return "setColor";
    }
}

