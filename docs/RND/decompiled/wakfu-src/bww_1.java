/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWW
 */
final class bww_1
extends bxo_2 {
    private static final String lvD = "getBearerPosition";
    private static final String lvE = "Retourne les coordonn?es de la position du porteur de l'effet (le propri?taire du manager d'effet dans lequel est stock? l'effet)";
    private static final afe_1[] lvF = new afe_1[]{new afe_1("posX", null, aff_2.dJy, false), new afe_1("posY", null, aff_2.dJy, false), new afe_1("posZ", null, aff_2.dJy, false)};

    bww_1(LuaState luaState, aWw aWw2) {
        super(luaState, aWw2);
    }

    @Override
    public String getName() {
        return lvD;
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public afe_1[] bBh() {
        return lvF;
    }

    @Override
    protected void ss(int n) {
        acd_1 acd_12 = this.lwK.cXw();
        if (acd_12 == null) {
            return;
        }
        this.xC(acd_12.getX());
        this.xC(acd_12.getY());
        this.xC(acd_12.bdi());
    }

    @Override
    public String getDescription() {
        return lvE;
    }
}

