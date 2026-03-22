/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aiQ
 */
public final class aiq_1
extends afk_1
implements ajs_1 {
    private static final afe_1[] czW = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false), new afe_1("funcName", null, aff_2.dJx, false), new afe_1("funcParams", null, aff_2.dJC, true)};

    public aiq_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "addMobileDestructionCallback";
    }

    @Override
    public String getDescription() {
        return "Run a function when the mobile is unloaded by the client";
    }

    @Override
    public afe_1[] bBg() {
        return czW;
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
        adn_0.bvh().b(adj_02 -> {
            if (adj_02.Sn() == l) {
                afx_12.a(string, afq_2Array, new afp_2[0]);
            }
        });
    }
}

