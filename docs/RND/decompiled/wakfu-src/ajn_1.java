/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajn
 */
public final class ajn_1
extends afk_1
implements ajs_1 {
    private static final afe_1[] cAL = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false)};
    private static final afe_1[] cAM = new afe_1[]{new afe_1("isMobile", null, aff_2.dJA, false)};

    public ajn_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "isMobile";
    }

    @Override
    public String getDescription() {
        return "Return true if the mobile is a Mobile";
    }

    @Override
    public afe_1[] bBg() {
        return cAL;
    }

    @Override
    public afe_1[] bBh() {
        return cAM;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        adj_0 adj_02 = this.fM(l);
        this.dK(adj_02 != null);
    }
}

