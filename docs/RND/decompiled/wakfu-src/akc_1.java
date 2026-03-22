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
 * Renamed from akC
 */
public class akc_1
extends aka_1 {
    private static final Logger cDA = Logger.getLogger(akc_1.class);
    public static final String cDB = "playRandomApsSoundWithGlobalPitch";
    private static final afe_1[] cDC = new afe_1[]{new afe_1("fightId", null, aff_2.dJy, false), new afe_1("apsId", null, aff_2.dJy, false), new afe_1("duration", null, aff_2.dJy, false), new afe_1("fadeOutTime", null, aff_2.dJy, false), new afe_1("rollOffId", null, aff_2.dJy, false), new afe_1("loop", null, aff_2.dJA, false), new afe_1("minPitch", null, aff_2.dJz, false), new afe_1("maxPitch", null, aff_2.dJz, false), new afe_1("soundId, gain", null, aff_2.dJC, true)};

    public akc_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return cDB;
    }

    @Override
    public afe_1[] bBg() {
        return cDC;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected akb_1 sF(int n) {
        int n2 = this.xp(0);
        int n3 = this.xp(1);
        int n4 = this.xp(2);
        int n5 = this.xp(3);
        int n6 = this.xp(4);
        boolean bl = this.xx(5);
        float f2 = this.xr(6);
        float f3 = this.xr(7);
        if (n < 9) {
            return new akb_1(n2, n3, n4, n5, n6, bl);
        }
        List<alq_1> list = this.a(6, n, false, (l, f4) -> new alq_1((long)l, f4.floatValue(), f2, f3));
        return new akb_1(n2, n3, n4, n5, n6, bl, list);
    }

    @Override
    protected /* synthetic */ Object sA(int n) {
        return this.sF(n);
    }
}

