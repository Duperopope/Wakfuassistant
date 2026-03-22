/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aGt
 */
final class agt_2
extends agq_2 {
    private static final String dLe = "executeAllAction";
    private static final String dLf = "Execute toutes les actions dont le type est l'id sont pass?s en param?tre";
    private static final afe_1[] dLg = new afe_1[]{new afe_1("actionType", null, aff_2.dJy, false), new afe_1("actionId", null, aff_2.dJy, false)};

    agt_2(LuaState luaState, afw_2 afw_22) {
        super(luaState, afw_22);
    }

    @Override
    public String getName() {
        return dLe;
    }

    @Override
    public afe_1[] bBg() {
        return dLg;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        int n2 = this.xp(0);
        int n3 = this.xp(1);
        aft_2 aft_22 = this.dKW.cQ(n2, n3);
        while (aft_22 != null) {
            this.dKW.a(aft_22, false);
            aft_22 = this.dKW.cQ(n2, n3);
        }
    }

    @Override
    public String getDescription() {
        return dLf;
    }
}

