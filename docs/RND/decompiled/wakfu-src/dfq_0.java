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
 * Renamed from dfq
 */
class dfq_0
extends afk_1 {
    dfq_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "removeDialogUnloadedListener";
    }

    @Override
    public String getDescription() {
        return "Annule l'effet d'un UI.addDialogUnloadedListener";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.oiS;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        String string = this.xu(0);
        ddi.fcw().rl(string);
    }
}

