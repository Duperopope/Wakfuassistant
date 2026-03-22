/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

final class ddA
extends afk_1 {
    private static final Logger ogR = Logger.getLogger(ddA.class);
    private boolean naw;
    private int bMn;
    private boolean nax;
    private String ogS;
    private afq_2[] ogT;
    private int ogU;
    private String ogV;

    ddA(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "prepareInteractiveBubble";
    }

    @Override
    public String getDescription() {
        return "Prepare an InteractiveBubble to be linked to a mobile";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("mobileId", "Id du mobile sur lequel attacher la bulle", aff_2.dJw, false), new afe_1("actAsButton", "La bulle se comportera comme la somme des boutons qui lui seront attaches par la suite", aff_2.dJA, true), new afe_1("duration", "Duree d'affichage de la bulle", aff_2.dJy, true), new afe_1("closeOnClick", "Ferme si on clique sur la bulle", aff_2.dJA, true), new afe_1("dialogFile", "Nom du fichier utilis\u00e9 pour le template de la bulle (default = interactiveBubbleDialog)", aff_2.dJw, true), new afe_1("dialogModalLevel", "Modal level de la bulle (default = 30000) [D\u00e9pr\u00e9ci\u00e9]", aff_2.dJw, true), new afe_1("dialogLayer", "Layer de la bulle (default = 25000)", aff_2.dJw, true), new afe_1("onEndFunc", "Fonction a appeler a la fermeture de la bulle", aff_2.dJx, true), new afe_1("funcParams", "Param\u00e8tres de la fonction", aff_2.dJC, true)};
    }

    @Override
    public afe_1[] bBh() {
        return new afe_1[]{new afe_1("bubbleId", "Id de la bulle", aff_2.dJy, false)};
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        adj_0 adj_02 = adn_0.bvh().fM(l);
        if (adj_02 == null) {
            this.a(ogR, "Le mobile n'existe pas " + l);
            this.cah();
            return;
        }
        this.fcG();
        this.Ob(n);
        int n2 = xd_0.bnv().bnw();
        String string = "interactiveBubbleDialog" + n2;
        chj_2 chj_22 = this.rp(string);
        this.ro(string);
        this.b(chj_22);
        this.a(adj_02, chj_22);
        ddA.b(n2, chj_22);
        this.xC(n2);
    }

    private void ro(String string) {
        if (this.ogS != null) {
            dds_0.fcD().a(string.hashCode(), new ddr_0(this.ogS, this.cai(), this.ogT));
        }
    }

    private chj_2 rp(String string) {
        return (chj_2)fyw_0.gqw().a(string, ccj_2.pe(this.ogV), this.bMn, 8256L);
    }

    private static void b(int n, chj_2 chj_22) {
        dds_0.fcD().a(n, chj_22);
    }

    private void b(chj_2 chj_22) {
        fbj_1.getInstance().getLayeredContainer().d(chj_22, this.ogU);
    }

    private void a(adj_0 adj_02, chj_2 chj_22) {
        chj_22.setTarget(adj_02);
        chj_22.setActAsButton(this.naw);
        chj_22.setVisible(false);
        chj_22.setCloseOnClick(this.nax);
    }

    private void fcG() {
        this.bMn = Integer.MAX_VALUE;
        this.naw = false;
        this.nax = false;
        this.ogS = null;
        this.ogT = null;
        this.ogV = "interactiveBubbleDialog";
        this.ogU = 25000;
    }

    private void Ob(int n) {
        if (n >= 2) {
            this.naw = this.xx(1);
        }
        if (n >= 3) {
            this.bMn = this.xp(2);
        }
        if (n >= 4) {
            this.nax = this.xx(3);
        }
        if (n >= 5) {
            this.ogV = this.xu(4);
        }
        if (n >= 7) {
            this.ogU = this.xp(6);
        }
        if (n >= 8) {
            this.ogS = this.xu(7);
        }
        if (n >= 9) {
            this.ogT = this.cP(8, n - 1);
        }
    }
}

