/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class deK
extends afk_1 {
    deK(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "followAchievement";
    }

    @Override
    public String getDescription() {
        return "Active (ou non) le suivi pour une qu\u00eate pr\u00e9cise";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ohD;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        int n2 = this.xp(0);
        boolean bl = this.xx(1);
        csc_1.G(n2, bl);
    }
}

