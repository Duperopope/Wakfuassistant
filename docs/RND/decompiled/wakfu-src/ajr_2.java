/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajr
 */
public final class ajr_2
extends afk_1
implements ajs_1 {
    private static final afe_1[] cAU = new afe_1[]{new afe_1("sourceMobileId", null, aff_2.dJw, false), new afe_1("toLinkMobileId", null, aff_2.dJw, false)};

    public ajr_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "linkMobile";
    }

    @Override
    public String getDescription() {
        return "Link the mobile to another. His anchor reference is the source mobile so it reproduces all his movements";
    }

    @Override
    public afe_1[] bBg() {
        return cAU;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        adj_0 adj_02 = this.fM(l);
        if (adj_02 == null) {
            this.a(this.bBx(), "Mobile " + l + " doesn't exist", false);
            return;
        }
        long l2 = this.xs(1);
        adj_0 adj_03 = this.fM(l2);
        if (adj_03 == null) {
            this.a(this.bBx(), "Mobile " + l2 + " doesn't exist", false);
            return;
        }
        adj_02.d(adj_03);
    }
}

