/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVY
 */
public class bvy_1
extends afr_1 {
    public static final bvy_1 lsJ = new bvy_1();

    private bvy_1() {
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new bwh_1(luaState), new bwf_1(luaState), new bwg_1(luaState), new bwd_1(luaState), new bvz_1(luaState), new bwb_1(luaState), new bwe_1(luaState)};
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return null;
    }

    @Override
    public final String getName() {
        return "Resource";
    }

    @Override
    public String getDescription() {
        return "NO Description<br/>Please Dev... implement me!";
    }

    static /* synthetic */ Logger aGh() {
        return dIl;
    }

    static /* synthetic */ Logger aGi() {
        return dIl;
    }

    static /* synthetic */ Logger aGj() {
        return dIl;
    }

    static /* synthetic */ Logger aGR() {
        return dIl;
    }
}

