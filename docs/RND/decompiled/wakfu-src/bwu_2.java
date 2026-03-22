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
 * Renamed from bWu
 */
final class bwu_2
extends bwo_2 {
    private static final Logger ltv = Logger.getLogger(bwu_2.class);
    private static final String ltw = "getCasterPosition";
    private static final String ltx = "Permet de r?cup?rer les coordonn?es de la cellule du lanceur de l'action";
    private static final afe_1[] lty = new afe_1[]{new afe_1("posX", null, aff_2.dJy, false), new afe_1("posY", null, aff_2.dJy, false), new afe_1("posZ", null, aff_2.dJy, false)};

    bwu_2(LuaState luaState, aUT aUT2) {
        super(luaState, aUT2);
    }

    @Override
    public String getName() {
        return ltw;
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public afe_1[] bBh() {
        return lty;
    }

    @Override
    protected void ss(int n) {
        bgy bgy2 = bgg_0.dlO().ju(this.lta.caQ());
        if (bgy2 == null) {
            this.a(ltv, "CharacterInfo introuvable : " + this.lta.caQ());
            this.cah();
            return;
        }
        acd_1 acd_12 = bgy2.aZw();
        this.xC(acd_12.getX());
        this.xC(acd_12.getY());
        this.xC(acd_12.bdi());
    }

    @Override
    public String getDescription() {
        return ltx;
    }
}

