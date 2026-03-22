/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajf
 */
public final class ajf_2
extends afk_1
implements ajs_1 {
    private static final afe_1[] cAx = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false)};
    private static final afe_1[] cAy = new afe_1[]{new afe_1("radius", null, aff_2.dJz, false)};

    public ajf_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getMobileRadius";
    }

    @Override
    public String getDescription() {
        return "Return the radius of the mobile";
    }

    @Override
    public afe_1[] bBg() {
        return cAx;
    }

    @Override
    public afe_1[] bBh() {
        return cAy;
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
        this.dJ(zC.aJM());
    }
}

