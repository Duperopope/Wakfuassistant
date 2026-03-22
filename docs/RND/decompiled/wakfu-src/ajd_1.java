/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajd
 */
public final class ajd_1
extends afk_1
implements ajs_1 {
    private static final afe_1[] cAt = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false)};
    private static final afe_1[] cAu = new afe_1[]{new afe_1("jumpCapacity", null, aff_2.dJy, false)};

    public ajd_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getMobileJumpCapacity";
    }

    @Override
    public String getDescription() {
        return "Return the jump capacity of the mobile";
    }

    @Override
    public afe_1[] bBg() {
        return cAt;
    }

    @Override
    public afe_1[] bBh() {
        return cAu;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        adj_0 adj_02 = adn_0.bvh().fM(l);
        if (!(adj_02 instanceof ads_0)) {
            this.a(this.bBx(), "Mobile " + l + " doesn't exist or is not a PathMobile", false);
            this.cah();
            return;
        }
        this.xC(((ads_0)adj_02).bvy());
    }
}

