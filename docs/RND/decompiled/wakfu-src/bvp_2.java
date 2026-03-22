/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVP
 */
class bvp_2
extends afk_1 {
    final /* synthetic */ bvl_1 lsC;

    bvp_2(bvl_1 bvl_12, LuaState luaState) {
        this.lsC = bvl_12;
        super(luaState);
    }

    @Override
    public String getName() {
        return "getTarget";
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public final afe_1[] bBh() {
        return bvl_1.lsv;
    }

    @Override
    public void ss(int n) {
        bgy bgy2 = this.lsC.lsy.cWO();
        if (bgy2 != null) {
            this.hA(bgy2.Sn());
        } else {
            this.cah();
        }
    }
}

