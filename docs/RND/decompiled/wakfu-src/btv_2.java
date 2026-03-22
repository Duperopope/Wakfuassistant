/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bTV
 */
public class btv_2
extends afr_1 {
    private static final btv_2 lqA = new btv_2();

    protected btv_2() {
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new btw_2(luaState), new bty_2(luaState)};
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return new afk_1[0];
    }

    public static btv_2 eol() {
        return lqA;
    }

    @Override
    public final String getName() {
        return "Ambiance";
    }

    @Override
    public String getDescription() {
        return "NO Description<br/>Please Dev... implement me!";
    }
}

