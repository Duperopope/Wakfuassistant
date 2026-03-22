/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXi
 */
final class bxi_2
extends bxo_2 {
    private static final String lwq = "getTargetCell";
    private static final String lwr = "Retourne les coordonn?es de la cellule cible de l'effet";
    private static final afe_1[] lws = new afe_1[]{new afe_1("posX", null, aff_2.dJy, false), new afe_1("posY", null, aff_2.dJy, false), new afe_1("posZ", null, aff_2.dJy, false)};

    bxi_2(LuaState luaState, aWw aWw2) {
        super(luaState, aWw2);
    }

    @Override
    public String getName() {
        return lwq;
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public afe_1[] bBh() {
        return lws;
    }

    @Override
    public void ss(int n) {
        acd_1 acd_12 = this.lwK.bbe();
        if (acd_12 == null) {
            return;
        }
        this.xC(acd_12.getX());
        this.xC(acd_12.getY());
        this.xC(acd_12.bdi());
    }

    @Override
    public String getDescription() {
        return lwr;
    }
}

