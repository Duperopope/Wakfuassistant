/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bUw
 */
class buw_2
extends afk_1 {
    public buw_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "runOnInstanceLoaded";
    }

    @Override
    public String getDescription() {
        return "Execute the function on instance load end";
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
        aam_0 aam_02 = aie_0.cfn().bmC();
        if (aam_02 != null) {
            aag_0 aag_02 = aam_02.bqL();
            aag_02.c(aue_0.cVJ().cVK().ddI());
            afx_1 afx_12 = this.cai();
            String string = this.xu(0);
            afq_2[] afq_2Array = this.cP(1, n);
            int n2 = afx_12.a(string, afq_2Array);
            aag_02.c(aag_02.byR());
            aag_02.a(new bux_2(this, aag_02, afx_12, n2));
        } else {
            this.a(bum_2.aGh(), "No scene");
        }
    }
}

