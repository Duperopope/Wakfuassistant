/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVB
 */
class bvb_1
extends afk_1 {
    final /* synthetic */ bvz_2 lsg;

    bvb_1(bvz_2 bvz_22, LuaState luaState) {
        this.lsg = bvz_22;
        super(luaState);
    }

    @Override
    public String getName() {
        return "getMobile";
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public final afe_1[] bBh() {
        return new afe_1[]{new afe_1("mobileId", null, aff_2.dJw, false)};
    }

    @Override
    public void ss(int n) {
        this.hA(this.lsg.lsf.cXJ().ddI().Sn());
    }
}

