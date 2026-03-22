/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bTY
 */
class bty_2
extends afk_1 {
    bty_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setWeather";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("temperature", null, aff_2.dJz, false), new afe_1("rainIntensity", null, aff_2.dJz, false), new afe_1("wind", null, aff_2.dJz, false)};
    }

    @Override
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        float f2 = (float)this.xq(0);
        wg_0 wg_02 = wg_0.qk(this.xp(1));
        float f3 = (float)this.xq(2);
        bof_1 bof_12 = new bof_1();
        bof_12.a(f2, f2, f2, 0.0f, new float[]{f2}, wg_02, f3, 0.0f);
        boh_1.ehH().b(bof_12);
        bzq_1.lCJ.a(bof_12.ehD(), 100);
        bzq_1.lCJ.eP(bof_12.blD());
    }
}

