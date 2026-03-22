/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajC
 */
public final class ajc_1
extends afk_1
implements ajs_1 {
    private static final afe_1[] cBq = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("animationName", null, aff_2.dJx, true), new afe_1("cellSpeed", "Time (ms) between two cells (see MovementSpeed.java)", aff_2.dJy, true)};

    public ajc_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setCustomWalkStyle";
    }

    @Override
    public String getDescription() {
        return "Change the walk style of the mobile (see MovementSpeed.java). Use only mobileId for reset the walk style";
    }

    @Override
    public afe_1[] bBg() {
        return cBq;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        ZC zC = this.gd(l);
        if (!(zC instanceof ads_0)) {
            this.a(this.bBx(), "Mobile " + l + " doesn't exist or is not a PathMobile", false);
            return;
        }
        ads_0 ads_02 = (ads_0)zC;
        if (n == 1) {
            ads_02.bvH();
        } else {
            ads_02.a(true, aea_0.cmt);
            adz_0 adz_02 = (adz_0)ads_02.bvO();
            adz_02.setAnimation(this.xu(1));
            if (n == 3) {
                adz_02.rY(this.xp(2));
            }
        }
    }
}

