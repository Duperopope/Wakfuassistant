/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVo
 */
class bvo_2
extends afk_1 {
    bvo_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getState";
    }

    @Override
    public String getDescription() {
        return "Return interactiveElement state";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("elementId", null, aff_2.dJw, false)};
    }

    @Override
    public afe_1[] bBh() {
        return new afe_1[]{new afe_1("state", "Depends on IE type", aff_2.dJy, false)};
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        afk_0 afk_02 = afh_0.bxU().fR(l);
        if (afk_02 == null) {
            this.a(bvc_2.lrR, "l'element interactif d'id " + l + " n'existe pas....");
            this.cah();
            return;
        }
        bCA bCA2 = (bCA)afk_02.aVD();
        this.xC(bCA2.bem());
    }
}

