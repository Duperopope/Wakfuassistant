/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajO
 */
public final class ajo_1
extends afk_1
implements ajs_1 {
    private static final afe_1[] cBF = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("jumpCapacity", null, aff_2.dJy, false)};

    public ajo_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setMobileJumpCapacity";
    }

    @Override
    public String getDescription() {
        return "Set the jump capacity of the mobile (default = 4)";
    }

    @Override
    public afe_1[] bBg() {
        return cBF;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        ZC zC = this.gd(l);
        if (!(zC instanceof ads_0)) {
            this.a(this.bBx(), "Mobile " + l + " doesn't exist or is not a PathMobile", false);
            return;
        }
        short s = (short)this.xp(1);
        ((ads_0)zC).aw(s);
    }
}

