/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dea
extends afk_1 {
    dea(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "addDialogUnloadedListener";
    }

    @Override
    public String getDescription() {
        return "Permet de demander l'?x?cution d'un callback LUA lors de la fermeture d'une interface Xulor. Une fois ce callback appel?, il sera automatiquement d?senregistr?.";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oiQ;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        String string = this.xu(0);
        String string2 = this.xu(1);
        afq_2[] afq_2Array = this.cP(2, n);
        afx_1 afx_12 = this.cai();
        deb deb2 = new deb(this, afx_12, string2, afq_2Array, string);
        ddi.fcw().a(string, deb2);
    }
}

