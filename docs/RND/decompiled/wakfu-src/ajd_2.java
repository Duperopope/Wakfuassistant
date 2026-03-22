/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajD
 */
public final class ajd_2
extends afk_1
implements ajs_1 {
    private static final afe_1[] cBr = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("visibility", null, aff_2.dJA, false)};

    public ajd_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setDirectionParticleSystemVisibility";
    }

    @Override
    public String getDescription() {
        return "Hide or Show the DirectionParticleSystem on the mobile";
    }

    @Override
    public afe_1[] bBg() {
        return cBr;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        adj_0 adj_02 = this.fM(l);
        if (adj_02 == null) {
            this.a(this.bBx(), "Mobile " + l + " doesn't exist", false);
            return;
        }
        boolean bl = this.xx(1);
        if (bl) {
            adj_02.bvg();
        } else {
            adj_02.bvf();
        }
    }
}

