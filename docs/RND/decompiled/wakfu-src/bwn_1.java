/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWN
 */
public class bwn_1
extends afr_1 {
    private static final String luM = "WakfuScriptedAction";
    private static final String luN = "Librarie qui fournit des fonctions permettant de forcer l'execution d'actions dans des groupes d'actions de Wakfu";
    private final afw_2 luO;

    public bwn_1(afw_2 afw_22) {
        this.luO = afw_22;
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new bwl_2(luaState, this.luO), new bwm_2(luaState, this.luO)};
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return null;
    }

    @Override
    public final String getName() {
        return luM;
    }

    @Override
    public String getDescription() {
        return luN;
    }
}

