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
 * Renamed from bWT
 */
final class bwt_1
extends bxo_2 {
    private static final Logger lvs = Logger.getLogger(bwt_1.class);
    private static final String lvt = "getAreaId";
    private static final String lvu = "Return the area ID of the fighter given as parameter";
    private static final afe_1[] lvv = new afe_1[]{new afe_1("fighterId", null, aff_2.dJw, false)};
    private static final afe_1[] lvw = new afe_1[]{new afe_1("areaId", null, aff_2.dJw, false)};

    bwt_1(LuaState luaState, aWw aWw2) {
        super(luaState, aWw2);
    }

    @Override
    @Nullable
    public afe_1[] bBg() {
        return lvv;
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return lvw;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        int n2 = this.lwK.bha();
        if (n2 == -1) {
            this.a(lvs, "Fight Id introuvable : " + n2);
            this.cah();
            return;
        }
        bsS bsS2 = bsU.dHk().Ft(n2);
        if (bsS2 == null) {
            this.a(lvs, "Fight introuvable");
            this.cah();
            return;
        }
        QQ qQ = bsS2.bai().dp(l);
        if (qQ == null) {
            this.a(lvs, "Area introuvable : " + l);
            this.cah();
            return;
        }
        this.hA(qQ.bcw());
    }

    @Override
    public String getDescription() {
        return lvu;
    }

    @Override
    public String getName() {
        return lvt;
    }
}

