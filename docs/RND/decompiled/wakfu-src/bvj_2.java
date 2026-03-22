/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVJ
 */
class bvj_2
extends afk_1 {
    final /* synthetic */ bvi_1 lsr;

    bvj_2(bvi_1 bvi_12, LuaState luaState) {
        this.lsr = bvi_12;
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
        return new afe_1[]{new afe_1("monsterId", null, aff_2.dJw, false)};
    }

    @Override
    public void ss(int n) {
        bhx_0 bhx_02 = this.lsr.lsq.cXa();
        if (bhx_02 != null) {
            this.hA(bhx_02.Sn());
        } else {
            this.cah();
        }
    }
}

