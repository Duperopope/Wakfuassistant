/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVR
 */
public class bvr_2
extends afr_1 {
    final awd_0 lsE;

    @Override
    public final String getName() {
        return "Evolution";
    }

    @Override
    public String getDescription() {
        return "NO Description<br/>Please Dev... implement me!";
    }

    public bvr_2(awd_0 awd_02) {
        this.lsE = awd_02;
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new bvu_2(this, luaState), new bvt_1(this, luaState), new bvs_1(this, luaState)};
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return null;
    }
}

