/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajR
 */
public final class ajr_1
extends afk_1
implements ajs_1 {
    private static final afe_1[] cBJ = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false)};

    public ajr_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setMobileNext4Direction";
    }

    @Override
    public String getDescription() {
        return "Set the mobile direction for it to be in direction4";
    }

    @Override
    public afe_1[] bBg() {
        return cBJ;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        ZC zC = this.gd(l);
        if (!(zC instanceof ZG)) {
            this.a(this.bBx(), "Mobile " + l + " doesn't exist or is not an AnimatedElementWithDirection", false);
            return;
        }
        ZG zG = (ZG)zC;
        if (!zG.bcB().bVO()) {
            zG.a(abi_1.wG((zG.bcB().dzy + 1) % 8));
        }
    }
}

