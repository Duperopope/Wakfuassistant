/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ais
 */
public class ais_1
extends afr_1 {
    private static final ais_1 cyX = new ais_1();

    protected ais_1() {
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new akl_2(luaState), new akf_2(luaState), new akn_2(luaState), new akj_2(luaState), new akp_2(luaState), new akh_2(luaState), new aki_2(luaState), new akk_2(luaState), new akm_2(luaState), new ako_2(luaState)};
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return null;
    }

    public static ais_1 bBp() {
        return cyX;
    }

    @Override
    public final String getName() {
        return "Particle";
    }

    @Override
    public String getDescription() {
        return "NO Description<br/>Please Dev... implement me!";
    }
}

