/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aiU
 */
public final class aiu_1
extends afk_1
implements ajs_1 {
    private static final afe_1[] cAb = new afe_1[]{new afe_1("carrierMobileId", null, aff_2.dJw, false)};
    private static final afe_1[] cAc = new afe_1[]{new afe_1("carriedMobileId", null, aff_2.dJw, false)};

    public aiu_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getCarriedMobileId";
    }

    @Override
    public String getDescription() {
        return "Return the ID of the carried mobile. Return 1 on error";
    }

    @Override
    public afe_1[] bBg() {
        return cAb;
    }

    @Override
    public afe_1[] bBh() {
        return cAc;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        adj_0 adj_02 = this.fM(l);
        if (adj_02 == null) {
            this.a(this.bBx(), "Mobile carrier " + l + " doesn't exist");
            this.hA(1L);
            return;
        }
        adj_0 adj_03 = adj_02.buU();
        if (adj_03 == null) {
            this.a(this.bBx(), "Mobile carrier " + l + " doesn't carry anything");
            this.hA(1L);
            return;
        }
        this.hA(adj_03.Sn());
    }
}

