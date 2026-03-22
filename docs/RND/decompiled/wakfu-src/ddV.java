/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class ddV
extends afk_1 {
    ddV(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "activateFollowAchievement";
    }

    @Override
    public String getDescription() {
        return "Active/D\u00e9sactive le suivi des qu\u00eates";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ojB;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        if (n < 1) {
            return;
        }
        fse_1.gFu().f("followAchievementsEnabled", this.xx(0));
    }
}

