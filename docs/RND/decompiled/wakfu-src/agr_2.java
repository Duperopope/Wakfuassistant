/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aGr
 */
final class agr_2
extends agq_2 {
    private static final String dKX = "executeAction";
    private static final String dKY = "Force l'execution d'une action dont l'uid est pass? en param?tre";
    private static final afe_1[] dKZ = new afe_1[]{new afe_1("actionUID", null, aff_2.dJy, false)};
    private static final afe_1[] dLa = new afe_1[]{new afe_1("actionExists", null, aff_2.dJA, false)};

    agr_2(LuaState luaState, afw_2 afw_22) {
        super(luaState, afw_22);
    }

    @Override
    public String getName() {
        return dKX;
    }

    @Override
    public afe_1[] bBg() {
        return dKZ;
    }

    @Override
    public afe_1[] bBh() {
        return dLa;
    }

    @Override
    public void ss(int n) {
        int n2 = this.xp(0);
        aft_2 aft_22 = this.dKW.xS(n2);
        if (aft_22 != null) {
            this.dKW.a(aft_22, false);
            this.dK(true);
        } else {
            this.dK(false);
        }
    }

    @Override
    public String getDescription() {
        return dKY;
    }
}

