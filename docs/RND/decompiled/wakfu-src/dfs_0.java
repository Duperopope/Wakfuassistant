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
 * Renamed from dfs
 */
class dfs_0
extends afk_1 {
    dfs_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getDescription() {
        return "Enl?ve le marqueur de boussole de la map et de la miniMap";
    }

    @Override
    public final String getName() {
        return "removeMiniMapMarker";
    }

    @Override
    public final afe_1[] bBg() {
        return ddU.ojb;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public final void ss(int n) {
        bif_2.dYO().dYk();
    }
}

