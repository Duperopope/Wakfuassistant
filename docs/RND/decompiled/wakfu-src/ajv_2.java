/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajV
 */
public final class ajv_2
extends afk_1
implements ajs_1 {
    private static final afe_1[] cBO = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("animName", null, aff_2.dJx, true)};

    public ajv_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setMobileAnimationStaticKey";
    }

    @Override
    public String getDescription() {
        return "Set the name of the static animation of the mobile. Use only mobileId to revert to the default static animation";
    }

    @Override
    public afe_1[] bBg() {
        return cBO;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        ZC zC = this.gd(l);
        if (zC == null) {
            this.a(this.bBx(), "Mobile " + l + " doesn't exist", false);
            return;
        }
        String string = n == 2 ? this.xu(1) : "AnimStatique";
        zC.dV(string);
    }
}

