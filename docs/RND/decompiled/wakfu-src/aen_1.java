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
 * Renamed from aEN
 */
class aen_1
extends afk_1 {
    aen_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String getName() {
        return "desinvoke";
    }

    @Override
    public String getDescription() {
        return "Clear timed and waiting tasks (all or by taskId)";
    }

    @Override
    public final afe_1[] bBg() {
        return aek_1.dGU;
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return null;
    }

    @Override
    public final void ss(int n) {
        int n2;
        afx_1 afx_12 = this.cai();
        int n3 = n2 = n > 0 ? this.xp(0) : -1;
        if (n2 == -1) {
            afx_12.caB();
        } else {
            afx_12.xJ(n2);
        }
    }
}

