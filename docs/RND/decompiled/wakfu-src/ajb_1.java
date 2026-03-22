/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajb
 */
public final class ajb_1
extends afk_1
implements ajs_1 {
    private static final afe_1[] cAp = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false)};
    private static final afe_1[] cAq = new afe_1[]{new afe_1("gfxId", null, aff_2.dJx, false)};

    public ajb_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getMobileGFX";
    }

    @Override
    public String getDescription() {
        return "Return the GFX of the mobile";
    }

    @Override
    public afe_1[] bBg() {
        return cAp;
    }

    @Override
    public final afe_1[] bBh() {
        return cAq;
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
        this.hS(zC.aXE());
    }
}

