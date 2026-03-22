/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajL
 */
public final class ajl_2
extends afk_1
implements ajs_1 {
    private static final afe_1[] cBB = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("canPlaySound", null, aff_2.dJA, false)};

    public ajl_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setMobileCanPlaySound";
    }

    @Override
    public String getDescription() {
        return "Set if the mobile can play sound";
    }

    @Override
    public afe_1[] bBg() {
        return cBB;
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
        boolean bl = this.xx(1);
        zC.setCanPlaySound(bl);
    }
}

