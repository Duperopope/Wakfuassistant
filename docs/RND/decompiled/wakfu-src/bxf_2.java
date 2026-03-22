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
 * Renamed from bXf
 */
final class bxf_2
extends bxo_2 {
    private static final String lwh = "getMover";
    private static final String lwi = "Utilisable uniquement sur des effets de mouvement (pousser, tirer...) : \nRetourne l'id du personnage d?plac?";
    private static final afe_1[] lwj = new afe_1[]{new afe_1("moverId", null, aff_2.dJw, false)};

    bxf_2(LuaState luaState, aWw aWw2) {
        super(luaState, aWw2);
    }

    @Override
    public String getName() {
        return lwh;
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public afe_1[] bBh() {
        return lwj;
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
        esu_0 esu_02 = ((epz_0)ero_02).fDJ();
        if (esu_02 != null) {
            this.hA(esu_02.Sn());
        } else {
            this.hA(-1L);
        }
    }

    @Override
    public String getDescription() {
        return lwi;
    }
}

