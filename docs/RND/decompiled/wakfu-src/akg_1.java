/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import java.util.List;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from akG
 */
public class akg_1
extends ake_1 {
    public static final String cDK = "playRandomSoundWithPitch";
    private static final afe_1[] cDL = new afe_1[]{new afe_1("soundId, gain, minPitch, maxPitch", null, aff_2.dJC, true)};

    public akg_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return cDK;
    }

    @Override
    public afe_1[] bBg() {
        return cDL;
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

