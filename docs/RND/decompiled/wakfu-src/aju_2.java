/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajU
 */
public final class aju_2
extends afk_1
implements ajs_1 {
    private static final afe_1[] cBN = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("scale", null, aff_2.dJz, false)};

    public aju_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setMobileScale";
    }

    @Override
    public String getDescription() {
        return "Set the scale of the mobile (default = 1)";
    }

    @Override
    public afe_1[] bBg() {
        return cBN;
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
        float f2 = this.xr(1);
        zC.setScale(f2);
    }
}

