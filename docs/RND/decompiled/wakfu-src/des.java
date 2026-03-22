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

class des
extends afk_1 {
    des(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "clearParticles";
    }

    @Override
    public String getDescription() {
        return "Enl?ve tous les syst?mes de particule sur un ?l?ment d'interface";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oiz;
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
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(string);
        if (fhs_22 == null) {
            ddU.ohA.error((Object)("[ClearParticles] Impossible de retrouver l'interface d'id=" + string));
            return;
        }
        fes_2 fes_22 = (fes_2)fhs_22.uH(string2);
        if (fes_22 == null) {
            ddU.ohA.error((Object)("[ClearParticles] Impossible de retrouver le widget d'id=" + string2 + " dans l'interface d'id=" + string));
            return;
        }
        ArrayList<fka_1> arrayList = new ArrayList<fka_1>();
        for (fhv_1 fhv_12 : fes_22.getAppearance().getChildren()) {
            if (!(fhv_12 instanceof fka_1)) continue;
            arrayList.add((fka_1)fhv_12);
        }
        for (fka_1 fka_12 : arrayList) {
            fka_12.setTimeToLive(100);
        }
    }
}

