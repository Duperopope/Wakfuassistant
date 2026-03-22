/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aja
 */
public final class aja_2
extends afk_1
implements ajs_1 {
    private static final afe_1[] cAn = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false)};
    private static final afe_1[] cAo = new afe_1[]{new afe_1("direction8Index", null, aff_2.dJy, false)};

    public aja_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getMobileDirection";
    }

    @Override
    public String getDescription() {
        return "Return the direction of the mobile";
    }

    @Override
    public afe_1[] bBg() {
        return cAn;
    }

    @Override
    public afe_1[] bBh() {
        return cAo;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        ZC zC = this.gd(l);
        if (!(zC instanceof ZG)) {
            this.a(this.bBx(), "Mobile " + l + " doesn't exist or is not an AnimatedElementWithDirection", false);
            this.cah();
            return;
        }
        this.xC(((ZG)zC).bcB().dzy);
    }
}

