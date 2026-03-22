/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bTG
 */
class btg_2
extends afk_1 {
    btg_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setPart";
    }

    @Override
    public String getDescription() {
        return "Set anm parts on a mobile";
    }

    @Override
    public afe_1[] bBg() {
        return btd_2.lql;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        String string = this.xu(1);
        String[] stringArray = new String[n - 2];
        for (int i = 2; i < n; ++i) {
            stringArray[i - 2] = this.xu(i);
        }
        adj_0 adj_02 = adn_0.bvh().fM(l);
        if (adj_02 != null) {
            adj_02.b(string, ary_2.n(stringArray));
        } else {
            this.a(btd_2.dog(), "le mobile " + l + " n'existe pas ");
        }
    }
}

