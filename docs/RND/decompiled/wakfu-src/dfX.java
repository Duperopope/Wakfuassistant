/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class dfX
extends afk_1 {
    dfX(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "startCountdown";
    }

    @Override
    public String getDescription() {
        return "Affiche un compte ? rebours g?n?rique";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ohK;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        int n2 = this.xp(0);
        ux_0 ux_02 = n >= 2 ? uw_0.fn(this.xs(1)) : ue_0.bjV().bjc();
        bfN.dhv().a(n2, ux_02);
    }
}

