/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXA
 */
public final class bxa_1
extends afk_1 {
    public bxa_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getPlayerFightId";
    }

    @Override
    public String getDescription() {
        return "Return ID of the current or observed fight for the local player character";
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public final afe_1[] bBh() {
        return new afe_1[]{new afe_1("localPlayerFightId", null, aff_2.dJy, false)};
    }

    @Override
    protected void ss(int n) {
        this.xC(aue_0.cVJ().cVK().dmW());
    }
}

