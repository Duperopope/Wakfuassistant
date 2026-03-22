/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aiT
 */
public final class ait_1
extends afk_1
implements ajs_1 {
    private static final afe_1[] czZ = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("animationName", null, aff_2.dJx, false)};
    private static final afe_1[] cAa = new afe_1[]{new afe_1("duration", null, aff_2.dJy, false)};

    public ait_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getAnimationDuration";
    }

    @Override
    public String getDescription() {
        return "Return the duration (ms) of the animation (0 if the animation is a loop)";
    }

    @Override
    public afe_1[] bBg() {
        return czZ;
    }

    @Override
    public afe_1[] bBh() {
        return cAa;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        ZC zC = this.gd(l);
        if (zC == null) {
            this.a(this.bBx(), "Mobile " + l + " doesn't exist", false);
            this.cah();
            return;
        }
        String string = this.xu(1);
        int n2 = zC.dY(string);
        this.xC(n2 == -1 ? 0 : n2);
    }
}

