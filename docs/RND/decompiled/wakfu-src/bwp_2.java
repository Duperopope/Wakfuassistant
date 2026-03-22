/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWp
 */
public class bwp_2
extends afr_1 {
    private static final String ltb = "Cast";
    private static final String ltc = "Permet de r?cup?rer des informations li?es aux actions de Cast en combat (utilisation de sort ou d'arme)";
    private final aUT ltd;

    public bwp_2(aUT aUT2) {
        this.ltd = aUT2;
    }

    @Override
    public final String getName() {
        return ltb;
    }

    @Override
    public String getDescription() {
        return ltc;
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new bwq_2(luaState, this.ltd), new bwr_2(luaState, this.ltd), new bws_2(luaState, this.ltd), new bwu_2(luaState, this.ltd), new bwv_2(luaState, this.ltd), new bww_2(luaState, this.ltd), new bwx_2(luaState, this.ltd), new bwy_2(luaState, this.ltd), new bwz_2(luaState, this.ltd), new bwa_2(luaState, this.ltd), new bwb_2(luaState, this.ltd), new bwc_2(luaState, this.ltd), new bwd_2(luaState, this.ltd)};
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return null;
    }
}

