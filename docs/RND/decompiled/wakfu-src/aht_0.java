/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ahT
 */
public class aht_0
extends afr_1 {
    private static final aht_0 cyK = new aht_0();
    private afV cyL;

    public static aht_0 bBe() {
        return cyK;
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new aia_1(luaState), new aib_1(luaState), new ahz_0(luaState), new ahw_0(luaState), new ahv_0(luaState), new ahy_0(luaState), new ahu_0(luaState), new ahx_0(luaState)};
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return null;
    }

    public final void h(afV afV2) {
        this.cyL = afV2;
    }

    public afV bBf() {
        return this.cyL;
    }

    private aht_0() {
    }

    static agf brf() {
        return aht_0.cyK.cyL.brf();
    }

    @Override
    public final String getName() {
        return "Effect";
    }

    @Override
    public String getDescription() {
        return "NO Description<br/>Please Dev... implement me!";
    }

    static void a(int n, int n2, int n3, abt_0 abt_02, agf agf2) {
        abt_02.b(agf2);
        if (n2 == -1) {
            abt_02.a(new abX(n));
        } else {
            abt_02.a(new acb(n, n2, n3));
        }
    }
}

