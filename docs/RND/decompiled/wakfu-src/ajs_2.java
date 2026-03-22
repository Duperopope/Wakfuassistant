/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajS
 */
public final class ajs_2
extends afk_1
implements ajs_1 {
    private static final afe_1[] cBK = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("posX", null, aff_2.dJz, false), new afe_1("posY", null, aff_2.dJz, false), new afe_1("posZ", null, aff_2.dJz, false)};

    public ajs_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setMobilePosition";
    }

    @Override
    public String getDescription() {
        return "Set the mobile position at the specified coordinates";
    }

    @Override
    public afe_1[] bBg() {
        return cBK;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        float f2 = this.xr(1);
        float f3 = this.xr(2);
        float f4 = this.xr(3);
        ZC zC = this.gd(l);
        if (zC == null) {
            this.a(this.bBx(), "Mobile " + l + " doesn't exist", false);
            return;
        }
        zC.e(f2, f3, f4);
    }
}

