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
 * Renamed from bWm
 */
public class bwm_1
extends afr_1 {
    private static final Logger lsY = Logger.getLogger(bwm_1.class);
    private static final bwm_1 lsZ = new bwm_1();

    public static bwm_1 eow() {
        return lsZ;
    }

    private bwm_1() {
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new bwn_2(luaState)};
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return null;
    }

    @Override
    public final String getName() {
        return "Tutorial";
    }

    @Override
    public String getDescription() {
        return "NO Description<br/>Please Dev... implement me!";
    }
}

