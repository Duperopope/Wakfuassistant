/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aGv
 */
final class agv_2
extends agq_2 {
    private static final afe_1[] dLl = new afe_1[]{new afe_1("actionId", null, aff_2.dJy, false)};
    private static final afe_1[] dLm = new afe_1[]{new afe_1("actionExists", null, aff_2.dJA, false)};
    private static final String dLn = "executeFirstActionWithSpecialId";
    private static final String dLo = "Execute la premi?re action qui correspond ? un effet dont l'id (id de l'effet, pas du type de l'effet) est pass? en param?tre";

    agv_2(LuaState luaState, afw_2 afw_22) {
        super(luaState, afw_22);
    }

    @Override
    public String getName() {
        return dLn;
    }

    @Override
    public afe_1[] bBg() {
        return dLl;
    }

    @Override
    public afe_1[] bBh() {
        return dLm;
    }

    @Override
    public void ss(int n) {
        int n2 = this.xp(0);
        aft_2 aft_22 = this.dKW.xT(n2);
        if (aft_22 != null) {
            this.dKW.a(aft_22, false);
            this.dK(true);
        } else {
            this.dK(false);
        }
    }

    @Override
    public String getDescription() {
        return dLo;
    }
}

