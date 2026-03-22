/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaException
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaException;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from dcT
 */
class dct_0
extends afk_1 {
    dct_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    @Nullable
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("display", "Display or hide the focus", aff_2.dJA, false)};
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        if (n != 1 && n != 3) {
            throw new LuaException("Invalid parameter count");
        }
        boolean bl = this.xx(0);
        if (bl) {
            if (!aue_0.cVJ().c(cum_1.nNA)) {
                aue_0.cVJ().a(cum_1.nNA);
            }
        } else {
            aue_0.cVJ().b(cum_1.nNA);
        }
    }

    @Override
    public String getName() {
        return "display";
    }
}

