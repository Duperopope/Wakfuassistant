/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWY
 */
final class bwy_1
extends bxo_2 {
    private static final String lvL = "getCaster";
    private static final String lvM = "Retourne l'id du caster de l'effet";
    private static final afe_1[] lvN = new afe_1[]{new afe_1("casterId", null, aff_2.dJw, false)};

    bwy_1(LuaState luaState, aWw aWw2) {
        super(luaState, aWw2);
    }

    @Override
    public String getName() {
        return lvL;
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public afe_1[] bBh() {
        return lvN;
    }

    @Override
    protected void ss(int n) {
        this.hA(this.lwK.Qw());
    }

    @Override
    public String getDescription() {
        return lvM;
    }
}

