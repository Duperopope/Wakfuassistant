/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ake
 */
public final class ake_2
extends afk_1
implements ajs_1 {
    private static final afe_1[] cBX = new afe_1[]{new afe_1("mobileId", "Mobile to unlink", aff_2.dJw, false)};

    public ake_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "unlinkMobile";
    }

    @Override
    public String getDescription() {
        return "Unlink the mobile (see Mobile.linkMobile)";
    }

    @Override
    public afe_1[] bBg() {
        return cBX;
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
        adj_02.buZ();
    }
}

