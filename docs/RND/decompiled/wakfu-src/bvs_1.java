/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVS
 */
class bvs_1
extends afk_1 {
    final /* synthetic */ bvr_2 lsF;

    bvs_1(bvr_2 bvr_22, LuaState luaState) {
        this.lsF = bvr_22;
        super(luaState);
    }

    @Override
    public String getName() {
        return "evolveMonsterToBreed";
    }

    @Override
    public afe_1[] bBg() {
        return new afe_1[]{new afe_1("breedId", null, aff_2.dJy, false)};
    }

    @Override
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        short s = (short)this.xp(0);
        bhx_0 bhx_02 = (bhx_0)this.lsF.lsE.cXh();
        if (bhx_02 != null) {
            bhx_02.B(s, this.lsF.lsE.cXg());
        }
    }
}

