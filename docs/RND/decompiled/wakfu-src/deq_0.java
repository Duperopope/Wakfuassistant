/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from deQ
 */
class deq_0
extends afk_1 {
    deq_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "getWindowSize";
    }

    @Override
    public String getDescription() {
        return "Fourni la taille d'une fen?tre sp?cifi?e";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oiR;
    }

    @Override
    public final afe_1[] bBh() {
        return new afe_1[]{new afe_1("x", null, aff_2.dJz, false), new afe_1("y", null, aff_2.dJz, false)};
    }

    @Override
    protected void ss(int n) {
        String string = this.xu(0);
        if (string == null || string.isEmpty()) {
            this.xC(aie_0.cfn().bmB().getWidth());
            this.xC(aie_0.cfn().bmB().getHeight());
            return;
        }
        if (n == 1) {
            fhv_1 fhv_12 = fyw_0.gqw().th(string);
            if (fhv_12 instanceof fes_2) {
                fes_2 fes_22 = (fes_2)fhv_12;
                fsm_1 fsm_12 = fes_22.getSize();
                this.xC(fsm_12.width);
                this.xC(fsm_12.height);
            } else {
                this.xC(0);
                this.xC(0);
                ddU.ohA.error((Object)("Impossible de r?cup?rer la taille de la fen?tre '" + string + "' qui n'existe pas"));
            }
            return;
        }
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(string);
        if (fhs_22 == null) {
            this.a(ddU.ohA, "Dialogue inconnu " + string);
            return;
        }
        String string2 = this.xu(1);
        fhv_1 fhv_13 = fhs_22.uH(string2);
        if (fhv_13 instanceof fes_2) {
            fsm_1 fsm_13 = ((fes_2)fhv_13).getSize();
            this.xC(fsm_13.width);
            this.xC(fsm_13.height);
        } else {
            this.a(ddU.ohA, "Le widget '" + string2 + "' n'existe pas ou n'est pas du type Widget");
        }
    }
}

