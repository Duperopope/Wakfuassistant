/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bTH
 */
class bth_2
extends afk_1 {
    bth_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "changeActorDefaultDeltaZ";
    }

    @Override
    public String getDescription() {
        return "Change the layer of the mobile. Default layer is 7.";
    }

    @Override
    public afe_1[] bBg() {
        return btd_2.lqh;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        int n2 = this.xp(1);
        bgy bgy2 = bgg_0.dlO().ju(l);
        if (bgy2 == null) {
            this.a(btd_2.aGS(), "Mobile introuvable " + l);
            return;
        }
        bgy2.ddI().qR(n2);
    }
}

