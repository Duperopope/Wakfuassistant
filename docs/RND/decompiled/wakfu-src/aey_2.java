/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aEY
 */
class aey_2
extends afk_1 {
    aey_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String getName() {
        return "max";
    }

    @Override
    public final afe_1[] bBg() {
        return aek_1.dHm;
    }

    @Override
    public afe_1[] bBh() {
        return aek_1.dHn;
    }

    @Override
    public final void ss(int n) {
        long l = this.xs(0);
        long l2 = this.xs(1);
        this.hA(Math.max(l, l2));
    }
}

