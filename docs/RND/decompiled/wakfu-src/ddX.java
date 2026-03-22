/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class ddX
extends afk_1 {
    ddX(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "addCompass";
    }

    @Override
    public String getDescription() {
        return "Cr?e une boussole";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ojt;
    }

    @Override
    public final afe_1[] bBh() {
        return ddU.oju;
    }

    @Override
    protected void ss(int n) {
        String string = aum_0.cWf().c(this.xu(0), new Object[0]);
        int n2 = this.xp(1);
        int n3 = this.xp(2);
        short s = n >= 4 ? (short)this.xp(3) : (short)0;
        if ((s = wa_0.y(n2, n3, s)) == Short.MIN_VALUE) {
            s = 0;
        }
        int n4 = 2;
        if (n >= 5) {
            n4 = this.xp(4);
        }
        long l = aym_2.bSE();
        bif_2.dYO().a(n4, (float)n2, (float)n3, (float)s, aue_0.cVJ().cVK().aqZ(), null, string, true);
        this.hA(l);
    }
}

