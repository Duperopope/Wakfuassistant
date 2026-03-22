/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ahX
 */
class ahx_0
extends afk_1 {
    ahx_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "createFullScreenSprite";
    }

    @Override
    public String getDescription() {
        return "Affiche une image remplissant compl\u00e8tement l'\u00e9cran";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("startDuration", "Temps pendant lequel la transparence augmente progressivement (en ms)", aff_2.dJz, true), new afe_1("midDuration", "Dur\u00e9e de l'effet \u00e0 la transparence max (en ms)", aff_2.dJz, true), new afe_1("endDuration", "Temps pendant lequel la transparence diminue progressivement (en ms)", aff_2.dJz, true), new afe_1("red", "Teinte rouge (entre 0 et 1)", aff_2.dJz, true), new afe_1("green", "Teinte verte (entre 0 et 1)", aff_2.dJz, true), new afe_1("blue", "Teinte bleue (entre 0 et 1)", aff_2.dJz, true), new afe_1("alpha", "Transparence de l'image", aff_2.dJz, true), new afe_1("textureFileName", "Fichier de l'image ? afficher", aff_2.dJx, true)};
    }

    @Override
    public afe_1[] bBh() {
        return new afe_1[]{new afe_1("effectId", "L'id de l'effet", aff_2.dJy, false)};
    }

    @Override
    protected void ss(int n) {
        int n2 = 1000;
        int n3 = 2000;
        int n4 = 1000;
        float f2 = 1.0f;
        float f3 = 1.0f;
        float f4 = 1.0f;
        float f5 = 1.0f;
        String string = null;
        if (n >= 1) {
            n2 = (int)this.xq(0);
        }
        if (n >= 2) {
            n3 = (int)this.xq(1);
        }
        if (n >= 3) {
            n4 = (int)this.xq(2);
        }
        if (n >= 4) {
            f2 = (float)this.xq(3);
        }
        if (n >= 5) {
            f3 = (float)this.xq(4);
        }
        if (n >= 6) {
            f4 = (float)this.xq(5);
        }
        if (n >= 7) {
            f5 = (float)this.xq(6);
        }
        if (n >= 8) {
            string = this.xu(7);
        }
        abd_0 abd_02 = new abd_0();
        abd_02.eh(string);
        abd_02.c(f2, f3, f4, f5);
        if (n3 < 0) {
            abd_02.a(new abX(n2));
        } else {
            abd_02.a(new acb(n2, n3, n4));
        }
        ast_1.bJG().a(abd_02);
        this.xC(abd_02.d());
    }
}

