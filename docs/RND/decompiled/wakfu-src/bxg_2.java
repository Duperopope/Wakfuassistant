/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXg
 */
final class bxg_2
extends bxo_2 {
    private static final String lwk = "getPosition";
    private static final String lwl = "Retourne les coordonn?es de la position de la cible de l'effet si elle existe, sinon retourne celles de la cellule cible";
    private static final afe_1[] lwm = new afe_1[]{new afe_1("posX", null, aff_2.dJy, false), new afe_1("posY", null, aff_2.dJy, false), new afe_1("posZ", null, aff_2.dJy, false)};

    bxg_2(LuaState luaState, aWw aWw2) {
        super(luaState, aWw2);
    }

    @Override
    public String getName() {
        return lwk;
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public afe_1[] bBh() {
        return lwm;
    }

    @Override
    public void ss(int n) {
        acd_1 acd_12 = this.lwK.aZw();
        this.xC(acd_12.getX());
        this.xC(acd_12.getY());
        this.xC(acd_12.bdi());
    }

    @Override
    public String getDescription() {
        return lwl;
    }
}

