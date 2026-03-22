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
 * Renamed from dev
 */
class dev_0
extends afk_1 {
    dev_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "closeMRU";
    }

    @Override
    public String getDescription() {
        return "Ferme le MRU courant s'il est affich?";
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
    public void ss(int n) {
        ddU.ohA.info((Object)"Fermeture de tous les MRU");
        cwd_2.eVe().eVg();
    }
}

