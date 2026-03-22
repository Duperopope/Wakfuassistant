/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bUv
 */
class buv_2
extends afk_1 {
    public buv_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "runOnEnterSellerMode";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("funcName", null, aff_2.dJx, false), new afe_1("params", null, aff_2.dJC, true)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        bul_1 bul_12 = new bul_1();
        String string = this.xu(0);
        afq_2[] afq_2Array = this.cP(1, n);
        afx_1 afx_12 = this.cai();
        agm_2.cbu().a(bul_12, afx_12, string, afq_2Array, true);
    }
}

