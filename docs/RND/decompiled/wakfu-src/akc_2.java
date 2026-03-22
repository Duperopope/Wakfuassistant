/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from akc
 */
public final class akc_2
extends afk_1
implements ajs_1 {
    private static final afe_1[] cBV = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("isVisible", null, aff_2.dJA, false), new afe_1("partNames", null, aff_2.dJC, false)};

    public akc_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setPartVisible";
    }

    @Override
    public String getDescription() {
        return "Set the visibility of parts of the mobile";
    }

    @Override
    public afe_1[] bBg() {
        return cBV;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        ZC zC = this.gd(l);
        if (zC == null) {
            this.a(this.bBx(), "Mobile " + l + " doesn't exist", false);
            return;
        }
        boolean bl = this.xx(1);
        String[] stringArray = new String[n - 2];
        for (int i = 2; i < n; ++i) {
            stringArray[i - 2] = this.xu(i);
        }
        zC.a(stringArray, bl);
    }
}

