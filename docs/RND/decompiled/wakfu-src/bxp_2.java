/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXp
 */
public class bxp_2
extends afr_1 {
    private static final String lwL = "SpellEffect";
    private static final String lwM = "Librairie ? utiliser dans les scripts d'effets uniquement";
    private final aWw lwN;

    public bxp_2(aWw aWw2) {
        this.lwN = aWw2;
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new bxm_2(luaState, this.lwN), new bxh_2(luaState, this.lwN), new bwp_1(luaState, this.lwN), new bxc_2(luaState, this.lwN), new bxg_2(luaState, this.lwN), new bxi_2(luaState, this.lwN), new bwy_1(luaState, this.lwN), new bxe_2(luaState, this.lwN), new bxj_2(luaState, this.lwN), new bxf_2(luaState, this.lwN), new bwo_1(luaState, this.lwN), new bxa_2(luaState, this.lwN), new bwz_1(luaState, this.lwN), new bww_1(luaState, this.lwN), new bxn_2(luaState), new bxk_2(luaState), new bxb_2(luaState), new bwu_1(luaState, this.lwN), new bwv_1(luaState, this.lwN), new bwx_1(luaState, this.lwN), new bwt_1(luaState, this.lwN), new bxd_2(luaState, this.lwN)};
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return null;
    }

    @Override
    public final String getName() {
        return lwL;
    }

    @Override
    public String getDescription() {
        return lwM;
    }
}

