/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class deJ
extends afk_1 {
    deJ(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "enableEvent";
    }

    @Override
    public String getDescription() {
        return "Permet de d?sactiver/r?activer des ?v?nements sur un widget.";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oic;
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        String string = this.xu(0);
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(string);
        if (fhs_22 == null) {
            this.a(ddU.ohA, "Dialogue inconnu " + string);
            return;
        }
        String string2 = this.xu(1);
        fhv_1 fhv_12 = fhs_22.uH(string2);
        if (fhv_12 == null) {
            this.a(ddU.ohA, "ElementDispatcher inconnu " + string2 + " dans le dialog " + string);
            return;
        }
        String string3 = this.xu(2);
        try {
            fzq_0 fzq_02 = fzq_0.valueOf(string3);
            fhv_12.a(fzq_02, this.xx(3));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            this.a(ddU.ohA, "Type d'evenement inconnu " + string3 + " pour le dialog " + string);
        }
    }
}

