/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.NotNull;
import org.keplerproject.luajava.LuaState;

class ddQ
extends ddP {
    private static final String ohr = "addParticleToBorder";
    private static final String ohs = "Ajoute un syst\u00e8me de particule sur la bordure d'un \u00e9l\u00e9ment d'interface";
    private static final afe_1[] oht = new afe_1[]{new afe_1("dialogName", "Nom du dialogue", aff_2.dJx, false), new afe_1("widgetId", "Nom du widget", aff_2.dJx, false), new afe_1("particleFileName", "Nom du fichier de particule", aff_2.dJx, false), new afe_1("posX", "Position x", aff_2.dJz, false), new afe_1("posY", "Position y", aff_2.dJz, false), new afe_1("alignment", "Alignement du systeme", aff_2.dJx, true), new afe_1("level", "Niveau du systeme", aff_2.dJz, true), new afe_1("speed", "Vitesse du syst\u00e8me", aff_2.dJz, true)};

    ddQ(LuaState luaState) {
        super(luaState);
    }

    @Override
    @NotNull
    fka_1 Od(int n) {
        fka_1 fka_12 = super.Od(n);
        fka_12.setFollowBorders(true);
        if (n > 7 && this.getParam(9).isNumber()) {
            fka_12.setSpeed(this.xr(7));
        }
        return fka_12;
    }

    @Override
    public String getName() {
        return ohr;
    }

    @Override
    public String getDescription() {
        return ohs;
    }

    @Override
    public afe_1[] bBg() {
        return oht;
    }
}

