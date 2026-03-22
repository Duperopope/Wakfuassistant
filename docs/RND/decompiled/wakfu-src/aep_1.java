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
 * Renamed from aEP
 */
class aep_1
extends afk_1 {
    aep_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String getName() {
        return "getTimer";
    }

    @Override
    public String getDescription() {
        return "Return elapsed time since script start.";
    }

    @Override
    @Nullable
    public final afe_1[] bBg() {
        return null;
    }

    @Override
    public afe_1[] bBh() {
        return aek_1.dGS;
    }

    @Override
    public final void ss(int n) {
        this.xC(this.cai().cax());
    }
}

