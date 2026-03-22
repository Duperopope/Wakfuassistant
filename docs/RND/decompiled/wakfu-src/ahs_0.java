/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ahS
 */
public class ahs_0
extends afr_1 {
    private static final ahs_0 cyI = new ahs_0();
    private aaj_0 cyJ = null;

    public aaj_0 bBc() {
        return this.cyJ;
    }

    public void g(aaj_0 aaj_02) {
        this.cyJ = aaj_02;
    }

    protected ahs_0() {
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new aif_1(luaState), new ain_1(luaState), new aia_2(luaState), new aij_1(luaState), new aib_2(luaState), new ail_1(luaState), new aiy_1(luaState), new aii_1(luaState), new aim_1(luaState), new aih_1(luaState), new aic_2(luaState)};
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return null;
    }

    public static ahs_0 bBd() {
        return cyI;
    }

    @Override
    public final String getName() {
        return "Camera";
    }

    @Override
    public String getDescription() {
        return "NO Description<br/>Please Dev... implement me!";
    }
}

