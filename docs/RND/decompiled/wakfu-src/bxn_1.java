/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXN
 */
public final class bxn_1
extends afk_1 {
    public bxn_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "isInFight";
    }

    @Override
    public String getDescription() {
        return "Check if the local player is in fight";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("currentFight", "True if player must be in the fight (false if must be in fight or spectator)", aff_2.dJA, true)};
    }

    @Override
    public final afe_1[] bBh() {
        return new afe_1[]{new afe_1("inFight", null, aff_2.dJA, false)};
    }

    @Override
    protected void ss(int n) {
        bsj_0 bsj_02 = aue_0.cVJ().cVK().dmV();
        if (bsj_02 == null) {
            this.dK(false);
            return;
        }
        if (n == 1 && this.xx(0)) {
            this.dK(this.cai().bha() == bsj_02.d());
            return;
        }
        this.dK(true);
    }
}

