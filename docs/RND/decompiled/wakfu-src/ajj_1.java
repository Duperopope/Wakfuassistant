/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajJ
 */
public final class ajj_1
extends afk_1
implements ajs_1 {
    private static final afe_1[] cBz = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("speed", "Mobile animation speed (default = 1.0)", aff_2.dJz, false)};

    public ajj_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setMobileAnimationSpeed";
    }

    @Override
    public String getDescription() {
        return "Set the mobile animation speed (default = 1.0)";
    }

    @Override
    public afe_1[] bBg() {
        return cBz;
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
        zC.bQ(f2);
    }
}

