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
 * Renamed from alM
 */
public class alm_1
extends alk_1 {
    public static final String cFW = "playRandomSoundWithPitch";
    private static final afe_1[] cFX = new afe_1[]{new afe_1("stopOnAnimationChange", null, aff_2.dJA, false), new afe_1("soundId, gain, minPitch, maxPitch", null, aff_2.dJC, true)};

    public alm_1(ZC zC, LuaState luaState, Logger logger) {
        super(zC, luaState, logger);
    }

    @Override
    public String getName() {
        return cFW;
    }

    @Override
    public afe_1[] bBg() {
        return cFX;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected alp_1<alq_1> sV(int n) {
        boolean bl = this.xx(0);
        List<alq_1> list = this.g(1, n, true);
        return new alp_1<alq_1>(bl, list);
    }

    @Override
    protected /* synthetic */ Object sA(int n) {
        return this.sV(n);
    }
}

