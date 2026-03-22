/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aie
 */
class aie_2
extends afk_1 {
    aie_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "addFlyingImageMob";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("mobileId", null, aff_2.dJy, true), new afe_1("imagePath", null, aff_2.dJx, true)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        String string = this.xu(1);
        adj_0 adj_02 = adn_0.bvh().fM(l);
        xp_0 xp_02 = new xp_0();
        xo_0 xo_02 = new xo_0(string, -1, -1, (xu_0)xp_02, 3000);
        xo_02.a(adj_02);
        xd_0.bnv().a(xo_02);
    }
}

