/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aFb
 */
class afb_1
extends afk_1 {
    afb_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String getName() {
        return "randomFloat";
    }

    @Override
    public final afe_1[] bBg() {
        return aek_1.dHq;
    }

    @Override
    public afe_1[] bBh() {
        return aek_1.dHr;
    }

    @Override
    public final void ss(int n) {
        float f2 = this.xr(0);
        float f3 = this.xr(1);
        float f4 = GC.b(f2, f3);
        this.dJ(f4);
    }
}

