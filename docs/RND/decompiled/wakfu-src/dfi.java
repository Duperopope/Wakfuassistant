/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dfi
extends afk_1 {
    dfi(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "openRewardsDialog";
    }

    @Override
    public String getDescription() {
        return "[DONJON SHUKRUTE] Affiche l'interface de r?compenses avec un texte donn?";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ojw;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        String[] stringArray;
        String string = null;
        String string2 = this.xu(0);
        if (n >= 1) {
            if (n == 1) {
                string = aum_0.cWf().c(string2, new Object[0]);
            } else {
                stringArray = new String[n - 1];
                for (int i = 1; i < n; ++i) {
                    String string3;
                    stringArray[i - 1] = string3 = this.xw(i);
                }
                string = aum_0.cWf().c(string2, stringArray);
            }
        }
        stringArray = new cyg_2(string);
        cya_2.eXM().a((cyg_2)stringArray);
    }
}

