/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class deZ
extends afk_1 {
    deZ(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "loadGuideDialog";
    }

    @Override
    public String getDescription() {
        return "Affiche une popup de guide";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ojA;
    }

    @Override
    @Nullable
    public final afe_1[] bBh() {
        return null;
    }

    @Override
    public void ss(int n) {
        if (n < 1) {
            ddU.ohA.warn((Object)("Not enough args for LoadGuideMessageDialog : " + n));
            return;
        }
        dae_0 dae_02 = new dae_0(18218);
        dae_02.sY(this.xp(0));
        aaw_1.bUq().h(dae_02);
    }
}

