/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bUt
 */
class but_1
extends afk_1 {
    public but_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "removeInteractiveElementActivationListener";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("elementId", null, aff_2.dJw, false), new afe_1("actionType", "Name of a field on InteractiveElementAction", aff_2.dJx, false)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        short s = rw_0.valueOf(this.xu(1)).bdX();
        bvb_2 bvb_22 = new bvb_2(l, s);
        afx_1 afx_12 = this.cai();
        agm_2.cbu().a(bvb_22, afx_12);
    }
}

