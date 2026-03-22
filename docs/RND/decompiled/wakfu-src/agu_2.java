/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aGu
 */
final class agu_2
extends agq_2 {
    private static final String dLh = "executeFirstAction";
    private static final String dLi = "Execute la premiere action de type et d'id donn? dans le groupe d'actions";
    private static final afe_1[] dLj = new afe_1[]{new afe_1("actionType", null, aff_2.dJy, false), new afe_1("actionId", null, aff_2.dJy, false)};
    private static final afe_1[] dLk = new afe_1[]{new afe_1("actionExists", null, aff_2.dJA, false)};

    agu_2(LuaState luaState, afw_2 afw_22) {
        super(luaState, afw_22);
    }

    @Override
    public String getName() {
        return dLh;
    }

    @Override
    public afe_1[] bBg() {
        return dLj;
    }

    @Override
    public afe_1[] bBh() {
        return dLk;
    }

    @Override
    public void ss(int n) {
        int n2;
        int n3 = this.xp(0);
        aft_2 aft_22 = this.dKW.cQ(n3, n2 = this.xp(1));
        if (aft_22 != null) {
            this.dKW.a(aft_22, false);
            this.dK(true);
        } else {
            this.dK(false);
        }
    }

    @Override
    public String getDescription() {
        return dLi;
    }
}

