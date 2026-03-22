/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVf
 */
class bvf_1
extends afk_1 {
    bvf_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "addIEDestructionCallback";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("interactiveElementId", null, aff_2.dJz, false), new afe_1("Function name", null, aff_2.dJx, false), new afe_1("Parameters", null, aff_2.dJC, true)};
    }

    @Override
    public afe_1[] bBh() {
        return new afe_1[]{new afe_1("callbackId", null, aff_2.dJz, false)};
    }

    @Override
    protected void ss(int n) {
        afx_1 afx_12 = this.cai();
        int n2 = this.xp(0);
        String string = this.xu(1);
        afq_2[] afq_2Array = this.cP(2, n);
        afh_0.bxU().b(new bvg_1(this, n2, afx_12, string, afq_2Array), (long)n2);
        this.xC(n2);
    }
}

