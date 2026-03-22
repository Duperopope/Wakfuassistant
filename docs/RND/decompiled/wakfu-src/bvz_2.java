/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVz
 */
public class bvz_2
extends afr_1 {
    static final afe_1[] lse = new afe_1[]{new afe_1("posX", null, aff_2.dJy, false), new afe_1("posY", null, aff_2.dJy, false), new afe_1("posZ", null, aff_2.dJy, false)};
    final awq_0 lsf;

    @Override
    public final String getName() {
        return "ItemAction";
    }

    @Override
    public String getDescription() {
        return "NO Description<br/>Please Dev... implement me!";
    }

    public bvz_2(awq_0 awq_02) {
        this.lsf = awq_02;
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new bvb_1(this, luaState), new bva_1(luaState), new bve_1(luaState), new bvc_1(luaState), new bvg_2(this, luaState)};
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return null;
    }
}

