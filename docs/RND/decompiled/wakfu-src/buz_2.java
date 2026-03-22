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
 * Renamed from bUZ
 */
final class buz_2
extends afk_1 {
    private static final Logger lrH = Logger.getLogger(buz_2.class);
    private static final String lrI = "forceDismount";
    private static final afe_1[] lrJ = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false)};

    buz_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return lrI;
    }

    @Override
    public afe_1[] bBg() {
        return lrJ;
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        ads_0 ads_02 = (ads_0)adn_0.bvh().fM(l);
        if (ads_02 instanceof bdj_2) {
            bdj_2 bdj_22 = (bdj_2)ads_02;
            if (bdj_22.bwb()) {
                bdj_22.ddv().ifPresent(bke_22 -> bke_22.r(bdj_22));
                bdj_22.a((bke_2)null);
            }
        } else {
            this.a(lrH, "Mobile " + l + " not found or not a player");
        }
    }
}

