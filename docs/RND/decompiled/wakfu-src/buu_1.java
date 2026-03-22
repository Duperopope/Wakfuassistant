/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bUU
 */
class buu_1
extends afk_1 {
    buu_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "addSpellCastCallback";
    }

    @Override
    public afe_1[] bBg() {
        return buc_2.lrf;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        long l2 = this.xs(1);
        String string = this.xu(2);
        afq_2[] afq_2Array = this.cP(3, n);
        afx_1 afx_12 = this.cai();
        boolean bl = btu.jlv.a(bsR.jjE, new buv_1(this, l, l2, afx_12, string, afq_2Array));
        if (!bl) {
            buc_2.aGj().warn((Object)("Unable to addSpellCastCallback for mobile " + l));
        }
    }
}

