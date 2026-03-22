/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWC
 */
final class bwc_2
extends bwo_2 {
    private static final String ltZ = "isCritical";
    private static final String lua = "Permet de r?cup?rer savoir si l'action a d?clench? un coup critique";
    private static final afe_1[] lub = new afe_1[]{new afe_1("criticalHit", null, aff_2.dJA, false)};

    bwc_2(LuaState luaState, aUT aUT2) {
        super(luaState, aUT2);
    }

    @Override
    public String getName() {
        return ltZ;
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public afe_1[] bBh() {
        return lub;
    }

    @Override
    public void ss(int n) {
        this.dK(this.lta.cWw());
    }

    @Override
    public String getDescription() {
        return lua;
    }
}

