/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aGA
 */
public class aga_1
extends afr_1 {
    private static final String dLF = "ScriptedAction";
    private static final String dLG = "Librarie qui fournit des fonctions permettant de forcer l'execution d'actions dans des groupes d'actions";
    private final afw_2 dLH;

    @Override
    public final String getName() {
        return dLF;
    }

    @Override
    public String getDescription() {
        return dLG;
    }

    public aga_1(afw_2 afw_22) {
        this.dLH = afw_22;
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new agw_2(luaState, this.dLH), new agr_2(luaState, this.dLH), new agu_2(luaState, this.dLH), new agt_2(luaState, this.dLH), new agx_2(luaState, this.dLH), new agz_2(luaState, this.dLH), new agy_2(luaState, this.dLH), new agv_2(luaState, this.dLH), new ags_2(luaState, this.dLH)};
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return null;
    }
}

