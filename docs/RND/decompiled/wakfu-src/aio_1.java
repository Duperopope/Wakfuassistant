/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aiO
 */
public final class aio_1
extends afk_1
implements ajs_1 {
    private static final afe_1[] czU = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("destX", null, aff_2.dJy, false), new afe_1("destY", null, aff_2.dJy, false), new afe_1("destZ", null, aff_2.dJy, false), new afe_1("duration", null, aff_2.dJy, false), new afe_1("startVectorX", null, aff_2.dJz, false), new afe_1("startVectorY", null, aff_2.dJz, false), new afe_1("startVectorZ", null, aff_2.dJz, false), new afe_1("endVectorX", null, aff_2.dJz, false), new afe_1("endVectorY", null, aff_2.dJz, false), new afe_1("endVectorZ", null, aff_2.dJz, false)};

    public aio_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "addCubicSplineTweenToMobile";
    }

    @Override
    public String getDescription() {
        return "Move the mobile based on vectors trajectories";
    }

    @Override
    public afe_1[] bBg() {
        return czU;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        ZC zC = this.gd(l);
        if (zC == null) {
            this.a(this.bBx(), "Mobile " + l + " doesn't exist", false);
            return;
        }
        int n2 = this.xp(1);
        int n3 = this.xp(2);
        int n4 = this.xp(3);
        int n5 = this.xp(4);
        float f2 = (float)this.xq(5);
        float f3 = (float)this.xq(6);
        float f4 = (float)this.xq(7);
        float f5 = (float)this.xq(8);
        float f6 = (float)this.xq(9);
        float f7 = (float)this.xq(10);
        ahg ahg2 = new ahg(zC);
        ahg2.d(new acp_1(n2, n3, n4));
        ahg2.b(new acp_1(zC.bcC(), zC.bcD(), zC.bcE()));
        ahg2.fY(n5);
        ahg2.c(new acp_1(f2, f3, f4));
        ahg2.e(new acp_1(f5, f6, f7));
        ahl.bzR().b(ahg2);
    }
}

