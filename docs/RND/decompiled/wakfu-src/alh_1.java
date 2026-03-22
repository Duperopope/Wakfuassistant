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
 * Renamed from alH
 */
public class alh_1
extends alf_1 {
    public static final String cFM = "playLocalRandomSoundWithPitch";
    private static final afe_1[] cFN = new afe_1[]{new afe_1("rollOffPresetId", null, aff_2.dJy, false), new afe_1("stopOnAnimationChange", null, aff_2.dJA, false), new afe_1("soundId, gain, minPitch, maxPitch", null, aff_2.dJC, true)};

    public alh_1(ZC zC, LuaState luaState, Logger logger) {
        super(zC, luaState, logger);
    }

    @Override
    public String getName() {
        return cFM;
    }

    @Override
    public afe_1[] bBg() {
        return cFN;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected alp_1<alq_1> sV(int n) {
        int n2 = this.xp(0);
        boolean bl = this.xx(1);
        List<alq_1> list = this.g(2, n, true);
        return new alp_1<alq_1>(n2, bl, list);
    }

    @Override
    protected /* synthetic */ Object sA(int n) {
        return this.sV(n);
    }
}

