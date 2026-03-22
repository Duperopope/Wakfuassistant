/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVN
 */
class bvn_2
extends afk_1 {
    final /* synthetic */ bvl_1 lsA;

    bvn_2(bvl_1 bvl_12, LuaState luaState) {
        this.lsA = bvl_12;
        super(luaState);
    }

    @Override
    public String getName() {
        return "getMonsterBreedInfo";
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public final afe_1[] bBh() {
        return bvl_1.lsu;
    }

    @Override
    public void ss(int n) {
        bhx_0 bhx_02 = this.lsA.lsy.cXa();
        if (bhx_02 != null) {
            this.xC(bhx_02.aWP());
            this.xC(bhx_02.cqy());
        } else {
            this.cah();
            this.cah();
        }
    }
}

