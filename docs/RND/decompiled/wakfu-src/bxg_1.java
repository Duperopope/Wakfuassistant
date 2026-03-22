/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXG
 */
public class bxg_1
extends afk_1 {
    public bxg_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getPlayerRealLevel";
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public final afe_1[] bBh() {
        return new afe_1[]{new afe_1("localPlayerRealLevel", null, aff_2.dJw, false)};
    }

    @Override
    protected void ss(int n) {
        this.xC(aue_0.cVJ().cVK().dnG());
    }
}

