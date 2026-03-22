/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajY
 */
public final class ajy_1
extends afk_1
implements ajs_1 {
    private static final afe_1[] cBR = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false)};

    public ajy_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setMobileToStaticAnimation";
    }

    @Override
    public String getDescription() {
        return "Set the mobile to STATIC animation";
    }

    @Override
    public afe_1[] bBg() {
        return cBR;
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
        zC.dT(zC.bpT());
    }
}

