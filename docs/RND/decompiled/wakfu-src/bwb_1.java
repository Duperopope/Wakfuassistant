/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWb
 */
class bwb_1
extends afk_1 {
    bwb_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "addResourceDestructionCallback";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("Resource X", null, aff_2.dJz, false), new afe_1("Resource Y", null, aff_2.dJz, false), new afe_1("funcName", null, aff_2.dJx, false), new afe_1("funcParam", null, aff_2.dJC, true)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        afx_1 afx_12 = this.cai();
        int n2 = this.xp(0);
        int n3 = this.xp(1);
        String string = this.xu(2);
        afq_2[] afq_2Array = this.cP(3, n);
        if (bLe.ecw().dQ(n2, n3) != null) {
            afx_12.a(string, afq_2Array, new afp_2[0]);
        }
        bLe.ecw().b(new bwc_1(this, n2, n3, afx_12, string, afq_2Array));
    }
}

