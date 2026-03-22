/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aEU
 */
class aeu_2
extends afk_1 {
    aeu_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String getName() {
        return "isGreater";
    }

    @Override
    public final afe_1[] bBg() {
        return aek_1.dHe;
    }

    @Override
    public afe_1[] bBh() {
        return aek_1.dHf;
    }

    @Override
    public final void ss(int n) {
        long l;
        long l2 = this.xs(0);
        boolean bl = l2 > (l = this.xs(1));
        this.dK(bl);
    }
}

