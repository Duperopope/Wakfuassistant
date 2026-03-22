/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

final class ddB
extends afk_1 {
    private fzw_0 ogW;
    private int ogX;
    private int ogY;
    private boolean naw;
    private int bMn;
    private boolean nax;
    private String ogS;
    private afq_2[] ogT;
    private int ogU;
    private String ogV;

    ddB(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "prepareInteractiveBubbleFloating";
    }

    @Override
    public String getDescription() {
        return "Prepare an InteractiveBubble to be displayed on the screen, relative to align, screenXoffset and screenYoffset";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("align", "Alignement de la bulle de texte", aff_2.dJx, false), new afe_1("screenXoffset", "Decalage en pixel vers la droite", aff_2.dJy, false), new afe_1("screenYoffset", "Decalage en pixel vers le heut", aff_2.dJy, false), new afe_1("actAsButton", "La bulle se comportera comme la somme des boutons qui lui seront attaches par la suite", aff_2.dJA, true), new afe_1("duration", "Duree d'affichage de la bulle", aff_2.dJy, true), new afe_1("closeOnClick", "Ferme si on clique sur la bulle", aff_2.dJA, true), new afe_1("dialogFile", "Nom du fichier utilis\u00e9 pour le template de la bulle (default = interactiveBubbleDialog)", aff_2.dJw, true), new afe_1("dialogModalLevel", "Modal level de la bulle (default = 30000) [D\u00e9pr\u00e9ci\u00e9]", aff_2.dJw, true), new afe_1("dialogLayer", "Layer de la bulle (default = 25000)", aff_2.dJw, true), new afe_1("onEndFunc", "Fonction a appeler a la fermeture de la bulle", aff_2.dJx, true), new afe_1("funcParams", "Param\u00e8tres de la fonction", aff_2.dJC, true)};
    }

    @Override
    public afe_1[] bBh() {
        return new afe_1[]{new afe_1("bubbleId", "Id de la bulle", aff_2.dJy, false)};
    }

    @Override
    protected void ss(int n) {
        this.fcH();
        this.Ob(n);
        int n2 = xd_0.bnv().bnw();
        String string = "interactiveBubbleDialog" + n2;
        chj_2 chj_22 = this.rp(string);
        this.rq(string);
        this.b(chj_22);
        this.b(n2, chj_22);
        this.c(chj_22);
        this.xC(n2);
    }

    private void b(int n, chj_2 chj_22) {
        dds_0.fcD().a(n, chj_22);
    }

    private void b(chj_2 chj_22) {
        fbj_1.getInstance().getLayeredContainer().d(chj_22, this.ogU);
    }

    private void rq(String string) {
        if (this.ogS != null) {
            dds_0.fcD().a(string.hashCode(), new ddr_0(this.ogS, this.cai(), this.ogT));
        }
    }

    private void c(chj_2 chj_22) {
        chj_22.setActAsButton(this.naw);
        frp_1 frp_12 = new frp_1();
        frp_12.aVI();
        frp_12.setAlign(this.ogW);
        frp_12.setXOffset(this.ogX);
        frp_12.setYOffset(this.ogY);
        chj_22.d(frp_12);
        chj_22.setVisible(false);
        chj_22.setCloseOnClick(this.nax);
        chj_22.setForcedDisplaySpark(false);
        chj_22.setUseTargetPositionning(false);
    }

    private chj_2 rp(String string) {
        return (chj_2)fyw_0.gqw().a(string, ccj_2.pe(this.ogV), this.bMn, 8256L);
    }

    private void Ob(int n) {
        if (n >= 4) {
            this.naw = this.xx(3);
        }
        if (n >= 5) {
            this.bMn = this.xp(4);
        }
        if (n >= 6) {
            this.nax = this.xx(5);
        }
        if (n >= 7) {
            this.ogV = this.xu(6);
        }
        if (n >= 9) {
            this.ogU = this.xp(8);
        }
        if (n >= 10) {
            this.ogS = this.xu(9);
        }
        if (n >= 11) {
            this.ogT = this.cP(10, n - 1);
        }
    }

    private void fcH() {
        this.ogW = fzw_0.valueOf(this.xu(0));
        this.ogX = this.xp(1);
        this.ogY = this.xp(2);
        this.naw = false;
        this.bMn = Integer.MAX_VALUE;
        this.nax = false;
        this.ogS = null;
        this.ogT = null;
        this.ogV = "interactiveBubbleDialog";
        this.ogU = 25000;
    }
}

