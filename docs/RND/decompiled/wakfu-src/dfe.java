/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dfe
extends afk_1 {
    dfe(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "openAllBags";
    }

    @Override
    public String getDescription() {
        return "Ouvre la fen?tre d'inventaires";
    }

    @Override
    @Nullable
    public afe_1[] bBg() {
        return null;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n) {
        cvo_2.eUK().eUN();
    }
}

