/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from akd
 */
public final class akd_2
extends afk_1
implements ajs_1 {
    private static final afe_1[] cBW = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("destX", null, aff_2.dJy, false), new afe_1("destY", null, aff_2.dJy, false), new afe_1("destZ", null, aff_2.dJy, false), new afe_1("duration", null, aff_2.dJy, false), new afe_1("startVectorZ", null, aff_2.dJz, false), new afe_1("endVectorZ", null, aff_2.dJz, false)};

    public akd_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "throwCarriedMobile";
    }

    @Override
    public String getDescription() {
        return "Throw the carried mobile at the coordinates with the specified trajectory";
    }

    @Override
    public afe_1[] bBg() {
        return cBW;
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
        adj_0 adj_03 = adj_02.buU();
        if (adj_03 == null) {
            this.a(this.bBx(), "Mobile " + l + " doesn't carry", false);
            return;
        }
        int n2 = this.xp(1);
        int n3 = this.xp(2);
        int n4 = this.xp(3);
        int n5 = this.xp(4);
        float f2 = (float)this.xq(5);
        float f3 = (float)this.xq(6);
        adj_03.setVisible(true);
        adj_02.a(false, (acd_1)null);
        ahg ahg2 = new ahg(adj_03);
        ahg2.d(new acp_1(n2, n3, n4));
        ahg2.b(new acp_1(adj_03.bcC(), adj_03.bcD(), adj_03.bcE() + adj_02.aKu()));
        ahg2.fY(n5);
        ahg2.c(new acp_1(0.0f, 0.0f, f2));
        ahg2.e(new acp_1(0.0f, 0.0f, f3));
        ahl.bzR().b(ahg2);
    }
}

