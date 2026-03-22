/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aEO
 */
class aeo_1
extends afk_1 {
    aeo_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getIntFromTwoShort";
    }

    @Override
    public afe_1[] bBg() {
        return aek_1.dHD;
    }

    @Override
    public afe_1[] bBh() {
        return aek_1.dHE;
    }

    @Override
    protected void ss(int n) {
        short s = GC.cu(this.xs(0));
        short s2 = GC.cu(this.xs(1));
        this.xC(GC.d(s, s2));
    }
}

