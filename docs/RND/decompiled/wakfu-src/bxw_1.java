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
 * Renamed from bXW
 */
public final class bxw_1
extends afk_1 {
    private static final Logger lxB = Logger.getLogger(bxw_1.class);
    private static final String lxC = "GetDistanceBetween";
    private static final String lxD = "Return distance between 2 interativeElements, with possibility to choose if that distance must be calculated with pathFinding";
    private static final afe_1[] lxE = new afe_1[]{new afe_1("IE 1 Id", null, aff_2.dJz, false), new afe_1("IE 2 Id", null, aff_2.dJz, false), new afe_1("With pathfind", null, aff_2.dJA, true)};
    private static final afe_1[] lxF = new afe_1[]{new afe_1("distance", null, aff_2.dJz, false)};

    public bxw_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    @Nullable
    public afe_1[] bBg() {
        return lxE;
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return lxF;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        long l2 = this.xs(1);
        boolean bl = this.xx(2);
        afk_0 afk_02 = afh_0.bxU().fR(l);
        if (afk_02 == null) {
            lxB.warn((Object)("Le premier \u00e9l\u00e9ment est introuvable " + l));
            return;
        }
        afk_0 afk_03 = afh_0.bxU().fR(l2);
        if (afk_03 == null) {
            lxB.warn((Object)("Le second \u00e9l\u00e9ment est introuvable " + l));
            return;
        }
        ni_1 ni_12 = afk_02.aVD();
        if (ni_12 == null) {
            lxB.warn((Object)("Le premier \u00e9l\u00e9ment est introuvable " + l));
            return;
        }
        ni_1 ni_13 = afk_03.aVD();
        if (ni_13 == null) {
            lxB.warn((Object)("Le second \u00e9l\u00e9ment est introuvable " + l));
            return;
        }
        acd_1 acd_12 = ni_12.aZw();
        acd_1 acd_13 = ni_13.aZw();
        if (!bl) {
            this.xC(acd_12.A(acd_13));
            return;
        }
        int n2 = bxw_1.g(acd_12, acd_13);
        this.xC(n2);
    }

    private static int g(acd_1 acd_12, acd_1 acd_13) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        st_0 st_02 = new st_0();
        st_02.bqM = true;
        st_02.bqN = 400;
        st_02.bqR = false;
        wz_0 wz_02 = new wz_0();
        wa_0.a(acd_12.getX(), acd_12.getY(), acd_13.getX(), acd_13.getY(), wz_02);
        sr_0 sr_02 = sr_0.bgd();
        st_02.bqM = ((ads_0)bgt_02.bvp()).bvx() != 8;
        sr_02.a(st_02);
        sr_02.a((int)bgt_02.bcN(), bgt_02.bcO(), bgt_02.bvy());
        sr_02.b(wz_02);
        sr_02.l(acd_12);
        sr_02.m(acd_13);
        sr_02.bgj();
        anp_2 anp_22 = sr_02.bgh();
        wz_02.reset();
        sr_02.aZp();
        return anp_22.bDU();
    }

    @Override
    public String getDescription() {
        return lxD;
    }

    @Override
    public String getName() {
        return lxC;
    }
}

