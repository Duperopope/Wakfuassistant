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
 * Renamed from alG
 */
public class alg_2
extends alf_1 {
    public static final String cFK = "playLocalRandomSoundWithGlobalPitch";
    private static final afe_1[] cFL = new afe_1[]{new afe_1("rollOffPresetId", null, aff_2.dJy, false), new afe_1("stopOnAnimationChange", null, aff_2.dJA, false), new afe_1("minPitch", null, aff_2.dJz, false), new afe_1("maxPitch", null, aff_2.dJz, false), new afe_1("soundId, gain", null, aff_2.dJC, true)};

    public alg_2(ZC zC, LuaState luaState, Logger logger) {
        super(zC, luaState, logger);
    }

    @Override
    public String getName() {
        return cFK;
    }

    @Override
    public afe_1[] bBg() {
        return cFL;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected alp_1<alq_1> sV(int n) {
        int n2 = this.xp(0);
        boolean bl = this.xx(1);
        float f2 = this.xr(2);
        float f3 = this.xr(3);
        List<alq_1> list = this.a(4, n, false, (l, f4) -> new alq_1((long)l, f4.floatValue(), f2, f3));
        return new alp_1<alq_1>(n2, bl, list);
    }

    @Override
    protected /* synthetic */ Object sA(int n) {
        return this.sV(n);
    }
}

