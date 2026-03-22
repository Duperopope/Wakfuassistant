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
 * Renamed from bUc
 */
public class buc_1
extends afr_1 {
    @Override
    public String getName() {
        return "BitOperator";
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new bue_1(luaState), new bud_2(luaState), new buf_1(luaState)};
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return null;
    }

    static /* synthetic */ Logger aGh() {
        return dIl;
    }
}

