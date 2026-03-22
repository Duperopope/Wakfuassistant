/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVd
 */
class bvd_1
extends afk_1 {
    bvd_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "addIECreationCallback";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("interactiveElementId", null, aff_2.dJz, false), new afe_1("funcName", null, aff_2.dJx, false), new afe_1("Parameters", null, aff_2.dJC, true)};
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
        if (afh_0.bxU().fR(n2) != null) {
            afx_12.a(string, afq_2Array, new afp_2[0]);
        }
        afh_0.bxU().b(new bve_2(this, n2, afx_12, string, afq_2Array), (long)n2);
        this.xC(n2);
    }
}

