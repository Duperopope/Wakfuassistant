/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWD
 */
final class bwd_2
extends bwo_2 {
    private static final String luc = "isTargetCellInRange";
    private static final String lud = "Renvoie true si la cellule cibl\u00e9e et situer dans la zone de port\u00e9e du sort";
    private static final afe_1[] lue = new afe_1[]{new afe_1("targetCellInRange", null, aff_2.dJA, false)};

    bwd_2(LuaState luaState, aUT aUT2) {
        super(luaState, aUT2);
    }

    @Override
    @Nullable
    public afe_1[] bBg() {
        return new afe_1[0];
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return lue;
    }

    @Override
    protected void ss(int n) {
        this.dK(this.lta.cWy());
    }

    @Override
    public String getName() {
        return luc;
    }

    @Override
    public String getDescription() {
        return lud;
    }
}

