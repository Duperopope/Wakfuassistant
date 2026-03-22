/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dey
extends afk_1 {
    dey(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "displayChallengeVarUpdateFlyingImage";
    }

    @Override
    public String getDescription() {
        return "Affiche l'image volante d'update de variable de challenge";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ohH;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        boolean bl = true;
        if (n >= 1) {
            bl = this.xx(0);
        }
        bfP.dhT().fF(bl);
    }
}

