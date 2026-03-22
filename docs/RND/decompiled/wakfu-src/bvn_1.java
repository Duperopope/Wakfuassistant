/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVn
 */
class bvn_1
extends afk_1 {
    bvn_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getPosition";
    }

    @Override
    public String getDescription() {
        return "Return interactiveElement position";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("elementId", null, aff_2.dJw, false)};
    }

    @Override
    public afe_1[] bBh() {
        return new afe_1[]{new afe_1("x", "Position x", aff_2.dJy, false), new afe_1("y", "Position y", aff_2.dJy, false), new afe_1("z", "Position z", aff_2.dJy, false)};
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        afk_0 afk_02 = afh_0.bxU().fR(l);
        if (afk_02 == null || afk_02.aVD() == null) {
            this.a(bvc_2.lrR, this.getName() + " : l'element interactif d'id " + l + " n'existe pas...");
            this.cah();
            this.cah();
            this.cah();
            return;
        }
        acd_1 acd_12 = afk_02.aVD().aZw();
        this.xC(acd_12.getX());
        this.xC(acd_12.getY());
        this.xC(acd_12.bdi());
    }
}

