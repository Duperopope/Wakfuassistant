/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bUT
 */
class but_2
extends afk_1 {
    but_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "removeCallback";
    }

    @Override
    public afe_1[] bBg() {
        return buc_2.lrg;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        String string = this.xu(1);
        bsR bsR2 = bsR.valueOf(string);
        boolean bl = btu.jlv.a(bsR2, l);
        if (!bl) {
            buc_2.aGR().warn((Object)("Unable to remove callback " + string + "for mobile " + l));
        }
    }
}

