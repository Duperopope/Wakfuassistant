/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class den
extends afk_1 {
    den(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "addUnremovableDialog";
    }

    @Override
    public String getDescription() {
        return "Add a dialog to unremovableDialogs";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oii;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        String string = this.xu(0);
        fyw_0.gqw().tj(string);
    }
}

