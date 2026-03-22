/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWH
 */
final class bwh_2
extends afk_1 {
    private static final String luo = "getTarget";
    private static final String lup = "Permet de r?cup?rer l'id du personnage qui a activ? la zone";
    private static final afe_1[] luq = new afe_1[]{new afe_1("targetId", null, aff_2.dJw, false)};
    private final aVe lur;

    bwh_2(LuaState luaState, aVe aVe2) {
        super(luaState);
        this.lur = aVe2;
    }

    @Override
    public String getName() {
        return luo;
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public afe_1[] bBh() {
        return luq;
    }

    @Override
    public void ss(int n) {
        this.hA(this.lur.Qy());
    }

    @Override
    public String getDescription() {
        return lup;
    }
}

