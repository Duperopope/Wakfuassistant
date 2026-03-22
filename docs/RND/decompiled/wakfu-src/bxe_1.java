/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXE
 */
public final class bxe_1
extends afk_1 {
    public bxe_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getPlayerName";
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public final afe_1[] bBh() {
        return new afe_1[]{new afe_1("localPlayerName", null, aff_2.dJx, false)};
    }

    @Override
    protected void ss(int n) {
        this.hS(aue_0.cVJ().cVK().getName());
    }
}

