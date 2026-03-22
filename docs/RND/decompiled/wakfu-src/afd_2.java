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
 * Renamed from aFd
 */
class afd_2
extends afk_1 {
    afd_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String getName() {
        return "require";
    }

    @Override
    public String getDescription() {
        return "Import the content of a script in another during script build (useless if used dynamically)";
    }

    @Override
    public afe_1[] bBg() {
        return aek_1.dGW;
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
    }
}

