/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

final class ddC
extends afk_1 {
    private static final Logger ogZ = Logger.getLogger(ddC.class);

    ddC(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "prepareWakfuBubble";
    }

    @Override
    public String getDescription() {
        return "Prepare a WakfuBubble to be linked to a mobile";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("characterId", "Id du personnage", aff_2.dJw, false), new afe_1("offsetX", "Decalage en pixel vers la droite", aff_2.dJy, false), new afe_1("offsetY", "Decalage en pixel vers le haut", aff_2.dJy, false), new afe_1("infiniteDuration", "si true la bulle reste toujours affichee", aff_2.dJA, true), new afe_1("funcOnEnd", "Fonction a appeler lors de la fermeture", aff_2.dJx, true)};
    }

    @Override
    public afe_1[] bBh() {
        return new afe_1[]{new afe_1("bubbleId", "Id de la bulle", aff_2.dJy, false), new afe_1("displayTime", "Temps d'affichage en ms", aff_2.dJy, false)};
    }

    @Override
    protected void ss(int n) {
        long l = this.xs(0);
        ZH zH = adn_0.bvh().fM(l);
        if (zH == null) {
            zH = afh_0.bxU().fR(l);
        }
        if (zH == null) {
            this.a(ogZ, "mobile ou IE " + l + " inexistant");
            this.cah();
            this.cah();
            return;
        }
        String string = aiw_0.cgD();
        fem_1 fem_12 = aiw_0.iy(string);
        try {
            fem_12.A(true, false);
        }
        catch (Exception exception) {
            ogZ.warn((Object)exception.getMessage());
            this.cah();
            this.cah();
            return;
        }
        fem_12.setTarget(zH);
        fem_12.setBubbleObserver(aue_0.cVJ().cVK().ddI());
        fem_12.setXOffset(ddw_0.NZ(this.xp(1)));
        fem_12.setYOffset(ddw_0.eY(this.xp(2), zH.bpX()));
        fem_12.setBubbleIsVisible(false);
        boolean bl = false;
        String string2 = null;
        if (n >= 4) {
            if (this.getParam(5).isBoolean()) {
                bl = this.xx(3);
            } else if (this.getParam(5).isString()) {
                string2 = this.xu(3);
            }
        }
        if (n >= 5 && this.getParam(6).isString()) {
            string2 = this.xu(4);
        }
        if (bl) {
            fem_12.setDuration(-1);
        }
        int n2 = fem_12.gsr();
        dds_0.fcD().a(fem_12);
        if (string2 != null) {
            ddr_0 ddr_02 = new ddr_0(string2, this.cai(), null);
            dds_0.fcD().b(n2, ddr_02);
        }
        this.xC(fem_12.getAdviserId());
        this.xC(fem_12.getDuration());
    }
}

