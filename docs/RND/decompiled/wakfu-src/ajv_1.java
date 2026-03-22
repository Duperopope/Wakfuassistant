/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajv
 */
public final class ajv_1
extends afk_1
implements ajs_1 {
    private static final afe_1[] cBc = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("startX", null, aff_2.dJy, false), new afe_1("startY", null, aff_2.dJy, false), new afe_1("checkPositionIsSameThatGiven", "True to check if the mobile is at startX, startY", aff_2.dJA, false), new afe_1("funcName", null, aff_2.dJx, false), new afe_1("funcParams", null, aff_2.dJC, true)};

    public ajv_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "onCellTransition";
    }

    @Override
    public String getDescription() {
        return "Run a function when the mobile change cell";
    }

    @Override
    public afe_1[] bBg() {
        return cBc;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        adj_0 adj_02 = adn_0.bvh().fM(l);
        if (!(adj_02 instanceof ads_0)) {
            this.a(this.bBx(), "Mobile " + l + " doesn't exist or is not a PathMobile", false);
            return;
        }
        ads_0 ads_02 = (ads_0)adj_02;
        afx_1 afx_12 = this.cai();
        int n2 = this.xp(1);
        int n3 = this.xp(2);
        boolean bl = this.xx(3);
        String string = this.xu(4);
        afq_2[] afq_2Array = this.cP(5, n);
        int n4 = afx_12.a(string, afq_2Array);
        ajw_2 ajw_22 = new ajw_2(this, bl, n2, n3, adj_02, afx_12, n4);
        ads_02.a(ajw_22);
    }
}

