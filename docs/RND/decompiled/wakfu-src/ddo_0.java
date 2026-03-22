/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ddO
 */
final class ddo_0
extends afk_1 {
    private static final Logger ohl = Logger.getLogger(ddo_0.class);

    ddo_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "showText";
    }

    @Override
    public String getDescription() {
        return "Display a WakfuBubble above the character. If not infinite, it will be removed after a duration based on the text's length";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("characterId", "Id du mobile", aff_2.dJw, false), new afe_1("text", "Texte a afficher", aff_2.dJx, false), new afe_1("offsetX", "Decalage en pixel vers la droite", aff_2.dJy, false), new afe_1("offsetY", "Decalage en pixel vers le haut", aff_2.dJy, false), new afe_1("infiniteDuration", "Si true la bulle reste toujours affichee", aff_2.dJA, true), new afe_1("funcOnEnd", "Fonction a appeler a la fin", aff_2.dJx, true), new afe_1("params", "Parametres de fonction de fin", aff_2.dJC, true)};
    }

    @Override
    public afe_1[] bBh() {
        return new afe_1[]{new afe_1("bubbleId", "Id de la bulle", aff_2.dJy, false), new afe_1("displayTime", "Temps d'affichage en ms", aff_2.dJy, false)};
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        adj_0 adj_02 = adn_0.bvh().fM(l);
        if (adj_02 != null) {
            String string = ddw_0.j(this.xu(1), new Object[0]);
            String string2 = aiw_0.cgD();
            fem_1 fem_12 = aiw_0.iy(string2);
            try {
                fem_12.A(true, false);
                fem_12.setText(string);
            }
            catch (Exception exception) {
                ohl.warn((Object)exception.getMessage());
                return;
            }
            fem_12.setTarget(adj_02);
            fem_12.setBubbleObserver(aue_0.cVJ().cVK().ddI());
            fem_12.setXOffset(ddw_0.NZ(this.xp(2)));
            fem_12.setYOffset(ddw_0.eY(this.xp(3), 0));
            boolean bl = false;
            String string3 = null;
            afq_2[] afq_2Array = null;
            if (n >= 5) {
                if (this.getParam(6).isBoolean()) {
                    bl = this.xx(4);
                } else if (this.getParam(6).isString()) {
                    string3 = this.xu(4);
                    if (n >= 6) {
                        afq_2Array = this.cP(5, n);
                    }
                }
            }
            if (n >= 6) {
                if (this.getParam(7).isString()) {
                    string3 = this.xu(5);
                }
                if (n >= 7) {
                    afq_2Array = this.cP(6, n);
                }
            }
            if (bl) {
                fem_12.setDuration(-1);
            }
            int n2 = fem_12.gsr();
            dds_0.fcD().a(fem_12);
            if (string3 != null) {
                ddr_0 ddr_02 = new ddr_0(string3, this.cai(), afq_2Array);
                dds_0.fcD().b(n2, ddr_02);
            }
            this.xC(fem_12.getAdviserId());
            this.xC(fem_12.getDuration());
        } else {
            this.a(ohl, "mobile " + l + " inexistant");
            this.cah();
            this.cah();
        }
    }
}

