/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWk
 */
class bwk_1
extends afk_1 {
    bwk_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setMonsterFollowEventId";
    }

    @Override
    public afe_1[] bBg() {
        afe_1[] afe_1Array = new afe_1[]{new afe_1("eventId", null, aff_2.dJy, false)};
        return afe_1Array;
    }

    @Override
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        int n2 = this.xp(0);
        cqv_2 cqv_22 = (cqv_2)cps_1.niS.eLJ();
        cqv_22.lT(n2);
    }
}

