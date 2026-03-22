/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWi
 */
final class bwi_1
extends afk_1 {
    private static final Logger lsU = Logger.getLogger(bwi_1.class);
    private static final String lsV = "restoreMountStatus";
    private static final afe_1[] lsW = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false)};

    bwi_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return lsV;
    }

    @Override
    public afe_1[] bBg() {
        return lsW;
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        bdj_2 bdj_22;
        bgy bgy2;
        long l = this.xs(0);
        ads_0 ads_02 = (ads_0)adn_0.bvh().fM(l);
        if (ads_02 instanceof bdj_2 && (bgy2 = (bdj_22 = (bdj_2)ads_02).dcP()) instanceof bhJ) {
            bhJ bhJ2 = (bhJ)bgy2;
            bhJ2.gj(bhJ2.bwb());
        } else {
            this.a(lsU, "Mobile " + l + " not found or is not a player");
        }
    }
}

