/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajG
 */
public final class ajg_1
extends afk_1
implements ajs_1 {
    private static final afe_1[] cBu = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("alpha", "Alpha (between 0 and 1)", aff_2.dJz, false)};

    public ajg_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setMobileAlpha";
    }

    @Override
    public String getDescription() {
        return "Set the alpha of the mobile";
    }

    @Override
    public afe_1[] bBg() {
        return cBu;
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
        float f2 = (float)this.xq(1);
        zC.setAlpha(f2);
    }
}

