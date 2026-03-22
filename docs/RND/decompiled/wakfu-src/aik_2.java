/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aik
 */
class aik_2
extends afk_1 {
    aik_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "removeGlobalLight";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("lightId", null, aff_2.dJy, false)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        int n2 = this.xp(0);
        acq_0.cge.b(aih_2.st(n2));
        aih_2.su(n2);
    }
}

