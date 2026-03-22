/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aid
 */
class aid_2
extends afk_1 {
    aid_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "addFlyingImageIE";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("interactiveElementId", null, aff_2.dJy, true), new afe_1("imagePath", null, aff_2.dJx, true)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        String string = this.xu(1);
        afk_0 afk_02 = afh_0.bxU().fR(l);
        xp_0 xp_02 = new xp_0();
        xo_0 xo_02 = new xo_0(string, -1, -1, (xu_0)xp_02, 3000);
        xo_02.a(afk_02);
        xd_0.bnv().a(xo_02);
    }
}

