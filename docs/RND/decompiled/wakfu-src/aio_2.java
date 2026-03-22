/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aio
 */
class aio_2
extends afk_1 {
    aio_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setPointLightPosition";
    }

    @Override
    public String getDescription() {
        return "Repositionne une lumi?re pmonctuelle";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("lightId", "Id de lumi?re", aff_2.dJy, false), new afe_1("x", "Position x", aff_2.dJz, false), new afe_1("y", "Position y", aff_2.dJz, false), new afe_1("z", "Position z", aff_2.dJz, false)};
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        acf acf2 = aih_2.sv(this.xp(0));
        if (acf2 != null) {
            acp_1 acp_12 = acf2.bts();
            acp_12.m(this.xr(1), this.xr(2), this.xr(3));
        } else {
            this.a(aih_2.cyR, "La lumi?re n'existe pas");
        }
    }
}

