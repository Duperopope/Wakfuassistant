/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from dcS
 */
public class dcs_0
extends afr_1 {
    public static final dcs_0 ogi = new dcs_0();

    private dcs_0() {
    }

    @Override
    @Nullable
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new ddd_0(luaState), new dcu_0(luaState), new dcy_0(luaState), new dcw_0(luaState), new dda_0(luaState), new ddb_0(luaState), new ddc_0(luaState), new dcz_0(luaState), new dcx_0(luaState), new dct_0(luaState), new dcv_0(luaState)};
    }

    @Override
    @Nullable
    public afk_1[] b(LuaState luaState) {
        return null;
    }

    @Override
    public String getName() {
        return "Focus";
    }

    @Override
    public String getDescription() {
        return "Manage and display the focus layer (vignetting)";
    }
}

