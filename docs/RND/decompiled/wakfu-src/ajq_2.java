/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajq
 */
public final class ajq_2
extends afk_1
implements ajs_1 {
    private static final String cAR = "If true, returns true if mobile is owned by local player only. If false, returns true if mobile is owned by a player, local or not. Defaults to false";
    private static final afe_1[] cAS = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("localOnly", "If true, returns true if mobile is owned by local player only. If false, returns true if mobile is owned by a player, local or not. Defaults to false", aff_2.dJA, true)};
    private static final afe_1[] cAT = new afe_1[]{new afe_1("isPlayer", null, aff_2.dJA, false)};

    public ajq_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "isPlayer";
    }

    @Override
    public String getDescription() {
        return "Return true if the mobile belongs to a player";
    }

    @Override
    public afe_1[] bBg() {
        return cAS;
    }

    @Override
    public afe_1[] bBh() {
        return cAT;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        boolean bl = n > 1 && this.xx(1);
        adj_0 adj_02 = this.fM(l);
        this.dK(adj_02 != null && adj_02.cf(bl));
    }
}

