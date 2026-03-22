/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aii
 */
class aii_2
extends afk_1 {
    aii_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "addGlobalLight";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("red", null, aff_2.dJz, false), new afe_1("green", null, aff_2.dJz, false), new afe_1("blue", null, aff_2.dJz, false)};
    }

    @Override
    public afe_1[] bBh() {
        return new afe_1[]{new afe_1("lightId", null, aff_2.dJy, false)};
    }

    @Override
    protected void ss(int n) {
        aaW aaW2 = new aaW();
        aaW2.setColor(this.xr(0), this.xr(1), this.xr(2));
        acq_0.cge.a(aaW2);
        int n2 = ++aih_2.bIL;
        aih_2.a(n2, aaW2);
        this.xC(n2);
    }
}

