/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bTO
 */
class bto_2
extends afk_1 {
    bto_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "equip";
    }

    @Override
    public String getDescription() {
        return "Generate a fake item skin on a mobile";
    }

    @Override
    public afe_1[] bBg() {
        return btd_2.lqn;
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
            try {
                String string2 = auc_0.cVq().bS("ANMEquipmentPath");
                string2 = String.format(string2, string);
                adj_02.b(string2, ary_2.n(stringArray));
            }
            catch (fu_0 fu_02) {
                btd_2.doi().error((Object)"Erreur au chargement d'une propri?t?", (Throwable)fu_02);
            }
        } else {
            this.a(btd_2.dqb(), "le mobile " + l + " n'existe pas ");
        }
    }
}

