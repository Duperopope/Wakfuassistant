/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aEZ
 */
class aez_2
extends afk_1 {
    aez_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "positionToLong";
    }

    @Override
    public afe_1[] bBg() {
        return aek_1.dHu;
    }

    @Override
    public afe_1[] bBh() {
        return aek_1.dHv;
    }

    @Override
    protected void ss(int n) {
        int n2 = this.xp(0);
        int n3 = this.xp(1);
        int n4 = this.xp(2);
        this.hA(anf_2.L(n2, n3, (short)n4));
    }
}

