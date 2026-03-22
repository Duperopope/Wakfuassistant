/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXB
 */
public final class bxb_1
extends afk_1 {
    public bxb_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getPlayer";
    }

    @Override
    public String getDescription() {
        return "Return local player id";
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public final afe_1[] bBh() {
        return new afe_1[]{new afe_1("localPlayerId", null, aff_2.dJw, false)};
    }

    @Override
    protected void ss(int n) {
        this.hA(aue_0.cVJ().cVK().Sn());
    }
}

