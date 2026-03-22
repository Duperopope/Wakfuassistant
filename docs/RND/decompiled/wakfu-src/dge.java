/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dge
extends afk_1 {
    dge(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "writeLocalisedInChat";
    }

    @Override
    public String getDescription() {
        return "Ecrit dans le chat d'information de jeu le message lie a la clef de traduction specifiee";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oiX;
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
            ddU.ohA.warn((Object)"On utilise writeLocalisedInChat sans argument !");
            return;
        }
        if (n == 1) {
            string = aum_0.cWf().c(this.xu(0), new Object[0]);
        } else {
            String[] stringArray = new String[n - 1];
            for (int i = 1; i < n; ++i) {
                String string2;
                stringArray[i - 1] = string2 = this.xw(i);
            }
            string = aum_0.cWf().c(this.xu(0), stringArray);
        }
        aPh.czg().iZ(string);
    }
}

