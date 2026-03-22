/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWF
 */
final class bwf_2
extends afk_1 {
    private static final String lug = "getAreaId";
    private static final String luh = "Permet de r?cup?rer l'id de la zone associ?e de l'action";
    private static final afe_1[] lui = new afe_1[]{new afe_1("areaId", null, aff_2.dJw, false)};
    private final aVe luj;

    bwf_2(LuaState luaState, aVe aVe2) {
        super(luaState);
        this.luj = aVe2;
    }

    @Override
    public String getName() {
        return lug;
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public afe_1[] bBh() {
        return lui;
    }

    @Override
    public void ss(int n) {
        this.hA(this.luj.caQ());
    }

    @Override
    public String getDescription() {
        return luh;
    }
}

