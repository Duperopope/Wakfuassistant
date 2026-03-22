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
 * Renamed from bXy
 */
public final class bxy_1
extends afk_1 {
    public bxy_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getDescription() {
        return "Return leader character id";
    }

    @Override
    @Nullable
    public afe_1[] bBg() {
        return null;
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return new afe_1[]{new afe_1("leaderId", "Leader character id (0 if unknown)", aff_2.dJw, false)};
    }

    @Override
    protected void ss(int n) {
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 == null) {
            this.xC(0);
        } else {
            this.hA(bgt_02.Sn());
        }
    }

    @Override
    public String getName() {
        return "getLeaderId";
    }
}

