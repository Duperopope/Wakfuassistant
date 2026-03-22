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
 * Renamed from dcX
 */
class dcx_0
extends afk_1 {
    dcx_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    @Nullable
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("translation", "Key of the translation text", aff_2.dJx, false), new afe_1("callback", "Callback function when clicking on the button (remove the focus if not defined)", aff_2.dJx, true), new afe_1("params", "Parameters of the callback function", aff_2.dJC, true)};
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        afq_2[] afq_2Array;
        if (n < 1) {
            throw new LuaException("Invalid parameter count");
        }
        String string = this.xu(0);
        cum_1.nNA.qA(string);
        if (n >= 2) {
            afq_2Array = this.xu(1);
            cum_1.nNA.g(this.cai());
            cum_1.nNA.qB((String)afq_2Array);
        }
        if (n >= 3) {
            afq_2Array = this.cP(2, n);
            cum_1.nNA.c(afq_2Array);
        }
    }

    @Override
    public String getName() {
        return "setButton";
    }
}

