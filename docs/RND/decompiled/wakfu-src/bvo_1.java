/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVO
 */
class bvo_1
extends afk_1 {
    final /* synthetic */ bvl_1 lsB;

    bvo_1(bvl_1 bvl_12, LuaState luaState) {
        this.lsB = bvl_12;
        super(luaState);
    }

    @Override
    public String getName() {
        return "getResourcePosition";
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public final afe_1[] bBh() {
        return bvl_1.lsw;
    }

    @Override
    public void ss(int n) {
        long l = this.lsB.lsy.cXc();
        this.xC(GC.cy(l));
        this.xC(GC.cz(l));
    }
}

