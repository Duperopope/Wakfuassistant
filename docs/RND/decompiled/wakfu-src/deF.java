/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class deF
extends afk_1 {
    deF(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "displaySplashText";
    }

    @Override
    public String getDescription() {
        return "[DONJON SHUKRUTE] Affiche un message splash (trace de pneu + particule..)";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ojo;
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        String string;
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
        cct_2.pj(string);
    }
}

