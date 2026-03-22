/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dgg
extends afk_1 {
    dgg(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "writeEmoteChat";
    }

    @Override
    public String getDescription() {
        return "[DEPRECATED] Affiche un message chat localis? dans le chat d'emote";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oiY;
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        String string;
        if (n < 1) {
            ddU.ohA.warn((Object)"On utilise writeEmoteChat sans argument !");
            return;
        }
        String string2 = this.xu(0);
        if (n == 1) {
            string = aum_0.cWf().c(string2, new Object[0]);
        } else {
            Object[] objectArray = new Object[n - 1];
            for (int i = 1; i < n; ++i) {
                String string3 = this.xu(i);
                objectArray[i - 1] = string3;
            }
            string = aum_0.cWf().c(string2, objectArray);
        }
        aPh.czg().a(string, aPl.exq);
    }
}

