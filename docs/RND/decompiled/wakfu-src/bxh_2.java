/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXh
 */
final class bxh_2
extends bxo_2 {
    private static final String lwn = "getTarget";
    private static final String lwo = "Retourne l'id de la cible de l'effet";
    private static final afe_1[] lwp = new afe_1[]{new afe_1("targetId", null, aff_2.dJw, false)};

    bxh_2(LuaState luaState, aWw aWw2) {
        super(luaState, aWw2);
    }

    @Override
    public String getName() {
        return lwn;
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public afe_1[] bBh() {
        return lwp;
    }

    @Override
    public void ss(int n) {
        this.hA(this.lwK.Qy());
    }

    @Override
    public String getDescription() {
        return lwo;
    }
}

