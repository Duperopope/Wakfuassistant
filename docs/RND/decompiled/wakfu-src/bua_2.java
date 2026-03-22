/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bUa
 */
public final class bua_2
extends afk_1 {
    private static final Logger lqH = Logger.getLogger(bua_2.class);
    private static final afe_1[] lqI = new afe_1[]{new afe_1("characterId", "character id", aff_2.dJz, false), new afe_1("petMobileRefId", "pet mobile id to apply colors to", aff_2.dJz, false), new afe_1("isMount", "true if it's a mount, false if it's a pet", aff_2.dJA, false)};
    private static final afe_1[] lqJ = new afe_1[]{new afe_1("mobileColorChanged", null, aff_2.dJA, false)};

    public bua_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "applyPlayerColorsToMobile";
    }

    @Override
    public String getDescription() {
        return "Set the colors of the pet/mount mobile to those of the player";
    }

    @Override
    public afe_1[] bBg() {
        return lqI;
    }

    @Override
    public afe_1[] bBh() {
        return lqJ;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        bgy bgy2 = bgg_0.dlO().ju(l);
        if (!(bgy2 instanceof bhJ)) {
            this.a(lqH, "Character " + l + " doesn't exist");
            this.dK(false);
            return;
        }
        long l2 = this.xs(1);
        adj_0 adj_02 = adn_0.bvh().fM(l2);
        if (adj_02 == null) {
            this.a(lqH, "Mobile " + l2 + " doesn't exist");
            this.dK(false);
            return;
        }
        boolean bl = this.xx(2);
        bhJ bhJ2 = (bhJ)bgy2;
        bua_2.a(bl, bhJ2, (bdf_1)adj_02);
        this.dK(true);
    }

    private static void a(boolean bl, bhJ bhJ2, bdf_1 bdf_12) {
        bjo_0 bjo_02;
        bjo_0 bjo_03 = bjo_02 = bl ? bhJ2.dpf() : bhJ2.dpe();
        if (bjo_02 == null) {
            return;
        }
        fnl_0 fnl_02 = bjo_02.ead();
        if (fnl_02 == null) {
            return;
        }
        fow_0 fow_02 = fnl_02.geM();
        int n = fnl_02.agK();
        bjn_0.a(fnl_02, bdf_12, n, fow_02, bhJ2);
    }
}

