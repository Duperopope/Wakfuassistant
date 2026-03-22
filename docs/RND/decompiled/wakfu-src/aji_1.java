/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aji
 */
public final class aji_1
extends afk_1
implements ajs_1 {
    private static final afe_1[] cAD = new afe_1[]{new afe_1("id", "mobile id", aff_2.dJz, false), new afe_1("hide", "true = hide mobile, false = show mobile", aff_2.dJA, false)};
    private static final afe_1[] cAE = new afe_1[]{new afe_1("mobileVisibilityChanged", null, aff_2.dJA, false)};

    public aji_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "hideMobile";
    }

    @Override
    public String getDescription() {
        return "Hide specific mobile";
    }

    @Override
    public afe_1[] bBg() {
        return cAD;
    }

    @Override
    public afe_1[] bBh() {
        return cAE;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        boolean bl = this.xx(1);
        adj_0 adj_02 = adn_0.bvh().fM(l);
        if (adj_02 == null) {
            this.a(this.bBx(), "Mobile " + l + " doesn't exist", false);
            this.dK(false);
            return;
        }
        if (adj_02.isVisible() == !bl) {
            this.dK(false);
            return;
        }
        adj_02.setVisible(!bl);
        this.dK(true);
    }
}

