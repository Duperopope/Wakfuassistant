/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

final class ddD
extends afk_1 {
    ddD(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "removeOnClose";
    }

    @Override
    public String getDescription() {
        return "DO NOT USE";
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
        int n2 = this.xp(0);
        if (n2 < 0) {
            return;
        }
        chj_2 chj_22 = dds_0.fcD().NV(n2);
        if (chj_22 != null) {
            int n3 = ("interactiveBubbleDialog" + n2).hashCode();
            dds_0.fcD().NS(n3);
        } else {
            dds_0.fcD().NT(n2);
        }
    }
}

