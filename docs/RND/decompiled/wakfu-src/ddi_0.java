/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ddI
 */
final class ddi_0
extends afk_1 {
    ddi_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setShakingMode";
    }

    @Override
    public String getDescription() {
        return "Specify to WakfuBubble to shake";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("bubbleId", null, aff_2.dJy, false), new afe_1("enable", null, aff_2.dJA, true)};
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
        fem_1 fem_12 = dds_0.fcD().NX(n2);
        if (fem_12 != null) {
            boolean bl = true;
            if (n > 1) {
                bl = this.xx(1);
            }
            fem_12.setShakingBubble(bl);
        }
    }
}

