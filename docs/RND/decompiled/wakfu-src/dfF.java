/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class dfF
extends afk_1 {
    dfF(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "setPosition";
    }

    @Override
    public String getDescription() {
        return "D\u00e9place la fen\u00eatre \u00e0 la position indiqu\u00e9e (0,0 = coin en bas \u00e0 gauche)";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("dialogName", null, aff_2.dJx, false), new afe_1("x", null, aff_2.dJz, false), new afe_1("y", null, aff_2.dJz, false)};
    }

    @Override
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        if (n < 3) {
            ddU.ohA.warn((Object)"setPosition: param\u00e8tres obligatoires");
            return;
        }
        String string = this.xu(0);
        int n2 = this.xp(1);
        int n3 = this.xp(2);
        fhv_1 fhv_12 = fyw_0.gqw().th(string);
        if (fhv_12 instanceof fey_2) {
            fey_2 fey_22 = (fey_2)fhv_12;
            fey_22.setPosition(n2, n3);
            fkj_2.gCW().b(fey_22, n2, n3);
        } else {
            ddU.ohA.error((Object)("Impossible de recuperer la fenetre '" + string + "' qui n'existe pas"));
        }
    }
}

