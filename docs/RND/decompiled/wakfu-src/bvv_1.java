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
 * Renamed from bVV
 */
public class bvv_1
extends afr_1 {
    private static final bvv_1 lsI = new bvv_1();

    public static bvv_1 eou() {
        return lsI;
    }

    private bvv_1() {
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new bvw_1(luaState), new bvx_1(luaState), new bua_2(luaState)};
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return null;
    }

    @Override
    public final String getName() {
        return "Pet";
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

