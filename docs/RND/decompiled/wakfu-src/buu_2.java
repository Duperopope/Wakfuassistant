/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bUu
 */
class buu_2
extends afk_1 {
    public buu_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "runOnBagLinked";
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
        bub_1 bub_12 = new bub_1();
        String string = this.xu(0);
        afq_2[] afq_2Array = this.cP(1, n);
        afx_1 afx_12 = this.cai();
        agm_2.cbu().a(bub_12, afx_12, string, afq_2Array, true);
    }
}

