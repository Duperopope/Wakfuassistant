/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ddg
 */
public class ddg_0
extends afr_1 {
    private static final ddg_0 ogm = new ddg_0();

    private ddg_0() {
    }

    public static ddg_0 fcv() {
        return ogm;
    }

    @Override
    public final String getName() {
        return "Pixmap";
    }

    @Override
    public String getDescription() {
        return "NO Description<br/>Please Dev... implement me!";
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return null;
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new ddh_0(luaState)};
    }
}

