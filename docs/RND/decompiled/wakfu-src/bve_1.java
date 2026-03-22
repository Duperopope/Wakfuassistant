/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVE
 */
class bve_1
extends afk_1 {
    bve_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "selectPosition";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("funcName", null, aff_2.dJx, false), new afe_1("funcParams", null, aff_2.dJC, true)};
    }

    @Override
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        String string = this.xu(0);
        afq_2[] afq_2Array = this.cP(1, n);
        afx_1 afx_12 = this.cai();
        int n2 = afq_2Array != null ? afq_2Array.length : 0;
        afq_2[] afq_2Array2 = new afq_2[n2 + 4];
        if (n2 != 0) {
            System.arraycopy(afq_2Array, 0, afq_2Array2, 4, afq_2Array.length);
        }
        if (aue_0.cVJ().c(bfv_0.dTx())) {
            aue_0.cVJ().b(bfv_0.dTx());
        }
        int n3 = afx_12.a(string, afq_2Array2);
        bfv_0.dTx().bX((byte)1);
        bfv_0.dTx().a(new bvf_2(this, afq_2Array2, afx_12, n3));
        aue_0.cVJ().a(bfv_0.dTx());
    }
}

