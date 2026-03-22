/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXX
 */
final class bxx_2
extends afk_1 {
    private static final String lxG = "addVideoStopOrEndCallback";
    private static final afe_1[] lxH = new afe_1[]{new afe_1("funcName", null, aff_2.dJx, false), new afe_1("params", null, aff_2.dJC, true)};

    bxx_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return lxG;
    }

    @Override
    @Nullable
    public afe_1[] bBg() {
        return lxH;
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return new afe_1[0];
    }

    @Override
    protected void ss(int n) {
        String string = this.xu(0);
        afq_2[] afq_2Array = this.cP(1, n);
        afx_1 afx_12 = this.cai();
        int n2 = afx_12.a(string, afq_2Array);
        Runnable runnable = () -> afx_12.xK(n2);
        if (aQd.cgp()) {
            runnable.run();
            return;
        }
        dae_0 dae_02 = new dae_0(17455);
        dae_02.D(runnable);
        aaw_1.bUq().h(dae_02);
    }
}

