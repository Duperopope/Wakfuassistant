/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aGx
 */
final class agx_2
extends agq_2 {
    private static final String dLt = "getNextActionTarget";
    private static final String dLu = "Retourne l'id de la cible de la prochaine action du groupe dont le type est l'id sont pass?s en param?tre";
    private static final afe_1[] dLv = new afe_1[]{new afe_1("actionType", null, aff_2.dJy, false), new afe_1("actionId", null, aff_2.dJy, false)};
    private static final afe_1[] dLw = new afe_1[]{new afe_1("targetId", null, aff_2.dJw, false)};

    agx_2(LuaState luaState, afw_2 afw_22) {
        super(luaState, afw_22);
    }

    @Override
    public String getName() {
        return dLt;
    }

    @Override
    public afe_1[] bBg() {
        return dLv;
    }

    @Override
    public afe_1[] bBh() {
        return dLw;
    }

    @Override
    public void ss(int n) {
        int n2;
        int n3 = this.xp(0);
        aft_2 aft_22 = this.dKW.cQ(n3, n2 = this.xp(1));
        if (aft_22 != null) {
            this.hA(aft_22.Qy());
        } else {
            this.hA(0L);
        }
    }

    @Override
    public String getDescription() {
        return dLu;
    }
}

