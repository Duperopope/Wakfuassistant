/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVM
 */
class bvm_2
extends afk_1 {
    final /* synthetic */ bvl_1 lsz;

    bvm_2(bvl_1 bvl_12, LuaState luaState) {
        this.lsz = bvl_12;
        super(luaState);
    }

    @Override
    public String getName() {
        return "getMonster";
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public final afe_1[] bBh() {
        return bvl_1.lst;
    }

    @Override
    public void ss(int n) {
        bhx_0 bhx_02 = this.lsz.lsy.cXa();
        if (bhx_02 != null) {
            this.hA(bhx_02.Sn());
        } else {
            this.cah();
        }
    }
}

