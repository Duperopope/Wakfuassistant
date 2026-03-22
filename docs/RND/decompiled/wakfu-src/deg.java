/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

class deg
extends afk_1 {
    deg(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getName() {
        return "addLODListener";
    }

    @Override
    public String getDescription() {
        return "Ajoute une ?coute sur le changement de niveau de d?tails du jeu";
    }

    @Override
    public afe_1[] bBg() {
        return ddU.ojr;
    }

    @Override
    @Nullable
    public afe_1[] bBh() {
        return null;
    }

    @Override
    protected void ss(int n2) {
        if (n2 < 1) {
            ddU.ohA.warn((Object)"On utilise addLODListener sans argument !");
            return;
        }
        String string = this.xu(0);
        afx_1 afx_12 = this.cai();
        aie_0.cfn().a(n -> afx_12.a(string, new afq_2[]{new afq_2(n)}, new afp_2[0]));
    }
}

