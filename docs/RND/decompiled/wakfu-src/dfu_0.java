/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from dfu
 */
class dfu_0
extends afk_1 {
    dfu_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "removeListColorTween";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oiv;
    }

    @Override
    public String getDescription() {
        return "Supprime un colorTween des ?l?ments d'une liste";
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
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
            this.a(ddU.ohA, "EventDispatcher inconnu " + string2 + " dans le dialog " + string);
            return;
        }
        if (!(fhv_12 instanceof fbz_2)) {
            this.a(ddU.ohA, "l'EventDispatcher n'est pas du type Widget");
            return;
        }
        String string3 = this.xu(2);
        fbz_2 fbz_22 = (fbz_2)fhv_12;
        ArrayList<fcv_1> arrayList = fbz_22.getRenderables();
        for (fcv_1 fcv_12 : arrayList) {
            fes_2 fes_22;
            fhs_2 fhs_23;
            if (fcv_12 == null || (fhs_23 = fcv_12.getInnerElementMap()) == null || (fes_22 = (fes_2)fhs_23.uH(string3)) == null) continue;
            fes_22.getAppearance().x(fsa_2.class);
        }
    }
}

