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
 * Renamed from deM
 */
class dem_0
extends afk_1 {
    dem_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getLOD";
    }

    @Override
    public String getDescription() {
        return "Fourni le niveau de d?tails actuel du jeu";
    }

    @Override
    @Nullable
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public final afe_1[] bBh() {
        return ddU.ojs;
    }

    @Override
    protected void ss(int n) {
        this.xC(aaa_0.brC().brQ());
    }
}

