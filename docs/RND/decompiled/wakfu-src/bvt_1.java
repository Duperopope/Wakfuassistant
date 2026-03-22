/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVT
 */
class bvt_1
extends afk_1 {
    final /* synthetic */ bvr_2 lsG;

    bvt_1(bvr_2 bvr_22, LuaState luaState) {
        this.lsG = bvr_22;
        super(luaState);
    }

    @Override
    public String getName() {
        return "getEvolvedBreedId";
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public final afe_1[] bBh() {
        return new afe_1[]{new afe_1("breedId", null, aff_2.dJy, false)};
    }

    @Override
    public void ss(int n) {
        this.xC(this.lsG.lsE.cXf());
    }
}

