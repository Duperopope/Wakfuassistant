/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aiX
 */
public final class aix_1
extends afk_1
implements ajs_1 {
    private static final afe_1[] cAh = new afe_1[]{new afe_1("startMobileId", null, aff_2.dJw, false), new afe_1("destMobileId", null, aff_2.dJw, false)};
    private static final afe_1[] cAi = new afe_1[]{new afe_1("distance", null, aff_2.dJy, false)};

    public aix_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getDistanceBetweenMobile";
    }

    @Override
    public String getDescription() {
        return "Return the number of cell(s) between 2 mobiles";
    }

    @Override
    public afe_1[] bBg() {
        return cAh;
    }

    @Override
    public afe_1[] bBh() {
        return cAi;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        long l2 = this.xs(1);
        ZC zC = this.gd(l);
        ZC zC2 = this.gd(l2);
        if (zC == null || zC2 == null) {
            this.a(this.bBx(), "Mobile " + l + " or " + l2 + " doesn't exist", false);
            this.cah();
            return;
        }
        this.xC(amf_1.c((amg_1)zC, zC2));
    }
}

