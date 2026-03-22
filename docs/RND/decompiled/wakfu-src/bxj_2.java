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
 * Renamed from bXj
 */
final class bxj_2
extends bxo_2 {
    private static final String lwt = "getThrowEffectArrivalCell";
    private static final String lwu = "Utilisable uniquement sur l'effet 333 \"Jette le personnage port?\" :\n retourne les coordonn?es de la position d'arriv?e du lancer";
    private static final afe_1[] lwv = new afe_1[]{new afe_1("posX", null, aff_2.dJy, false), new afe_1("posY", null, aff_2.dJy, false), new afe_1("posZ", null, aff_2.dJy, false)};

    bxj_2(LuaState luaState, aWw aWw2) {
        super(luaState, aWw2);
    }

    @Override
    public String getName() {
        return lwt;
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public afe_1[] bBh() {
        return lwv;
    }

    @Override
    protected void ss(int n) {
        ero_0 ero_02 = this.lwK.cXu();
        if (ero_02 == null) {
            throw new LuaException("On ne peut pas utiliser la fonction getMovementEffectArrivalCell sur un effet qui est null");
        }
        if (!(ero_02 instanceof eRB)) {
            throw new LuaException("On ne peut pas utiliser la fonction getMovementEffectArrivalCell sur un effet de type " + ero_02.getClass().getSimpleName());
        }
        acd_1 acd_12 = ((eRB)ero_02).fEt();
        this.xC(acd_12.getX());
        this.xC(acd_12.getY());
        this.xC(acd_12.bdi());
    }

    @Override
    public String getDescription() {
        return lwu;
    }
}

