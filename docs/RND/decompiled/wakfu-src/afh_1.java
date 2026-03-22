/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aFh
 */
class afh_1
extends afk_1 {
    afh_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "toString";
    }

    @Override
    public afe_1[] bBg() {
        return aek_1.dHy;
    }

    @Override
    public afe_1[] bBh() {
        return aek_1.dHz;
    }

    @Override
    protected void ss(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            String string = this.xw(i);
            stringBuilder.append(string != null ? string : null);
        }
        this.hS(stringBuilder.toString());
    }
}

