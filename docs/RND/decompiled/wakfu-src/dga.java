/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dga
extends afk_1 {
    dga(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "systemMessage";
    }

    @Override
    public String getDescription() {
        return "Affiche un message admin NON LOCALIS? sur l'?cran";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ohN;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        String string = this.xu(0);
        int n2 = n >= 2 ? this.xp(1) : 5000;
        dgw.fcT().a(new dgv(dgx.okH, string, n2));
    }
}

