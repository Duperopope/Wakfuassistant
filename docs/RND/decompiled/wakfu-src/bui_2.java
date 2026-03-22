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
 * Renamed from bUi
 */
public class bui_2
extends afr_1 {
    private static final Logger lqN = Logger.getLogger(bui_2.class);
    private static final bui_2 lqO = new bui_2();

    public static bui_2 eon() {
        return lqO;
    }

    protected bui_2() {
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new buj_1(luaState)};
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return null;
    }

    @Override
    public final String getName() {
        return "Climate";
    }

    @Override
    public String getDescription() {
        return "NO Description<br/>Please Dev... implement me!";
    }
}

