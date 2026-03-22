/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aiY
 */
public final class aiy_2
extends afk_1
implements ajs_1 {
    private static final afe_1[] cAj = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false)};
    private static final afe_1[] cAk = new afe_1[]{new afe_1("alpha", null, aff_2.dJz, false)};

    public aiy_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getMobileAlpha";
    }

    @Override
    public String getDescription() {
        return "Return the alpha value of the mobile (between 0 and 1)";
    }

    @Override
    public afe_1[] bBg() {
        return cAj;
    }

    @Override
    public afe_1[] bBh() {
        return cAk;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        ZC zC = this.gd(l);
        if (zC == null) {
            this.a(this.bBx(), "Mobile " + l + " doesn't exist", false);
            this.cah();
            return;
        }
        this.dJ(zC.aIX());
    }
}

