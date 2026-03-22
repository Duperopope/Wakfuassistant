/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dgc
extends afk_1 {
    dgc(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "unloadGuideDialog";
    }

    @Override
    public String getDescription() {
        return "Ferme le popup de guide";
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        dae_0 dae_02 = new dae_0(17027);
        aaw_1.bUq().h(dae_02);
    }
}

