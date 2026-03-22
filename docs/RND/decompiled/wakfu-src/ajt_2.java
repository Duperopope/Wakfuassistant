/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajT
 */
public final class ajt_2
extends afk_1
implements ajs_1 {
    private static final afe_1[] cBL = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("radius", null, aff_2.dJz, false)};
    private static final afe_1[] cBM = new afe_1[]{new afe_1("oldRadius", null, aff_2.dJz, false)};

    public ajt_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setMobileRadius";
    }

    @Override
    public String getDescription() {
        return "Set the radius of the mobile (default = 1)";
    }

    @Override
    public afe_1[] bBg() {
        return cBL;
    }

    @Override
    public afe_1[] bBh() {
        return cBM;
    }

    @Override
    public void ss(int n) {
        adj_0 adj_02;
        adj_0 adj_03;
        long l = this.xs(0);
        ZC zC = this.gd(l);
        if (zC == null) {
            this.a(this.bBx(), "Mobile " + l + " doesn't exist", false);
            this.cah();
            return;
        }
        this.dJ(zC.aJM());
        float f2 = this.xr(1);
        zC.l(f2);
        if (zC instanceof adj_0 && (adj_03 = (adj_02 = (adj_0)zC).buU()) != null) {
            adj_03.l(f2);
        }
    }
}

