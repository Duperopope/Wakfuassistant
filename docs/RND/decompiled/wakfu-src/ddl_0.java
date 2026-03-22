/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ddl
 */
public class ddl_0
extends afr_1 {
    private static final ddl_0 ogz = new ddl_0();

    private ddl_0() {
    }

    public static ddl_0 fcC() {
        return ogz;
    }

    @Override
    public final String getName() {
        return "SystemMessage";
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
        return new afk_1[]{new ddm_0(luaState)};
    }
}

