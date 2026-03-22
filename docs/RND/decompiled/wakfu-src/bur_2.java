/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bUr
 */
class bur_2
extends afk_1 {
    public bur_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "removeFightTurnStartedListener";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("playerId", null, aff_2.dJy, false)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        int n2 = this.xp(0);
        buw_1 buw_12 = new buw_1(n2);
        agm_2.cbu().c(buw_12);
    }
}

