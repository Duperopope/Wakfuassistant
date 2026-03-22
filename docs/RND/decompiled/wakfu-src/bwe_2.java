/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWE
 */
public final class bwe_2
extends afr_1 {
    private final aVe luf;

    public bwe_2(aVe aVe2) {
        this.luf = aVe2;
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new bwh_2(luaState, this.luf), new bwg_2(luaState, this.luf), new bwf_2(luaState, this.luf)};
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return null;
    }

    @Override
    public final String getName() {
        return "EffectArea";
    }

    @Override
    public String getDescription() {
        return "NO Description<br/>Please Dev... implement me!";
    }
}

