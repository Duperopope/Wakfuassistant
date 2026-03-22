/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajp
 */
public final class ajp_1
extends afk_1
implements ajs_1 {
    private static final afe_1[] cAP = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false)};
    private static final afe_1[] cAQ = new afe_1[]{new afe_1("isMoving", null, aff_2.dJA, false)};

    public ajp_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "isMoving";
    }

    @Override
    public String getDescription() {
        return "Return true if the mobile is moving";
    }

    @Override
    public afe_1[] bBg() {
        return cAP;
    }

    @Override
    public afe_1[] bBh() {
        return cAQ;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        ZC zC = this.gd(l);
        if (!(zC instanceof ads_0)) {
            this.a(this.bBx(), "Mobile " + l + " doesn't exist or is not a PathMobile", false);
            this.dK(false);
            return;
        }
        ads_0 ads_02 = (ads_0)zC;
        this.dK(ads_02.bvE());
    }
}

