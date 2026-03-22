/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aic
 */
public class aic_1
extends afr_1 {
    private static final aic_1 cyM = new aic_1();

    private aic_1() {
    }

    public static aic_1 bBi() {
        return cyM;
    }

    @Override
    public final String getName() {
        return "Flying";
    }

    @Override
    public String getDescription() {
        return "NO Description<br/>Please Dev... implement me!";
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new aid_2(luaState), new aie_2(luaState)};
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return null;
    }
}

