/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aFc
 */
class afc_2
extends afk_1 {
    afc_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String getName() {
        return "registerWaitingTask";
    }

    @Override
    public String getDescription() {
        return "Register a waiting task";
    }

    @Override
    public final afe_1[] bBg() {
        return aek_1.dHA;
    }

    @Override
    public afe_1[] bBh() {
        return aek_1.dHB;
    }

    @Override
    public final void ss(int n) {
        afx_1 afx_12 = this.cai();
        String string = this.xu(0);
        afq_2[] afq_2Array = this.cP(1, n);
        int n2 = afx_12.a(string, afq_2Array);
        this.xC(n2);
    }
}

