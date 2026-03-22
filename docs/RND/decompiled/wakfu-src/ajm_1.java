/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajM
 */
public final class ajm_1
extends afk_1
implements ajs_1 {
    private static final afe_1[] cBC = new afe_1[]{new afe_1("id", "mobile id", aff_2.dJz, false), new afe_1("mobileRefId", "mobile id of reference mobile to grab his color", aff_2.dJz, false)};
    private static final afe_1[] cBD = new afe_1[]{new afe_1("mobileColorChanged", null, aff_2.dJA, false)};

    public ajm_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setMobileColorFromAnotherMobile";
    }

    @Override
    public String getDescription() {
        return "Set color of specific mobile from another mobile";
    }

    @Override
    public afe_1[] bBg() {
        return cBC;
    }

    @Override
    public afe_1[] bBh() {
        return cBD;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        long l2 = this.xs(1);
        adj_0 adj_02 = adn_0.bvh().fM(l);
        if (adj_02 == null) {
            this.a(this.bBx(), "Mobile " + l + " doesn't exist", false);
            this.dK(false);
            return;
        }
        adj_0 adj_03 = adn_0.bvh().fM(l2);
        if (adj_03 == null) {
            this.a(this.bBx(), "Ref mobile " + l + " doesn't exist");
            this.dK(false);
            return;
        }
        adj_02.f(adj_03);
        this.dK(true);
    }
}

