/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajB
 */
public final class ajb_2
extends afk_1
implements ajs_1 {
    private static final afe_1[] cBp = new afe_1[]{new afe_1("carrierId", null, aff_2.dJw, false), new afe_1("carriedId", null, aff_2.dJw, true)};

    public ajb_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setCarriedMobile";
    }

    @Override
    public String getDescription() {
        return "Set the carried mobile of the mobile. Use only carrierId to remove the carried mobile.";
    }

    @Override
    public afe_1[] bBg() {
        return cBp;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        adj_0 adj_02 = this.fM(l);
        if (adj_02 == null) {
            this.a(this.bBx(), "Mobile " + l + " doesn't exist", false);
            return;
        }
        if (n > 1) {
            if (adj_02.buX()) {
                this.a(this.bBx(), "Mobile " + l + " is already carrying", false);
                return;
            }
            long l2 = this.xs(1);
            adj_0 adj_03 = this.fM(l2);
            if (adj_03 == null || adj_03.buW()) {
                this.a(this.bBx(), "Mobile " + l + " doesn't exist or is already carried", false);
                return;
            }
            adj_02.c(adj_03);
        } else {
            if (!adj_02.buX()) {
                this.a(this.bBx(), "Mobile " + l + " doesn't carry anything", false);
                return;
            }
            adj_02.buY();
        }
    }
}

