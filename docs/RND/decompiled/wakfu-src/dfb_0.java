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
 * Renamed from dfB
 */
class dfb_0
extends afk_1 {
    dfb_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "removeSpellSelectionListener";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ojq;
    }

    @Override
    public String getDescription() {
        return "Supprime l'?coute de la s?lection d'un sort par une fonction script";
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        if (n < 1) {
            ddU.ohA.warn((Object)"On utilise removeSpellSelectionListener sans argument !");
            return;
        }
        String string = this.xu(0);
        afx_1 afx_12 = this.cai();
        ddi.fcw().b(afx_12, null, null, null, string);
        cul_2.eST().a(null);
    }
}

