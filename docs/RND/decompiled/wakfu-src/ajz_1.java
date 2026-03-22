/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajZ
 */
public final class ajz_1
extends afk_1
implements ajs_1 {
    private static final afe_1[] cBS = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("isVisible", null, aff_2.dJA, false)};

    public ajz_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setMobileVisible";
    }

    @Override
    public String getDescription() {
        return "Set the visibility of the mobile";
    }

    @Override
    public afe_1[] bBg() {
        return cBS;
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
        zC.setVisible(bl);
    }
}

