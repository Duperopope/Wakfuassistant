/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajz
 */
public final class ajz_2
extends afk_1
implements ajs_1 {
    private static final afe_1[] cBn = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("listener", "Listener to remove", aff_2.dJv, false)};

    public ajz_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "removeOnPathEndedListener";
    }

    @Override
    public String getDescription() {
        return "Remove a PathListener of the mobile";
    }

    @Override
    public afe_1[] bBg() {
        return cBn;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        adj_0 adj_02 = this.fM(l);
        if (!(adj_02 instanceof ads_0)) {
            this.a(this.bBx(), "Mobile " + l + " doesn't exist or is not a PathMobile", false);
            return;
        }
        Object object = this.xt(1);
        if (!(object instanceof adm_0)) {
            this.a(this.bBx(), "Listener is not a MobileEndPathListener " + String.valueOf(object));
            return;
        }
        ads_0 ads_02 = (ads_0)adj_02;
        ads_02.c((adm_0)object);
    }
}

