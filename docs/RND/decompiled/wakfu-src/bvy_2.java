/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVy
 */
class bvy_2
extends afk_1 {
    bvy_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setVisible";
    }

    @Override
    public String getDescription() {
        return "Change InteractiveElement visibility";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("id", "elementId", aff_2.dJw, false), new afe_1("visible", "Visibility", aff_2.dJA, false)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        boolean bl = this.xx(1);
        afk_0 afk_02 = afh_0.bxU().fR(l);
        if (afk_02 == null) {
            this.a(bvc_2.lrR, "l'element interactif d'id " + l + " n'existe pas.");
            return;
        }
        afk_02.setVisible(bl);
    }
}

