/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aEL
 */
class ael_1
extends afk_1 {
    ael_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String getName() {
        return "abs";
    }

    @Override
    public final afe_1[] bBg() {
        return aek_1.dHk;
    }

    @Override
    public afe_1[] bBh() {
        return aek_1.dHl;
    }

    @Override
    public final void ss(int n) {
        long l = this.xs(0);
        this.hA(Math.abs(l));
    }
}

