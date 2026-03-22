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
 * Renamed from dfj
 */
class dfj_0
extends afk_1 {
    dfj_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "pushHavenBagJukebox";
    }

    @Override
    public String getDescription() {
        return "Display or hide jukebox for Haven Bag";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ojd;
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        cwb_1.eVa().eVb();
    }
}

