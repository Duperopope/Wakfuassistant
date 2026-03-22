/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aip
 */
class aip_1
extends afk_1 {
    aip_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setPointLightRange";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("lightId", null, aff_2.dJy, false), new afe_1("range", null, aff_2.dJz, false)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        acf acf2 = aih_2.sv(this.xp(0));
        if (acf2 != null) {
            acf2.aT(this.xr(1));
        } else {
            this.a(aih_2.cyR, "La lumi?re n'existe pas");
        }
    }
}

