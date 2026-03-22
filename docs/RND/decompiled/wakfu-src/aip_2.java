/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aiP
 */
public final class aip_2
extends afk_1
implements ajs_1 {
    private static final afe_1[] czV = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("funcName", null, aff_2.dJx, false), new afe_1("funcParams", null, aff_2.dJC, true)};

    public aip_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "addMobileCreationCallback";
    }

    @Override
    public String getDescription() {
        return "Run a function when the mobile is loaded by the client. The function is run if the mobile is already loaded";
    }

    @Override
    public afe_1[] bBg() {
        return czV;
    }

    @Override
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        afx_1 afx_12 = this.cai();
        long l = this.xs(0);
        String string = this.xu(1);
        afq_2[] afq_2Array = this.cP(2, n);
        if (this.fM(l) != null) {
            afx_12.a(string, afq_2Array, new afp_2[0]);
        }
        adn_0.bvh().b(adj_02 -> {
            if (adj_02.Sn() == l) {
                afx_12.a(string, afq_2Array, new afp_2[0]);
            }
        });
    }
}

