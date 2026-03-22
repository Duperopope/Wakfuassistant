/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVI
 */
public class bvi_1
extends afr_1 {
    final aWa lsq;

    @Override
    public final String getName() {
        return "MonsterAction";
    }

    @Override
    public String getDescription() {
        return "NO Description<br/>Please Dev... implement me!";
    }

    public bvi_1(aWa aWa2) {
        this.lsq = aWa2;
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new bvj_2(this, luaState), new bvk_2(this, luaState)};
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return null;
    }
}

