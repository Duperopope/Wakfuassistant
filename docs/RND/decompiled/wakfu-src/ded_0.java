/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from deD
 */
class ded_0
extends afk_1 {
    ded_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "displaySplashScreenAnimation";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ojh;
    }

    @Override
    public String getDescription() {
        return "Affiche une animation au centre de l'\u00e9cran (non modale)";
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        String string = this.xu(0);
        int n2 = this.xp(1);
        String string2 = this.xu(2);
        int n3 = this.xp(3);
        dgw.fcT().a(new dgm(dgx.okN, string, n2, string2, n3));
    }
}

