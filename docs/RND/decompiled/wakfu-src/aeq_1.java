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
 * Renamed from aEQ
 */
class aeq_1
extends afk_1 {
    aeq_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String getName() {
        return "import";
    }

    @Override
    public String getDescription() {
        return "Import script (functions can be used from loader script)";
    }

    @Override
    public afe_1[] bBg() {
        return aek_1.dGX;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
    }
}

