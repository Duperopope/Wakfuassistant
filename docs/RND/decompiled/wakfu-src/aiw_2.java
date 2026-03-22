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
 * Renamed from aiw
 */
public class aiw_2
extends afr_1 {
    private static final Logger czl = Logger.getLogger(aiw_2.class);
    private static final aiw_2 czm = new aiw_2();

    private aiw_2() {
    }

    public static aiw_2 bBs() {
        return czm;
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new aks_2(luaState), new aku_2(luaState), new akx_2(luaState), new akz_2(luaState), new aky_2(luaState), new akw_2(luaState), new ala_2(luaState), new akr_2(luaState)};
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return null;
    }

    @Override
    public final String getName() {
        return "World";
    }

    @Override
    public String getDescription() {
        return "NO Description<br/>Please Dev... implement me!";
    }
}

