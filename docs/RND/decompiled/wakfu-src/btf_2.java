/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bTF
 */
class btf_2
extends afk_1 {
    btf_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "applyColorFrom";
    }

    @Override
    public afe_1[] bBg() {
        return btd_2.lqd;
    }

    @Override
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        long l2 = this.xs(1);
        adj_0 adj_02 = adn_0.bvh().fM(l);
        adj_0 adj_03 = adn_0.bvh().fM(l2);
        if (adj_02 == null) {
            btd_2.aGh().error((Object)("impossible de trouver le mobile " + l));
            return;
        }
        if (adj_03 == null) {
            btd_2.aGi().error((Object)("impossible de trouver le mobile " + l2));
            return;
        }
        adj_02.f(adj_03);
    }
}

