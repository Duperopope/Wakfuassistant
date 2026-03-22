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
 * Renamed from bVp
 */
public class bvp_1
extends afk_1 {
    bvp_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    @Nullable
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("elementId", null, aff_2.dJw, false)};
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return new afe_1[]{new afe_1("isInteractiveElement", null, aff_2.dJA, false)};
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        afk_0 afk_02 = afh_0.bxU().fR(l);
        this.dK(afk_02 != null);
    }

    @Override
    public String getName() {
        return "isInteractiveElement";
    }
}

