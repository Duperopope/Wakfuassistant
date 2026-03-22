/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVU
 */
class bvu_2
extends afk_1 {
    final /* synthetic */ bvr_2 lsH;

    bvu_2(bvr_2 bvr_22, LuaState luaState) {
        this.lsH = bvr_22;
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
        this.hA(this.lsH.lsE.cXe());
    }
}

