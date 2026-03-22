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
 * Renamed from dfx
 */
class dfx_0
extends afk_1 {
    dfx_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "removeProperty";
    }

    @Override
    public String getDescription() {
        return "Supprime une propri?t? Xulor";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oip;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        String string = this.xu(0);
        ddU.ojI.remove((Object)string);
        fse_1.gFu().vX(string);
    }
}

