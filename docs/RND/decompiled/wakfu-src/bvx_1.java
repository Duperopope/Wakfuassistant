/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVX
 */
class bvx_1
extends afk_1 {
    bvx_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setPetVisible";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("playerId", null, aff_2.dJw, false), new afe_1("visible", null, aff_2.dJA, false)};
    }

    @Override
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        boolean bl = this.xx(1);
        bgy bgy2 = bgg_0.dlO().ju(l);
        if (bgy2 != null && bgy2 instanceof bhJ) {
            bjo_0 bjo_02 = ((bhJ)bgy2).dpe();
            if (bjo_02 != null) {
                bjo_02.eam().setVisible(bl);
            } else {
                this.a(bvv_1.aGj(), "character " + l + " hasn't pet");
            }
        } else {
            this.a(bvv_1.aGR(), "character " + l + " don't exist");
        }
    }
}

