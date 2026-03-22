/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bTS
 */
class bts_2
extends afk_1 {
    bts_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getSex";
    }

    @Override
    public String getDescription() {
        return "Return mobile gender";
    }

    @Override
    public afe_1[] bBg() {
        return btd_2.lqj;
    }

    @Override
    public afe_1[] bBh() {
        return btd_2.lqk;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        bgy bgy2 = bgg_0.dlO().ju(l);
        if (bgy2 == null) {
            this.a(btd_2.doX(), "Mobile introuvable " + l);
            this.cah();
            return;
        }
        this.xC(bgy2.aWO());
    }
}

