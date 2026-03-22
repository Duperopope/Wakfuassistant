/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajm
 */
public final class ajm_2
extends afk_1
implements ajs_1 {
    private static final afe_1[] cAJ = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false)};
    private static final afe_1[] cAK = new afe_1[]{new afe_1("isInFight", null, aff_2.dJA, false)};

    public ajm_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "isInFight";
    }

    @Override
    public String getDescription() {
        return "Return true if the mobile is in fight";
    }

    @Override
    public afe_1[] bBg() {
        return cAJ;
    }

    @Override
    public afe_1[] bBh() {
        return cAK;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        adj_0 adj_02 = this.fM(l);
        this.dK(adj_02 != null && adj_02.bqo() != -1);
    }
}

