/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaException
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaException;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXe
 */
final class bxe_2
extends bxo_2 {
    private static final String lwe = "getMovementEffectArrivalCell";
    private static final String lwf = "Utilisable uniquement sur des effets de mouvement (pousser, tirer...) : \nRetourne les coordonn?es de la cellule d'arriv?e du mouvement";
    private static final afe_1[] lwg = new afe_1[]{new afe_1("posX", null, aff_2.dJy, false), new afe_1("posY", null, aff_2.dJy, false), new afe_1("posZ", null, aff_2.dJy, false)};

    bxe_2(LuaState luaState, aWw aWw2) {
        super(luaState, aWw2);
    }

    @Override
    public String getName() {
        return lwe;
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public afe_1[] bBh() {
        return lwg;
    }

    @Override
    protected void ss(int n) {
        ero_0 ero_02 = this.lwK.cXu();
        if (ero_02 == null) {
            throw new LuaException("On ne peut pas utiliser la fonction getMovementEffectArrivalCell sur un effet qui est null");
        }
        if (!(ero_02 instanceof epz_0)) {
            throw new LuaException("On ne peut pas utiliser la fonction getMovementEffectArrivalCell sur un effet de type " + ero_02.getClass().getSimpleName());
        }
        acd_1 acd_12 = ((epz_0)ero_02).fEt();
        this.xC(acd_12.getX());
        this.xC(acd_12.getY());
        this.xC(acd_12.bdi());
    }

    @Override
    public String getDescription() {
        return lwf;
    }
}

