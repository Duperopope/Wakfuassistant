/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajH
 */
public final class ajh_2
extends afk_1
implements ajs_1 {
    private static final afe_1[] cBv = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("animationName", null, aff_2.dJx, false), new afe_1("funcName", null, aff_2.dJx, true), new afe_1("funcParams", null, aff_2.dJC, true)};

    public ajh_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setMobileAnimation";
    }

    @Override
    public String getDescription() {
        return "Set the animation of the mobile";
    }

    @Override
    public afe_1[] bBg() {
        return cBv;
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
        String string = this.xu(1);
        zC.dT(string);
        zC.bpC();
        if (n > 2) {
            afx_1 afx_12 = this.cai();
            String string2 = this.xu(2);
            afq_2[] afq_2Array = this.cP(3, n);
            int n2 = afx_12.a(string2, afq_2Array);
            zC.a(new aji_2(this, zC, afx_12, n2));
        }
    }
}

