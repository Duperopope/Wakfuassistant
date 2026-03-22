/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWZ
 */
final class bwz_1
extends bxo_2 {
    private static final String lvO = "getCasterPosition";
    private static final String lvP = "Retourne les coordonn?es de la position du caster de l'effet";
    private static final afe_1[] lvQ = new afe_1[]{new afe_1("posX", null, aff_2.dJy, false), new afe_1("posY", null, aff_2.dJy, false), new afe_1("posZ", null, aff_2.dJy, false)};

    bwz_1(LuaState luaState, aWw aWw2) {
        super(luaState, aWw2);
    }

    @Override
    public String getName() {
        return lvO;
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public afe_1[] bBh() {
        return lvQ;
    }

    @Override
    protected void ss(int n) {
        acd_1 acd_12 = this.lwK.cXv();
        this.xC(acd_12.getX());
        this.xC(acd_12.getY());
        this.xC(acd_12.bdi());
    }

    @Override
    public String getDescription() {
        return lvP;
    }
}

