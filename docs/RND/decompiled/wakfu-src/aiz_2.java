/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aiZ
 */
public final class aiz_2
extends afk_1
implements ajs_1 {
    private static final afe_1[] cAl = new afe_1[]{new afe_1("x", null, aff_2.dJy, false), new afe_1("y", null, aff_2.dJy, false)};
    private static final afe_1[] cAm = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false)};

    public aiz_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getMobileAtCoordinates";
    }

    @Override
    public String getDescription() {
        return "Return the mobile ID at given coords";
    }

    @Override
    public afe_1[] bBg() {
        return cAl;
    }

    @Override
    public afe_1[] bBh() {
        return cAm;
    }

    @Override
    protected void ss(int n) {
        int n2;
        int n3 = this.xp(0);
        ZC zC = this.bN(n3, n2 = this.xp(1));
        if (zC == null) {
            this.a(this.bBx(), "No mobile found at " + n3 + ", " + n2, false);
            this.hA(1L);
            return;
        }
        this.hA(zC.Sn());
    }
}

