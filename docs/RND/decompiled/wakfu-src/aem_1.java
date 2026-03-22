/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aEM
 */
class aem_1
extends afk_1 {
    aem_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String getName() {
        return "cancelWaitingTask";
    }

    @Override
    public String getDescription() {
        return "Cancel a waiting task";
    }

    @Override
    public final afe_1[] bBg() {
        return aek_1.dHC;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    public final void ss(int n) {
        afx_1 afx_12 = this.cai();
        int n2 = this.xp(0);
        afx_12.xL(n2);
    }
}

