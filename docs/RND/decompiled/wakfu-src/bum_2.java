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
 * Renamed from bUm
 */
public class bum_2
extends afr_1 {
    private static final bum_2 lqR = new bum_2();

    public static bum_2 eop() {
        return lqR;
    }

    @Override
    public final String getName() {
        return "Event";
    }

    @Override
    public String getDescription() {
        return "NO Description<br/>Please Dev... implement me!";
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new buo_2(luaState), new bup_2(luaState), new buw_2(luaState), new buy_1(luaState), new but_1(luaState), new buz_1(luaState), new buu_2(luaState), new bun_1(luaState), new bus_2(luaState), new buv_2(luaState), new bua_1(luaState), new bur_2(luaState), new buq_2(luaState)};
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return null;
    }

    private bum_2() {
    }

    static /* synthetic */ Logger aGh() {
        return dIl;
    }
}

