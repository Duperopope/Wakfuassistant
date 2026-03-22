/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bTI
 */
class bti_2
extends afk_1 {
    bti_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "changeSkin";
    }

    @Override
    public String getDescription() {
        return "Change mobile's skin";
    }

    @Override
    public afe_1[] bBg() {
        return btd_2.lqm;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        String string = this.xu(1);
        adj_0 adj_02 = adn_0.bvh().fM(l);
        if (adj_02 instanceof bdf_1) {
            bdf_1 bdf_12 = (bdf_1)adj_02;
            bdf_12.lf(string);
            if (n > 2) {
                afx_1 afx_12 = this.cai();
                String string2 = this.xu(2);
                afq_2[] afq_2Array = this.cP(3, n);
                int n2 = afx_12.a(string2, afq_2Array);
                adj_02.d(new btj_2(this, afx_12, n2));
            }
        } else {
            this.a(btd_2.doh(), "le mobile " + l + " n'existe pas ");
        }
    }
}

