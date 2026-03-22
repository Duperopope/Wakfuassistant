/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVK
 */
class bvk_2
extends afk_1 {
    final /* synthetic */ bvi_1 lss;

    bvk_2(bvi_1 bvi_12, LuaState luaState) {
        this.lss = bvi_12;
        super(luaState);
    }

    @Override
    public String getName() {
        return "getPlayer";
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public final afe_1[] bBh() {
        return new afe_1[]{new afe_1("playerId", null, aff_2.dJw, false)};
    }

    @Override
    public void ss(int n) {
        bhJ bhJ2 = this.lss.lsq.cXb();
        if (bhJ2 != null) {
            this.hA(bhJ2.Sn());
        } else {
            this.cah();
        }
    }
}

