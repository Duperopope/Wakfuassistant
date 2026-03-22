/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bUh
 */
class buh_2
extends afk_1 {
    public buh_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "enableAreaChallenges";
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
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.lja, this.xx(0));
    }
}

