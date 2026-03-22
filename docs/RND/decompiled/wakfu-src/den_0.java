/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from deN
 */
class den_0
extends afk_1 {
    den_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getPosition";
    }

    @Override
    public String getDescription() {
        return "Indique la position de la fen\u00eatre (0,0 = coin en bas \u00e0 gauche)";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ojF;
    }

    @Override
    public final afe_1[] bBh() {
        return new afe_1[]{new afe_1("x", null, aff_2.dJz, false), new afe_1("y", null, aff_2.dJz, false)};
    }

    @Override
    protected void ss(int n) {
        if (n < 1) {
            ddU.ohA.warn((Object)"getPosition: param\u00e8tres obligatoires");
            return;
        }
        String string = this.xu(0);
        String string2 = this.xu(1);
        fhv_1 fhv_12 = fyw_0.gqw().th(string);
        if (fhv_12 instanceof fes_2) {
            fes_2 fes_22 = (fes_2)fhv_12;
            if (n == 1) {
                this.xC(fes_22.getScreenX());
                this.xC(fes_22.getScreenY());
                return;
            }
            fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(string);
            if (fhs_22 == null) {
                this.a(ddU.ohA, "Dialogue inconnu " + string);
                return;
            }
            fhv_1 fhv_13 = fhs_22.uH(string2);
            if (fhv_13 instanceof fes_2) {
                fes_2 fes_23 = (fes_2)fhv_13;
                this.xC(fes_23.getScreenX());
                this.xC(fes_23.getScreenY());
            } else {
                this.a(ddU.ohA, "Le widget '" + string2 + "' n'existe pas ou n'est pas du type Widget");
            }
        } else {
            ddU.ohA.error((Object)("Impossible de recuperer la fenetre '" + string + "' qui n'existe pas"));
        }
    }
}

