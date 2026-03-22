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
 * Renamed from bYc
 */
public final class byc_2
extends afr_1 {
    private static final String lxT = "Video";
    private static final String lxU = "Fournit les fonctions li\u00e9es \u00e0 l'utilisation de la video dans le script LUA";
    public static final byc_2 lxV = new byc_2();

    private byc_2() {
    }

    @Override
    @Nullable
    public String getName() {
        return lxT;
    }

    @Override
    public String getDescription() {
        return lxU;
    }

    @Override
    @Nullable
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new bya_2(luaState), new bxx_2(luaState), new bxy_2(luaState), new byb_2(luaState)};
    }

    @Override
    @Nullable
    public afk_1[] b(LuaState luaState) {
        return null;
    }
}

