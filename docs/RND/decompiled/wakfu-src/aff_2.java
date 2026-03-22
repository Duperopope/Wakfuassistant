/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aFF
 */
public abstract sealed class aff_2
extends Enum<aff_2>
implements gb_0
permits afg_2, afh_2, afi_1, afj_1, afk_2, afl_1, afm_1, afn_2, afo_2 {
    public static final /* enum */ aff_2 dJv = new afg_2();
    public static final /* enum */ aff_2 dJw = new afh_2();
    public static final /* enum */ aff_2 dJx = new afi_1();
    public static final /* enum */ aff_2 dJy = new afj_1();
    public static final /* enum */ aff_2 dJz = new afk_2();
    public static final /* enum */ aff_2 dJA = new afl_1();
    public static final /* enum */ aff_2 dJB = new afm_1();
    public static final /* enum */ aff_2 dJC = new afn_2();
    public static final /* enum */ aff_2 dJD = new afo_2();
    private static final /* synthetic */ aff_2[] dJE;

    public static aff_2[] values() {
        return (aff_2[])dJE.clone();
    }

    public static aff_2 valueOf(String string) {
        return Enum.valueOf(aff_2.class, string);
    }

    final boolean b(aff_2 aff_22) {
        if (this == aff_22) {
            return true;
        }
        if (this == dJy) {
            return aff_22 == dJz;
        }
        if (this == dJz) {
            return aff_22 == dJy;
        }
        return false;
    }

    public abstract boolean a(LuaState var1, int var2);

    private static /* synthetic */ aff_2[] caL() {
        return new aff_2[]{dJv, dJw, dJx, dJy, dJz, dJA, dJB, dJC, dJD};
    }

    static {
        dJE = aff_2.caL();
    }
}

