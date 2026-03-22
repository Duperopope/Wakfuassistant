/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.NotNull;
import org.keplerproject.luajava.LuaState;

class ddP
extends afk_1 {
    private static final String ohm = "addParticle";
    private static final String ohn = "Ajoute un syst\u00e8me de particule sur un \u00e9l\u00e9ment d'interface";
    private static final afe_1[] oho = new afe_1[]{new afe_1("dialogName", "Nom du dialogue", aff_2.dJx, false), new afe_1("widgetId", "Nom du widget", aff_2.dJx, false), new afe_1("particleFileName", "Nom du fichier de particule", aff_2.dJx, false), new afe_1("posX", "Position x", aff_2.dJz, false), new afe_1("posY", "Position y", aff_2.dJz, false), new afe_1("alignment", "Alignement du systeme", aff_2.dJx, true), new afe_1("level", "Niveau du systeme", aff_2.dJz, true)};
    private static final afe_1[] ohp = new afe_1[]{new afe_1("particleId", "Id de l'APS", aff_2.dJy, false)};
    private static int ohq;

    ddP(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return ohm;
    }

    @Override
    public String getDescription() {
        return ohn;
    }

    @Override
    public afe_1[] bBg() {
        return oho;
    }

    @Override
    public final afe_1[] bBh() {
        return ohp;
    }

    @Override
    protected void ss(int n) {
        String string = this.xu(0);
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(string);
        if (fhs_22 == null) {
            this.a(ddU.ohA, "Dialogue inconnu " + string);
            this.cah();
            return;
        }
        String string2 = this.xu(1);
        fhv_1 fhv_12 = fhs_22.uH(string2);
        if (fhv_12 == null) {
            this.a(ddU.ohA, "ElementDispatcher inconnu " + string2 + " dans le dialog " + string);
            this.cah();
            return;
        }
        if (!(fhv_12 instanceof fes_2)) {
            this.a(ddU.ohA, "le widget n'est pas du type Widget");
            this.cah();
            return;
        }
        int n2 = ++ohq;
        fka_1 fka_12 = this.Od(n);
        ((fes_2)fhv_12).getAppearance().d(fka_12);
        ddU.fcI().ojL.put(n2, (Object)fka_12);
        this.xC(n2);
    }

    @NotNull
    fka_1 Od(int n) {
        String string = this.xu(2);
        fka_1 fka_12 = new fka_1();
        fka_12.aVI();
        fka_12.setFile(string);
        fka_12.setX(this.xp(3));
        fka_12.setY(this.xp(4));
        faa_2 faa_22 = faa_2.tLO;
        int n2 = 1;
        if (n > 5) {
            if (this.getParam(7).isString()) {
                faa_22 = faa_2.valueOf(this.xu(5));
            } else if (this.getParam(7).isNumber()) {
                n2 = this.xp(5);
            }
        }
        if (n > 6 && this.getParam(8).isNumber()) {
            n2 = this.xp(6);
        }
        if (n2 != 1) {
            fka_12.setLevel(n2);
        }
        fka_12.setAlignment(faa_22);
        return fka_12;
    }

    static void clear() {
        ohq = 0;
    }
}

