/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajg
 */
public final class ajg_2
extends afk_1
implements ajs_1 {
    private static final afe_1[] cAz = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false)};
    private static final afe_1[] cAA = new afe_1[]{new afe_1("status", null, aff_2.dJy, false)};

    public ajg_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getMobileStatus";
    }

    @Override
    public String getDescription() {
        return "Return the status of the mobile (0 = NORMAL, 1 = KO, 2 = DEAD)";
    }

    @Override
    public afe_1[] bBg() {
        return cAz;
    }

    @Override
    public afe_1[] bBh() {
        return cAA;
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
        this.xC(adj_02.bvd());
    }
}

