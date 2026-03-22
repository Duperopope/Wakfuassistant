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
 * Renamed from bUg
 */
public class bug_2
extends afr_1 {
    private static final Logger lqL = Logger.getLogger(bug_2.class);
    private static final bug_2 lqM = new bug_2();

    public static bug_2 eom() {
        return lqM;
    }

    protected bug_2() {
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new buh_2(luaState)};
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return null;
    }

    @Override
    public final String getName() {
        return "Challenge";
    }

    @Override
    public String getDescription() {
        return "NO Description<br/>Please Dev... implement me!";
    }
}

