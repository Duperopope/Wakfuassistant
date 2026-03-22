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
 * Renamed from deu
 */
class deu_0
extends afk_1 {
    deu_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "closeAllBags";
    }

    @Override
    public String getDescription() {
        return "Ferme la fen?tre des inventaires";
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
        aue_0.cVJ().b(cvo_2.eUK());
    }
}

