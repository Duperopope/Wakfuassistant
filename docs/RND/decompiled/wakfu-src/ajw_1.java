/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajW
 */
public final class ajw_1
extends afk_1
implements ajs_1 {
    private static final afe_1[] cBP = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("status", null, aff_2.dJy, false)};

    public ajw_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setMobileStatus";
    }

    @Override
    public String getDescription() {
        return "Set the status of the mobile (0 = NORMAL, 1 = KO, 2 = DEAD)";
    }

    @Override
    public afe_1[] bBg() {
        return cBP;
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
        byte by = (byte)this.xp(1);
        adj_02.as(by);
    }
}

