/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWn
 */
class bwn_2
extends afk_1 {
    public bwn_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "enableTutorialTooltips";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("enable", null, aff_2.dJA, false)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        bon.dAK().setEnabled(this.xx(0));
    }
}

