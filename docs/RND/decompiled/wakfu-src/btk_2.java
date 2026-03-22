/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bTK
 */
class btk_2
extends afk_1 {
    btk_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "copyActorFrom";
    }

    @Override
    public String getDescription() {
        return "Copy a mobile from another (both mobiles must exist)";
    }

    @Override
    public afe_1[] bBg() {
        return btd_2.lqs;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        long l2 = this.xs(1);
        adj_0 adj_02 = adn_0.bvh().fM(l);
        adj_0 adj_03 = adn_0.bvh().fM(l2);
        if (adj_02 == null) {
            this.a(btd_2.dqd(), "le mobile " + l + " n'existe pas ");
            return;
        }
        if (adj_03 == null) {
            this.a(btd_2.dqe(), "le mobile " + l2 + " n'existe pas ");
            return;
        }
        adj_03.a((ZC)adj_02);
    }
}

