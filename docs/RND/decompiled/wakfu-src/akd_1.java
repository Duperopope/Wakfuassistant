/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import java.util.List;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from akD
 */
public class akd_1
extends aka_1 {
    public static final String cDD = "playRandomApsSoundWithPitch";
    private static final afe_1[] cDE = new afe_1[]{new afe_1("fightId", null, aff_2.dJy, false), new afe_1("apsId", null, aff_2.dJy, false), new afe_1("duration", null, aff_2.dJy, false), new afe_1("fadeOutTime", null, aff_2.dJy, false), new afe_1("rollOffId", null, aff_2.dJy, false), new afe_1("loop", null, aff_2.dJA, false), new afe_1("soundId, gain, minPitch, maxPitch", null, aff_2.dJC, true)};

    public akd_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return cDD;
    }

    @Override
    public afe_1[] bBg() {
        return cDE;
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
        if (n < 7) {
            return new akb_1(n2, n3, n4, n5, n6, bl);
        }
        List<alq_1> list = this.g(6, n, true);
        return new akb_1(n2, n3, n4, n5, n6, bl, list);
    }

    @Override
    protected /* synthetic */ Object sA(int n) {
        return this.sF(n);
    }
}

