/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajh
 */
public final class ajh_1
extends afk_1
implements ajs_1 {
    private static final afe_1[] cAB = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("animationName", null, aff_2.dJx, false)};
    private static final afe_1[] cAC = new afe_1[]{new afe_1("hasAnimation", null, aff_2.dJA, false)};

    public ajh_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "hasAnimation";
    }

    @Override
    public String getDescription() {
        return "Return true if the mobile has the specified animation";
    }

    @Override
    public afe_1[] bBg() {
        return cAB;
    }

    @Override
    public afe_1[] bBh() {
        return cAC;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        adj_0 adj_02 = this.fM(l);
        if (adj_02 == null) {
            this.a(this.bBx(), "Mobile " + l + " doesn't exist", false);
            this.cah();
            return;
        }
        String string = this.xu(1);
        boolean bl = adj_02.bqd().dZ(adj_02.ea(string));
        this.dK(bl);
    }
}

