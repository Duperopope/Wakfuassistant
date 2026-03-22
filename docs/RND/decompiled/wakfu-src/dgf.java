/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dgf
extends afk_1 {
    dgf(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "writeInChatPipe";
    }

    @Override
    public String getDescription() {
        return "write a message in the specified channel";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oiZ;
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        String string;
        if (n < 2) {
            ddU.ohA.warn((Object)"On utilise writeInChatPipe sans assez d'arguments !");
            return;
        }
        aPl aPl2 = aPl.yX(this.xp(0));
        if (n == 2) {
            string = aum_0.cWf().c(this.xu(1), new Object[0]);
        } else {
            String[] stringArray = new String[n - 2];
            for (int i = 2; i < n; ++i) {
                String string2;
                stringArray[i - 2] = string2 = this.xw(i);
            }
            string = aum_0.cWf().c(this.xu(1), stringArray);
        }
        aPh.czg().a(string, aPl2);
    }
}

