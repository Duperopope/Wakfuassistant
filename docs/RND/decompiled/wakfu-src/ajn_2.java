/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajN
 */
public final class ajn_2
extends afk_1
implements ajs_1 {
    private static final afe_1[] cBE = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("direction8Index", null, aff_2.dJy, false)};

    public ajn_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setMobileDirection";
    }

    @Override
    public String getDescription() {
        return "Set the direction of the mobile";
    }

    @Override
    public afe_1[] bBg() {
        return cBE;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        ZC zC = this.gd(l);
        if (!(zC instanceof ZG)) {
            this.a(this.bBx(), "Mobile " + l + " doesn't exist or is not an AnimatedElementWithDirection", false);
            return;
        }
        int n2 = this.xp(1);
        ((ZG)zC).a(abi_1.wG(n2));
    }
}

