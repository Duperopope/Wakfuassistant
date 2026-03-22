/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import java.util.List;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from akF
 */
public class akf_1
extends ake_1 {
    public static final String cDI = "playRandomSoundWithGlobalPitch";
    private static final afe_1[] cDJ = new afe_1[]{new afe_1("minPitch", null, aff_2.dJz, false), new afe_1("maxPitch", null, aff_2.dJz, false), new afe_1("soundId, gain", null, aff_2.dJC, true)};

    public akf_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return cDI;
    }

    @Override
    public afe_1[] bBg() {
        return cDJ;
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

