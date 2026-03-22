/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

final class ddL
extends afk_1 {
    private static final Logger ohc = Logger.getLogger(ddL.class);

    ddL(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "showMonologue";
    }

    @Override
    public String getDescription() {
        return "DO NOT USE";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("mobileId", "Id du personnage", aff_2.dJw, false), new afe_1("texts", "Textes a afficher (sous forme de table)", aff_2.dJB, false), new afe_1("funcOnTerminate", "Fonction a appeler a la fin", aff_2.dJx, true), new afe_1("funcParams", "Parametres de la fonction de fin", aff_2.dJC, true)};
    }

    @Override
    public afe_1[] bBh() {
        return new afe_1[]{new afe_1("bubbleId", "Id de la bulle", aff_2.dJy, false)};
    }

    @Override
    protected void ss(int n) {
        adj_0 adj_02 = adn_0.bvh().fM(this.xs(0));
        if (adj_02 == null) {
            this.a(ohc, "Le mobile n'existe pas " + this.xs(0));
            this.xC(0);
            return;
        }
        afq_2[] afq_2Array = this.xv(1);
        if (afq_2Array.length == 0) {
            this.a(ohc, "La table de texte est vide");
        }
        String[] stringArray = new String[afq_2Array.length];
        for (int i = 0; i < afq_2Array.length; ++i) {
            stringArray[i] = ddw_0.j((String)afq_2Array[i].getValue(), new Object[0]);
        }
        afx_1 afx_12 = this.cai();
        int n2 = xd_0.bnv().bnw();
        chj_2 chj_22 = (chj_2)fyw_0.gqw().a("interactiveBubbleDialog" + n2, ccj_2.pe("interactiveBubbleDialog"), 8256L);
        fbj_1.getInstance().getLayeredContainer().d(chj_22, 25000);
        chj_22.setVisible(false);
        chj_22.setTarget(adj_02);
        dds_0.fcD().a(n2, chj_22);
        int[] nArray = new int[]{0};
        chj_22.setBubbleText(stringArray[0]);
        chj_22.setActAsButton(true);
        String string = n > 2 ? this.xu(2) : null;
        afq_2[] afq_2Array2 = this.cP(3, n);
        chj_22.a(ddw_0.j("dialog.next", new Object[0]), (fis_1)new ddM(this, nArray, chj_22, stringArray, string, afx_12, afq_2Array2, n2), true);
        chj_22.setCloseOnClick(false);
        chj_22.eKG();
        this.xC(n2);
    }
}

