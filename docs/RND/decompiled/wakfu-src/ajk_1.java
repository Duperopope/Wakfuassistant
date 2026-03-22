/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajK
 */
public final class ajk_1
extends afk_1
implements ajs_1 {
    private static final afe_1[] cBA = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("animationSuffix", null, aff_2.dJx, true)};

    public ajk_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setMobileAnimationSuffix";
    }

    @Override
    public String getDescription() {
        return "Set a suffix to the mobile animations. Use only mobileId to remove the suffix";
    }

    @Override
    public afe_1[] bBg() {
        return cBA;
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
        zC.dU(n == 2 ? this.xu(1) : null);
    }
}

