/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bTU
 */
class btu_2
extends afk_1 {
    btu_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "stopMovingActor";
    }

    @Override
    public String getDescription() {
        return "Stop the mobile";
    }

    @Override
    public afe_1[] bBg() {
        return btd_2.lqi;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        bgy bgy2 = bgg_0.dlO().ju(l);
        if (bgy2 == null) {
            this.a(btd_2.dof(), "Mobile introuvable " + l);
            return;
        }
        bgy2.ddI().bvA();
    }
}

