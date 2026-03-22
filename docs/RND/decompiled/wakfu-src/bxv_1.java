/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.keplerproject.luajava.LuaState
 */
import lombok.Generated;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXV
 */
public class bxv_1
extends afr_1 {
    private long dOX = -1L;

    @Override
    public final String getName() {
        return "Sound";
    }

    @Override
    public String getDescription() {
        return "Library used for code related to sound inside interactive dialogs";
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new bxu_1(this, luaState, dIl), new bxr_1(this, luaState, dIl), new bxt_1(this, luaState, dIl), new bxs_1(this, luaState, dIl)};
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return null;
    }

    @Generated
    public long ccq() {
        return this.dOX;
    }

    @Generated
    public void hF(long l) {
        this.dOX = l;
    }

    @Generated
    public bxv_1() {
    }

    @Generated
    public bxv_1(long l) {
        this.dOX = l;
    }
}

