/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bTP
 */
class btp_2
extends afk_1 {
    public btp_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getActivePetMobile";
    }

    @Override
    public String getDescription() {
        return "Return the ID of the active pet mobile of supplied character. Return -1 on error";
    }

    @Override
    public afe_1[] bBg() {
        return btd_2.lqu;
    }

    @Override
    public afe_1[] bBh() {
        return btd_2.lqv;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        bgy bgy2 = bgg_0.dlO().ju(l);
        if (!(bgy2 instanceof bhJ)) {
            this.hA(-1L);
            return;
        }
        bhJ bhJ2 = (bhJ)bgy2;
        bjo_0 bjo_02 = bhJ2.dpe();
        if (bjo_02 == null || !bjo_02.adO() || bjo_02.eam() == null || !bjo_02.ead().apo()) {
            this.hA(-1L);
            return;
        }
        this.hA(bjo_02.eam().Sn());
    }
}

