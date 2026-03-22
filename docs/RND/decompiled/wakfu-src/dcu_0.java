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
 * Renamed from dcU
 */
class dcu_0
extends afk_1 {
    dcu_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    @Nullable
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("duration", "Duration (ms) of the linear interpolation", aff_2.dJz, false), new afe_1("left", "Offset to the left vignette side", aff_2.dJz, false), new afe_1("bottom", "Offset to the bottom vignette side", aff_2.dJz, false), new afe_1("right", "Offset to the right vignette side", aff_2.dJz, false), new afe_1("top", "Offset to the top vignette side", aff_2.dJz, false)};
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        if (n != 5) {
            throw new LuaException("Invalid parameter count");
        }
        long l = this.xs(0);
        float f2 = this.xr(1);
        float f3 = this.xr(2);
        float f4 = this.xr(3);
        float f5 = this.xr(4);
        cum_1.nNA.setMovePosition(l, f2, f3, f4, f5);
    }

    @Override
    public String getName() {
        return "movePosition";
    }
}

