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
 * Renamed from dft
 */
class dft_0
extends afk_1 {
    dft_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "removeLandMarkNote";
    }

    @Override
    public String getDescription() {
        return "Retire une note personnelle";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ohI;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        int n2 = this.xp(0);
        if (!bRq.ekK().Jd(n2)) {
            ddU.ohA.warn((Object)("Tentative de suppression d'un landmark d'id " + n2 + " non trouv?."));
        }
    }
}

