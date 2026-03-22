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
 * Renamed from bXT
 */
public class bxt_1
extends bxr_1 {
    public static final String lxv = "playRandomSoundWithPitch";
    private static final afe_1[] lxw = new afe_1[]{new afe_1("soundId, gain, minPitch, maxPitch", null, aff_2.dJC, true)};

    public bxt_1(bxv_1 bxv_12, LuaState luaState, Logger logger) {
        super(bxv_12, luaState, logger);
    }

    @Override
    public String getName() {
        return lxv;
    }

    @Override
    public afe_1[] bBg() {
        return lxw;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected List<alq_1> sG(int n) {
        return this.g(0, n, true);
    }

    @Override
    protected /* synthetic */ Object sA(int n) {
        return this.sG(n);
    }
}

