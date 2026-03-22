/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ddy
 */
final class ddy_0
extends afk_1 {
    ddy_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "close";
    }

    @Override
    public String getDescription() {
        return "Hide an InteractiveBubble or a WakfuBubble";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("bubbleId", "Id de la bulle a fermer", aff_2.dJy, false)};
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
        ddy_0.Oa(n2);
    }

    static void Oa(int n) {
        if (dds_0.fcD().NW(n) != null) {
            fyw_0.gqw().tl("interactiveBubbleDialog" + n);
        } else {
            xd_0.bnv().qB(n);
            dds_0.fcD().NY(n);
        }
    }
}

