/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dfW
extends afk_1 {
    dfW(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setWindowMovable";
    }

    @Override
    public String getDescription() {
        return "Permet de verrouiller ou d?verrouiller une fen?tre de l'interface.";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oik;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        String string = this.xu(0);
        boolean bl = this.xx(1);
        fhv_1 fhv_12 = fyw_0.gqw().th(string);
        if (fhv_12 instanceof fey_2) {
            fey_2 fey_22 = (fey_2)fhv_12;
            fey_22.setMovable(bl);
        } else {
            ddU.ohA.error((Object)("Impossible de trouver la fen?tre '" + string + "' pour la rendre movable=" + bl));
        }
    }
}

