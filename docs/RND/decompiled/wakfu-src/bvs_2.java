/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVs
 */
class bvs_2
extends afk_1 {
    bvs_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "removeIECreationCallback";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("callbackId", null, aff_2.dJz, false)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        afh_0.bxU().fT(l);
    }
}

