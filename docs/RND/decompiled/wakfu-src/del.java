/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class del
extends afk_1 {
    del(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "addSpellSelectionListener";
    }

    @Override
    public String getDescription() {
        return "Ajoute une ?coute sur la s?lection d'un sort";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ojp;
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        if (n < 1) {
            ddU.ohA.warn((Object)"On utilise addSpellSelectionListener sans argument !");
            return;
        }
        boolean bl = this.xx(0);
        String string = this.xu(1);
        afq_2[] afq_2Array = this.cP(2, n);
        afx_1 afx_12 = this.cai();
        ddk ddk2 = (ddk)ddi.fcw().a(afx_12, null, null, null, string);
        if (ddk2 == null) {
            ddk2 = new ddk(afx_12, string, afq_2Array, bl);
            ddi.fcw().a(afx_12, null, null, null, string, ddk2);
            cul_2.eST().a(ddk2);
        } else {
            ddk2.d(afq_2Array);
            ddk ddk3 = cul_2.eST().eSW();
            if (ddk3 == null || ddk3 != ddk2) {
                cul_2.eST().a(ddk2);
            }
        }
    }
}

