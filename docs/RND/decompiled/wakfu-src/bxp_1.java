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
 * Renamed from bXP
 */
public final class bxp_1
extends afk_1 {
    static final Logger lxk = Logger.getLogger(bxp_1.class);

    public bxp_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setCharacteristicListenerOn";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("characterId", null, aff_2.dJw, false), new afe_1("characteristic", null, aff_2.dJx, false), new afe_1("functionOnUpdate", null, aff_2.dJx, false), new afe_1("unregisterAfterTrigger", "true if function must be executed once", aff_2.dJA, false)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        String string = this.xu(1);
        String string2 = this.xu(2);
        boolean bl = this.xx(3);
        bgy bgy2 = bgg_0.dlO().ju(l);
        if (bgy2 == null) {
            lxk.error((Object)("No character found :" + l));
            return;
        }
        if (!bgy2.a((pt_0)exx_2.valueOf(string))) {
            lxk.error((Object)("No charac found (" + string + ") for character " + l));
            return;
        }
        exf_2 exf_22 = bgy2.e(exx_2.valueOf(string));
        exf_22.a(new bxq_1(this, string2, bl, exf_22));
    }

    static /* synthetic */ afx_1 a(bxp_1 bxp_12) {
        return bxp_12.cai();
    }
}

