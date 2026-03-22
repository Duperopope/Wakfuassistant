/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dfC
extends afk_1 {
    dfC(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "removeUnremovableDialog";
    }

    @Override
    public String getDescription() {
        return "Removes a dialog from unremovableDialogs";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oij;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        String string = this.xu(0);
        fyw_0.gqw().tk(string);
    }
}

