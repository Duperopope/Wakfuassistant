/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aij
 */
class aij_2
extends afk_1 {
    aij_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "addPointLight";
    }

    @Override
    public String getDescription() {
        return "Add a point of light";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("posX", "Position x", aff_2.dJz, false), new afe_1("posY", "Position y", aff_2.dJz, false), new afe_1("posZ", "Position z", aff_2.dJz, false), new afe_1("red", "R of RGB value", aff_2.dJz, false), new afe_1("green", "G of RGB value", aff_2.dJz, false), new afe_1("blue", "B of RGB value", aff_2.dJz, false), new afe_1("radius", "Light radius (including automatic light attenuation)", aff_2.dJz, true)};
    }

    @Override
    public afe_1[] bBh() {
        return new afe_1[]{new afe_1("lightId", null, aff_2.dJy, false)};
    }

    @Override
    protected void ss(int n) {
        acf acf2 = (acf)asx_2.day.btu();
        acf2.a(new afU(this.xr(0), this.xr(1), this.xr(2)));
        acf2.u(this.xr(3), this.xr(4), this.xr(5));
        if (n == 7) {
            acf2.aT(this.xr(6));
        }
        acq_0.cge.a(acf2);
        int n2 = ++aih_2.bIL;
        aih_2.a(n2, acf2);
        this.xC(n2);
    }
}

