/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aET
 */
class aet_2
extends afk_1 {
    aet_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public final String getName() {
        return "isEqual";
    }

    @Override
    public final afe_1[] bBg() {
        return aek_1.dHc;
    }

    @Override
    public afe_1[] bBh() {
        return aek_1.dHd;
    }

    @Override
    public final void ss(int n) {
        long l;
        long l2 = this.xs(0);
        boolean bl = l2 == (l = this.xs(1));
        this.dK(bl);
    }
}

