/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aGy
 */
final class agy_2
extends agq_2 {
    private static final String dLx = "getNextActionWithSpecialIdTarget";
    private static final String dLy = "Retourne l'id de la cible de la prochaine action du groupe dont l'id (id de l'effet, pas du type de l'effet) est pass? en param?tre";
    private static final afe_1[] dLz = new afe_1[]{new afe_1("specialId", null, aff_2.dJy, false)};
    private static final afe_1[] dLA = new afe_1[]{new afe_1("targetId", null, aff_2.dJw, false)};

    agy_2(LuaState luaState, afw_2 afw_22) {
        super(luaState, afw_22);
    }

    @Override
    public String getName() {
        return dLx;
    }

    @Override
    public afe_1[] bBg() {
        return dLz;
    }

    @Override
    public afe_1[] bBh() {
        return dLA;
    }

    @Override
    public void ss(int n) {
        int n2 = this.xp(0);
        aft_2 aft_22 = this.dKW.xT(n2);
        if (aft_22 != null) {
            this.hA(aft_22.Qy());
        } else {
            this.hA(0L);
        }
    }

    @Override
    public String getDescription() {
        return dLy;
    }
}

