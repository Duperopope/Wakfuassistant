/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public class ddR
extends afk_1 {
    public ddR(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "createFullScreenText";
    }

    @Override
    public String getDescription() {
        return "Affiche un texte centr\u00e9 \u00e0 l'\u00e9cran";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("startDuration", "Temps pendant lequel la transparence augmente progressivement (en ms)", aff_2.dJy, false), new afe_1("midDuration", "Dur\u00e9e de l'affichage en transparence max (en ms)", aff_2.dJy, false), new afe_1("endDuration", "Temps pendant lequel la transparence diminue progressivement (en ms)", aff_2.dJy, false), new afe_1("tradKey", "Clef de traduction", aff_2.dJx, false), new afe_1("red", "Teinte rouge (entre 0 et 1)", aff_2.dJz, true), new afe_1("green", "Teinte verte (entre 0 et 1)", aff_2.dJz, true), new afe_1("blue", "Teinte bleue (entre 0 et 1)", aff_2.dJz, true), new afe_1("alpha", "Transparence du texte", aff_2.dJz, true), new afe_1("font", "Police \u00e0 utiliser ('ibmplexsans' par d\u00e9faut)", aff_2.dJx, true), new afe_1("fontSize", "Taille de la police, 30 par d\u00e9faut", aff_2.dJy, true), new afe_1("fontStyle", "Style \u00e0 utiliser (Bit-mask, voir Font.java)", aff_2.dJy, true)};
    }

    @Override
    public afe_1[] bBh() {
        return new afe_1[]{new afe_1("effectId", "L'id de l'effet", aff_2.dJy, false)};
    }

    @Override
    protected void ss(int n) {
        int n2 = this.xp(0);
        int n3 = this.xp(1);
        int n4 = this.xp(2);
        String string = this.xu(3);
        float f2 = n >= 5 ? this.xr(4) : 1.0f;
        float f3 = n >= 6 ? this.xr(5) : 1.0f;
        float f4 = n >= 7 ? this.xr(6) : 1.0f;
        float f5 = n >= 8 ? this.xr(7) : 1.0f;
        String string2 = n >= 9 ? this.xu(8) : "ibmplexsans";
        int n5 = n >= 10 ? this.xp(9) : 30;
        int n6 = n >= 11 ? this.xp(10) : 0;
        aJr aJr2 = new aJr(string2, n6, n5);
        String string3 = aum_0.cWf().c(string, new Object[0]);
        aJr2.setText(string3);
        aJr2.c(f2, f3, f4, f5);
        if (n3 < 0) {
            aJr2.a(new abX(n2));
        } else {
            aJr2.a(new acb(n2, n3, n4));
        }
        ast_1.bJG().a(aJr2);
        this.xC(aJr2.d());
    }
}

