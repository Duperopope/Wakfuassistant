/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bUz
 */
class buz_1
extends afk_1 {
    public buz_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "runOnItemEquipped";
    }

    @Override
    public String getDescription() {
        return "Run the method on an item equipment event with itemRefId <=> provided itemRefId. Unloaded after execution.";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("itemReferenceId", "Reference Id a ?couter", aff_2.dJy, false), new afe_1("funcName", "Focntion ? appeler", aff_2.dJx, false), new afe_1("params", "Param?tres de la fonction ? appeler", aff_2.dJC, true)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        int n2 = this.xp(0);
        bvh_2 bvh_22 = new bvh_2(n2);
        String string = this.xu(1);
        afq_2[] afq_2Array = this.cP(2, n);
        afx_1 afx_12 = this.cai();
        agm_2.cbu().a(bvh_22, afx_12, string, afq_2Array, true);
    }
}

