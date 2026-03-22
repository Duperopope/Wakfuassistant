/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

final class ddF
extends afk_1 {
    ddF(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setFont";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("bubbleId", null, aff_2.dJy, false)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        chj_2 chj_22 = dds_0.fcD().NV(this.xp(0));
        if (chj_22 != null) {
            chj_22.setBubbleFontName(this.xu(1));
            chj_22.setBubbleFontSize(this.xp(2));
            chj_22.setBubbleFontStyle(this.xp(3));
        }
    }
}

