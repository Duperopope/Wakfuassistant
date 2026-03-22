/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bUP
 */
class bup_1
extends afk_1 {
    private final String lrh;
    private final bsR lri;

    bup_1(LuaState luaState, String string, bsR bsR2) {
        super(luaState);
        this.lrh = string;
        this.lri = bsR2;
    }

    @Override
    public String getName() {
        return this.lrh;
    }

    @Override
    public afe_1[] bBg() {
        return buc_2.lrd;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        String string = this.xu(0);
        afq_2[] afq_2Array = this.cP(1, n);
        afx_1 afx_12 = this.cai();
        boolean bl = btu.jlv.a(this.lri, new buq_1(this, afx_12, string, afq_2Array));
        if (!bl) {
            buc_2.aGh().warn((Object)("Unable to " + this.lrh));
        }
    }
}

