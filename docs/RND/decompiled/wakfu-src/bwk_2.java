/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWK
 */
public final class bwk_2
extends afr_1 {
    public static final bwk_2 luA = new bwk_2();
    private static final String luB = "FightAction";
    private static final String luC = "Librairie qui permet de manipuler les groupes d'actions";

    private bwk_2() {
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new bwi_2(luaState)};
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return null;
    }

    @Override
    public String getName() {
        return luB;
    }

    @Override
    public String getDescription() {
        return luC;
    }
}

