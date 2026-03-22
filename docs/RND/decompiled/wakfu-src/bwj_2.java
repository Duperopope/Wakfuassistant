/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWj
 */
public class bwj_2
extends afr_1 {
    private static final bwj_2 lsX = new bwj_2();

    public static bwj_2 eov() {
        return lsX;
    }

    @Override
    public final String getName() {
        return "Server";
    }

    @Override
    public String getDescription() {
        return "Fonctions critiques qu'il vaut mieux ?viter d'utiliser";
    }

    private bwj_2() {
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new bwl_1(luaState), new bwk_1(luaState)};
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return new afk_1[0];
    }
}

