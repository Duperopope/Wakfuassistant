/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aFe
 */
class afe_2
extends afk_1 {
    afe_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String getName() {
        return "setInterval";
    }

    @Override
    public String getDescription() {
        return "Infinite timed execution of a function";
    }

    @Override
    public final afe_1[] bBg() {
        return aek_1.dGY;
    }

    @Override
    public afe_1[] bBh() {
        return aek_1.dGZ;
    }

    @Override
    public final void ss(int n) {
        afx_1 afx_12 = this.cai();
        int n2 = this.xp(0);
        String string = this.xu(1);
        afq_2[] afq_2Array = this.cP(2, n);
        int n3 = afx_12.a((int)n2, (int)-1, (String)string, (afq_2[])afq_2Array).dJb;
        this.xC(n3);
    }
}

