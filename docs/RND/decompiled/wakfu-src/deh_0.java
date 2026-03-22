/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from deh
 */
class deh_0
extends afk_1 {
    deh_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "addLandMarkNote";
    }

    @Override
    public String getDescription() {
        return "Ajoute une note personnelle";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ohF;
    }

    @Override
    public final afe_1[] bBh() {
        return ddU.ohC;
    }

    @Override
    public void ss(int n) {
        String string = aum_0.cWf().c(this.xu(0), new Object[0]);
        int n2 = this.xp(1);
        int n3 = this.xp(2);
        int n4 = this.xp(3);
        int n5 = 0;
        if (n >= 5) {
            n5 = this.xp(4);
        }
        boolean bl = false;
        if (n >= 6) {
            bl = this.xx(5);
        }
        bRp bRp2 = bif_2.dYO().dYi().a(n3, n4, n5, n2, string, bl);
        this.xC(bRp2.d());
    }
}

