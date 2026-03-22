/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajo
 */
public final class ajo_2
extends afk_1
implements ajs_1 {
    private static final afe_1[] cAN = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false)};
    private static final afe_1[] cAO = new afe_1[]{new afe_1("isVisible", null, aff_2.dJA, false)};

    public ajo_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "isMobileVisible";
    }

    @Override
    public String getDescription() {
        return "Return true if the mobile is visible";
    }

    @Override
    public afe_1[] bBg() {
        return cAN;
    }

    @Override
    public afe_1[] bBh() {
        return cAO;
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        ZC zC = this.gd(l);
        this.dK(zC != null && zC.isVisible());
    }
}

