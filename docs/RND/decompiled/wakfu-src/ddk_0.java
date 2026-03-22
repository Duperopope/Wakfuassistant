/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ddK
 */
final class ddk_0
extends afk_1 {
    ddk_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "show";
    }

    @Override
    public String getDescription() {
        return "Display an InteractiveBubble or a WakfuBubble";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("bubbleId", "Id de la bulle a afficher", aff_2.dJy, false)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        chj_2 chj_22 = dds_0.fcD().NV(this.xp(0));
        if (chj_22 != null) {
            chj_22.eKG();
            return;
        }
        fem_1 fem_12 = dds_0.fcD().NX(this.xp(0));
        fem_12.setBubbleIsVisible(true);
    }
}

