/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dfn
extends afk_1 {
    dfn(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "removeColorTween";
    }

    @Override
    public String getDescription() {
        return "Retire les ColorTween sur le widget pass? en param?tre";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oix;
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
        if (!(fhv_12 instanceof fes_2)) {
            this.a(ddU.ohA, "l'EventDispatcher n'est pas du type Widget");
            return;
        }
        ((fes_2)fhv_12).getAppearance().x(fsa_2.class);
    }
}

