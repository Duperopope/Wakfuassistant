/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bUA
 */
class bua_1
extends afk_1 {
    public bua_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setFightTurnStartedListener";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("playerId", "Listener id trigger on playerId's turn", aff_2.dJw, false), new afe_1("funcName", null, aff_2.dJx, false), new afe_1("params", null, aff_2.dJC, true)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        buw_1 buw_12 = new buw_1(l);
        String string = this.xu(1);
        afq_2[] afq_2Array = this.cP(2, n);
        afx_1 afx_12 = this.cai();
        agm_2.cbu().a(buw_12, afx_12, string, afq_2Array, false);
    }
}

