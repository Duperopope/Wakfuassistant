/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bTT
 */
class btt_2
extends afk_1 {
    btt_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setActorHeight";
    }

    @Override
    public afe_1[] bBg() {
        return btd_2.lqf;
    }

    @Override
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        short s = (short)this.xp(1);
        adj_0 adj_02 = adn_0.bvh().fM(l);
        if (adj_02 == null) {
            btd_2.aGR().warn((Object)("impossible de trouver le mobile " + l));
        } else {
            adj_02.aq(s);
        }
    }
}

