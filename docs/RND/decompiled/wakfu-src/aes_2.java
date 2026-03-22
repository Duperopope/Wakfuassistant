/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aES
 */
class aes_2
extends afk_1 {
    aes_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String getName() {
        return "invoke";
    }

    @Override
    public String getDescription() {
        return "Register a timed task";
    }

    @Override
    public final afe_1[] bBg() {
        return aek_1.dGT;
    }

    @Override
    public afe_1[] bBh() {
        return aek_1.dGV;
    }

    @Override
    public final void ss(int n) {
        afx_1 afx_12 = this.cai();
        int n2 = this.xp(0);
        int n3 = this.xp(1);
        String string = this.xu(2);
        afq_2[] afq_2Array = this.cP(3, n);
        afa_1 afa_12 = afx_12.a(n2, n3, string, afq_2Array);
        this.xC(afa_12.d());
    }
}

