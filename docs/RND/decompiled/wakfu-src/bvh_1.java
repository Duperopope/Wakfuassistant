/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVh
 */
class bvh_1
extends afk_1 {
    bvh_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "fireAction";
    }

    @Override
    public String getDescription() {
        return "Execute an action on element";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("interactiveElementId", null, aff_2.dJw, false), new afe_1("action", "Action name on InteractiveElementAction", aff_2.dJx, false), new afe_1("userId", null, aff_2.dJw, false)};
    }

    @Override
    public afe_1[] bBh() {
        return new afe_1[]{new afe_1("executed", "true if has been executed", aff_2.dJA, false)};
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        String string = this.xu(1);
        long l2 = this.xs(2);
        afk_0 afk_02 = afh_0.bxU().fR(l);
        try {
            bgy bgy2 = bgg_0.dlO().ju(l2);
            rw_0 rw_02 = rw_0.valueOf(string);
            boolean bl = afk_02.aVD().a(rw_02, bgy2);
            this.dK(bl);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            this.a(bvc_2.lrR, "type d'action inconnue " + string);
            this.cah();
            return;
        }
    }
}

