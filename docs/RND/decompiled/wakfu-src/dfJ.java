/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dfJ
extends afk_1 {
    dfJ(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setShortcutEnabled";
    }

    @Override
    public String getDescription() {
        return "Permet d'activer/d?sactiver l'ensemble, un groupe ou un unique raccourci (voir le fichier shortcuts.xml). Si aucune id n'est pr?cis?e dans le raccourci, vous pouvez en rajouter une.";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oiV;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        String string;
        boolean bl = this.xx(0);
        String string2 = n >= 2 ? this.xu(1) : null;
        String string3 = string = n >= 3 ? this.xu(2) : null;
        if (n == 1) {
            aUm.cUI().cD(bl);
        } else if (n == 2) {
            aUm.cUI().p(string2, bl);
        } else if (n == 3) {
            aUm.cUI().q(string, bl);
        }
    }
}

