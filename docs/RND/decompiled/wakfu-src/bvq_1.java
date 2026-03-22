/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVq
 */
class bvq_1
extends afk_1 {
    bvq_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "isUsable";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("elementId", null, aff_2.dJw, false)};
    }

    @Override
    public afe_1[] bBh() {
        return new afe_1[]{new afe_1("usable", null, aff_2.dJA, false)};
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        afk_0 afk_02 = afh_0.bxU().fR(l);
        if (afk_02 == null) {
            this.a(bvc_2.lrR, "l'element interactif d'id " + l + " n'existe pas.....");
            this.cah();
            return;
        }
        bCA bCA2 = (bCA)afk_02.aVD();
        this.dK(bCA2.isUsable());
    }
}

