/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aGs
 */
final class ags_2
extends agq_2 {
    private static final String dLb = "executeActionsWithSpecialId";
    private static final String dLc = "Execute toutes les actions qui correspondent ? un effet dont l'id (id de l'effet, pas du type de l'effet) est pass? en param?tre";
    private static final afe_1[] dLd = new afe_1[]{new afe_1("actionId", null, aff_2.dJy, false)};

    ags_2(LuaState luaState, afw_2 afw_22) {
        super(luaState, afw_22);
    }

    @Override
    public String getName() {
        return dLb;
    }

    @Override
    public afe_1[] bBg() {
        return dLd;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        int n2 = this.xp(0);
        aft_2 aft_22 = this.dKW.xT(n2);
        while (aft_22 != null) {
            this.dKW.a(aft_22, false);
            aft_22 = this.dKW.xT(n2);
        }
    }

    @Override
    public String getDescription() {
        return dLc;
    }
}

