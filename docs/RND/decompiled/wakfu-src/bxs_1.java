/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import java.util.List;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXS
 */
public class bxs_1
extends bxr_1 {
    public static final String lxt = "playRandomSoundWithGlobalPitch";
    private static final afe_1[] lxu = new afe_1[]{new afe_1("minPitch", null, aff_2.dJz, false), new afe_1("maxPitch", null, aff_2.dJz, false), new afe_1("soundId, gain", null, aff_2.dJC, true)};

    public bxs_1(bxv_1 bxv_12, LuaState luaState, Logger logger) {
        super(bxv_12, luaState, logger);
    }

    @Override
    public String getName() {
        return lxt;
    }

    @Override
    public afe_1[] bBg() {
        return lxu;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected List<alq_1> sG(int n) {
        float f2 = this.xr(0);
        float f3 = this.xr(1);
        return this.a(2, n, false, (l, f4) -> new alq_1((long)l, f4.floatValue(), f2, f3));
    }

    @Override
    protected /* synthetic */ Object sA(int n) {
        return this.sG(n);
    }
}

