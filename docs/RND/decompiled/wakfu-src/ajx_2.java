/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajx
 */
public final class ajx_2
extends afk_1
implements ajs_1 {
    private static final afe_1[] cBj = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("funcName", null, aff_2.dJx, false), new afe_1("funcParams", null, aff_2.dJC, true)};
    private static final afe_1[] cBk = new afe_1[]{new afe_1("listener", "Listener Object", aff_2.dJv, false)};

    public ajx_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "onPathEnded";
    }

    @Override
    public String getDescription() {
        return "Run a function when the mobile finish a movement";
    }

    @Override
    public afe_1[] bBg() {
        return cBj;
    }

    @Override
    public afe_1[] bBh() {
        return cBk;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        adj_0 adj_02 = this.fM(l);
        if (!(adj_02 instanceof ads_0)) {
            this.a(this.bBx(), "Mobile " + l + " doesn't exist or is not a PathMobile", false);
            this.cah();
            return;
        }
        ads_0 ads_02 = (ads_0)adj_02;
        afx_1 afx_12 = this.cai();
        String string = this.xu(1);
        afq_2[] afq_2Array = this.cP(2, n);
        int n2 = afx_12.a(string, afq_2Array);
        ajy_2 ajy_22 = new ajy_2(this, afx_12, n2);
        ads_02.b(ajy_22);
        this.ad(ajy_22);
    }
}

