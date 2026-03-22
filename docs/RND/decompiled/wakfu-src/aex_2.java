/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aEX
 */
class aex_2
extends afk_1 {
    aex_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "longToPosition";
    }

    @Override
    public afe_1[] bBg() {
        return aek_1.dHw;
    }

    @Override
    public afe_1[] bBh() {
        return aek_1.dHx;
    }

    @Override
    protected void ss(int n) {
        acd_1 acd_12 = anf_2.gn(this.xs(0));
        this.xC(acd_12.getX());
        this.xC(acd_12.getY());
        this.xC(acd_12.bdi());
    }
}

