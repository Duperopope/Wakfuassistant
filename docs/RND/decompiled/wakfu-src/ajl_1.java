/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ajl
 */
public final class ajl_1
extends afk_1
implements ajs_1 {
    private static final afe_1[] cAH = new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false)};
    private static final afe_1[] cAI = new afe_1[]{new afe_1("isAnimatedElement", null, aff_2.dJA, false)};

    public ajl_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "isAnimatedElement";
    }

    @Override
    public String getDescription() {
        return "Return true if the mobile is an AnimatedElement";
    }

    @Override
    public afe_1[] bBg() {
        return cAH;
    }

    @Override
    public final afe_1[] bBh() {
        return cAI;
    }

    @Override
    public void ss(int n) {
        long l = this.xs(0);
        ZC zC = this.gd(l);
        this.dK(zC != null);
    }
}

