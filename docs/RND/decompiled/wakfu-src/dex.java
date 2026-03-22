/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dex
extends afk_1 {
    dex(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "displayButton";
    }

    @Override
    public String getDescription() {
        return "Display a button";
    }

    @Override
    @Nullable
    public afe_1[] bBg() {
        return ddU.ohE;
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        boolean bl = this.xx(0);
        String string = this.xu(1);
        String string2 = this.xu(2);
        String string3 = this.xu(3);
        if (n > 4) {
            afq_2[] afq_2Array = this.cP(4, n);
            ctu_1.nKS.b(afq_2Array);
        }
        int n2 = n > 5 ? this.xp(5) : -10;
        int n3 = n > 6 ? this.xp(6) : 10;
        fzw_0 fzw_02 = n > 7 ? fzw_0.valueOf(this.xu(7)) : ctu_1.nKV;
        ctu_1.nKS.pW(string2);
        ctu_1.nKS.setXOffset(n2);
        ctu_1.nKS.setYOffset(n3);
        ctu_1.nKS.setAlignment(fzw_02);
        ctu_1.nKS.f(this.cai());
        ctu_1.nKS.qv(string3);
        ctu_1.nKS.kk(bl);
        ctu_1.nKS.qu(string);
        if (!aue_0.cVJ().c(ctu_1.nKS)) {
            aue_0.cVJ().a(ctu_1.nKS);
        }
    }
}

