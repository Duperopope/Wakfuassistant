/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dfU
extends afk_1 {
    dfU(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setWidgetEnabled";
    }

    @Override
    public String getDescription() {
        return "Permet d'activer ou d?sactiver un widget (par exempel un bouton) dans une interface.";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oil;
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
        boolean bl = this.xx(2);
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(string);
        if (fhs_22 == null) {
            this.a(ddU.ohA, "Dialogue inconnu " + string);
            return;
        }
        fhv_1 fhv_12 = fhs_22.uH(string2);
        if (fhv_12 == null) {
            this.a(ddU.ohA, "ElementDispatcher inconnu " + string2 + " dans le dialog " + string);
            return;
        }
        if (!(fhv_12 instanceof fes_2)) {
            this.a(ddU.ohA, "le widget n'est pas du type Widget");
            return;
        }
        fes_2 fes_22 = (fes_2)fhv_12;
        fes_22.setEnabled(bl);
    }
}

