/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bUd
 */
class bud_2
extends afk_1 {
    bud_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "And";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("number", aff_2.dJw, false), new afe_1("number", aff_2.dJw, false)};
    }

    @Override
    public final afe_1[] bBh() {
        return new afe_1[]{new afe_1("number", aff_2.dJw, false)};
    }

    @Override
    public void ss(int n) {
        if (n == 2) {
            this.hA(this.xs(0) & this.xs(1));
        }
    }
}

