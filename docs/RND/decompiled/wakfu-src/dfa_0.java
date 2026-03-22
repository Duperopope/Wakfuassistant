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
 * Renamed from dfa
 */
class dfa_0
extends afk_1 {
    dfa_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "loadTutorialDialog";
    }

    @Override
    public String getDescription() {
        return "Ouvre l'interface de tutorial";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ojz;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        Object object;
        String string;
        int n2;
        String string2;
        if (n < 3) {
            ddU.ohA.warn((Object)"On utilise LoadTutorialDialog avec trop peu d'arguments !");
            return;
        }
        int n3 = 0;
        String string3 = "null".equalsIgnoreCase(string2 = this.xu(n3++)) ? null : string2;
        String string4 = aum_0.cWf().c(this.xu(n3++), new Object[0]);
        String string5 = this.xu(n3++);
        if (n == n3) {
            n2 = 0;
        } else {
            try {
                n2 = this.xp(n3);
                ++n3;
            }
            catch (LuaException luaException) {
                n2 = 0;
            }
        }
        if (n - n3 == 0) {
            string = aum_0.cWf().c(string5, new Object[0]);
        } else {
            object = new String[n - n3];
            for (int i = n3; i < n; ++i) {
                String string6;
                object[i - n3] = string6 = this.xw(i);
            }
            string = aum_0.cWf().c(string5, object);
        }
        object = new dcg_0(string4, string, string3, n2);
        aaw_1.bUq().h((aam_2)object);
    }
}

