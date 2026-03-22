/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aFf
 */
class aff_1
extends afk_1 {
    aff_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String getName() {
        return "substract";
    }

    @Override
    public final afe_1[] bBg() {
        return aek_1.dHi;
    }

    @Override
    public afe_1[] bBh() {
        return aek_1.dHj;
    }

    @Override
    public final void ss(int n) {
        long l = this.xs(0);
        long l2 = this.xs(1);
        long l3 = l - l2;
        this.hA(l3);
    }
}

