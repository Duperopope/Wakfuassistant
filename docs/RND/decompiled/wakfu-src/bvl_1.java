/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVL
 */
public class bvl_1
extends afr_1 {
    static final afe_1[] lst = new afe_1[]{new afe_1("monsterId", null, aff_2.dJw, false)};
    static final afe_1[] lsu = new afe_1[]{new afe_1("breedId", null, aff_2.dJy, false), new afe_1("familyId", null, aff_2.dJy, false)};
    static final afe_1[] lsv = new afe_1[]{new afe_1("monsterId", null, aff_2.dJw, false)};
    static final afe_1[] lsw = new afe_1[]{new afe_1("posX", null, aff_2.dJy, false), new afe_1("posY", null, aff_2.dJy, false)};
    static final afe_1[] lsx = new afe_1[]{new afe_1("isOnFight", null, aff_2.dJA, false)};
    final aWc lsy;

    @Override
    public final String getName() {
        return "Behaviour";
    }

    @Override
    public String getDescription() {
        return "Retrieves informations about the caster and his target in monster behaviour scripts";
    }

    public bvl_1(aWc aWc2) {
        this.lsy = aWc2;
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new bvm_2(this, luaState), new bvn_2(this, luaState), new bvp_2(this, luaState), new bvo_1(this, luaState), new bvq_2(this, luaState)};
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return null;
    }
}

