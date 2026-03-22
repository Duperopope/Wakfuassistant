/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bVc
 */
public class bvc_2
extends afr_1 {
    static final Logger lrR = Logger.getLogger(bvc_2.class);
    private static final bvc_2 lrS = new bvc_2();

    @Override
    public final String getName() {
        return "InteractiveElement";
    }

    @Override
    public String getDescription() {
        return "NO Description<br/>Please Dev... implement me!";
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new bvu_1(luaState), new bvi_2(luaState), new bvk_1(luaState), new bvj_1(luaState), new bvh_1(luaState), new bvy_2(luaState), new bvr_1(luaState), new bvn_1(luaState), new bvo_2(luaState), new bvq_1(luaState), new bvx_2(luaState), new bvw_2(luaState), new bvd_1(luaState), new bvf_1(luaState), new bvl_2(luaState), new bvp_1(luaState), new bvm_1(luaState), new bvs_2(luaState), new bvt_2(luaState), new bxw_1(luaState)};
    }

    private bvc_2() {
    }

    public static bvc_2 eot() {
        return lrS;
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return null;
    }
}

