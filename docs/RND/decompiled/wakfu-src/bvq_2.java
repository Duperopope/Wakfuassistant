/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVQ
 */
class bvq_2
extends afk_1 {
    final /* synthetic */ bvl_1 lsD;

    bvq_2(bvl_1 bvl_12, LuaState luaState) {
        this.lsD = bvl_12;
        super(luaState);
    }

    @Override
    public String getName() {
        return "isMonsterOnFight";
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public final afe_1[] bBh() {
        return bvl_1.lsx;
    }

    @Override
    public void ss(int n) {
        bhx_0 bhx_02 = this.lsD.lsy.cXa();
        if (bhx_02 != null) {
            this.dK(bhx_02.djT());
        } else {
            this.cah();
        }
    }
}

