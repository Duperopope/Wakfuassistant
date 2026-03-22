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
 * Renamed from aER
 */
class aer_1
extends afk_1 {
    aer_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String getName() {
        return "interrupt";
    }

    @Override
    public String getDescription() {
        return "Kill script";
    }

    @Override
    public final afe_1[] bBg() {
        return aek_1.dHa;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public final void ss(int n) {
        afx_1 afx_12 = this.cai();
        if (afx_12 != null) {
            if (n == 1) {
                afx_12.xJ(this.xp(0));
            } else {
                afx_12.cay();
            }
        }
    }
}

