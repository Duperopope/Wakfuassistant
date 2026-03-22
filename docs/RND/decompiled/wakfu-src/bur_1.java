/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bUR
 */
class bur_1
extends afk_1 {
    private final String lrm;
    private final bsR lrn;

    bur_1(LuaState luaState, String string, bsR bsR2) {
        super(luaState);
        this.lrm = string;
        this.lrn = bsR2;
    }

    @Override
    public String getName() {
        return this.lrm;
    }

    @Override
    public afe_1[] bBg() {
        return buc_2.lre;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        String string = this.xu(1);
        afq_2[] afq_2Array = this.cP(2, n);
        afx_1 afx_12 = this.cai();
        boolean bl = btu.jlv.a(this.lrn, new bus_1(this, l, afx_12, string, afq_2Array));
        if (!bl) {
            buc_2.aGi().warn((Object)("Unable to " + this.lrm + " for mobile " + l));
        }
    }
}

