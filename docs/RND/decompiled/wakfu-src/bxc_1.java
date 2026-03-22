/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXC
 */
public final class bxc_1
extends afk_1 {
    public bxc_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getPlayerInstanceId";
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public final afe_1[] bBh() {
        return new afe_1[]{new afe_1("localPlayerInstanceId", null, aff_2.dJy, false)};
    }

    @Override
    protected void ss(int n) {
        this.hA(aue_0.cVJ().cVK().aqZ());
    }
}

