/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ddt
 */
public final class ddt_0
extends afr_1 {
    private static final ddt_0 ogO = new ddt_0();

    private ddt_0() {
        fyw_0.gqw().a(new ddv_0());
        xd_0.bnv().a(new ddu_0());
    }

    public static ddt_0 fcE() {
        return ogO;
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new ddo_0(luaState), new ddA(luaState), new ddB(luaState), new ddJ(luaState), new ddx_0(luaState), new ddG(luaState), new ddn_0(luaState), new ddo(luaState), new ddL(luaState), new ddk_0(luaState), new ddy_0(luaState), new ddz_0(luaState), new ddH(luaState), new ddq_0(luaState), new ddC(luaState), new ddE(luaState), new ddD(luaState), new ddi_0(luaState)};
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return null;
    }

    public void clear() {
        dds_0.fcD().clear();
    }

    @Override
    public final String getName() {
        return "BubbleText";
    }

    @Override
    public String getDescription() {
        return "NO Description<br/>Please Dev... implement me!";
    }
}

