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
 * Renamed from deE
 */
class dee_0
extends afk_1 {
    dee_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "displaySplashScreenImage";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ojg;
    }

    @Override
    public String getDescription() {
        return "Affiche une image au centre de l'?cran (non modale)";
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        try {
            if (n < 1) {
                ddU.ohA.warn((Object)"On utilise displaySplashScreenImage sans argument !");
                return;
            }
            ccj_2.pd("splashScreenDialog");
            fse_1.gFu().f("splashScreenIconUrl", this.xu(0));
        }
        catch (Exception exception) {
            ddU.ohA.error((Object)"Exception lev?e lors det l'ajout d'un message de personnage sp?cial", (Throwable)exception);
        }
    }
}

